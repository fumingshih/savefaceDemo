package com.restfb;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;

import com.restfb.ReflectionUtils.FieldWithAnnotation;
import com.restfb.types.User;
public class TestFB {

	/**
	 * @param args
	 */
	private static PrintStream out = new PrintStream(System.out);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      List<FieldWithAnnotation<Facebook>> fieldsWithAnnotation =
	          ReflectionUtils.findFieldsWithAnnotation(User.class, Facebook.class);
	      
	      for (FieldWithAnnotation<Facebook> fieldWithAnnotation : fieldsWithAnnotation) {
	    	  
	    	  String facebookFieldName = fieldWithAnnotation.getAnnotation().value();
	          Field field = fieldWithAnnotation.getField();
	    	  out.println(field);
	    	  
	      }

	}

}
