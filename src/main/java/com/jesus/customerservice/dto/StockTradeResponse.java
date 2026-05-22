package com.jesus.customerservice.dto;

import com.jesus.customerservice.domain.Ticker;
import com.jesus.customerservice.domain.TradeAction;

public record StockTradeResponse(Integer customerId, Ticker ticker, Integer price, Integer quantity, TradeAction action,
Integer totalPrice, Integer balance) {
}
