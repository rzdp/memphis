package com.rzdp.memphis.account.service;

import com.rzdp.memphis.account.dto.AccountDto;

public interface AccountService {

    AccountDto getAccountByOrganizationId(String organizationId);
}
