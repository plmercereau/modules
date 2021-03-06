package org.motechproject.dhis2.rest.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * A class to model the DHIS2 API's organisation unit resource.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrganisationUnitDto extends BaseDto {

    public OrganisationUnitDto() {}

    public OrganisationUnitDto(String uuid, String name) {
        this.setId(uuid);
        this.setName(name);
    }
}
