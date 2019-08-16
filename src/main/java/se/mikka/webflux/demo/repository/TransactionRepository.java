package se.mikka.webflux.demo.repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionRepository {

    Flux<Transaction> findAll();

    Mono<Transaction> findTransactionById(String id);
}
