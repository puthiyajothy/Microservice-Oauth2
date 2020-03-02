package com.java.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class Userconfiguration extends GlobalAuthenticationConfigurerAdapter{

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser(username:"jothi").password(12345).roles("USER","ADMIN","MANAGER").authorities("CAN_READ,CAN_WRITE","CAN_DELETE")
		.withUser(username:"dilu").password("manager").roles("USER","ADMIN").authorities("CAN_READ,CAN_WRITE");
		
		super.init(auth);
	}
}
