package com.jesus.customerservice.mapper;

import com.jesus.customerservice.dto.CustomerInformation;
import com.jesus.customerservice.dto.Holding;
import com.jesus.customerservice.entity.Customer;
import com.jesus.customerservice.entity.PortfolioItem;

import java.util.List;

public class EntityDtoMapper {

    public static CustomerInformation customerInformation(Customer customer, List<PortfolioItem> portfolioItems) {
        var holdings = portfolioItems.stream()
                .map(pi -> new Holding(pi.getTicker(), pi.getQuantity()))
                .toList();
        return new CustomerInformation(customer.getId(), customer.getName(), customer.getBalance(), holdings);
    }

}
