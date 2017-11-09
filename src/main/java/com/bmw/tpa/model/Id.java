package com.bmw.tpa.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "$oid" })
public class Id {

	@JsonProperty("$oid")
	private String $oid;

	@JsonProperty("$oid")
	public String get$oid() {
		return $oid;
	}

	@JsonProperty("$oid")
	public void set$oid(String $oid) {
		this.$oid = $oid;
	}

}