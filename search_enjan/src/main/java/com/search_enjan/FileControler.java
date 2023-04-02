package com.search_enjan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.Part;

@Controller
public class FileControler {

	
	@RequestMapping("convert")
	public void converter(HttpServletRequest request) {

		
		try {
			Part part = request.getPart("file");
			
			InputStream inputstr = part.getInputStream();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//String filepath = path;
		System.out.println("this is file path  " );
		
		//Converterfile con=new Converterfile(filepath);
//		try {
//			con.con();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// return "ComplexForm";
//		System.out.println("successfull");

	}

	@RequestMapping("ComplexForm")
	public String convert() {
		return "ComplexForm";

	}
	
	
}
