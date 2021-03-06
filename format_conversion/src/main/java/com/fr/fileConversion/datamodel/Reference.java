package com.fr.fileConversion.datamodel;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * The Class Reference.
 */
@JsonPropertyOrder({"colour", "prize", "size","numReference"})
public class Reference {
	
	/** The colour. */
	@JacksonXmlProperty(isAttribute = true)
	Colour colour;
	
	/** The prize. */
	@JacksonXmlProperty(isAttribute = true)
	String price;
	
	/** The size. */
	@JacksonXmlProperty(isAttribute = true)
	String size;
	
	/** The num reference. */
	@JacksonXmlProperty(isAttribute = true)
	String numReference;
	
	/**
	 * Gets the colour.
	 *
	 * @return the colour
	 */
	public String getColour() {
		return colour.getName();
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public String getPrize() {
		return price;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	
	/**
	 * Gets the num reference.
	 *
	 * @return the numReference
	 */
	public String getNumReference() {
		return numReference;
	}
	
	/**
	 * Sets the colour.
	 *
	 * @param colour the colour to set
	 */
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param prize the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	
	/**
	 * Sets the size.
	 *
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 * Sets the num reference.
	 *
	 * @param numReference the numReference to set
	 */
	public void setNumReference(String numReference) {
		this.numReference = numReference;
	}
	

}
