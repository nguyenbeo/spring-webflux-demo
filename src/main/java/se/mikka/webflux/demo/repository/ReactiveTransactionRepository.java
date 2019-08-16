package se.mikka.webflux.demo.repository;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ReactiveTransactionRepository implements TransactionRepository {

    private static List<Transaction> transactions = new ArrayList<>();

    static {
        transactions.add(new Transaction("id1", 150, "SEK"));
        transactions.add(new Transaction("id2", 250, "NOK"));
        transactions.add(new Transaction("id3", 350, "DNK"));
        transactions.add(new Transaction("id4", 450, "EUR"));
        transactions.add(new Transaction("id5", 550, "USD"));
    }

    @Override
    public Flux<Transaction> findAll() {
        //Mock big data, streaming it every 2 second
        return Flux.fromIterable(transactions).delayElements(Duration.ofSeconds(2));
    }

    @Override
    public Mono<Transaction> findTransactionById(String id) {
        return Mono.from(findAll()).filter(t -> t.equals(id));
    }
}
