package com.jesus.customerservice.exceptions;

import reactor.core.publisher.Mono;

public class ApplicationExceptions {

    public static <T> Mono<T> customerNotFound(Integer id) {
        return Mono.error(new CustomerNotFoundException(id));
    }


    public static <T> Mono<T> insufficentBalance(Integer id) {
        return Mono.error(new InsufficentBalanceException(id));
    }

    public static <T> Mono<T> insufficentShares(Integer id) {
        return Mono.error(new InsufficentSharedException(id));
    }



}
