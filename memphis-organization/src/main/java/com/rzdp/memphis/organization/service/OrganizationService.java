package com.rzdp.memphis.organization.service;

import com.rzdp.memphis.organization.dto.OrganizationDto;

public interface OrganizationService {

    OrganizationDto getOrganizationById(Long organizationId);

    OrganizationDto getOrganizationByName(String name);
}