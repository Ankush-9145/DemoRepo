package com.test.bodyParamsInXMl;
//for root element

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@XmlRootElement(namespace="Request")
public class Test16BodyParamsWithXmlPojo {
	
/*<Request>
   <login>login</login>
   <password>password</password>
</Request>*/
	
	@JacksonXmlProperty(localName = "login")
	private String login;
	
	@JacksonXmlProperty(localName = "password")
	private String password;
	
	public void setLogin(String login) {
		this.login=login;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
}
