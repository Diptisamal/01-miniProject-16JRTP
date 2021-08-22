package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CantactRestController {
	@GetMapping("/contact")
	public String getContact() {
		return "index";
	}

}