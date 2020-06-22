package com.rzdp.memphis.account.dto;

import lombok.Data;

@Data
public class AccountDto {

    private Long id;
    private String organizationId;
    private String email;
    private String password;
    private String phone;
    private boolean active;

}
