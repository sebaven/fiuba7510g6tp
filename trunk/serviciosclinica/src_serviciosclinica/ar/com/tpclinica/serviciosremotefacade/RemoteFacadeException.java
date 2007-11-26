package ar.com.tpclinica.serviciosremotefacade;

public class RemoteFacadeException extends RuntimeException {

	public RemoteFacadeException(){
		super();
	}
	public RemoteFacadeException(String message){
		super(message);
	}
	
	public RemoteFacadeException(Throwable cause){
		super(cause);
	}
}
