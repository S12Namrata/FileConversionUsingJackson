package com.fr.fileConversion.datamodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Class Report.
 */
@JsonPropertyOrder({"inputFile", "references", "errors"})
public class Report {
	
	/** The input file. */
	String inputFile;
	
	/** The references. */
	List<Reference> references;
	
	/** The errors. */
	List<Error> errors;
	
	/**
	 * Gets the input file.
	 *
	 * @return the input file
	 */
	public String getInputFile() {
		return inputFile;
	}
	
	/**
	 * Gets the references.
	 *
	 * @return the references
	 */
	public List<Reference> getReferences() {
		return references;
	}
	
	/**
	 * Gets the errors.
	 *
	 * @return the errors
	 */
	public List<Error> getErrors() {
		return errors;
	}
	
	/**
	 * Sets the input file.
	 *
	 * @param inputFile the new input file
	 */
	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}
	
	/**
	 * Sets the references.
	 *
	 * @param references the new references
	 */
	public void setReferences(List<Reference> references) {
		this.references = references;
	}
	
	/**
	 * Sets the errors.
	 *
	 * @param errors the new errors
	 */
	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

}
