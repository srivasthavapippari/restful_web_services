package com.srivasthava.rest.webservices.restfulwebservices.user;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path="/hello-world-internationalized")
	public String helloWorldInternationalized(
//			@RequestHeader(name="Accept-Language", required=false) Locale locale
			) {
//		return "Hello world";
		// In the postman go to headers and add key Acept-Language and value as fr
		// instead of passing locale parameter for all the methods, we can access it from LocaleContextHolder
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
