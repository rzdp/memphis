package com.rzdp.memphis.organization.controller;

import com.rzdp.memphis.organization.dto.OrganizationDto;
import com.rzdp.memphis.organization.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationController {

    private final OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/v1/organizations/{id}")
    public ResponseEntity<OrganizationDto> getOrganizationById(
            @PathVariable("id") Long organizationId) {
        return new ResponseEntity<>(organizationService
                .getOrganizationById(organizationId), HttpStatus.OK);
    }
}
