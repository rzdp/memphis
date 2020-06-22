package com.rzdp.memphis.account.service.impl;

import com.rzdp.memphis.account.entity.Account;
import com.rzdp.memphis.account.exception.AccountNotFoundException;
import com.rzdp.memphis.account.repository.AccountRepository;
import com.rzdp.memphis.account.service.GetAccountByOrganizationId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetAccountByOrganizationIdImpl implements GetAccountByOrganizationId {

    private final AccountRepository accountRepository;

    @Autowired
    public GetAccountByOrganizationIdImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account execute(String organizationId) {
        Optional<Account> optionalAccount = accountRepository
                .findByOrganizationId(organizationId);
        if (!optionalAccount.isPresent()) {
            throw new AccountNotFoundException("Account not found. " +
                    "Organization ID=" + organizationId);
        }
        return optionalAccount.get();
    }
}
