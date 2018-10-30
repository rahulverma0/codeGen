/**
 * 
 */
package com.codegen.service.protoToTypescript;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author RV
 *
 */
public class ProtoToTypescriptModel {
	@JsonProperty
	private String typeScript;

	public String getTypeScript() {
		return typeScript;
	}

	public void setTypeScript(String typeScript) {
		this.typeScript = typeScript;
	}
	
}
