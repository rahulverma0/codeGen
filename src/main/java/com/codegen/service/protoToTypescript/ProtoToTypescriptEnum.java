/**
 * 
 */
package com.codegen.service.protoToTypescript;

/**
 * @author RV
 *
 */
public enum ProtoToTypescriptEnum {

	DOUBLE("double","number"),
	FLOAT("float","number"),
	INT32("int32","number"),
	INT64("int64","number"),
	UINT32("uint32","number"),
	UINT64("uint64","number"),
	SINT32("sint32","number"),
	SINT64("sint64","number"),
	FIXED32("fixed32","number"),
	FIXED64("fixed64","number"),
	SFIXED32("sfixed32","number"),
	SFIXED64("sfixed64","number"),
	BOOL("bool","boolean"),
	STRING("string","string"),
	BYTE("bytes","string");
	
	private final String key;
    private final String value;
    
    ProtoToTypescriptEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
