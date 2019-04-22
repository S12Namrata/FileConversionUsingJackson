package com.fr.fileConversion.utils;

import com.fr.fileConversion.datamodel.Colour;

/**
 * The Class Validations.
 */
public class Validations {

	
	/**
	 * Validate colour.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	public boolean validateColour(String input)
	{
		for (Colour colour : Colour.values()) {
	        if (colour.name().equals(input)) {
	            return true;
	        }
	    }
		return false;
	}
	
	/**
	 * Validate price.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	public boolean validatePrice(String input)
	{
		// Regex for pattern of type "5.23"
		String regex = "^([0-9]+((.)[0-9]{0,2}))"; 
		return input.matches(regex);
	}
	
	/**
	 * Validate size.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	public boolean validateSize(String input)
	{
		// Regex for checking only full numbers
		String regex = "[0-9]+";
		return input.matches(regex);
	}
}
