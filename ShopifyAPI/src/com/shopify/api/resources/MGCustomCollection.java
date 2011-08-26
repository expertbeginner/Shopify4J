/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in CustomCollection.java
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
  
public class MGCustomCollection extends ShopifyResource {

	@JsonProperty("body_html")
	private String _body_html;
	public String getBodyHtml(){ return _body_html;}
	public void setBodyHtml(String _body_html){this._body_html = _body_html;}

	@JsonProperty("handle")
	private String _handle;
	public String getHandle(){ return _handle;}
	public void setHandle(String _handle){this._handle = _handle;}

	@JsonProperty("template_suffix")
	private String _template_suffix;
	public String getTemplateSuffix(){ return _template_suffix;}
	public void setTemplateSuffix(String _template_suffix){this._template_suffix = _template_suffix;}

	@JsonProperty("title")
	private String _title;
	public String getTitle(){ return _title;}
	public void setTitle(String _title){this._title = _title;}

	@JsonProperty("sort_order")
	private String _sort_order;
	public String getSortOrder(){ return _sort_order;}
	public void setSortOrder(String _sort_order){this._sort_order = _sort_order;}

	@JsonProperty("published_at")
	private String _published_at;
	public String getPublishedAt(){ return _published_at;}
	public void setPublishedAt(String _published_at){this._published_at = _published_at;}

}