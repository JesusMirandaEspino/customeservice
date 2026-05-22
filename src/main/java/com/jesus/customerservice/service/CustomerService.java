package com.jesus.customerservice.service;

import com.jesus.customerservice.dto.CustomerInformation;
import com.jesus.customerservice.entity.Customer;
import com.jesus.customerservice.exceptions.ApplicationExceptions;
import com.jesus.customerservice.mapper.EntityDtoMapper;
import com.jesus.customerservice.repository.CustomerRepository;
import com.jesus.customerservice.repository.PortfolioItemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final PortfolioItemRepository portfolioItemService;

    public CustomerService(CustomerRepository customerRepository, PortfolioItemRepository portfolioItemService) {
        this.customerRepository = customerRepository;
        this.portfolioItemService = portfolioItemService;
    }

    public Mono<CustomerInformation> getCustomerInformation(Integer customerId) {
        return this.customerRepository.findById(customerId)
                .switchIfEmpty(ApplicationExceptions.customerNotFound(customerId))
                .flatMap(this::buildCustomerInformation);

      }


      public Mono<CustomerInformation> buildCustomerInformation(Customer customer) {
            return this.portfolioItemService.findAllByCustomerId(customer.getId())
                    .collectList()
                    .map(list -> EntityDtoMapper.customerInformation(customer, list));
      }


}
