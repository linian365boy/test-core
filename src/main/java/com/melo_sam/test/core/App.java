package com.melo_sam.test.core;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	String str = "Hello World!";
        System.out.println( str );
        System.out.println(appendStr(str));
        println();
    }
    
    public static String appendStr(String str){
    	StringBuilder sb = new StringBuilder(str);
    	sb = sb.append("this a test project!");
    	return sb.substring(4);
    }
    
    public static void println(){
    	System.out.println("first to bring to this world!");
    }
}
