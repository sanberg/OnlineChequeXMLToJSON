package ru.detmir.sap.model.cheque;/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * ru.detmir.sap.model.cheque.ItemDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
public class ItemDto {
  @SerializedName("id")
  private Integer id = null;

  /**
   * Gets or Sets itemType
   */
  @JsonAdapter(ItemTypeEnum.Adapter.class)
  public enum ItemTypeEnum {
    DONATION("donation"),
    PRODUCT("product"),
    DELIVERY("delivery"),
    GIFT_CARD("gift_card");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ItemTypeEnum fromValue(String input) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ItemTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("itemType")
  private ItemTypeEnum itemType = null;

  @SerializedName("orderCode")
  private String orderCode = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productCode")
  private String productCode = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("position")
  private Integer position = null;

  /**
   * Gets or Sets ndsCode
   */
  @JsonAdapter(NdsCodeEnum.Adapter.class)
  public enum NdsCodeEnum {
    NONE("NONE"),
    NDS_0("NDS_0"),
    NDS_10("NDS_10"),
    NDS_10_110("NDS_10_110"),
    NDS_20("NDS_20"),
    NDS_20_120("NDS_20_120");

    private String value;

    NdsCodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static NdsCodeEnum fromValue(String input) {
      for (NdsCodeEnum b : NdsCodeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<NdsCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NdsCodeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public NdsCodeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return NdsCodeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ndsCode")
  private NdsCodeEnum ndsCode = null;

  @SerializedName("discountInfo")
  private List<DiscountInfo> discountInfo = null;

  @SerializedName("createdTs")
  private Long createdTs = null;

  @SerializedName("chequeId")
  private Integer chequeId = null;

  @SerializedName("loyaltyPercent")
  private Integer loyaltyPercent = null;

  @SerializedName("vendorCode")
  private String vendorCode = null;

  @SerializedName("vendorPhone")
  private String vendorPhone = null;

  @SerializedName("vendorName")
  private String vendorName = null;

  @SerializedName("vendorInn")
  private String vendorInn = null;

  public ItemDto id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemDto itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/

  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public ItemDto orderCode(String orderCode) {
    this.orderCode = orderCode;
    return this;
  }

   /**
   * Get orderCode
   * @return orderCode
  **/

  public String getOrderCode() {
    return orderCode;
  }

  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  public ItemDto productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ItemDto productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public ItemDto quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ItemDto price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ItemDto position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public ItemDto ndsCode(NdsCodeEnum ndsCode) {
    this.ndsCode = ndsCode;
    return this;
  }

   /**
   * Get ndsCode
   * @return ndsCode
  **/

  public NdsCodeEnum getNdsCode() {
    return ndsCode;
  }

  public void setNdsCode(NdsCodeEnum ndsCode) {
    this.ndsCode = ndsCode;
  }

  public ItemDto discountInfo(List<DiscountInfo> discountInfo) {
    this.discountInfo = discountInfo;
    return this;
  }

  public ItemDto addDiscountInfoItem(DiscountInfo discountInfoItem) {
    if (this.discountInfo == null) {
      this.discountInfo = new ArrayList<DiscountInfo>();
    }
    this.discountInfo.add(discountInfoItem);
    return this;
  }

   /**
   * Get discountInfo
   * @return discountInfo
  **/

  public List<DiscountInfo> getDiscountInfo() {
    return discountInfo;
  }

  public void setDiscountInfo(List<DiscountInfo> discountInfo) {
    this.discountInfo = discountInfo;
  }

  public ItemDto createdTs(Long createdTs) {
    this.createdTs = createdTs;
    return this;
  }

   /**
   * Get createdTs
   * @return createdTs
  **/

  public Long getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(Long createdTs) {
    this.createdTs = createdTs;
  }

  public ItemDto chequeId(Integer chequeId) {
    this.chequeId = chequeId;
    return this;
  }

   /**
   * Get chequeId
   * @return chequeId
  **/

  public Integer getChequeId() {
    return chequeId;
  }

  public void setChequeId(Integer chequeId) {
    this.chequeId = chequeId;
  }

  public ItemDto loyaltyPercent(Integer loyaltyPercent) {
    this.loyaltyPercent = loyaltyPercent;
    return this;
  }

   /**
   * Get loyaltyPercent
   * @return loyaltyPercent
  **/

  public Integer getLoyaltyPercent() {
    return loyaltyPercent;
  }

  public void setLoyaltyPercent(Integer loyaltyPercent) {
    this.loyaltyPercent = loyaltyPercent;
  }

  public ItemDto vendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
    return this;
  }

   /**
   * Get vendorCode
   * @return vendorCode
  **/

  public String getVendorCode() {
    return vendorCode;
  }

  public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
  }

  public ItemDto vendorPhone(String vendorPhone) {
    this.vendorPhone = vendorPhone;
    return this;
  }

   /**
   * Get vendorPhone
   * @return vendorPhone
  **/

  public String getVendorPhone() {
    return vendorPhone;
  }

  public void setVendorPhone(String vendorPhone) {
    this.vendorPhone = vendorPhone;
  }

  public ItemDto vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/

  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }

  public ItemDto vendorInn(String vendorInn) {
    this.vendorInn = vendorInn;
    return this;
  }

   /**
   * Get vendorInn
   * @return vendorInn
  **/

  public String getVendorInn() {
    return vendorInn;
  }

  public void setVendorInn(String vendorInn) {
    this.vendorInn = vendorInn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDto itemDto = (ItemDto) o;
    return Objects.equals(this.id, itemDto.id) &&
        Objects.equals(this.itemType, itemDto.itemType) &&
        Objects.equals(this.orderCode, itemDto.orderCode) &&
        Objects.equals(this.productName, itemDto.productName) &&
        Objects.equals(this.productCode, itemDto.productCode) &&
        Objects.equals(this.quantity, itemDto.quantity) &&
        Objects.equals(this.price, itemDto.price) &&
        Objects.equals(this.position, itemDto.position) &&
        Objects.equals(this.ndsCode, itemDto.ndsCode) &&
        Objects.equals(this.discountInfo, itemDto.discountInfo) &&
        Objects.equals(this.createdTs, itemDto.createdTs) &&
        Objects.equals(this.chequeId, itemDto.chequeId) &&
        Objects.equals(this.loyaltyPercent, itemDto.loyaltyPercent) &&
        Objects.equals(this.vendorCode, itemDto.vendorCode) &&
        Objects.equals(this.vendorPhone, itemDto.vendorPhone) &&
        Objects.equals(this.vendorName, itemDto.vendorName) &&
        Objects.equals(this.vendorInn, itemDto.vendorInn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemType, orderCode, productName, productCode, quantity, price, position, ndsCode, discountInfo, createdTs, chequeId, loyaltyPercent, vendorCode, vendorPhone, vendorName, vendorInn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ru.detmir.sap.model.cheque.ItemDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    orderCode: ").append(toIndentedString(orderCode)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    ndsCode: ").append(toIndentedString(ndsCode)).append("\n");
    sb.append("    discountInfo: ").append(toIndentedString(discountInfo)).append("\n");
    sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
    sb.append("    chequeId: ").append(toIndentedString(chequeId)).append("\n");
    sb.append("    loyaltyPercent: ").append(toIndentedString(loyaltyPercent)).append("\n");
    sb.append("    vendorCode: ").append(toIndentedString(vendorCode)).append("\n");
    sb.append("    vendorPhone: ").append(toIndentedString(vendorPhone)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorInn: ").append(toIndentedString(vendorInn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}