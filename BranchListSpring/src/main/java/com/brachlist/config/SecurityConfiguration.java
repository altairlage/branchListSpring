package com.brachlist.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
//	@Autowired
//	private UsuarioDAO usuarioDao;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/produtos/form").hasAnyRole("ADMIN")
//			.antMatchers("/carrinho/**").permitAll()
//			.antMatchers(HttpMethod.POST, "/produtos").hasRole("ADMIN")
//			.antMatchers(HttpMethod.GET, "/produtos").hasRole("ADMIN")
//			.antMatchers("/produtos/**").permitAll()
//			.antMatchers("/resources/**").permitAll()
//			.antMatchers("/").permitAll()
//			.anyRequest().authenticated()
//			.and().formLogin().loginPage("/login").permitAll()
//			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
			
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(userDao).passwordEncoder(new BCryptPasswordEncoder());
	}
}
