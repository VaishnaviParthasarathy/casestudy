
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
    "tcin",
    "bundle_components",
    "dpci",
    "upc",
    "product_description",
    "parent_items",
    "buy_url",
    "variation",
    "enrichment",
    "return_method",
    "handling",
    "recall_compliance",
    "tax_category",
    "display_option",
    "fulfillment",
    "package_dimensions",
    "environmental_segmentation",
    "manufacturer",
    "product_vendors",
    "product_classification",
    "product_brand",
    "item_state",
    "specifications",
    "attributes",
    "country_of_origin",
    "relationship_type_code",
    "subscription_eligible",
    "ribbons",
    "tags",
    "estore_item_status_code",
    "return_policies",
    "gifting_enabled"
})
public class Item {

    @JsonProperty("tcin")
    private String tcin;
    @JsonProperty("bundle_components")
    private BundleComponents bundleComponents;
    @JsonProperty("dpci")
    private String dpci;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("product_description")
    private ProductDescription productDescription;
    @JsonProperty("parent_items")
    private String parentItems;
    @JsonProperty("buy_url")
    private String buyUrl;
    @JsonProperty("variation")
    private Variation variation;
    @JsonProperty("enrichment")
    private Enrichment enrichment;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonProperty("handling")
    private Handling handling;
    @JsonProperty("recall_compliance")
    private RecallCompliance recallCompliance;
    @JsonProperty("tax_category")
    private TaxCategory taxCategory;
    @JsonProperty("display_option")
    private DisplayOption displayOption;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("package_dimensions")
    private PackageDimensions packageDimensions;
    @JsonProperty("environmental_segmentation")
    private EnvironmentalSegmentation environmentalSegmentation;
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;
    @JsonProperty("product_vendors")
    private List<ProductVendor> productVendors = new ArrayList<ProductVendor>();
    @JsonProperty("product_classification")
    private ProductClassification productClassification;
    @JsonProperty("product_brand")
    private ProductBrand productBrand;
    @JsonProperty("item_state")
    private String itemState;
    @JsonProperty("specifications")
    private List<Object> specifications = new ArrayList<Object>();
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    @JsonProperty("relationship_type_code")
    private String relationshipTypeCode;
    @JsonProperty("subscription_eligible")
    private Boolean subscriptionEligible;
    @JsonProperty("ribbons")
    private List<Object> ribbons = new ArrayList<Object>();
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("estore_item_status_code")
    private String estoreItemStatusCode;
    @JsonProperty("return_policies")
    private ReturnPolicies returnPolicies;
    @JsonProperty("gifting_enabled")
    private Boolean giftingEnabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tcin")
    public String getTcin() {
        return tcin;
    }

    @JsonProperty("tcin")
    public void setTcin(String tcin) {
        this.tcin = tcin;
    }

    public Item withTcin(String tcin) {
        this.tcin = tcin;
        return this;
    }

    @JsonProperty("bundle_components")
    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    @JsonProperty("bundle_components")
    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    public Item withBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
        return this;
    }

    @JsonProperty("dpci")
    public String getDpci() {
        return dpci;
    }

    @JsonProperty("dpci")
    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    public Item withDpci(String dpci) {
        this.dpci = dpci;
        return this;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    public Item withUpc(String upc) {
        this.upc = upc;
        return this;
    }

    @JsonProperty("product_description")
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    @JsonProperty("product_description")
    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public Item withProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    @JsonProperty("parent_items")
    public String getParentItems() {
        return parentItems;
    }

    @JsonProperty("parent_items")
    public void setParentItems(String parentItems) {
        this.parentItems = parentItems;
    }

    public Item withParentItems(String parentItems) {
        this.parentItems = parentItems;
        return this;
    }

    @JsonProperty("buy_url")
    public String getBuyUrl() {
        return buyUrl;
    }

    @JsonProperty("buy_url")
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public Item withBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
        return this;
    }

    @JsonProperty("variation")
    public Variation getVariation() {
        return variation;
    }

    @JsonProperty("variation")
    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    public Item withVariation(Variation variation) {
        this.variation = variation;
        return this;
    }

    @JsonProperty("enrichment")
    public Enrichment getEnrichment() {
        return enrichment;
    }

    @JsonProperty("enrichment")
    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    public Item withEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
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

    public Item withReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
        return this;
    }

    @JsonProperty("handling")
    public Handling getHandling() {
        return handling;
    }

    @JsonProperty("handling")
    public void setHandling(Handling handling) {
        this.handling = handling;
    }

    public Item withHandling(Handling handling) {
        this.handling = handling;
        return this;
    }

    @JsonProperty("recall_compliance")
    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    @JsonProperty("recall_compliance")
    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    public Item withRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
        return this;
    }

    @JsonProperty("tax_category")
    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    @JsonProperty("tax_category")
    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public Item withTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    @JsonProperty("display_option")
    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    @JsonProperty("display_option")
    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    public Item withDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
        return this;
    }

    @JsonProperty("fulfillment")
    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    @JsonProperty("fulfillment")
    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public Item withFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
        return this;
    }

    @JsonProperty("package_dimensions")
    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    @JsonProperty("package_dimensions")
    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public Item withPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
        return this;
    }

    @JsonProperty("environmental_segmentation")
    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    @JsonProperty("environmental_segmentation")
    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    public Item withEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
        return this;
    }

    @JsonProperty("manufacturer")
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @JsonProperty("manufacturer")
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Item withManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    @JsonProperty("product_vendors")
    public List<ProductVendor> getProductVendors() {
        return productVendors;
    }

    @JsonProperty("product_vendors")
    public void setProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
    }

    public Item withProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
        return this;
    }

    @JsonProperty("product_classification")
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    @JsonProperty("product_classification")
    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    public Item withProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
        return this;
    }

    @JsonProperty("product_brand")
    public ProductBrand getProductBrand() {
        return productBrand;
    }

    @JsonProperty("product_brand")
    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public Item withProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
        return this;
    }

    @JsonProperty("item_state")
    public String getItemState() {
        return itemState;
    }

    @JsonProperty("item_state")
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public Item withItemState(String itemState) {
        this.itemState = itemState;
        return this;
    }

    @JsonProperty("specifications")
    public List<Object> getSpecifications() {
        return specifications;
    }

    @JsonProperty("specifications")
    public void setSpecifications(List<Object> specifications) {
        this.specifications = specifications;
    }

    public Item withSpecifications(List<Object> specifications) {
        this.specifications = specifications;
        return this;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Item withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    @JsonProperty("country_of_origin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("country_of_origin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Item withCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        return this;
    }

    @JsonProperty("relationship_type_code")
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    @JsonProperty("relationship_type_code")
    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    public Item withRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
        return this;
    }

    @JsonProperty("subscription_eligible")
    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    @JsonProperty("subscription_eligible")
    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    public Item withSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
        return this;
    }

    @JsonProperty("ribbons")
    public List<Object> getRibbons() {
        return ribbons;
    }

    @JsonProperty("ribbons")
    public void setRibbons(List<Object> ribbons) {
        this.ribbons = ribbons;
    }

    public Item withRibbons(List<Object> ribbons) {
        this.ribbons = ribbons;
        return this;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Item withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("estore_item_status_code")
    public String getEstoreItemStatusCode() {
        return estoreItemStatusCode;
    }

    @JsonProperty("estore_item_status_code")
    public void setEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
    }

    public Item withEstoreItemStatusCode(String estoreItemStatusCode) {
        this.estoreItemStatusCode = estoreItemStatusCode;
        return this;
    }

    @JsonProperty("return_policies")
    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    @JsonProperty("return_policies")
    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    public Item withReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
        return this;
    }

    @JsonProperty("gifting_enabled")
    public Boolean getGiftingEnabled() {
        return giftingEnabled;
    }

    @JsonProperty("gifting_enabled")
    public void setGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
    }

    public Item withGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
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

    public Item withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tcin).append(bundleComponents).append(dpci).append(upc).append(productDescription).append(parentItems).append(buyUrl).append(variation).append(enrichment).append(returnMethod).append(handling).append(recallCompliance).append(taxCategory).append(displayOption).append(fulfillment).append(packageDimensions).append(environmentalSegmentation).append(manufacturer).append(productVendors).append(productClassification).append(productBrand).append(itemState).append(specifications).append(attributes).append(countryOfOrigin).append(relationshipTypeCode).append(subscriptionEligible).append(ribbons).append(tags).append(estoreItemStatusCode).append(returnPolicies).append(giftingEnabled).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(tcin, rhs.tcin).append(bundleComponents, rhs.bundleComponents).append(dpci, rhs.dpci).append(upc, rhs.upc).append(productDescription, rhs.productDescription).append(parentItems, rhs.parentItems).append(buyUrl, rhs.buyUrl).append(variation, rhs.variation).append(enrichment, rhs.enrichment).append(returnMethod, rhs.returnMethod).append(handling, rhs.handling).append(recallCompliance, rhs.recallCompliance).append(taxCategory, rhs.taxCategory).append(displayOption, rhs.displayOption).append(fulfillment, rhs.fulfillment).append(packageDimensions, rhs.packageDimensions).append(environmentalSegmentation, rhs.environmentalSegmentation).append(manufacturer, rhs.manufacturer).append(productVendors, rhs.productVendors).append(productClassification, rhs.productClassification).append(productBrand, rhs.productBrand).append(itemState, rhs.itemState).append(specifications, rhs.specifications).append(attributes, rhs.attributes).append(countryOfOrigin, rhs.countryOfOrigin).append(relationshipTypeCode, rhs.relationshipTypeCode).append(subscriptionEligible, rhs.subscriptionEligible).append(ribbons, rhs.ribbons).append(tags, rhs.tags).append(estoreItemStatusCode, rhs.estoreItemStatusCode).append(returnPolicies, rhs.returnPolicies).append(giftingEnabled, rhs.giftingEnabled).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
