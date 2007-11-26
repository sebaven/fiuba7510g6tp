package ar.com.tpclinica.negocio.reglas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ar.com.tpclinica.negocio.OrdenMedica;

public class MesesEnPlan extends Operando {
	public MesesEnPlan ()
	{
		this.setTipo(1);
	}
	public int getValor(OrdenMedica om)
	{
		//TODO!!! // cant de meses q tiene el usr en el plan
		return getDifEnMeses(om.getPaciente().getFechaInicioPlan(), new Date());
	}
	@Override
	public boolean equals(Object obj) {
		OrdenMedica om = null;
		if (((Operando)obj).getValor(om)==this.getValor(om))
			return true;
		else return false;
	}
	
	
    public static int getDifEnMeses( java.util.Date pFrom, java.util.Date pTo )
    {
        Calendar lFrom = new GregorianCalendar();
        lFrom.setTime( pFrom );
        Calendar lTo = new GregorianCalendar();
        lTo.setTime( pTo );
 
        int lFromYear = lFrom.get( Calendar.YEAR );
        int lFromMonth = lFrom.get( Calendar.MONTH );
        int lFromDay = lFrom.get( Calendar.DAY_OF_MONTH );
 
        int lToYear = lTo.get( Calendar.YEAR );
        int lToMonth = lTo.get( Calendar.MONTH );
        int lToDay = lTo.get( Calendar.DAY_OF_MONTH );
 
        int lYearDiff = lToYear - lFromYear;
        int lMonthDiff = lToMonth - lFromMonth;
        int lDayDiff = lToDay - lFromDay;
 
        if ( lDayDiff < 0 )
        {
            lMonthDiff--;
            Calendar lTemp = new GregorianCalendar();
            lTemp.setTime( pTo );
            lTemp.add( lTemp.MONTH, -1 );
            lDayDiff = lTemp.getActualMaximum( lTemp.DAY_OF_MONTH ) + lDayDiff;
        }
 
        if ( lMonthDiff < 0 )
        {
            lYearDiff--;
            lMonthDiff = 12 + lMonthDiff;
        }
 
        return  ( lYearDiff * 12 + lMonthDiff );
    }
}
