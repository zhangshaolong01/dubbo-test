package cn.enn.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("User")
public class User implements Serializable{

	private static final long serialVersionUID = -8403936237259644149L;
	
	@Id
	private String id;
	private String name;
	private Integer age;
	private String email;
	private String createDate;

}
