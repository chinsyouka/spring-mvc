package tlab.spring.mvc.mybatis;

import lombok.Data;

@Data
public class UserEntity {

	public String userId;
	public String userName;

	public UserEntity(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
}
