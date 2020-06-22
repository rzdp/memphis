package com.rzdp.memphis.organization.service;

import com.rzdp.memphis.organization.entity.Organization;

public interface GetOrganizationById {

    Organization execute(Long organizationId);
}