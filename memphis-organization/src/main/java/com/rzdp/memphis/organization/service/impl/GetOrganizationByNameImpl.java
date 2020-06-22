package com.rzdp.memphis.organization.service.impl;

import com.rzdp.memphis.organization.entity.Organization;
import com.rzdp.memphis.organization.exception.OrganizationNotFoundException;
import com.rzdp.memphis.organization.repository.OrganizationRepository;
import com.rzdp.memphis.organization.service.GetOrganizationByName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetOrganizationByNameImpl implements GetOrganizationByName {


    private final OrganizationRepository organizationRepository;

    @Autowired
    public GetOrganizationByNameImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization execute(String name) {
        Optional<Organization> optionalOrganization =
                organizationRepository.findByName(name);
        if (!optionalOrganization.isPresent()) {
            throw new OrganizationNotFoundException(
                    "Organization not found. Name=" + name
            );
        }
        return optionalOrganization.get();
    }
}
