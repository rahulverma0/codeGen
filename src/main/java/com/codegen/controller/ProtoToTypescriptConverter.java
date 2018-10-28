/**
 * 
 */
package com.codegen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RV
 *
 */
@RestController
public class ProtoToTypescriptConverter {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
