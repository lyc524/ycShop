package com.yc.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.Filter;
import com.sun.net.httpserver.HttpExchange; 

public class EncoderFilter extends Filter{
	
	String encode="";
	public void init(FilterConfig fConfig) throws ServletException {
		if(fConfig.getInitParameter("charset")!=null){
			encode=fConfig.getInitParameter("charset");
		}else{
			encode="utf-8";
		}
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain fChain) throws IOException,ServletException {
		request.setCharacterEncoding(encode);
		response.setContentType("text/html:charset="+encode);
		fChain.doFilter(request, response);
	}
	
	public void destory() {
		
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doFilter(HttpExchange arg0, Chain arg1) throws IOException {
		// TODO Auto-generated method stub
		
	}
 
}
