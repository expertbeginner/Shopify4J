/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in ProductSearchEngine.java
* 
* It has been machine generated from fixtures and your changes will be
* lost if anything new needs to be added to the API. 
**/
// Last Generated: 2011-08-26T10:00:59-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
* This code has been machine generated by processing the single entry
* fixtures found from the Shopify API Documentation
*/
  
public class MGProductSearchEngine extends ShopifyResource {

	@JsonProperty("name")
	private String _name;
	public String getName(){ return _name;}
	public void setName(String _name){this._name = _name;}

}