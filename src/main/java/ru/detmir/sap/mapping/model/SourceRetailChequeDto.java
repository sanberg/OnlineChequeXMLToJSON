package ru.detmir.sap.mapping.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class SourceRetailChequeDto {
    @SerializedName("transactionNumber")
    private String transactionNumber = null;
    @SerializedName("calendarDay")
    private String calendarDay = null;

    @SerializedName("posId")
    private String posId = null;

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getCalendarDay() {
        return calendarDay;
    }

    public void setCalendarDay(String calendarDay) {
        this.calendarDay = calendarDay;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SourceRetailChequeDto that = (SourceRetailChequeDto) o;

        if (!Objects.equals(transactionNumber, that.transactionNumber))
            return false;
        if (!Objects.equals(calendarDay, that.calendarDay)) return false;
        return Objects.equals(posId, that.posId);
    }

    @Override
    public int hashCode() {
        int result = transactionNumber != null ? transactionNumber.hashCode() : 0;
        result = 31 * result + (calendarDay != null ? calendarDay.hashCode() : 0);
        result = 31 * result + (posId != null ? posId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SourceRetailChequeDto{" +
               "transactionNumber='" + transactionNumber + '\'' +
               ", calendarDay='" + calendarDay + '\'' +
               ", posId='" + posId + '\'' +
               '}';
    }
}
