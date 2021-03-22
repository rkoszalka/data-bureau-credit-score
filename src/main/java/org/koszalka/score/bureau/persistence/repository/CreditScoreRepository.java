package org.koszalka.score.bureau.persistence.repository;

import org.koszalka.score.bureau.persistence.entity.CreditScoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Debt List Repository
 * @author rkoszalka
 */

@Repository
public interface CreditScoreRepository extends JpaRepository<CreditScoreEntity, Long> {
}
