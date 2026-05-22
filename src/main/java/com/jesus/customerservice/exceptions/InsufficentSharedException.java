package com.jesus.customerservice.exceptions;

public class InsufficentSharedException extends RuntimeException{

    private static final  String MESSAGE = "Customer with id %d does not have enough shares to complete the transaction.";

    public InsufficentSharedException(Integer id) {
        super(MESSAGE.formatted(id));
    }

}
