package com.fr.fileConversion.services;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fr.fileConversion.datamodel.Report;

/**
 * The Class FileFormatConverter.
 */
public class Converter {
	
	/**
	 * Convert to JSON.
	 *
	 * @param report   the report
	 * @param fileName the file name
	 */
	public void convertToJSON(Report report, String fileName) {
		
		ObjectMapper mapper = new ObjectMapper();
	    try 
	    {
	    	// Opening file and Writing to the File
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File(fileName), report);
			System.out.println("JSON File Generated Successfully");

			
		}catch (IOException e) {
			System.out.println(" Error in generating JSON file : " + e);
		}
	}
	
	/**
	 * Convert to XML.
	 *
	 * @param report   the report
	 * @param fileName the file name
	 */
	public void convertToXML(Report report,String fileName) {	
		
		XmlMapper xmlMapper = new XmlMapper();
	    try 
	    {
	    	// Opening file and Writing to the File
			xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), report);
			System.out.println("XML File Generated Successfully");

		}  catch (IOException e) {
			System.out.println(" Error in generating XML file : " + e);
		}
	}
}
