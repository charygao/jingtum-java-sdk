/*
 * Copyright www.jingtum.com Inc. 
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jingtum.model;

import com.google.gson.annotations.Expose;
import com.jingtum.JingtumMessage;
import com.jingtum.exception.InvalidParameterException;
import com.jingtum.util.Utility;

/**
 * @author jzhao
 * @version 1.0
 * Currency class
 * Updated with getIssuer()
 * for new interface
 */

public class Amount extends JingtumObject{
	@Expose
	private double value;
	@Expose
	private double limit;//for relation use only
	@Expose
	private String currency;
	@Expose
	private String issuer; //for balance
	//@Expose
	private String counterparty;//for order,
	/**
	 * Set JingtumCurrency
	 * @param jtc
	 * @throws InvalidParameterException
	 */
	public void setJingtumCurrency(Currency jtc) throws InvalidParameterException{
		if(jtc == null){
			throw new InvalidParameterException(JingtumMessage.INVALID_JINGTUM_CURRENCY,currency,null);
		}
		this.currency = jtc.getCurrency();
		this.counterparty = jtc.getIssuer();
		this.issuer = jtc.getIssuer();
	}

	public boolean isSWT(){
		if (currency.compareTo("SWT") == 0)
			return true;
		else
			return false;
	}
	/**
	 * Get value
	 * @return value
	 */
	public double getValue() {
		return this.value;
	}

	/**
	 * Get limit for relation class
	 * @return limit
	 */
	public double getLimit() {
		return this.limit;
	}

	/**
	 * Set value
	 * @param value
	 * @throws InvalidParameterException
	 */
	public void setValue(double value) throws InvalidParameterException {
		if(value < 0){
			throw new InvalidParameterException(JingtumMessage.INVALID_VALUE,currency,null);
		}
		this.value = value;
	}
	/**
	 * Get currency
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * Set currency
	 * @param currency
	 * @throws InvalidParameterException
	 */
	public void setCurrency(String currency) throws InvalidParameterException {
		if(!Utility.isValidCurrency(currency)){
			throw new InvalidParameterException(JingtumMessage.INVALID_CURRENCY,currency,null);
		}
		this.currency = currency;
	}
	/**
	 * Get issuer
	 * @return issuer
	 */
	public String getIssuer() {
		if (issuer != null && issuer.length() > 0)
			return issuer;
		return counterparty;
	}
	/**
	 * Set issuer
	 * @param issuer
	 * @throws InvalidParameterException
	 */
	public void setIssuer(String issuer) throws InvalidParameterException {
		if(issuer!="" && !Utility.isValidAddress(issuer)){
			throw new InvalidParameterException(JingtumMessage.INVALID_JINGTUM_ADDRESS,issuer,null);
		}
		this.issuer = issuer;
		this.counterparty = issuer;
	}		

	/**
	 * Set counter party
	 * @param counterparty
	 * @throws InvalidParameterException 
	 */
	public void setCounterparty(String counterparty) throws InvalidParameterException{
		if(!"".equals(counterparty) && !Utility.isValidAddress(counterparty)){
			throw new InvalidParameterException(JingtumMessage.INVALID_JINGTUM_ADDRESS,counterparty,null);
		}
		this.counterparty = counterparty;
		this.issuer = counterparty;
	}
}

