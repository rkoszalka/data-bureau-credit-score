package org.koszalka.score.bureau.persistence.entity;

import lombok.Getter;
import lombok.Setter;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Person Data Entity
 * @author ctl_rkoszalka
 */
@Getter
@Setter
@Entity
@Table(name = "RA_PERSON_DATA", schema = "PERSON_DATA")
public class CreditScoreEntity extends BaseEntity {

    private static final long serialVersionUID = 1302038376155119059L;

    @Id
    @Column(name = "ID_PERSON_DATA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RAPERSON_DATA_ID")
    @SequenceGenerator(name = "SQ_RAPERSON_DATA_ID", sequenceName = "SQ_RAPERSON_DATA_ID",
            allocationSize = 1, schema = "SALESFORCELEADS_ADM")
    private Long idtPerson;

    @Column(name = "CPF")
    @NotNull
    private String cpf;

    @Column(name = "NAM_PERSON")
    @NotNull
    private String personType;


}