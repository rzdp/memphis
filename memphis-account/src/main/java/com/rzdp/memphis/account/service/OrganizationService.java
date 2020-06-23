package com.rzdp.memphis.account.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "memphis-organization")
@RequestMapping("/api")
public interface OrganizationService {

    @GetMapping("/v1/organizations/{id}/exists")
    boolean existsByOrganizationId(@PathVariable("id") Long organizationId);
}
