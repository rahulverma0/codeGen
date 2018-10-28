/**
 * 
 */
package com.codegen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MySpace
 *
 */
@RestController
public class ProtoToTypescriptConverter {
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
