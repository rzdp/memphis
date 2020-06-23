package com.rzdp.memphis.account.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rzdp.memphis.account.dto.AccountDto;
import com.rzdp.memphis.account.service.AccountService;
import com.rzdp.memphis.account.service.GetAccountByOrganizationId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final GetAccountByOrganizationId getAccountByOrganizationId;
    private final ModelMapper modelMapper;

    @Autowired
    public AccountServiceImpl(GetAccountByOrganizationId getAccountByOrganizationId,
                              ModelMapper modelMapper) {
        this.getAccountByOrganizationId = getAccountByOrganizationId;
        this.modelMapper = modelMapper;
    }

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultAccount")
    public AccountDto getAccountByOrganizationId(String organizationId) {
       return modelMapper.map(getAccountByOrganizationId
                .execute(organizationId), AccountDto.class);
    }

    private AccountDto getDefaultAccount(String organizationId) {
        return new AccountDto();
    }
}
