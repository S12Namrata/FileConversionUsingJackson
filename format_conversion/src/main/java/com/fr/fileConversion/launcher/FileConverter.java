package com.fr.fileConversion.launcher;

import java.util.List;

import com.fr.fileConversion.datamodel.Report;
import com.fr.fileConversion.services.Converter;
import com.fr.fileConversion.services.FileToPOJO;
import com.fr.fileConversion.services.ReadInputFile;

/**
 * The Class Launcher.
 */

public class FileConverter {

	/**
	 * Convert file.
	 *
	 * @param fileNameIn the file name in like "input.txt"
	 * @param format the format of output file "xml/json"
	 * @param fileNameOut the file name out line "output.xml/output.json"
	 */
	public void convertFile(String fileNameIn, String format, String fileNameOut)
	{
		ReadInputFile rfile = new ReadInputFile();
		List<String> fileData = rfile.readFile(fileNameIn);

		FileToPOJO fileToPojo = new FileToPOJO();
		Report report = fileToPojo.createReportObject(fileData, fileNameIn);

		Converter converter = new Converter(); 

		if("xml".equalsIgnoreCase(format))
			converter.convertToXML(report,fileNameOut);
		if("json".equalsIgnoreCase(format))
			converter.convertToJSON(report,fileNameOut);
	}

}
