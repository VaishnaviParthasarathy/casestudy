
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
    "deep_red_labels",
    "available_to_promise_network",
    "item"
})
public class Product {

    @JsonProperty("deep_red_labels")
    private DeepRedLabels deepRedLabels;
    @JsonProperty("available_to_promise_network")
    private AvailableToPromiseNetwork availableToPromiseNetwork;
    @JsonProperty("item")
    private Item item;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deep_red_labels")
    public DeepRedLabels getDeepRedLabels() {
        return deepRedLabels;
    }

    @JsonProperty("deep_red_labels")
    public void setDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
    }

    public Product withDeepRedLabels(DeepRedLabels deepRedLabels) {
        this.deepRedLabels = deepRedLabels;
        return this;
    }

    @JsonProperty("available_to_promise_network")
    public AvailableToPromiseNetwork getAvailableToPromiseNetwork() {
        return availableToPromiseNetwork;
    }

    @JsonProperty("available_to_promise_network")
    public void setAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
    }

    public Product withAvailableToPromiseNetwork(AvailableToPromiseNetwork availableToPromiseNetwork) {
        this.availableToPromiseNetwork = availableToPromiseNetwork;
        return this;
    }

    @JsonProperty("item")
    public Item getItem() {
        return item;
    }

    @JsonProperty("item")
    public void setItem(Item item) {
        this.item = item;
    }

    public Product withItem(Item item) {
        this.item = item;
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

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deepRedLabels).append(availableToPromiseNetwork).append(item).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(deepRedLabels, rhs.deepRedLabels).append(availableToPromiseNetwork, rhs.availableToPromiseNetwork).append(item, rhs.item).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
