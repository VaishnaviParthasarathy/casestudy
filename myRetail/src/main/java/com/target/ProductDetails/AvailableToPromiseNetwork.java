
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
    "product_id",
    "id_type",
    "available_to_promise_quantity",
    "street_date",
    "availability",
    "online_available_to_promise_quantity",
    "stores_available_to_promise_quantity",
    "availability_status",
    "multichannel_options",
    "is_infinite_inventory",
    "loyalty_availability_status",
    "loyalty_purchase_start_date_time",
    "is_loyalty_purchase_enabled",
    "is_out_of_stock_in_all_store_locations",
    "is_out_of_stock_in_all_online_locations"
})
public class AvailableToPromiseNetwork {

    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("id_type")
    private String idType;
    @JsonProperty("available_to_promise_quantity")
    private Double availableToPromiseQuantity;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("online_available_to_promise_quantity")
    private Double onlineAvailableToPromiseQuantity;
    @JsonProperty("stores_available_to_promise_quantity")
    private Double storesAvailableToPromiseQuantity;
    @JsonProperty("availability_status")
    private String availabilityStatus;
    @JsonProperty("multichannel_options")
    private List<Object> multichannelOptions = new ArrayList<Object>();
    @JsonProperty("is_infinite_inventory")
    private Boolean isInfiniteInventory;
    @JsonProperty("loyalty_availability_status")
    private String loyaltyAvailabilityStatus;
    @JsonProperty("loyalty_purchase_start_date_time")
    private String loyaltyPurchaseStartDateTime;
    @JsonProperty("is_loyalty_purchase_enabled")
    private Boolean isLoyaltyPurchaseEnabled;
    @JsonProperty("is_out_of_stock_in_all_store_locations")
    private Boolean isOutOfStockInAllStoreLocations;
    @JsonProperty("is_out_of_stock_in_all_online_locations")
    private Boolean isOutOfStockInAllOnlineLocations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public AvailableToPromiseNetwork withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    @JsonProperty("id_type")
    public String getIdType() {
        return idType;
    }

    @JsonProperty("id_type")
    public void setIdType(String idType) {
        this.idType = idType;
    }

    public AvailableToPromiseNetwork withIdType(String idType) {
        this.idType = idType;
        return this;
    }

    @JsonProperty("available_to_promise_quantity")
    public Double getAvailableToPromiseQuantity() {
        return availableToPromiseQuantity;
    }

    @JsonProperty("available_to_promise_quantity")
    public void setAvailableToPromiseQuantity(Double availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
    }

    public AvailableToPromiseNetwork withAvailableToPromiseQuantity(Double availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
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

    public AvailableToPromiseNetwork withStreetDate(String streetDate) {
        this.streetDate = streetDate;
        return this;
    }

    @JsonProperty("availability")
    public String getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public AvailableToPromiseNetwork withAvailability(String availability) {
        this.availability = availability;
        return this;
    }

    @JsonProperty("online_available_to_promise_quantity")
    public Double getOnlineAvailableToPromiseQuantity() {
        return onlineAvailableToPromiseQuantity;
    }

    @JsonProperty("online_available_to_promise_quantity")
    public void setOnlineAvailableToPromiseQuantity(Double onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
    }

    public AvailableToPromiseNetwork withOnlineAvailableToPromiseQuantity(Double onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
        return this;
    }

    @JsonProperty("stores_available_to_promise_quantity")
    public Double getStoresAvailableToPromiseQuantity() {
        return storesAvailableToPromiseQuantity;
    }

    @JsonProperty("stores_available_to_promise_quantity")
    public void setStoresAvailableToPromiseQuantity(Double storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
    }

    public AvailableToPromiseNetwork withStoresAvailableToPromiseQuantity(Double storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
        return this;
    }

    @JsonProperty("availability_status")
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    @JsonProperty("availability_status")
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public AvailableToPromiseNetwork withAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
        return this;
    }

    @JsonProperty("multichannel_options")
    public List<Object> getMultichannelOptions() {
        return multichannelOptions;
    }

    @JsonProperty("multichannel_options")
    public void setMultichannelOptions(List<Object> multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
    }

    public AvailableToPromiseNetwork withMultichannelOptions(List<Object> multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
        return this;
    }

    @JsonProperty("is_infinite_inventory")
    public Boolean getIsInfiniteInventory() {
        return isInfiniteInventory;
    }

    @JsonProperty("is_infinite_inventory")
    public void setIsInfiniteInventory(Boolean isInfiniteInventory) {
        this.isInfiniteInventory = isInfiniteInventory;
    }

    public AvailableToPromiseNetwork withIsInfiniteInventory(Boolean isInfiniteInventory) {
        this.isInfiniteInventory = isInfiniteInventory;
        return this;
    }

    @JsonProperty("loyalty_availability_status")
    public String getLoyaltyAvailabilityStatus() {
        return loyaltyAvailabilityStatus;
    }

    @JsonProperty("loyalty_availability_status")
    public void setLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
    }

    public AvailableToPromiseNetwork withLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
        return this;
    }

    @JsonProperty("loyalty_purchase_start_date_time")
    public String getLoyaltyPurchaseStartDateTime() {
        return loyaltyPurchaseStartDateTime;
    }

    @JsonProperty("loyalty_purchase_start_date_time")
    public void setLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
    }

    public AvailableToPromiseNetwork withLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
        return this;
    }

    @JsonProperty("is_loyalty_purchase_enabled")
    public Boolean getIsLoyaltyPurchaseEnabled() {
        return isLoyaltyPurchaseEnabled;
    }

    @JsonProperty("is_loyalty_purchase_enabled")
    public void setIsLoyaltyPurchaseEnabled(Boolean isLoyaltyPurchaseEnabled) {
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
    }

    public AvailableToPromiseNetwork withIsLoyaltyPurchaseEnabled(Boolean isLoyaltyPurchaseEnabled) {
        this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
        return this;
    }

    @JsonProperty("is_out_of_stock_in_all_store_locations")
    public Boolean getIsOutOfStockInAllStoreLocations() {
        return isOutOfStockInAllStoreLocations;
    }

    @JsonProperty("is_out_of_stock_in_all_store_locations")
    public void setIsOutOfStockInAllStoreLocations(Boolean isOutOfStockInAllStoreLocations) {
        this.isOutOfStockInAllStoreLocations = isOutOfStockInAllStoreLocations;
    }

    public AvailableToPromiseNetwork withIsOutOfStockInAllStoreLocations(Boolean isOutOfStockInAllStoreLocations) {
        this.isOutOfStockInAllStoreLocations = isOutOfStockInAllStoreLocations;
        return this;
    }

    @JsonProperty("is_out_of_stock_in_all_online_locations")
    public Boolean getIsOutOfStockInAllOnlineLocations() {
        return isOutOfStockInAllOnlineLocations;
    }

    @JsonProperty("is_out_of_stock_in_all_online_locations")
    public void setIsOutOfStockInAllOnlineLocations(Boolean isOutOfStockInAllOnlineLocations) {
        this.isOutOfStockInAllOnlineLocations = isOutOfStockInAllOnlineLocations;
    }

    public AvailableToPromiseNetwork withIsOutOfStockInAllOnlineLocations(Boolean isOutOfStockInAllOnlineLocations) {
        this.isOutOfStockInAllOnlineLocations = isOutOfStockInAllOnlineLocations;
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

    public AvailableToPromiseNetwork withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(productId).append(idType).append(availableToPromiseQuantity).append(streetDate).append(availability).append(onlineAvailableToPromiseQuantity).append(storesAvailableToPromiseQuantity).append(availabilityStatus).append(multichannelOptions).append(isInfiniteInventory).append(loyaltyAvailabilityStatus).append(loyaltyPurchaseStartDateTime).append(isLoyaltyPurchaseEnabled).append(isOutOfStockInAllStoreLocations).append(isOutOfStockInAllOnlineLocations).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AvailableToPromiseNetwork) == false) {
            return false;
        }
        AvailableToPromiseNetwork rhs = ((AvailableToPromiseNetwork) other);
        return new EqualsBuilder().append(productId, rhs.productId).append(idType, rhs.idType).append(availableToPromiseQuantity, rhs.availableToPromiseQuantity).append(streetDate, rhs.streetDate).append(availability, rhs.availability).append(onlineAvailableToPromiseQuantity, rhs.onlineAvailableToPromiseQuantity).append(storesAvailableToPromiseQuantity, rhs.storesAvailableToPromiseQuantity).append(availabilityStatus, rhs.availabilityStatus).append(multichannelOptions, rhs.multichannelOptions).append(isInfiniteInventory, rhs.isInfiniteInventory).append(loyaltyAvailabilityStatus, rhs.loyaltyAvailabilityStatus).append(loyaltyPurchaseStartDateTime, rhs.loyaltyPurchaseStartDateTime).append(isLoyaltyPurchaseEnabled, rhs.isLoyaltyPurchaseEnabled).append(isOutOfStockInAllStoreLocations, rhs.isOutOfStockInAllStoreLocations).append(isOutOfStockInAllOnlineLocations, rhs.isOutOfStockInAllOnlineLocations).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
