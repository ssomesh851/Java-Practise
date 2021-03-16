package com.example.prgms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class UrlGetResponse {
	 
    public static void main(String[] args) {
        crunchifyPrint("\nOutput: \n" + 
    crunchifyGETCallURLUtil("http://10.3.102.10:8080/FIGW/api/fi/upstream_sst"));
    }
 
    public static String crunchifyGETCallURLUtil(String crunchifyURL) {
		crunchifyPrint("Requested URL:" + crunchifyURL);
 
		// A mutable sequence of characters. This class provides an API compatible with StringBuffer,
		// but with no guarantee of synchronization.
        StringBuilder crunchifyStringBuilder = new StringBuilder();
        
        URLConnection crunchifyURLConnection = null;
        
        InputStreamReader in = null;
        
        try {

        	URL url = new URL(crunchifyURL);
            
            crunchifyURLConnection = url.openConnection();
            
            if (crunchifyURLConnection != null)
            	
            	// Set 5 second Read timeout
                
            	crunchifyURLConnection.setReadTimeout(5 * 1000);
 
            if (crunchifyURLConnection != null && crunchifyURLConnection.getInputStream() != null) {
                
            	in = new InputStreamReader(crunchifyURLConnection.getInputStream(),
                
            	Charset.defaultCharset());
                
            	BufferedReader bufferedReader = new BufferedReader(in);
 
                if (bufferedReader != null) {
                
                int cp;
                    
                while ((cp = bufferedReader.read()) != -1) {
                    
                crunchifyStringBuilder.append((char) cp);
                    }
                    
                bufferedReader.close();
                }
            }
            
            in.close();
        
        } catch (Exception e) {
         
        	throw new RuntimeException("Exception while calling URL:" + crunchifyURL, e);
        }
 
        return crunchifyStringBuilder.toString();
    }
 
	private static void crunchifyPrint(String print) {
		
		System.out.println(print);
	}

}
