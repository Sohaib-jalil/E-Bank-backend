package com.sohaib.e_bankbackend.repositories;

import com.sohaib.e_bankbackend.entities.AccountOperation;
import com.sohaib.e_bankbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
