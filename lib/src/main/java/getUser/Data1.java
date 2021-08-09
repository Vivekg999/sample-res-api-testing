package getUser;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Data1 {
	
	@JsonProperty("id")
	int id;
	@JsonProperty("email")
	String email;
	@JsonProperty("first_name")
	String first_name;
	@JsonProperty("last_name")
	String last_name;
	@JsonProperty("avatar")
	String avatar;

}
