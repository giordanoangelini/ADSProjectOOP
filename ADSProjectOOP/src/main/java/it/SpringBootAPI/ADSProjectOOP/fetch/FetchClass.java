package it.SpringBootAPI.ADSProjectOOP.fetch;

public class FetchClass {
		
		
	public String getJSONFromURL () {
			
		//vengono definite due variabili String per la òettura del file 
		String line = "";
		String data = "";
			
		try { 
			URLConnection openConnection = 
					new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/friends/list.json?screen_name=efrontoni&count=100").openConnection();
			BufferedInputStream in =new BufferedInputStream(openConnection.getInputStream());
				
			try {
					
				InputStreamReader inR = new InputStreamReader(in); //stream del file
				BufferedReader buf = new BufferedReader (inR);
					
				while ((line = buf.readLine() ) != null) {
					data += ( line ); //lettura riga per riga
				}
					
					
			}finally {
				in.close();
			}
				
			}catch (IOException e) {
					
				System.out.println ("I/O Error" + e);
			}
			
			return data;
		}
	
	
	//metodo che effettua il PARSING del JSON
	public JSONObject parsing () {	
			
			//viene definito un oggetto JSONObject e inizializzo a null	
			JSONObject obj = null; 
			String data = getJSONFromURL();
			try {
				obj = (JSONObject)JSONValue.parseWithException(data); //parsing
			
			} catch (ParseException e) {
			
				e.printStackTrace();
			}	 
				
			return obj;
	}

}
