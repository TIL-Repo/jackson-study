package me.hajoo.jacksonexamples._2_serialization._05_JsonValue;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeEnumWithValue {

	TYPE1(1, "Type A"), TYPE2(2, "Type 2");

	private Integer id;
	private String name;

	TypeEnumWithValue(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@JsonValue
	public String getName() {
		return name;
	}
}