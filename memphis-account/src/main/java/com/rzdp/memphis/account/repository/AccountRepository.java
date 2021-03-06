package com.rzdp.memphis.account.repository;

import com.rzdp.memphis.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long>,
        JpaSpecificationExecutor<Account> {
    Optional<Account> findByOrganizationId(String organizationId);
}
