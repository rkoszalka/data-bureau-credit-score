package org.koszalka.score.bureau.facade;

import org.koszalka.score.bureau.persistence.service.CreditScoreService;
import org.koszalka.score.bureau.presentation.dto.PersonDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditScoreFacade {

    private final CreditScoreService creditScoreService;

    @Autowired
    public CreditScoreFacade(CreditScoreService creditScoreService) {
        this.creditScoreService = creditScoreService;
    }

    public PersonDataDTO getPersonData(Long cpfNumber) {
        return creditScoreService.getPersonData(cpfNumber);
    }
}
