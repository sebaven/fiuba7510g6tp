package ar.com.tpclinica.persistencia.queries;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.collections.Predicate;

/**
 * Esta clase se usa para buscar un elemento en una coleccion, donde el objeto machee con el valor de la propiedad indicada
 * @author carlos
 *
 */
public class PropertyPredicate implements Predicate {

	/**
	 * Valor que tiene que tener el objeto en cuestion
	 */
	private Object value;
	private String propertyName;
	
	public PropertyPredicate(Object valueToMacth,String propertyName){
		this.value=valueToMacth;
		this.propertyName=propertyName;
	}
	
	public boolean evaluate(Object objectToEvaluate) {
		boolean result=false;

        try {
        	Method method = objectToEvaluate.getClass().getMethod(this.propertyName);
			result= method.invoke(objectToEvaluate).equals(this.value);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	


}
