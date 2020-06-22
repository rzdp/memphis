package com.rzdp.memphis.account.service;

import com.rzdp.memphis.account.entity.Account;

public interface GetAccountByOrganizationId {

    Account execute(String organizationId);
}
