package org.koszalka.score.bureau.presentation.controller;


import lombok.extern.slf4j.Slf4j;
import org.koszalka.score.bureau.facade.CreditScoreFacade;
import org.koszalka.score.bureau.presentation.dto.PersonDataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.koszalka.score.bureau.presentation.api.CreditScoreAPI;

import java.util.Objects;

/**
 * CPF Person Data controller
 * @author rkoszalka
 */
@Slf4j
@RestController
public class CreditScoreController implements CreditScoreAPI {

    private final CreditScoreFacade creditScoreFacade;

    @Autowired
    public CreditScoreController(CreditScoreFacade creditScoreFacade) {
        this.creditScoreFacade = creditScoreFacade;
    }

    /**
     * @param cpfNumber CPF Number
     * @return personDataDTO.
     */
    @Override
    public ResponseEntity<PersonDataDTO> getCreditScore(@RequestParam Long cpfNumber) {
        if (cpfNumber == null) {
            log.error("M=getCPFCreditScore, message=CPF number is required");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        try {
            PersonDataDTO response = creditScoreFacade.getPersonData(cpfNumber);
            if (Objects.isNull(response)) {
                log.error("M=.getCPFCreditScore, message=Person Data not found for {}", cpfNumber);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (InternalError e) {
            log.error("M=getPersonData, message=Internal Server Error. {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
