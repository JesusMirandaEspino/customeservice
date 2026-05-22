package com.jesus.customerservice.exceptions;

public class InsufficentBalanceException extends RuntimeException{

    private static final  String MESSAGE = "Customer with id %d does not have enough founds to complete the transaction.";

    public InsufficentBalanceException(Integer id) {
        super(MESSAGE.formatted(id));
    }

}
