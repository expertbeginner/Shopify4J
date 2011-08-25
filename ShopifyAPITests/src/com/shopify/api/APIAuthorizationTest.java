package com.shopify.api;

import java.util.HashMap;

import com.shopify.api.APIAuthorization;

import android.test.AndroidTestCase;
import android.util.Log;

public class APIAuthorizationTest extends AndroidTestCase {
	private HashMap<String, String> responseParams;
	private APIAuthorization auth;

	protected void setUp() throws Exception {
		super.setUp();
		
		auth = new APIAuthorization(
				"invoice-api-key",
				"hush",
				"some-shop");
				
		responseParams = new HashMap<String, String>(){{
			put("shop", "some-shop.myshopify.com");
            put("t", "a94a110d86d2452eb3e2af4cfb8a3828");
            put("timestamp", "1272470066");
            put("signature", "7e88701262a17b051b977e9ed51cd318");
		}};
	}
	
	public void testToMD5Digest() {
		String expected = "36b29a08b3113077f14777570c0577ed";
		String input = "hush" + "a94a110d86d2452eb3e2af4cfb8a3828";
		assertEquals(expected, auth.toMD5Hexdigest(input));
	}
	
	public void testGeneratePreDigest() {
		responseParams.remove("signature");
		String predigest = auth.generatePreDigest(responseParams);
		String expected = "hushshop=some-shop.myshopify.comt=a94a110d86d2452eb3e2af4cfb8a3828timestamp=1272470066";
		
		assertEquals(expected, predigest);
	}
	
	public void testIsValidShopifyResponse() {
		assertTrue(auth.isValidShopifyResponse(responseParams));
	}
	
	public void testGetAPIPassword() {
		assertTrue(auth.getAPIPassword(responseParams));
		
		String expectedPassword = "36b29a08b3113077f14777570c0577ed"; 
		assertEquals(expectedPassword, auth.getPassword());
	}
}
