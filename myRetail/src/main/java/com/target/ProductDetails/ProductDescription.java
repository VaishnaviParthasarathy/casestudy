
package com.target.ProductDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "title",
    "bullet_description",
    "general_description"
})
public class ProductDescription {

    @JsonProperty("title")
    private String title;
    @JsonProperty("bullet_description")
    private List<String> bulletDescription = new ArrayList<String>();
    @JsonProperty("general_description")
    private String generalDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ProductDescription withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("bullet_description")
    public List<String> getBulletDescription() {
        return bulletDescription;
    }

    @JsonProperty("bullet_description")
    public void setBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
    }

    public ProductDescription withBulletDescription(List<String> bulletDescription) {
        this.bulletDescription = bulletDescription;
        return this;
    }

    @JsonProperty("general_description")
    public String getGeneralDescription() {
        return generalDescription;
    }

    @JsonProperty("general_description")
    public void setGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
    }

    public ProductDescription withGeneralDescription(String generalDescription) {
        this.generalDescription = generalDescription;
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

    public ProductDescription withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(title).append(bulletDescription).append(generalDescription).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductDescription) == false) {
            return false;
        }
        ProductDescription rhs = ((ProductDescription) other);
        return new EqualsBuilder().append(title, rhs.title).append(bulletDescription, rhs.bulletDescription).append(generalDescription, rhs.generalDescription).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
