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
package com.jingtum;
/**
 * All used messages
 * @author jzhao
 * @version 1.0
 */
public abstract class JingtumMessage {
	public static final String INVALID_JINGTUM_ADDRESS = "Invalid Jingtum address!";
	public static final String INVALID_ORDER_NUMBER = "Order number cannot be empty!";
	public static final String INVALID_PAGE_INFO = "Invalid paging option!";
	public static final String INVALID_CURRENCY = "Invalid currency!";
	public static final String INVALID_JINGTUM_CURRENCY = "Invalid Jingtum Tum code!";
	public static final String INVALID_VALUE = "Invalid value!";
	public static final String INVALID_LIMIT = "Invalid limit!";
	public static final String SPECIFY_ORDER_TYPE = "Please specify an order type!";
	public static final String ACCOUNT_NOT_FOUND = "Account not found.";
	public static final String INACTIVATED_ACCOUNT = "Inactivated Account;";
	public static final String INVALID_SECRET = "Invalid Jingtum account secret!";
	public static final String INVALID_JINGTUM_AMOUNT = "Invalid JingtumAmount! Please make sure Currency and issuer are all valid.";
	public static final String INVALID_TRUST_LINE = "Invalid trust line! Please make sure Currency and Counterparty are all valid.";
	public static final String INVALID_JINGTUM_ADDRESS_OR_SECRET = "Invalid address or secret!";
	public static final String INVALID_ID = "Invalid ID!";
	public static final String GATEWAY_NOT_INITIALIZED = "Gateway address is not set";
	public static final String CURRENCY_OTHER_THAN_SWT = "Please set currency other than ";
	public static final String INVALID_RELATION_TYPE = "Invalid relation type!";
	public static final String NOT_NULL_MESSAGE_HANDLER = "Message handler cannot be null!";
	public static final String NO_CONNECTION_AVAIABLE = "Please set up connection first!";
	public static final String ERROR_MESSAGE = "Error message: ";
	public static final String ERROR_CODE = "Error code: ";
	public static final String ERROR_INPUT = "Input value cannot be empty!";
	public static final String ERROR_CLIENT_ID = "Client Id cannot be empty!";
	public static final String EMPTY_TOKEN = "FinGate custom token is not set!";
	public static final String EMPTY_KEY = "FinGate custom key is not set!";
	public static final String UNRECOGNIZED_HTTP_METHOD = "Unrecognized HTTP method %s. ";
	public static final String SERVER_ERROR = "IOException during API request to Jingtum (%s): %s "
            					+ "Please check your internet connection and try again. If this problem persists,"
            					+ "you should check Jingtum's service status at https://api.jingtum.com,"
            					+ " or let us know at support@jingtum.com.";
	public static final String UNKNOWN_MODE = "FinGate mode is unknown!";
	public static final String INVALID_TUM_PAIR = "Invalid Tum pair!";
}
