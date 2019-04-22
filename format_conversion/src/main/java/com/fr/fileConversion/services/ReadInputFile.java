package com.fr.fileConversion.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ReadInputFile.
 */
public class ReadInputFile {

	/**
	 * Read file.
	 *
	 * @param fileName the file name
	 * @return the file data as list of strings
	 */
	public List<String> readFile(String fileName)
	{
		List<String> fileData = new ArrayList<String>();
		try 
		{
			File dir = new File(".");
			File fileIn = new File(dir.getCanonicalPath() + File.separator + fileName); 

			BufferedReader br = new BufferedReader(new FileReader(fileIn));
			 
			String line = null;
			while ((line = br.readLine()) != null) { // Reading file line by line
				fileData.add(line); // storing file as list of strings
			}
		 
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File : "+fileName+ " Not Found !!");
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return fileData;
	}
	
}
