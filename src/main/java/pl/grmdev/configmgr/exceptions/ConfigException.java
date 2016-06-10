package pl.grmdev.configmgr.exceptions;

public abstract class ConfigException extends Exception
{
	private static final long serialVersionUID = 243095599920186687L;
	
	public ConfigException() {
		super();
	}
	
	public ConfigException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConfigException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ConfigException(String message) {
		super(message);
	}
	
	public ConfigException(Throwable cause) {
		super(cause);
	}
	
}
