package ar.com.tplaboratorio.servicioremotofacade;

public class RemoteFacadeException extends RuntimeException {

	public RemoteFacadeException(){
		super();
	}
	public RemoteFacadeException(String msg){
		super(msg);
	}
	public RemoteFacadeException(Throwable cause){
		super(cause);
	}
}
