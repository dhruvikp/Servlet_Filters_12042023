package com.simplilearn.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter(urlPatterns = { "/dashboard", "/profile" })
public class AuthFilter2 implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthFilter2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// place your code here

		String userId = request.getParameter("userId");
		if (userId != null && userId.equals("johndoe")) {
			System.out.println("Filter 2 gets executed");
			chain.doFilter(request, response);
			System.out.println("Filter2 :This line will get executed after receiving response from servlet");

		} else {
			System.out.println("Request dropped!");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
