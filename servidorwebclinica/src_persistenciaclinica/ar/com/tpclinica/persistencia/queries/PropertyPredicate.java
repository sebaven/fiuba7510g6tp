package ar.com.tpclinica.persistencia.queries;

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
	
	public PropertyPredicate(Object valueToMacth,String property){
		this.value=valueToMacth;
	}
	
	public boolean evaluate(Object arg0) {
//        
//		Method method = o.getClass().getMethod("setColor", new Class[] { Color.class });
//
//        method.invoke(o, new Object[] { color });
		
		return false;
	}
	


}
