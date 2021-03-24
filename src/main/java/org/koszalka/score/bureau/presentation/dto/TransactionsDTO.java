package org.koszalka.score.bureau.presentation.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Transaction DTO
 * @author rkoszalka
 */
@Getter
@Setter
public class TransactionsDTO {

    public LocalDateTime lastBureauSearch;
    public List<FinancialTransactionDTO> financialTransactionsDTOList;
    public org.koszalka.data.bureau.presentation.dto.CreditCardDataDTO creditCardDataDTO;

}
