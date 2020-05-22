//package com.backend.xworld.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class CorsFilter implements Filter {
//
//    private final List<String> ALLOWED_ORIGINS = Arrays.asList("http://localhost:4200");
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletRequest requestToUse = (HttpServletRequest) servletRequest;
//        HttpServletResponse responseToUse = (HttpServletResponse) servletResponse;
//        String incomingOriginFromRequest = requestToUse.getHeader("Origin");
//        if(ALLOWED_ORIGINS.contains(incomingOriginFromRequest)){
//            responseToUse.setHeader("Access-Control-Allow-Origin", incomingOriginFromRequest);
//        }
//        filterChain.doFilter(requestToUse, responseToUse);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
