package it.SpringBootAPI.ADSProjectOOP.fetch;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import it.SpringBootAPI.ADSProjectOOP.exceptions.FetchException;

import java.io.*;

import java.net.URL;  
import java.net.URLConnection;   

public class FetchClass {
			
	private String getJSONFromURL() {
			
		String line = "";
		String data = "";
			
		try { 
			URLConnection openConnection = 
					new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/"
						  + "friends/list.json?screen_name=efrontoni&count=100").openConnection();
			BufferedInputStream in =new BufferedInputStream(openConnection.getInputStream());
				
			try {
					
				InputStreamReader inR = new InputStreamReader(in);
				BufferedReader buf = new BufferedReader (inR);
					
				while ((line = buf.readLine() ) != null) {
					data += ( line ); 
				}
						
			} finally {
				in.close();
			}
				
		} catch (IOException e) {	
				throw new FetchException();
		}
		
		return data;
	}
	
	
	public JSONObject parsing () {	
			
		JSONObject obj = null; 
		String data = getJSONFromURL();
		try {
			obj = (JSONObject)JSONValue.parseWithException(data);
		
		} catch (ParseException e) {
			throw new FetchException();
		}	
		
		return obj;
	}
}
