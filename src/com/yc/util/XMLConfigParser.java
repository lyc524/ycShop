package com.yc.util;

import java.util.Properties;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLConfigParser extends DefaultHandler {

	private Properties props;
	public Properties getProps() {
		return props;
	}

	private StringBuffer curValue=new StringBuffer();
	
	public XMLConfigParser(){
		this.props=new Properties();
	}
	
	public void startElement(String url,String localName,String qName,Attributes attr) throws SAXException{
		curValue.delete(0, curValue.length());
	}
	
	public void characters(char[] ch,int start,int length) throws SAXException{
		curValue.append(ch,start,length);
	}
	
	public void endElement(String url,String localName,String qName) throws SAXException{
		 
	}
}
