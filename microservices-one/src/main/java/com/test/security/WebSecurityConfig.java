
package com.test.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	/*
	 * @Bean public PasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * @Bean
	 * 
	 * @Override protected UserDetailsService userDetailsService() { UserDetails
	 * user1 = User.withUsername("namhm")
	 * .password("$2a$10$sWszOXuTlN0amQi8vXp4cerb.tJUQo.4FzLAnTCsSqChsYhlLdQWW").
	 * roles("USER").build(); UserDetails user2 = User.withUsername("admin")
	 * .password("$2a$10$PH0p2x2x8oi5bKx.80Bt7ubMAiHdZnqm9TC/Cpss9VoccyTYw1AoC").
	 * roles("ADMIN").build();
	 * 
	 * return new InMemoryUserDetailsManager(user1, user2); }
	 */

	@Autowired
	private DataSource dataSource;

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
		.dataSource(dataSource)
				.usersByUsernameQuery("select username, password, enabled from users where username=?")
				.authoritiesByUsernameQuery("select username, role from users where username=?");
	}

	

	
	@Override protected void configure(HttpSecurity http) throws Exception { 
		http
	  .csrf().disable() .authorizeHttpRequests()
	  .antMatchers("/","index","/css/*","/js/*").permitAll()
	  //.antMatchers("/api/**").hasRole(ApplicationUserRole.STUDENT.name())
	  .antMatchers(HttpMethod.DELETE,"/microservices-one/**").hasAuthority(ApplicationUserPermission.COURSE_WRITE.getPermission())
	  .antMatchers(HttpMethod.POST,"/microservices-one/**").hasAuthority(ApplicationUserPermission. COURSE_WRITE.getPermission()) 
	  .antMatchers(HttpMethod.PUT,"/microservices-one/**").hasAuthority(ApplicationUserPermission. COURSE_WRITE.getPermission()) 
	  .antMatchers(HttpMethod .GET,"/microservices-one/**").hasAnyRole(ApplicationUserPermission.COURSE_READ.getPermission())
	  
	  .anyRequest().authenticated().and().httpBasic();//.formLogin()
	 // .loginPage("/login").permitAll() .defaultSuccessUrl("/Covers" ,true); 
		}

	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().logout().permitAll().and()
				.exceptionHandling();
	}*/
}

