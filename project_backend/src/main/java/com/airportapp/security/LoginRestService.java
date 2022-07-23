package com.airportapp.security;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTUtil tokenUtil;

	@Autowired
	private UserDetailsService userDetailsService;

	@RequestMapping(path = "login", method = RequestMethod.POST, consumes = "application/json")
	@RolesAllowed(value = "admin")
	public String login(@RequestBody LoginVO loginVO) {
		// get the authentication manager and authenticate this person
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginVO.getUsername(), loginVO.getPassword()));
		UserDetails details = userDetailsService.loadUserByUsername(loginVO.getUsername());
		return tokenUtil.generateToken(details);
	}
}
