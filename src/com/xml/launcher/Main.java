package com.xml.launcher;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.xml.files.price.StorePrices;
import com.xml.files.stores.Chain;

public class Main {

	public static void main(String[] args) throws JAXBException {
		 JAXBContext jaxbContext = JAXBContext.newInstance(Chain.class);
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		     
		    //We had written this file in marshalling example
		    @SuppressWarnings("unused")
			Chain emps = (Chain) jaxbUnmarshaller.unmarshal( new File("xmlfiles/Stores7290027600007-000-201601270201.xml") );
		    
		    
		    
		    JAXBContext jaxbContext2 = JAXBContext.newInstance(StorePrices.class);
		    Unmarshaller jaxbUnmarshaller2 = jaxbContext2.createUnmarshaller();
		    @SuppressWarnings("unused")
			StorePrices prices = (StorePrices)jaxbUnmarshaller2.unmarshal( new File("xmlfiles/PriceFull7290027600007-001-201601270330.xml") );
		    
		  System.out.println(":");  	
	}

}
