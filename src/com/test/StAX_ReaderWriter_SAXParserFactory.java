package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAX_ReaderWriter_SAXParserFactory {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, XMLStreamException, URISyntaxException {
		URL url = StAX_ReaderWriter_SAXParserFactory.class.getResource("verseny1.xml");
//		URL url = StAX_ReaderWriter_SAXParserFactory.class.getResource("test.txt");
//		System.out.print(System.getProperty("user.dir"));
//		File file = new File(url.toURI());
		File file = new File("verseny1.xml");
		try (FileInputStream fis = new FileInputStream(file)) {
	        XMLInputFactory xmlInFact = XMLInputFactory.newInstance();
	        XMLStreamReader reader = xmlInFact.createXMLStreamReader(fis);
	        while(reader.hasNext()) {
	            reader.next(); // do something here
//	            System.out.println("line: " + reader);
	        }
	    }
	}

}
