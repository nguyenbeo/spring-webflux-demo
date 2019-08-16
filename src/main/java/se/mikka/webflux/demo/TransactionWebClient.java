package se.mikka.webflux.demo;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class TransactionWebClient {

    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get()
            .uri("/transactions")
            .accept(MediaType.APPLICATION_JSON)
            .exchange();

    public String getAllTransactions() {
        return ">> result = " + result.flatMap(res -> res.bodyToMono(String.class)).block();
    }
}
