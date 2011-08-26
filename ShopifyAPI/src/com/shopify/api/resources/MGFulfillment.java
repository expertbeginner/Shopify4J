/**
* DO NOT MODIFY THIS CODE
* 
* Place all of your changes in Fulfillment.java
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
  
public class MGFulfillment extends ShopifyResource {

	@JsonProperty("line_items")
	private List<LineItem> _line_items;
	public List<LineItem> getLineItems(){ return _line_items;}
	public void setLineItems(List<LineItem> _line_items){this._line_items = _line_items;}

	@JsonProperty("tracking_company")
	private String _tracking_company;
	public String getTrackingCompany(){ return _tracking_company;}
	public void setTrackingCompany(String _tracking_company){this._tracking_company = _tracking_company;}

	@JsonProperty("order_id")
	private int _order_id;
	public int getOrderId(){ return _order_id;}
	public void setOrderId(int _order_id){this._order_id = _order_id;}

	@JsonProperty("tracking_number")
	private String _tracking_number;
	public String getTrackingNumber(){ return _tracking_number;}
	public void setTrackingNumber(String _tracking_number){this._tracking_number = _tracking_number;}

	@JsonProperty("receipt")
	private Receipt _receipt;
	public Receipt getReceipt(){ return _receipt;}
	public void setReceipt(Receipt _receipt){this._receipt = _receipt;}

	@JsonProperty("status")
	private String _status;
	public String getStatus(){ return _status;}
	public void setStatus(String _status){this._status = _status;}

}