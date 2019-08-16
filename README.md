# spring-webflux-demo
A simple demo to experiment the React support of Spring boot

## What is Webflux and why
Spring Webflux is a reactive-stack web framework to support non-blocking and Reactive Streams back pressure.

Why?

The need for a non-blocking web stack to handle concurrency with small number of threads and few resrouces
* Reactive: is the way of handling work by reacting on complete when data is available without blocking.
* Reactive API: provides Mono (0..1) and Flux (0..N) to work on data sequences.

## Technologies
* Spring Boot 2
* Gradle
* Webflux 

## How to run
* Run **gradle bootRun**

## Expect output
`2019-08-16 10:33:08.108  INFO 1990 --- [           main] s.m.webflux.demo.WebfluxDemoApplication  : >> result = [{"id":"id1","amount":150,"currency":"SEK"},{"id":"id2","amount":250,"currency":"NOK"},{"id":"id3","amount":350,"currency":"DNK"},{"id":"id4","amount":450,"currency":"EUR"},{"id":"id5","amount":550,"currency":"USD"}]
`