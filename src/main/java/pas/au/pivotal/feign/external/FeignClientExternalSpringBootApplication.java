package pas.au.pivotal.feign.external;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientExternalSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientExternalSpringBootApplication.class, args);
	}
}
