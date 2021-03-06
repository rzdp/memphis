package com.rzdp.memphis.organization.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private Integer code;
    private String message;
    private String description;
    private Date timestamp;

}