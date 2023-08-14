package ru.detmir.sap.mapping.model;
import java.math.BigDecimal;
import java.util.Objects;
/**
 * ru.detmir.sap.model.cheque.DiscountInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
public class DiscountInfo {
  private String code = null;

  private BigDecimal amountPerItem = null;

  public DiscountInfo code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DiscountInfo amountPerItem(BigDecimal amountPerItem) {
    this.amountPerItem = amountPerItem;
    return this;
  }

   /**
   * Get amountPerItem
   * @return amountPerItem
  **/
  public BigDecimal getAmountPerItem() {
    return amountPerItem;
  }

  public void setAmountPerItem(BigDecimal amountPerItem) {
    this.amountPerItem = amountPerItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInfo discountInfo = (DiscountInfo) o;
    return Objects.equals(this.code, discountInfo.code) &&
        Objects.equals(this.amountPerItem, discountInfo.amountPerItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, amountPerItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ru.detmir.sap.model.cheque.DiscountInfo {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amountPerItem: ").append(toIndentedString(amountPerItem)).append("\n");
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
