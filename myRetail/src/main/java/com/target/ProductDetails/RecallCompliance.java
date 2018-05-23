
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
    "is_product_recalled"
})
public class RecallCompliance {

    @JsonProperty("is_product_recalled")
    private Boolean isProductRecalled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_product_recalled")
    public Boolean getIsProductRecalled() {
        return isProductRecalled;
    }

    @JsonProperty("is_product_recalled")
    public void setIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
    }

    public RecallCompliance withIsProductRecalled(Boolean isProductRecalled) {
        this.isProductRecalled = isProductRecalled;
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

    public RecallCompliance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isProductRecalled).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecallCompliance) == false) {
            return false;
        }
        RecallCompliance rhs = ((RecallCompliance) other);
        return new EqualsBuilder().append(isProductRecalled, rhs.isProductRecalled).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
