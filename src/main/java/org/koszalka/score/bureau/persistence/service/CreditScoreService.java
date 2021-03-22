package org.koszalka.score.bureau.persistence.service;

import org.koszalka.score.bureau.persistence.entity.CreditScoreEntity;
import org.koszalka.score.bureau.persistence.repository.CreditScoreRepository;
import org.koszalka.score.bureau.presentation.dto.PersonDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreService {

    private final CreditScoreRepository creditScoreRepository;

    @Autowired
    public CreditScoreService(CreditScoreRepository creditScoreRepository) {
        this.creditScoreRepository = creditScoreRepository;
    }

    public PersonDataDTO getPersonData(Long cpfNumber) {
        CreditScoreEntity creditScoreEntity = creditScoreRepository.getOne(cpfNumber);
        PersonDataDTO personDataDTO = new PersonDataDTO();

        // @todo: DTO ObjectMapper

        return personDataDTO;
    }
}
