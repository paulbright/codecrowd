package org.co.sbsa;

import com.news.africa.AfricaNews; 

public class Welcome{
	public static void main(String [] args){
		System.out.println("Welcome to SBSA");
		
		AfricaNews an = new AfricaNews();
		System.out.println(an.getNews());
	}
}