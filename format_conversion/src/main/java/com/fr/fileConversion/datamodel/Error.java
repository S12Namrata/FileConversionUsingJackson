package com.fr.fileConversion.datamodel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/**
 * The Class Error.
 */
@JsonPropertyOrder({"line", "message"})
public class Error {
	
	/** The line. */
	@JacksonXmlProperty(isAttribute = true)
	String line;
	
	/** The message. */
	@JacksonXmlProperty(isAttribute = true)
	String message;
	
	/** The value. */
	@JacksonXmlText
    private String value;

	/**
	 * Gets the line.
	 *
	 * @return the line
	 */
	public String getLine() {
		return line;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the line.
	 *
	 * @param line the line to set
	 */
	public void setLine(String line) {
		this.line = line;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	

}
