package com.mc_es.json;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class CustomDateDeserializer extends StdDeserializer<Date> {

	private static final long serialVersionUID = 1L;
	private static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	public CustomDateDeserializer() {
		this(null);
	}

	public CustomDateDeserializer(Class<Date> t) {
		super(t);
	}

	@Override
	public Date deserialize(JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
		String date = parser.getText();

		try {
			return dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
