package se.coredev.service;

public final class ServiceException extends Exception {

	private static final long serialVersionUID = -8913114110810607202L;

	public ServiceException(String message, Throwable e) {
		super(message, e);
	}
}
