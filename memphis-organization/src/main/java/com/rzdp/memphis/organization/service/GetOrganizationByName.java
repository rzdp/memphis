package com.rzdp.memphis.organization.service;

import com.rzdp.memphis.organization.entity.Organization;

public interface GetOrganizationByName {

    Organization execute(String name);
}