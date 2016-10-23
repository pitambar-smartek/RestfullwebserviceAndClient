package com.yash.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.core.Headers;
import org.jboss.resteasy.core.ResourceMethodInvoker;
import org.jboss.resteasy.core.ServerResponse;

@ServerInterceptor
@Provider
public class SecurityIntercepter implements ContainerRequestFilter {
	
	 String roles="";

	private static final String AUTHORIZATION_PROPERTY = "Authorization";
	private static final String AUTHENTICATION_SCHEME = "Basic";

	private static final ServerResponse ACCESS_DENIED = new ServerResponse(
			"Access denied for this resource", 401, new Headers<Object>());

	private static final ServerResponse ACCESS_FORBIDDEN = new ServerResponse(
			"Nobody can access this resource", 403, new Headers<Object>());

	private static final ServerResponse SERVER_ERROR = new ServerResponse(
			"INTERNAL SERVER ERROR", 500, new Headers<Object>());;

	@Override
	public void filter(ContainerRequestContext requestContext)
			throws IOException {
		
		ResourceMethodInvoker methodInvoker = (ResourceMethodInvoker) requestContext
				.getProperty("org.jboss.resteasy.core.ResourceMethodInvoker");
		Method method = methodInvoker.getMethod();
		System.out.println("The REquested method =" + method.getName());
		System.out.println("ha ha ha filter is going to executed");

		// Access allowed for all
		if (method.isAnnotationPresent(PermitAll.class)) {
			System.out.println("entering all allow");
			// Access denied for all
			if (method.isAnnotationPresent(DenyAll.class)) {
				requestContext.abortWith(ACCESS_FORBIDDEN);
				return;
			}

			// Get request headers
			final MultivaluedMap<String, String> headers = requestContext
					.getHeaders();

			// Fetch authorization header
			final List<String> authorization = headers
					.get(AUTHORIZATION_PROPERTY);
			
			final List<String> list=headers.get("roles");

			// If no authorization information present; block access
			if (authorization == null || authorization.isEmpty()) {
				requestContext.abortWith(ACCESS_FORBIDDEN);
				System.out.println("Access denied");
				return;
			}

			// Get encoded username and password
			System.out.println("Encoded all=" + authorization.get(0));
			final String encodedUserPassword = authorization.get(0).replaceFirst(AUTHENTICATION_SCHEME , "");
			
			roles=list.get(0);
			System.out.println("The roles is="+roles);

			System.out.println("Encoded username and password="
					+ encodedUserPassword);

			// Decode username and password
			String usernameAndPassword = null;
			try {
				usernameAndPassword = new String(
						 new sun.misc.BASE64Decoder().decodeBuffer(encodedUserPassword));
				
				System.out.println("decoded username and password="+usernameAndPassword);
			} catch (IOException e) {
				requestContext.abortWith(SERVER_ERROR);
				return;
			}

			// Split username and password tokens
			final StringTokenizer tokenizer = new StringTokenizer(
					usernameAndPassword, ":");
			final String username = tokenizer.nextToken();
			final String password = tokenizer.nextToken();

			// Verifying Username and password
			System.out.println("The Actually user name=" + username);
			System.out.println("The Actually user name=" + password);

			// Verify user access
			if (method.isAnnotationPresent(RolesAllowed.class)) {
				RolesAllowed rolesAnnotation = method
						.getAnnotation(RolesAllowed.class);
				Set<String> rolesSet = new HashSet<String>(
						Arrays.asList(rolesAnnotation.value()));

				// Is user valid?
				if (!isUserAllowed(username, password, rolesSet)) {
					requestContext.abortWith(ACCESS_DENIED);
					return;
				}
			}
		}else{
			System.out.println("NNNNNNNNNNNNOOOOOOOOOOOOTTTTTTTTTTTTTTTTTT");
		}
	}

	private boolean isUserAllowed(final String username, final String password,
			final Set<String> rolesSet) {
		System.out.println("IsALLOWED method is executed ha ha ha ha ha");
		boolean isAllowed = false;

		// Step 1. Fetch password from database and match with password in
		// argument //If both match then get the defined role for user from
		// database and continue; else return isAllowed [false] //Access the
		// database and do this part yourself //String userRole =
		// userMgr.getUserRole(username);
		//String userRole = "supervisor";

		// Step 2. Verify user role
		for(String s:rolesSet){
			System.out.println("Allowed user=="+s);
		}
		if (rolesSet.contains(roles)) {
			
			isAllowed = true;
		}
		return isAllowed;
	}

}