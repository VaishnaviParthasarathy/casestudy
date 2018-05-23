
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
    "weight",
    "weight_unit_of_measure",
    "width",
    "depth",
    "height",
    "dimension_unit_of_measure"
})
public class PackageDimensions {

    @JsonProperty("weight")
    private String weight;
    @JsonProperty("weight_unit_of_measure")
    private String weightUnitOfMeasure;
    @JsonProperty("width")
    private String width;
    @JsonProperty("depth")
    private String depth;
    @JsonProperty("height")
    private String height;
    @JsonProperty("dimension_unit_of_measure")
    private String dimensionUnitOfMeasure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public PackageDimensions withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    @JsonProperty("weight_unit_of_measure")
    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    @JsonProperty("weight_unit_of_measure")
    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    public PackageDimensions withWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
        return this;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    public PackageDimensions withWidth(String width) {
        this.width = width;
        return this;
    }

    @JsonProperty("depth")
    public String getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    public PackageDimensions withDepth(String depth) {
        this.depth = depth;
        return this;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    public PackageDimensions withHeight(String height) {
        this.height = height;
        return this;
    }

    @JsonProperty("dimension_unit_of_measure")
    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    @JsonProperty("dimension_unit_of_measure")
    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    public PackageDimensions withDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
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

    public PackageDimensions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).append(weightUnitOfMeasure).append(width).append(depth).append(height).append(dimensionUnitOfMeasure).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PackageDimensions) == false) {
            return false;
        }
        PackageDimensions rhs = ((PackageDimensions) other);
        return new EqualsBuilder().append(weight, rhs.weight).append(weightUnitOfMeasure, rhs.weightUnitOfMeasure).append(width, rhs.width).append(depth, rhs.depth).append(height, rhs.height).append(dimensionUnitOfMeasure, rhs.dimensionUnitOfMeasure).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
