package pojo_classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder(toBuilder = true)
public class Response {
	
	@JsonProperty("name")
	String name;
	@JsonProperty("job")
	String job;
	@JsonProperty("id")
	int id;
	@JsonProperty("createdAt")
	String createdAt;

}
