package com.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.login.entity.Admins;
import com.login.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	public UserDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Admins user=userRepo.findByEmail(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User Not Exist");
		}else
		{
			CustomUserDtls customUserDtls =new CustomUserDtls(user);
			return customUserDtls;
		}
			
		
	}

}