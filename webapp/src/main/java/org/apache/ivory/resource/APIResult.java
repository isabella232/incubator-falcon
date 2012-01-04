/*
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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ivory.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * APIResult is the output returned by all the APIs; status-SUCCEEDED or FAILED
 * message- detailed message
 */
@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class APIResult {

	private Status status;

	private String message;

	public static enum Status {
		SUCCEEDED, FAILED
	}

	public APIResult(Status status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	private APIResult() {
		// private default constructor for JAXB
	}

	public Status getStatus() {
		return this.status;
	}

	public String getMessage() {
		return this.message;
	}

	@Override
	public String toString() {
		return "{ Status: " + this.status + ", Message: " + this.message + " }";
	}
}