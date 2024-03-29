package ru.detmir.sap.mapping.model;


import java.util.Date;
import java.util.Objects;

/**
 * ru.detmir.sap.model.cheque.AtolReportPayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
public class AtolReportPayload {
  private String ecrRegistrationNumber = null;

  private Long fiscalDocumentAttribute = null;

  private Long fiscalDocumentNumber = null;

  private Long fiscalReceiptNumber = null;

  private Long fnNumber = null;

  private String fnsSite = null;

  private Date receiptDatetime = null;

  private String shiftNumber = null;

  private String total = null;

  private String ofdInn = null;

  private String ofdReceiptUrl = null;

  private String zn = null;

  private String rnm = null;

  public AtolReportPayload ecrRegistrationNumber(String ecrRegistrationNumber) {
    this.ecrRegistrationNumber = ecrRegistrationNumber;
    return this;
  }

   /**
   * № ККТ
   * @return ecrRegistrationNumber
  **/
  public String getEcrRegistrationNumber() {
    return ecrRegistrationNumber;
  }

  public void setEcrRegistrationNumber(String ecrRegistrationNumber) {
    this.ecrRegistrationNumber = ecrRegistrationNumber;
  }

  public AtolReportPayload fiscalDocumentAttribute(Long fiscalDocumentAttribute) {
    this.fiscalDocumentAttribute = fiscalDocumentAttribute;
    return this;
  }

   /**
   * ФП
   * @return fiscalDocumentAttribute
  **/
  public Long getFiscalDocumentAttribute() {
    return fiscalDocumentAttribute;
  }

  public void setFiscalDocumentAttribute(Long fiscalDocumentAttribute) {
    this.fiscalDocumentAttribute = fiscalDocumentAttribute;
  }

  public AtolReportPayload fiscalDocumentNumber(Long fiscalDocumentNumber) {
    this.fiscalDocumentNumber = fiscalDocumentNumber;
    return this;
  }

   /**
   * № ФД
   * @return fiscalDocumentNumber
  **/
  public Long getFiscalDocumentNumber() {
    return fiscalDocumentNumber;
  }

  public void setFiscalDocumentNumber(Long fiscalDocumentNumber) {
    this.fiscalDocumentNumber = fiscalDocumentNumber;
  }

  public AtolReportPayload fiscalReceiptNumber(Long fiscalReceiptNumber) {
    this.fiscalReceiptNumber = fiscalReceiptNumber;
    return this;
  }

   /**
   * КАССОВЫЙ ЧЕК №
   * @return fiscalReceiptNumber
  **/
  public Long getFiscalReceiptNumber() {
    return fiscalReceiptNumber;
  }

  public void setFiscalReceiptNumber(Long fiscalReceiptNumber) {
    this.fiscalReceiptNumber = fiscalReceiptNumber;
  }

  public AtolReportPayload fnNumber(Long fnNumber) {
    this.fnNumber = fnNumber;
    return this;
  }

   /**
   * № ФН
   * @return fnNumber
  **/
  public Long getFnNumber() {
    return fnNumber;
  }

  public void setFnNumber(Long fnNumber) {
    this.fnNumber = fnNumber;
  }

  public AtolReportPayload fnsSite(String fnsSite) {
    this.fnsSite = fnsSite;
    return this;
  }

   /**
   * Get fnsSite
   * @return fnsSite
  **/
  public String getFnsSite() {
    return fnsSite;
  }

  public void setFnsSite(String fnsSite) {
    this.fnsSite = fnsSite;
  }

  public AtolReportPayload receiptDatetime(Date receiptDatetime) {
    this.receiptDatetime = receiptDatetime;
    return this;
  }

   /**
   * КАССОВЫЙ ЧЕК datetime
   * @return receiptDatetime
  **/
  public Date getReceiptDatetime() {
    return receiptDatetime;
  }

  public void setReceiptDatetime(Date receiptDatetime) {
    this.receiptDatetime = receiptDatetime;
  }

  public AtolReportPayload shiftNumber(String shiftNumber) {
    this.shiftNumber = shiftNumber;
    return this;
  }

   /**
   * СМЕНА
   * @return shiftNumber
  **/
  public String getShiftNumber() {
    return shiftNumber;
  }

  public void setShiftNumber(String shiftNumber) {
    this.shiftNumber = shiftNumber;
  }

  public AtolReportPayload total(String total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  public AtolReportPayload ofdInn(String ofdInn) {
    this.ofdInn = ofdInn;
    return this;
  }

   /**
   * ИНН
   * @return ofdInn
  **/
  public String getOfdInn() {
    return ofdInn;
  }

  public void setOfdInn(String ofdInn) {
    this.ofdInn = ofdInn;
  }

  public AtolReportPayload ofdReceiptUrl(String ofdReceiptUrl) {
    this.ofdReceiptUrl = ofdReceiptUrl;
    return this;
  }

   /**
   * Get ofdReceiptUrl
   * @return ofdReceiptUrl
  **/
  public String getOfdReceiptUrl() {
    return ofdReceiptUrl;
  }

  public void setOfdReceiptUrl(String ofdReceiptUrl) {
    this.ofdReceiptUrl = ofdReceiptUrl;
  }

  public AtolReportPayload zn(String zn) {
    this.zn = zn;
    return this;
  }

   /**
   * ЗН ККТ Заводской номер кассы
   * @return zn
  **/
  public String getZn() {
    return zn;
  }

  public void setZn(String zn) {
    this.zn = zn;
  }

  public AtolReportPayload rnm(String rnm) {
    this.rnm = rnm;
    return this;
  }

   /**
   * РН ККТ Регистрационный номер кассы
   * @return rnm
  **/
  public String getRnm() {
    return rnm;
  }

  public void setRnm(String rnm) {
    this.rnm = rnm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtolReportPayload atolReportPayload = (AtolReportPayload) o;
    return Objects.equals(this.ecrRegistrationNumber, atolReportPayload.ecrRegistrationNumber) &&
        Objects.equals(this.fiscalDocumentAttribute, atolReportPayload.fiscalDocumentAttribute) &&
        Objects.equals(this.fiscalDocumentNumber, atolReportPayload.fiscalDocumentNumber) &&
        Objects.equals(this.fiscalReceiptNumber, atolReportPayload.fiscalReceiptNumber) &&
        Objects.equals(this.fnNumber, atolReportPayload.fnNumber) &&
        Objects.equals(this.fnsSite, atolReportPayload.fnsSite) &&
        Objects.equals(this.receiptDatetime, atolReportPayload.receiptDatetime) &&
        Objects.equals(this.shiftNumber, atolReportPayload.shiftNumber) &&
        Objects.equals(this.total, atolReportPayload.total) &&
        Objects.equals(this.ofdInn, atolReportPayload.ofdInn) &&
        Objects.equals(this.ofdReceiptUrl, atolReportPayload.ofdReceiptUrl) &&
        Objects.equals(this.zn, atolReportPayload.zn) &&
        Objects.equals(this.rnm, atolReportPayload.rnm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecrRegistrationNumber, fiscalDocumentAttribute, fiscalDocumentNumber, fiscalReceiptNumber, fnNumber, fnsSite, receiptDatetime, shiftNumber, total, ofdInn, ofdReceiptUrl, zn, rnm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ru.detmir.sap.model.cheque.AtolReportPayload {\n");
    
    sb.append("    ecrRegistrationNumber: ").append(toIndentedString(ecrRegistrationNumber)).append("\n");
    sb.append("    fiscalDocumentAttribute: ").append(toIndentedString(fiscalDocumentAttribute)).append("\n");
    sb.append("    fiscalDocumentNumber: ").append(toIndentedString(fiscalDocumentNumber)).append("\n");
    sb.append("    fiscalReceiptNumber: ").append(toIndentedString(fiscalReceiptNumber)).append("\n");
    sb.append("    fnNumber: ").append(toIndentedString(fnNumber)).append("\n");
    sb.append("    fnsSite: ").append(toIndentedString(fnsSite)).append("\n");
    sb.append("    receiptDatetime: ").append(toIndentedString(receiptDatetime)).append("\n");
    sb.append("    shiftNumber: ").append(toIndentedString(shiftNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    ofdInn: ").append(toIndentedString(ofdInn)).append("\n");
    sb.append("    ofdReceiptUrl: ").append(toIndentedString(ofdReceiptUrl)).append("\n");
    sb.append("    zn: ").append(toIndentedString(zn)).append("\n");
    sb.append("    rnm: ").append(toIndentedString(rnm)).append("\n");
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
