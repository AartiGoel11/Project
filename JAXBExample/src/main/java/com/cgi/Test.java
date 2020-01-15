package com.cgi;

import java.io.File;
import java.io.PrintStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) throws JAXBException {
		//Marshalling --> convert java object into xml
		Employee emp = new Employee();
		
		emp.setEmpNo(11);
		emp.setName("aarti");
		emp.setSalary(30000.00);

		// create JAXBContext object
		
		JAXBContext jaxb = JAXBContext.newInstance(Employee.class);
		//create Marshaller object from JAXBContext
		
		Marshaller marshaller = jaxb.createMarshaller();
		//call marshall(-) from marshaller object
		marshaller.marshal(emp, System.out); // to display generated xml on console.
		
		//store generated xml into a file
		
		File file = new File("emp.xml");
				marshaller.marshal(emp, file);
		System.out.println("done..");
		
		//get the generated xml in the form of string using StringWriter
		
		StringWriter str = new StringWriter();
		marshaller.marshal(emp, str);
		String xml=str.toString();
		
		System.out.println("String Writer.."+xml);
	}

}
