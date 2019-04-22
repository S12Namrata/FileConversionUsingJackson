package format_conversion;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import com.fr.fileConversion.launcher.FileConverter;


public class TestFileConversion {
	
	@Test
	public void testFileConversiontoXML()
	{
		String fileNameIn = "InputFile.txt";
		String fileNameOut = "InputFile.xml";
		
		FileConverter fileConverter = new FileConverter();
		fileConverter.convertFile(fileNameIn, "xml", fileNameOut);
		
		File file = new File(fileNameOut);
		Assert.assertTrue(file.exists());
	}
	
	@Test
	public void testFileConversiontoJSON()
	{
		String fileNameIn = "InputFile.txt";
		String fileNameOut = "InputFile.json";
		
		FileConverter fileConverter = new FileConverter();
		fileConverter.convertFile(fileNameIn, "json", fileNameOut);
		
		 File file = new File(fileNameOut);
		 Assert.assertTrue(file.exists());
		
	}

}
