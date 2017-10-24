package com.bmw.tpa.common;

/**
 * The Enum Config.
 *
 * @author niraj
 */
public enum Config {
	
	SERVER_URL("server.url"),
	
	SERVER_PORT("server.port"),
	
	/** The docbase name. */
	DATABASE("docbase.name"),
	
	/** The docbase username. */
	USER("docbase.username"),
	
	/** The docbase password. */
	PASSWORD("docbase.password")
	;
	
	/** The key. */
	private final String key;

	/** The value. */
	protected final String value;

	/** The value defined. */
	private final boolean valueDefined;

	/**
	 * Instantiates a new config.
	 *
	 * @param key
	 *            the key
	 * @param theDefault
	 *            the the default
	 */
	Config(final String key, final String theDefault) {
		this.key = key;
		this.value = SettingHelper.getProperty(key);
		this.valueDefined = true;
	}

	/**
	 * Instantiates a new config.
	 *
	 * @param key
	 *            the key
	 */
	Config(final String key) {
		this.key = key;
		this.value = SettingHelper.getProperty(key);
		this.valueDefined = value != null;
	}

	/**
	 * Gets the string value.
	 *
	 * @return the string value
	 */
	public String getStringValue() {
		return this.value;
	}

	/**
	 * Gets the integer value.
	 *
	 * @return the integer value
	 */
	public Integer getIntegerValue() {
		return Integer.valueOf(this.value);
	}

	/**
	 * Gets the boolean value.
	 *
	 * @return the boolean value
	 */
	public Boolean getBooleanValue() {
		return Boolean.valueOf(this.value);
	}
}
