
package com.target.ProductDetails;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_lead_disclosure"
})
public class EnvironmentalSegmentation {

    @JsonProperty("is_lead_disclosure")
    private Boolean isLeadDisclosure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_lead_disclosure")
    public Boolean getIsLeadDisclosure() {
        return isLeadDisclosure;
    }

    @JsonProperty("is_lead_disclosure")
    public void setIsLeadDisclosure(Boolean isLeadDisclosure) {
        this.isLeadDisclosure = isLeadDisclosure;
    }

    public EnvironmentalSegmentation withIsLeadDisclosure(Boolean isLeadDisclosure) {
        this.isLeadDisclosure = isLeadDisclosure;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public EnvironmentalSegmentation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isLeadDisclosure).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentalSegmentation) == false) {
            return false;
        }
        EnvironmentalSegmentation rhs = ((EnvironmentalSegmentation) other);
        return new EqualsBuilder().append(isLeadDisclosure, rhs.isLeadDisclosure).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
