package com.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.com.RestAPITest.RestAPI.TestBaseAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.client.RestClient;

public class GetAPITest extends TestBaseAPI{
	TestBaseAPI testBase;
	String url;
	String APIUrl;
	RestClient restClient;
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBaseAPI();
		url = prop.getProperty("URL");
		APIUrl = prop.getProperty("serviceURL");
		
		url = url+APIUrl;
		
	}
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		restClient.get(url);
		
		
	}

}
