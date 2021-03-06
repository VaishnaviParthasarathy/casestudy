
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
    "is_assortment",
    "is_kit_master",
    "is_standard_item",
    "is_component"
})
public class BundleComponents {

    @JsonProperty("is_assortment")
    private Boolean isAssortment;
    @JsonProperty("is_kit_master")
    private Boolean isKitMaster;
    @JsonProperty("is_standard_item")
    private Boolean isStandardItem;
    @JsonProperty("is_component")
    private Boolean isComponent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("is_assortment")
    public Boolean getIsAssortment() {
        return isAssortment;
    }

    @JsonProperty("is_assortment")
    public void setIsAssortment(Boolean isAssortment) {
        this.isAssortment = isAssortment;
    }

    public BundleComponents withIsAssortment(Boolean isAssortment) {
        this.isAssortment = isAssortment;
        return this;
    }

    @JsonProperty("is_kit_master")
    public Boolean getIsKitMaster() {
        return isKitMaster;
    }

    @JsonProperty("is_kit_master")
    public void setIsKitMaster(Boolean isKitMaster) {
        this.isKitMaster = isKitMaster;
    }

    public BundleComponents withIsKitMaster(Boolean isKitMaster) {
        this.isKitMaster = isKitMaster;
        return this;
    }

    @JsonProperty("is_standard_item")
    public Boolean getIsStandardItem() {
        return isStandardItem;
    }

    @JsonProperty("is_standard_item")
    public void setIsStandardItem(Boolean isStandardItem) {
        this.isStandardItem = isStandardItem;
    }

    public BundleComponents withIsStandardItem(Boolean isStandardItem) {
        this.isStandardItem = isStandardItem;
        return this;
    }

    @JsonProperty("is_component")
    public Boolean getIsComponent() {
        return isComponent;
    }

    @JsonProperty("is_component")
    public void setIsComponent(Boolean isComponent) {
        this.isComponent = isComponent;
    }

    public BundleComponents withIsComponent(Boolean isComponent) {
        this.isComponent = isComponent;
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

    public BundleComponents withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isAssortment).append(isKitMaster).append(isStandardItem).append(isComponent).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BundleComponents) == false) {
            return false;
        }
        BundleComponents rhs = ((BundleComponents) other);
        return new EqualsBuilder().append(isAssortment, rhs.isAssortment).append(isKitMaster, rhs.isKitMaster).append(isStandardItem, rhs.isStandardItem).append(isComponent, rhs.isComponent).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
