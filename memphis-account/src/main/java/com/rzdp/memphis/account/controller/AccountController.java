package com.rzdp.memphis.account.controller;

import com.rzdp.memphis.account.dto.AccountDto;
import com.rzdp.memphis.account.exception.OrganizationNotFoundException;
import com.rzdp.memphis.account.service.AccountService;
import com.rzdp.memphis.account.service.OrganizationService;
import com.rzdp.memphis.account.util.OrganizationUtil;
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
    private final OrganizationService organizationService;

    @Autowired
    public AccountController(AccountService accountService,
                             OrganizationService organizationService) {
        this.accountService = accountService;
        this.organizationService = organizationService;
    }

    @GetMapping("/v1/organizations/{organizationId}/accounts")
    public ResponseEntity<AccountDto> getAccountByOrganizationId(
            @PathVariable long organizationId) {

        boolean exists = organizationService.existsByOrganizationId(organizationId);

        if (!exists) {
            throw new OrganizationNotFoundException("Unable to get organization. " +
                    "OrganizationID=" + organizationId);
        }

        String fullOrganizationId = OrganizationUtil.convertToFullOrganizationId(organizationId);

        return new ResponseEntity<>(accountService
                .getAccountByOrganizationId(fullOrganizationId), HttpStatus.OK);
    }
}
