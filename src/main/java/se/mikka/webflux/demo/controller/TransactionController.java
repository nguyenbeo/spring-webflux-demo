package se.mikka.webflux.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import se.mikka.webflux.demo.repository.Transaction;
import se.mikka.webflux.demo.repository.TransactionRepository;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    /**
     * This is just for demo purpose. In reality, we shouldn't expose DB entity class in the REST request/response.
     */
    @GetMapping
    public Flux<Transaction> getAllTransaction() {
        return transactionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Transaction> getTransactionById(@PathVariable String id) {
        return transactionRepository.findTransactionById(id);
    }
}
