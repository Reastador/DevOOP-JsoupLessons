package com.sjd;

import java.util.logging.Logger;

import com.sjd.htmloperations.HtmlPOperations;

public class Main {
	private static Logger logger = Logger.getLogger(Main.class.getName());
	public static void main(String[] args) {
		
		HtmlPOperations oper = new HtmlPOperations();
		logger.info(oper.getinfo());
	}

}
