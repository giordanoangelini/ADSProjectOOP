package it.SpringBootAPI.ADSProjectOOP.fetch;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

import java.net.URL;  
import java.net.URLConnection;   

public class FetchClass {
			
	public String getJSONFromURL () {
			
		//vengono definite due variabili String per la lettura del file 
		String line = "";
		String data = "";
			
		try { 
			URLConnection openConnection = 
					new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/friends/list.json?screen_name=efrontoni&count=5").openConnection();
			BufferedInputStream in =new BufferedInputStream(openConnection.getInputStream());
				
			try {
					
				InputStreamReader inR = new InputStreamReader(in); //stream del file
				BufferedReader buf = new BufferedReader (inR);
					
				while ((line = buf.readLine() ) != null) {
					data += ( line ); //lettura riga per riga
				}
					
					
			} finally {
				in.close();
			}
				
			} catch (IOException e) {	
				System.out.println ("I/O Error" + e);
			}
			
			return data;
		}
	
	//metodo che effettua il PARSING del JSON
	public JSONObject parsing () {	
			
		String jString = getJSONFromURL();
		JSONObject json = null;
		
		JSONParser parser = new JSONParser(); 
		try {
			json = (JSONObject) parser.parse(jString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			return json;
	}
}
