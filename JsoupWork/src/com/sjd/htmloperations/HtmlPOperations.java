package com.sjd.htmloperations;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlPOperations {
	public String getinfo() {
	String info = "";	
	try{Document document = Jsoup.connect("https://www.amazon.com/Sony-XBR55X900F-55-Inch-Ultra-Smart/dp/B078GWPQRB/ref=sr_1_8?s=tv&amp&ie=UTF8&amp&qid=1529672856&amp&sr=1-8&amp&refinements=p_n_size_browse-bin%3A3578042011").get();
	Elements elements = document.select("ul.a-unordered-list.a-vertical.a-spacing-none");
	for (Element element : elements) {
		info += element;
	}
	}catch (IOException e) {
		System.out.print("Some wrong");
	}
    return info;
	}  
	}
	
