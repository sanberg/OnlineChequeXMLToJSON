package ru.detmir.sap.mapping.model;


import java.util.Objects;

/**
 * ru.detmir.sap.model.cheque.GiftCardTransactionDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
public class GiftCardTransactionDto {

  private String transactionId = null;


  private String barcode = null;


  private Long transactionDate = null;

  public GiftCardTransactionDto transactionId(String transactionId) {
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

  public GiftCardTransactionDto barcode(String barcode) {
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

  public GiftCardTransactionDto transactionDate(Long transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  public Long getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Long transactionDate) {
    this.transactionDate = transactionDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCardTransactionDto giftCardTransactionDto = (GiftCardTransactionDto) o;
    return Objects.equals(this.transactionId, giftCardTransactionDto.transactionId) &&
        Objects.equals(this.barcode, giftCardTransactionDto.barcode) &&
        Objects.equals(this.transactionDate, giftCardTransactionDto.transactionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, barcode, transactionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ru.detmir.sap.model.cheque.GiftCardTransactionDto {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
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
