package in.arjun;

import in.arjun.client.UserClient;
import in.arjun.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class Application {

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUser")
	public List<UserResponse> getAllUser(){
		return userClient.getUsers();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
