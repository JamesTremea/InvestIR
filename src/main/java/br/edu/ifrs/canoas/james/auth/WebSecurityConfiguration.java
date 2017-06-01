package br.edu.ifrs.canoas.james.auth;

import br.edu.canoas.lds.sed.service.AccountUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 * Created by rodrigo on 2/22/17.
 */
@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	AccountUserDetailsService accountUserDetailsService;

	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(accountUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/webjars/**", "/photos/**","/img/**", "/resources/**", "/public/**", "/dist/**", "/db/**",
				"/test/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/**").authorizeRequests().antMatchers("/login**", "/dist/**", "/webjars**", "/db/**")
				.permitAll().anyRequest().authenticated().and().logout().logoutSuccessUrl("/").permitAll().and().csrf()
				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and().formLogin()
				.loginPage("/login").permitAll().and().logout().deleteCookies("remember-me")
				.logoutSuccessUrl("/login?logout").permitAll().and().rememberMe();
		http.csrf().disable();

	}

}