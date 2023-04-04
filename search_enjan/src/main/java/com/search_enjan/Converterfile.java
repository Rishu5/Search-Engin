package com.search_enjan;

import java.io.File;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;



public class Converterfile {

	String filepath;

	public Converterfile(String filepath) {
		super();
		this.filepath = filepath;
	}
	
	public void con() {
		
		File f = new File((System.getProperty("user.home") + File.separator + "Desktop") + File.separator
				+ "Rishu_First_Project");
		f.mkdir();
 		Document doc1 = null;
		try {
			doc1 = new Document(filepath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doc1.save(f.getAbsolutePath().trim() + File.separator + filepath.replace("docx", "") + "pdf", SaveFormat.PDF);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}
