package com.java.oauth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.java.oauth.model.AuthUserDetails;
import com.java.oauth.model.User;
import com.java.oauth.repository.UserDetailsRepository;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	UserDetailsRepository userDetailsRepository;

	
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> optional=userDetailsRepository.findByUsername(name);
		optional.orElseThrow(() -> new UsernameNotFoundException("Username or password wrong"));
		UserDetails userDetails = new AuthUserDetails(optional.get());
		new AccountStatusUserDetailsChecker().check(userDetails);
		
		return userDetails;
	}

}
