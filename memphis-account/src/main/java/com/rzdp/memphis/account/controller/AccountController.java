package com.rzdp.memphis.account.controller;

import com.rzdp.memphis.account.dto.AccountDto;
import com.rzdp.memphis.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/v1/organizations/{organizationId}/accounts")
    public ResponseEntity<AccountDto> getAccountByOrganizationId(
            @PathVariable String organizationId) {
        return new ResponseEntity<>(accountService
                .getAccountByOrganizationId(organizationId), HttpStatus.OK);
    }
}
