package com.rzdp.memphis.organization.service.impl;

import com.rzdp.memphis.organization.repository.OrganizationRepository;
import com.rzdp.memphis.organization.service.ExistOrganizationById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExistOrganizationByIdImpl implements ExistOrganizationById {

    private final OrganizationRepository organizationRepository;

    @Autowired
    public ExistOrganizationByIdImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public boolean execute(Long organizationId) {
        return organizationRepository.existsById(organizationId);
    }
}
