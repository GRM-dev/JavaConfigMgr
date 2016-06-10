package pl.grmdev.configmgr.exceptions;

public class ConfigFactoryInitializationException extends ConfigException {
	private static final long serialVersionUID = 5662886921435440170L;
	
	public ConfigFactoryInitializationException() {
	}
	
	public ConfigFactoryInitializationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public ConfigFactoryInitializationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ConfigFactoryInitializationException(String message) {
		super(message);
	}
	
	public ConfigFactoryInitializationException(Throwable cause) {
		super(cause);
	}
	
}
