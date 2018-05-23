
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
    "gift_wrapable",
    "has_prop65",
    "is_hazmat",
    "max_order_qty",
    "street_date",
    "media_format",
    "merch_class",
    "merch_subclass",
    "return_method"
})
public class Attributes {

    @JsonProperty("gift_wrapable")
    private String giftWrapable;
    @JsonProperty("has_prop65")
    private String hasProp65;
    @JsonProperty("is_hazmat")
    private String isHazmat;
    @JsonProperty("max_order_qty")
    private Integer maxOrderQty;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("media_format")
    private String mediaFormat;
    @JsonProperty("merch_class")
    private String merchClass;
    @JsonProperty("merch_subclass")
    private Integer merchSubclass;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gift_wrapable")
    public String getGiftWrapable() {
        return giftWrapable;
    }

    @JsonProperty("gift_wrapable")
    public void setGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
    }

    public Attributes withGiftWrapable(String giftWrapable) {
        this.giftWrapable = giftWrapable;
        return this;
    }

    @JsonProperty("has_prop65")
    public String getHasProp65() {
        return hasProp65;
    }

    @JsonProperty("has_prop65")
    public void setHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
    }

    public Attributes withHasProp65(String hasProp65) {
        this.hasProp65 = hasProp65;
        return this;
    }

    @JsonProperty("is_hazmat")
    public String getIsHazmat() {
        return isHazmat;
    }

    @JsonProperty("is_hazmat")
    public void setIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
    }

    public Attributes withIsHazmat(String isHazmat) {
        this.isHazmat = isHazmat;
        return this;
    }

    @JsonProperty("max_order_qty")
    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    @JsonProperty("max_order_qty")
    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public Attributes withMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
        return this;
    }

    @JsonProperty("street_date")
    public String getStreetDate() {
        return streetDate;
    }

    @JsonProperty("street_date")
    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public Attributes withStreetDate(String streetDate) {
        this.streetDate = streetDate;
        return this;
    }

    @JsonProperty("media_format")
    public String getMediaFormat() {
        return mediaFormat;
    }

    @JsonProperty("media_format")
    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public Attributes withMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
        return this;
    }

    @JsonProperty("merch_class")
    public String getMerchClass() {
        return merchClass;
    }

    @JsonProperty("merch_class")
    public void setMerchClass(String merchClass) {
        this.merchClass = merchClass;
    }

    public Attributes withMerchClass(String merchClass) {
        this.merchClass = merchClass;
        return this;
    }

    @JsonProperty("merch_subclass")
    public Integer getMerchSubclass() {
        return merchSubclass;
    }

    @JsonProperty("merch_subclass")
    public void setMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
    }

    public Attributes withMerchSubclass(Integer merchSubclass) {
        this.merchSubclass = merchSubclass;
        return this;
    }

    @JsonProperty("return_method")
    public String getReturnMethod() {
        return returnMethod;
    }

    @JsonProperty("return_method")
    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    public Attributes withReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
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

    public Attributes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(giftWrapable).append(hasProp65).append(isHazmat).append(maxOrderQty).append(streetDate).append(mediaFormat).append(merchClass).append(merchSubclass).append(returnMethod).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(giftWrapable, rhs.giftWrapable).append(hasProp65, rhs.hasProp65).append(isHazmat, rhs.isHazmat).append(maxOrderQty, rhs.maxOrderQty).append(streetDate, rhs.streetDate).append(mediaFormat, rhs.mediaFormat).append(merchClass, rhs.merchClass).append(merchSubclass, rhs.merchSubclass).append(returnMethod, rhs.returnMethod).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
