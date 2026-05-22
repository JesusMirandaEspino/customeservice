package com.jesus.customerservice.dto;

import com.jesus.customerservice.domain.Ticker;

public record Holding(Ticker ticker, Integer quantity) {
}
