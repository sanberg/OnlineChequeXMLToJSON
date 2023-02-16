package ru.detmir.sap.mapping.model;/*
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

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * ru.detmir.sap.model.cheque.LoyaltyTransactionDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
public class LoyaltyTransactionDto {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("barcode")
  private String barcode = null;

  public LoyaltyTransactionDto transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public LoyaltyTransactionDto barcode(String barcode) {
    this.barcode = barcode;
    return this;
  }

   /**
   * Get barcode
   * @return barcode
  **/

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionDto loyaltyTransactionDto = (LoyaltyTransactionDto) o;
    return Objects.equals(this.transactionId, loyaltyTransactionDto.transactionId) &&
        Objects.equals(this.barcode, loyaltyTransactionDto.barcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, barcode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ru.detmir.sap.model.cheque.LoyaltyTransactionDto {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
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
