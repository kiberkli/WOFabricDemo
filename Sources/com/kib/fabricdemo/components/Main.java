package com.kib.fabricdemo.components;

import org.apache.log4j.Logger;

import com.webobjects.appserver.WOContext;

public class Main extends BaseComponent {
	
	private static Logger log = Logger.getLogger(Main.class);
	
	public String imageData;
	
	public Main(WOContext context) {
		super(context);
	}
	
	public Main submitForm() {
		
		// imageData can now be stored in a database. 
		// It's base64 encoded and can be stored as such in a varchar or text.
		log.info("This is the image data: " + imageData);
		
		return null;
	}
}
