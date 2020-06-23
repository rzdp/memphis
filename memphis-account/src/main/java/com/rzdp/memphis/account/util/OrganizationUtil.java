package com.rzdp.memphis.account.util;

import org.springframework.util.StringUtils;

public final class OrganizationUtil {

    private static final String ORGANIZATION_ID_PREFIX = "MORG";

    public static String convertToFullOrganizationId(long organizationId) {
        return ORGANIZATION_ID_PREFIX + StringUtil
                .padLeft(String.valueOf(organizationId), 6, "0");
    }
}
