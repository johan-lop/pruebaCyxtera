package co.com.cyxtera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.cyxtera.business.ClientUrlBusiness;

@RestController
public class UrlController {

	@Autowired
	private ClientUrlBusiness clientUrlBusiness;
	
	@GetMapping("/getUrls")
	public String saluda() {
		clientUrlBusiness.processUrl("nueva url");
		return "Hola";
	}
	
}
