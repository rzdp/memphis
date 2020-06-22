package com.rzdp.memphis.organization.dto;

import com.rzdp.memphis.organization.entity.Address;
import com.rzdp.memphis.organization.entity.Contact;
import lombok.Data;

@Data
public class OrganizationDto {

    private Long organizationId;
    private String name;
    private String domain;
    private AddressDto address;
    private ContactDto contact;

}
