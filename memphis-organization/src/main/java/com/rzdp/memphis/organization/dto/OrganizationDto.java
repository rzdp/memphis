package com.rzdp.memphis.organization.dto;

import lombok.Data;

@Data
public class OrganizationDto {

    private Long organizationId;
    private String name;
    private String domain;
    private AddressDto address;
    private ContactDto contact;

}
