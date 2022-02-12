package springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAPIGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAPIGatewayServiceApplication.class, args);
    }

}
