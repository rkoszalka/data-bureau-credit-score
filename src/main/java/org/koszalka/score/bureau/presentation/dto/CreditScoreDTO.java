package org.koszalka.score.bureau.presentation.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Credit Score DTO
 * @author rkoszalka
 */
@Getter
@Setter
public class CreditScoreDTO {

    public Integer age;
    public List<CPFPropertiesDTO> properties;
    public org.koszalka.data.bureau.presentation.dto.AddressDTO address;
    public String incomingType;

}
