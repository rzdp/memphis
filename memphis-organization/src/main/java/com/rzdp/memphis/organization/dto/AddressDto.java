package com.rzdp.memphis.organization.dto;

import lombok.Data;

@Data
public class AddressDto {

    private Long addressId;
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String state;
    private String country;
    private String postal;

}