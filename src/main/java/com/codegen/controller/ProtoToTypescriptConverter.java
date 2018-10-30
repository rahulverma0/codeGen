/**
 * 
 */
package com.codegen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codegen.service.protoToTypescript.ProtoToTypescriptModel;
import com.codegen.service.protoToTypescript.ProtoToTypescriptService;

/**
 * @author RV
 *
 */
@RestController
public class ProtoToTypescriptConverter {
	
	/**
	 * Error Codes:
	 * 	200 - SUCESS
		404 - RESOURCE NOT FOUND
		400 - BAD REQUEST
		201 - CREATED
		401 - UNAUTHORIZED
		415 - UNSUPPORTED TYPE - Representation not supported for the resource
		500 - SERVER ERROR
	 */
	@Autowired
	private ProtoToTypescriptService protoToTypescriptService;
	
	@PostMapping("/p2t")
	public ProtoToTypescriptModel protoToTypescript(@RequestBody String protoString) {
		return protoToTypescriptService.convertProtoToTypeScript(protoString);
	}

	public ProtoToTypescriptService getProtoToTypescriptService() {
		return protoToTypescriptService;
	}

	public void setProtoToTypescriptService(ProtoToTypescriptService protoToTypescriptService) {
		this.protoToTypescriptService = protoToTypescriptService;
	}
}
