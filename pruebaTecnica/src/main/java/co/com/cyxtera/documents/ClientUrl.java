package co.com.cyxtera.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection  = "urls")
public @Data class ClientUrl {

	@Id
	private String id;	
	
	private String url;
	
	private Double qualification; 
}
