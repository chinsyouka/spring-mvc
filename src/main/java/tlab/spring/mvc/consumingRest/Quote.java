package tlab.spring.mvc.consumingRest;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	private String type;
	private Value value;
}
