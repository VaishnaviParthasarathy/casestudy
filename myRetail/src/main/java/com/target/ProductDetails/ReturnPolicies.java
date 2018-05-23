
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
    "user",
    "policyDays",
    "guestMessage"
})
public class ReturnPolicies {

    @JsonProperty("user")
    private String user;
    @JsonProperty("policyDays")
    private String policyDays;
    @JsonProperty("guestMessage")
    private String guestMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public ReturnPolicies withUser(String user) {
        this.user = user;
        return this;
    }

    @JsonProperty("policyDays")
    public String getPolicyDays() {
        return policyDays;
    }

    @JsonProperty("policyDays")
    public void setPolicyDays(String policyDays) {
        this.policyDays = policyDays;
    }

    public ReturnPolicies withPolicyDays(String policyDays) {
        this.policyDays = policyDays;
        return this;
    }

    @JsonProperty("guestMessage")
    public String getGuestMessage() {
        return guestMessage;
    }

    @JsonProperty("guestMessage")
    public void setGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
    }

    public ReturnPolicies withGuestMessage(String guestMessage) {
        this.guestMessage = guestMessage;
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

    public ReturnPolicies withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(user).append(policyDays).append(guestMessage).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReturnPolicies) == false) {
            return false;
        }
        ReturnPolicies rhs = ((ReturnPolicies) other);
        return new EqualsBuilder().append(user, rhs.user).append(policyDays, rhs.policyDays).append(guestMessage, rhs.guestMessage).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
