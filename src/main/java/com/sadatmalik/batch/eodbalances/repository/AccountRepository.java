package com.sadatmalik.batch.eodbalances.repository;

import com.sadatmalik.batch.eodbalances.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}