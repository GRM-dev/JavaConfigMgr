package pl.grmdev.configmgr.exceptions;

public final class ConfigInitializationException extends ConfigException {
	private static final long serialVersionUID = -2099682242516528705L;
	
	public ConfigInitializationException() {
	}
	
	public ConfigInitializationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public ConfigInitializationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ConfigInitializationException(String message) {
		super(message);
	}
	
	public ConfigInitializationException(Throwable cause) {
		super(cause);
	}
}
