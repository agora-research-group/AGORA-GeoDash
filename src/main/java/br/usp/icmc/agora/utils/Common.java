package br.usp.icmc.agora.utils;

import java.io.FileReader;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Common {
	
	public final static String SOS_PATH = "http://sensorweb.demo.52north.org/52n-sos-webapp/service";
//	public final static String SERVER_PATH = "C:\\Users\\Oscar Neto\\Documents\\IC\\Workspace\\Git\\geodash\\json\\";
	public final static String SERVER_PATH = "E:\\Desenvolvimento\\Agora\\AGORA-GeoDash\\json\\";
	public static <T> T jsonToObject(String json, Class<T> object) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
		
		return mapper.readValue(json, object);
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static JSONObject readJson(String fileName) {
		
		String filePath = Common.SERVER_PATH + fileName;
		
		try {
			
			FileReader reader = new FileReader(filePath);
			
			JSONTokener tokener = new JSONTokener(reader);
			
			return (new JSONObject(tokener));
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static String httpPost(String file, String type) {
		
		PostMethod post = new PostMethod(Common.SOS_PATH);
		String response = null;
		
		try {
			
			post.setRequestEntity(new StringRequestEntity(file, type, "UTF-8"));
		
			post.setRequestHeader("Content-type", type+"; charset=UTF-8");
			
			HttpClient httpclient = new HttpClient();
				
			httpclient.executeMethod(post);

			response = post.getResponseBodyAsString();
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			post.releaseConnection();
		}
		
		return response;
	}
}
