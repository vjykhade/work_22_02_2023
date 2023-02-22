package com.work22022023.microservices.currencyexchangeservice.repository;

import com.work22022023.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
       CurrencyExchange findByFromAndTo(String from, String to);
}
