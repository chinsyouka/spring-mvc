package tlab.spring.mvc.mybatis;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {
	String getUserInfo(String userId, String userName) {
		// UserEntity user = new UserEntity(userId, userName);

		return String.format("id:%s,name:%s", userId, userName);
	}
}
