package com.rzdp.memphis.organization.service.impl;

import com.rzdp.memphis.organization.dto.OrganizationDto;
import com.rzdp.memphis.organization.service.ExistOrganizationById;
import com.rzdp.memphis.organization.service.GetOrganizationById;
import com.rzdp.memphis.organization.service.GetOrganizationByName;
import com.rzdp.memphis.organization.service.OrganizationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrganizationServiceImpl implements OrganizationService {

    private final GetOrganizationById getOrganizationById;
    private final GetOrganizationByName getOrganizationByName;
    private final ExistOrganizationById existOrganizationById;
    private final ModelMapper modelMapper;

    @Autowired
    public OrganizationServiceImpl(GetOrganizationById getOrganizationById,
                                   GetOrganizationByName getOrganizationByName,
                                   ExistOrganizationById existOrganizationById,
                                   ModelMapper modelMapper) {
        this.getOrganizationById = getOrganizationById;
        this.getOrganizationByName = getOrganizationByName;
        this.existOrganizationById = existOrganizationById;
        this.modelMapper = modelMapper;
    }

    @Override
    public OrganizationDto getOrganizationById(Long organizationId) {
        return modelMapper.map(getOrganizationById.execute(organizationId), OrganizationDto.class);
    }

    @Override
    public OrganizationDto getOrganizationByName(String name) {
        return modelMapper.map(getOrganizationByName.execute(name), OrganizationDto.class);
    }

    @Override
    public boolean existOrganizationById(Long organizationId) {
        return existOrganizationById.execute(organizationId);
    }
}
