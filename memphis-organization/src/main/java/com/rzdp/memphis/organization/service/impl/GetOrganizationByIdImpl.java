package com.rzdp.memphis.organization.service.impl;

import com.rzdp.memphis.organization.entity.Organization;
import com.rzdp.memphis.organization.exception.OrganizationNotFoundException;
import com.rzdp.memphis.organization.repository.OrganizationRepository;
import com.rzdp.memphis.organization.service.GetOrganizationById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetOrganizationByIdImpl implements GetOrganizationById {


    private final OrganizationRepository organizationRepository;

    @Autowired
    public GetOrganizationByIdImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization execute(Long organizationId) {
        Optional<Organization> optionalOrganization =
                organizationRepository.findById(organizationId);
        if (!optionalOrganization.isPresent()) {
            throw new OrganizationNotFoundException(
                    "Organization not found. ID=" + organizationId
            );
        }
        return optionalOrganization.get();
    }
}
