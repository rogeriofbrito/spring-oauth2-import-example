package com.github.rogeriofbrito.springoauth2importexample.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

@Configuration
public class OAuth2RestTemplateConfig {

	/*
	 * This bean can be used when communicating with a server protected with oauth2.
	 * See more: https://docs.spring.io/spring-security/oauth/apidocs/org/springframework/security/oauth2/client/OAuth2RestTemplate.html
	 * */
	@Bean
	public OAuth2RestTemplate OAuth2RestTemplate() {
		return new OAuth2RestTemplate(getResourceDetails());	
	}
	
	private ResourceOwnerPasswordResourceDetails getResourceDetails() {
		ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
		resourceDetails.setGrantType("password");
		
		resourceDetails.setAccessTokenUri("http://oauth2server/oauth/token");
		
		resourceDetails.setClientId("resource-client-id");
		resourceDetails.setClientSecret("resource-client-secret");
		
		resourceDetails.setScope(Arrays.asList("read", "write"));
		
		resourceDetails.setUsername("username");
		resourceDetails.setPassword("password");
		
		return resourceDetails;
	}
}
