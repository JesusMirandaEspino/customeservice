package com.jesus.customerservice.dto;

import com.jesus.customerservice.domain.Ticker;
import com.jesus.customerservice.domain.TradeAction;

public record StockTradeRequest(Ticker ticker, Integer price, Integer quantity, TradeAction action) {
}
