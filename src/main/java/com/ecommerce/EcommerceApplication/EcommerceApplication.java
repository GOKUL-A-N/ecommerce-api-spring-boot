package com.ecommerce.EcommerceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		String dbUrl = dotenv.get("MONGO_DB_URL");

        assert dbUrl != null;

        System.setProperty("MONGO_DB_URL",dbUrl);

		SpringApplication.run(EcommerceApplication.class, args);
	}

}
