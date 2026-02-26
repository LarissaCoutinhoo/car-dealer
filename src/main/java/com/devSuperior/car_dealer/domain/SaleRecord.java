package com.devSuperior.car_dealer.domain;
import java.math.BigDecimal;

//classe de representação dos dados
public record SaleRecord(
        String dealerId,
        String saleDate,
        String model,
        String paymentType,
        BigDecimal salePriceBrl
) {
}
