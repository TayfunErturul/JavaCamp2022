package kodlama.io.Homework1.business.requests.subTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseSubTechnologyRequest {
	private String name;
	private int programmingLanguageId;
}
