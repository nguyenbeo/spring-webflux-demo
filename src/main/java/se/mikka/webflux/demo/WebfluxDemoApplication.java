package se.mikka.webflux.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxDemoApplication {

	private static final Logger LOG = LoggerFactory.getLogger(WebfluxDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebfluxDemoApplication.class, args);

		TransactionWebClient webClient = new TransactionWebClient();
		LOG.info(webClient.getAllTransactions());
	}

}
