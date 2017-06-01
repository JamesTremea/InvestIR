package br.edu.ifrs.canoas.james.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by rodrigo on 2/22/17.
 */
@Configuration
@EnableGlobalAuthentication
@Profile("development")
public class SecurityConfigDev extends GlobalAuthenticationConfigurerAdapter {

	private final UserDetailsService userDetailsService;

	public SecurityConfigDev(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.userDetailsService);
	}

}
