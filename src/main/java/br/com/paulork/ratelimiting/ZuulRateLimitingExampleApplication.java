package br.com.paulork.ratelimiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulRateLimitingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRateLimitingExampleApplication.class, args);
	}

}
