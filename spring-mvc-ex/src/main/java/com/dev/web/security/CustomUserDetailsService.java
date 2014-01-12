package com.dev.web.security;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomUserDetailsService.
 */
public class CustomUserDetailsService implements UserDetailsService {
	
	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		System.out.println("username recieved :: " + username);
		// Get this user details from database and set its roles also here
		Collection<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails user = new User(username, "password", true, true, true, true, authorities);
		return user;
	}
}