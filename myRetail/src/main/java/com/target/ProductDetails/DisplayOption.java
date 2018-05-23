
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
    "is_size_chart",
    "is_warranty"
})
public class DisplayOption {

    @JsonProperty("is_size_chart")
    private Boolean isSizeChart;
    @JsonProperty("is_warranty")
    private Boolean isWarranty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_size_chart")
    public Boolean getIsSizeChart() {
        return isSizeChart;
    }

    @JsonProperty("is_size_chart")
    public void setIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
    }

    public DisplayOption withIsSizeChart(Boolean isSizeChart) {
        this.isSizeChart = isSizeChart;
        return this;
    }

    @JsonProperty("is_warranty")
    public Boolean getIsWarranty() {
        return isWarranty;
    }

    @JsonProperty("is_warranty")
    public void setIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
    }

    public DisplayOption withIsWarranty(Boolean isWarranty) {
        this.isWarranty = isWarranty;
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

    public DisplayOption withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isSizeChart).append(isWarranty).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DisplayOption) == false) {
            return false;
        }
        DisplayOption rhs = ((DisplayOption) other);
        return new EqualsBuilder().append(isSizeChart, rhs.isSizeChart).append(isWarranty, rhs.isWarranty).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
