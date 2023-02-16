package ru.detmir.sap.mapping.model;

/*
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


import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ru.detmir.sap.model.cheque.ChequeDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-15T05:59:41.749518627Z[GMT]")
@XmlRootElement(namespace = "urn:DetMir.ru:Hybris:Finance", name = "SalesEmailCheckRequest")
public class ChequeDto {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("externalId")
    private String externalId = null;

    @SerializedName("orderGuid")
    private String orderGuid = null;

    @SerializedName("orderCode")
    private String orderCode = null;

    @SerializedName("groupCode")
    private String groupCode = null;

    @SerializedName("groupGuid")
    private String groupGuid = null;

    @SerializedName("totalAmount")
    private BigDecimal totalAmount = null;

    @SerializedName("totalDiscount")
    private BigDecimal totalDiscount = null;

    @SerializedName("createdTs")
    private Long createdTs = null;

    /**
     * Gets or Sets type
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        SALE("sale"),
        REFUND("refund");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static TypeEnum fromValue(String input) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return TypeEnum.fromValue((String)(value));
            }
        }
    }  @SerializedName("type")
    private TypeEnum type = null;

    @SerializedName("atolData")
    private AtolReportResponse atolData = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("url")
    private String url = null;

    @SerializedName("userEmail")
    private String userEmail = null;

    @SerializedName("userName")
    private String userName = null;

    @SerializedName("userPhone")
    private String userPhone = null;

    @SerializedName("createdTsSource")
    private Long createdTsSource = null;

    /**
     * Gets or Sets channel
     */
    @JsonAdapter(ChannelEnum.Adapter.class)
    public enum ChannelEnum {
        ONLINE("online"),
        OFFLINE("offline");

        private String value;

        ChannelEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static ChannelEnum fromValue(String input) {
            for (ChannelEnum b : ChannelEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<ChannelEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ChannelEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ChannelEnum.fromValue((String)(value));
            }
        }
    }  @SerializedName("channel")
    private ChannelEnum channel = null;

    @SerializedName("items")
    private List<ItemDto> items = null;

    @SerializedName("prepaid")
    private Boolean prepaid = null;

    @SerializedName("loyalty")
    private LoyaltyTransactionDto loyalty = null;

    @SerializedName("cashier")
    private String cashier = null;

    @SerializedName("posId")
    private String posId = null;

    @SerializedName("address")
    private String address = null;

    @SerializedName("placeOfSettlement")
    private String placeOfSettlement = null;

    /**
     * Gets or Sets chain
     */
    @JsonAdapter(ChainEnum.Adapter.class)
    public enum ChainEnum {
        ZOOZAVR("zoozavr"),
        DETMIR("detmir");

        private String value;

        ChainEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static ChainEnum fromValue(String input) {
            for (ChainEnum b : ChainEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<ChainEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ChainEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ChainEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ChainEnum.fromValue((String)(value));
            }
        }
    }  @SerializedName("chain")
    private ChainEnum chain = null;

    @SerializedName("loyaltyPromoText")
    private String loyaltyPromoText = null;

    @SerializedName("promoText")
    private String promoText = null;

    @SerializedName("giftCard")
    private String giftCard = null;

    @SerializedName("giftCardTs")
    private Long giftCardTs = null;

    @SerializedName("giftCardAmount")
    private BigDecimal giftCardAmount = null;

    @SerializedName("bonusCard")
    private String bonusCard = null;

    @SerializedName("redeemed")
    private BigDecimal redeemed = null;

    @SerializedName("awarded")
    private BigDecimal awarded = null;

    @SerializedName("loyaltyBalance")
    private BigDecimal loyaltyBalance = null;

    @SerializedName("loyaltyActivePoints")
    private BigDecimal loyaltyActivePoints = null;

    @SerializedName("loyaltyInactivePoints")
    private BigDecimal loyaltyInactivePoints = null;

    @SerializedName("ndsMap")
    private Map<String, BigDecimal> ndsMap = null;

    @SerializedName("sent")
    private Boolean sent = null;

    @SerializedName("mustBeSent")
    private Boolean mustBeSent = null;

    /**
     * Gets or Sets paymentMethod
     */
    @JsonAdapter(PaymentMethodEnum.Adapter.class)
    public enum PaymentMethodEnum {
        CARD("card"),
        CASH("cash"),
        PAYPAL("paypal"),
        LOYALTY("loyalty"),
        GIFT("gift"),
        QUICKPAY("quickpay"),
        APPLEPAY("applepay"),
        GOOGLEPAY("googlepay"),
        SAMSUNGPAY("samsungpay"),
        GIFTCARD("giftcard"),
        MOKKA("mokka"),
        DOLYAME("dolyame");

        private String value;

        PaymentMethodEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static PaymentMethodEnum fromValue(String input) {
            for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PaymentMethodEnum.fromValue((String)(value));
            }
        }
    }  @SerializedName("paymentMethod")
    private PaymentMethodEnum paymentMethod = null;

    @SerializedName("cardAmount")
    private BigDecimal cardAmount = null;

    @SerializedName("cashAmount")
    private BigDecimal cashAmount = null;

    @SerializedName("giftCardDetails")
    private List<GiftCardTransactionDto> giftCardDetails = null;

    @SerializedName("properties")
    private Map<String, String> properties = null;

    @SerializedName("groupPublicId")
    private Boolean groupPublicId = null;

    public ChequeDto id(Integer id) {
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

    public ChequeDto externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     **/
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ChequeDto orderGuid(String orderGuid) {
        this.orderGuid = orderGuid;
        return this;
    }

    /**
     * Get orderGuid
     * @return orderGuid
     **/
    public String getOrderGuid() {
        return orderGuid;
    }

    public void setOrderGuid(String orderGuid) {
        this.orderGuid = orderGuid;
    }

    public ChequeDto orderCode(String orderCode) {
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

    public ChequeDto groupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }

    /**
     * Get groupCode
     * @return groupCode
     **/
    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public ChequeDto groupGuid(String groupGuid) {
        this.groupGuid = groupGuid;
        return this;
    }

    /**
     * Get groupGuid
     * @return groupGuid
     **/
    public String getGroupGuid() {
        return groupGuid;
    }

    public void setGroupGuid(String groupGuid) {
        this.groupGuid = groupGuid;
    }

    public ChequeDto totalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * Get totalAmount
     * @return totalAmount
     **/
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ChequeDto totalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }

    /**
     * Get totalDiscount
     * @return totalDiscount
     **/
    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public ChequeDto createdTs(Long createdTs) {
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

    public ChequeDto type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ChequeDto atolData(AtolReportResponse atolData) {
        this.atolData = atolData;
        return this;
    }

    /**
     * Get atolData
     * @return atolData
     **/
    public AtolReportResponse getAtolData() {
        return atolData;
    }

    public void setAtolData(AtolReportResponse atolData) {
        this.atolData = atolData;
    }

    public ChequeDto description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChequeDto url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ChequeDto userEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Get userEmail
     * @return userEmail
     **/
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public ChequeDto userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get userName
     * @return userName
     **/
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ChequeDto userPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * Get userPhone
     * @return userPhone
     **/
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public ChequeDto createdTsSource(Long createdTsSource) {
        this.createdTsSource = createdTsSource;
        return this;
    }

    /**
     * Get createdTsSource
     * @return createdTsSource
     **/
    public Long getCreatedTsSource() {
        return createdTsSource;
    }

    public void setCreatedTsSource(Long createdTsSource) {
        this.createdTsSource = createdTsSource;
    }

    public ChequeDto channel(ChannelEnum channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Get channel
     * @return channel
     **/
    public ChannelEnum getChannel() {
        return channel;
    }

    public void setChannel(ChannelEnum channel) {
        this.channel = channel;
    }

    public ChequeDto items(List<ItemDto> items) {
        this.items = items;
        return this;
    }

    public ChequeDto addItemsItem(ItemDto itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<ItemDto>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     **/
    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
    }

    public ChequeDto prepaid(Boolean prepaid) {
        this.prepaid = prepaid;
        return this;
    }

    /**
     * Get prepaid
     * @return prepaid
     **/
    public Boolean isPrepaid() {
        return prepaid;
    }

    public void setPrepaid(Boolean prepaid) {
        this.prepaid = prepaid;
    }

    public ChequeDto loyalty(LoyaltyTransactionDto loyalty) {
        this.loyalty = loyalty;
        return this;
    }

    /**
     * Get loyalty
     * @return loyalty
     **/
    public LoyaltyTransactionDto getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(LoyaltyTransactionDto loyalty) {
        this.loyalty = loyalty;
    }

    public ChequeDto cashier(String cashier) {
        this.cashier = cashier;
        return this;
    }

    /**
     * Get cashier
     * @return cashier
     **/
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public ChequeDto posId(String posId) {
        this.posId = posId;
        return this;
    }

    /**
     * Get posId
     * @return posId
     **/
    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public ChequeDto address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     **/
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ChequeDto placeOfSettlement(String placeOfSettlement) {
        this.placeOfSettlement = placeOfSettlement;
        return this;
    }

    /**
     * Get placeOfSettlement
     * @return placeOfSettlement
     **/
    public String getPlaceOfSettlement() {
        return placeOfSettlement;
    }

    public void setPlaceOfSettlement(String placeOfSettlement) {
        this.placeOfSettlement = placeOfSettlement;
    }

    public ChequeDto chain(ChainEnum chain) {
        this.chain = chain;
        return this;
    }

    /**
     * Get chain
     * @return chain
     **/
    public ChainEnum getChain() {
        return chain;
    }

    public void setChain(ChainEnum chain) {
        this.chain = chain;
    }

    public ChequeDto loyaltyPromoText(String loyaltyPromoText) {
        this.loyaltyPromoText = loyaltyPromoText;
        return this;
    }

    /**
     * Get loyaltyPromoText
     * @return loyaltyPromoText
     **/
    public String getLoyaltyPromoText() {
        return loyaltyPromoText;
    }

    public void setLoyaltyPromoText(String loyaltyPromoText) {
        this.loyaltyPromoText = loyaltyPromoText;
    }

    public ChequeDto promoText(String promoText) {
        this.promoText = promoText;
        return this;
    }

    /**
     * Get promoText
     * @return promoText
     **/
    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }

    public ChequeDto giftCard(String giftCard) {
        this.giftCard = giftCard;
        return this;
    }

    /**
     * Get giftCard
     * @return giftCard
     **/
    public String getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(String giftCard) {
        this.giftCard = giftCard;
    }

    public ChequeDto giftCardTs(Long giftCardTs) {
        this.giftCardTs = giftCardTs;
        return this;
    }

    /**
     * Get giftCardTs
     * @return giftCardTs
     **/
    public Long getGiftCardTs() {
        return giftCardTs;
    }

    public void setGiftCardTs(Long giftCardTs) {
        this.giftCardTs = giftCardTs;
    }

    public ChequeDto giftCardAmount(BigDecimal giftCardAmount) {
        this.giftCardAmount = giftCardAmount;
        return this;
    }

    /**
     * Get giftCardAmount
     * @return giftCardAmount
     **/
    public BigDecimal getGiftCardAmount() {
        return giftCardAmount;
    }

    public void setGiftCardAmount(BigDecimal giftCardAmount) {
        this.giftCardAmount = giftCardAmount;
    }

    public ChequeDto bonusCard(String bonusCard) {
        this.bonusCard = bonusCard;
        return this;
    }

    /**
     * Get bonusCard
     * @return bonusCard
     **/
    public String getBonusCard() {
        return bonusCard;
    }

    public void setBonusCard(String bonusCard) {
        this.bonusCard = bonusCard;
    }

    public ChequeDto redeemed(BigDecimal redeemed) {
        this.redeemed = redeemed;
        return this;
    }

    /**
     * Get redeemed
     * @return redeemed
     **/
    public BigDecimal getRedeemed() {
        return redeemed;
    }

    public void setRedeemed(BigDecimal redeemed) {
        this.redeemed = redeemed;
    }

    public ChequeDto awarded(BigDecimal awarded) {
        this.awarded = awarded;
        return this;
    }

    /**
     * Get awarded
     * @return awarded
     **/
    public BigDecimal getAwarded() {
        return awarded;
    }

    public void setAwarded(BigDecimal awarded) {
        this.awarded = awarded;
    }

    public ChequeDto loyaltyBalance(BigDecimal loyaltyBalance) {
        this.loyaltyBalance = loyaltyBalance;
        return this;
    }

    /**
     * Get loyaltyBalance
     * @return loyaltyBalance
     **/
    public BigDecimal getLoyaltyBalance() {
        return loyaltyBalance;
    }

    public void setLoyaltyBalance(BigDecimal loyaltyBalance) {
        this.loyaltyBalance = loyaltyBalance;
    }

    public ChequeDto loyaltyActivePoints(BigDecimal loyaltyActivePoints) {
        this.loyaltyActivePoints = loyaltyActivePoints;
        return this;
    }

    /**
     * Get loyaltyActivePoints
     * @return loyaltyActivePoints
     **/
    public BigDecimal getLoyaltyActivePoints() {
        return loyaltyActivePoints;
    }

    public void setLoyaltyActivePoints(BigDecimal loyaltyActivePoints) {
        this.loyaltyActivePoints = loyaltyActivePoints;
    }

    public ChequeDto loyaltyInactivePoints(BigDecimal loyaltyInactivePoints) {
        this.loyaltyInactivePoints = loyaltyInactivePoints;
        return this;
    }

    /**
     * Get loyaltyInactivePoints
     * @return loyaltyInactivePoints
     **/
    public BigDecimal getLoyaltyInactivePoints() {
        return loyaltyInactivePoints;
    }

    public void setLoyaltyInactivePoints(BigDecimal loyaltyInactivePoints) {
        this.loyaltyInactivePoints = loyaltyInactivePoints;
    }

    public ChequeDto ndsMap(Map<String, BigDecimal> ndsMap) {
        this.ndsMap = ndsMap;
        return this;
    }

    public ChequeDto putNdsMapItem(String key, BigDecimal ndsMapItem) {
        if (this.ndsMap == null) {
            this.ndsMap = new HashMap<String, BigDecimal>();
        }
        this.ndsMap.put(key, ndsMapItem);
        return this;
    }

    /**
     * Get ndsMap
     * @return ndsMap
     **/
    public Map<String, BigDecimal> getNdsMap() {
        return ndsMap;
    }

    public void setNdsMap(Map<String, BigDecimal> ndsMap) {
        this.ndsMap = ndsMap;
    }

    public ChequeDto sent(Boolean sent) {
        this.sent = sent;
        return this;
    }

    /**
     * Get sent
     * @return sent
     **/
    public Boolean isSent() {
        return sent;
    }

    public void setSent(Boolean sent) {
        this.sent = sent;
    }

    public ChequeDto mustBeSent(Boolean mustBeSent) {
        this.mustBeSent = mustBeSent;
        return this;
    }

    /**
     * Get mustBeSent
     * @return mustBeSent
     **/
    public Boolean isMustBeSent() {
        return mustBeSent;
    }

    public void setMustBeSent(Boolean mustBeSent) {
        this.mustBeSent = mustBeSent;
    }

    public ChequeDto paymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Get paymentMethod
     * @return paymentMethod
     **/
    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ChequeDto cardAmount(BigDecimal cardAmount) {
        this.cardAmount = cardAmount;
        return this;
    }

    /**
     * Get cardAmount
     * @return cardAmount
     **/
    public BigDecimal getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(BigDecimal cardAmount) {
        this.cardAmount = cardAmount;
    }

    public ChequeDto cashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    /**
     * Get cashAmount
     * @return cashAmount
     **/
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public ChequeDto giftCardDetails(List<GiftCardTransactionDto> giftCardDetails) {
        this.giftCardDetails = giftCardDetails;
        return this;
    }

    public ChequeDto addGiftCardDetailsItem(GiftCardTransactionDto giftCardDetailsItem) {
        if (this.giftCardDetails == null) {
            this.giftCardDetails = new ArrayList<GiftCardTransactionDto>();
        }
        this.giftCardDetails.add(giftCardDetailsItem);
        return this;
    }

    /**
     * Get giftCardDetails
     * @return giftCardDetails
     **/
    public List<GiftCardTransactionDto> getGiftCardDetails() {
        return giftCardDetails;
    }

    public void setGiftCardDetails(List<GiftCardTransactionDto> giftCardDetails) {
        this.giftCardDetails = giftCardDetails;
    }

    public ChequeDto properties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public ChequeDto putPropertiesItem(String key, String propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<String, String>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    /**
     * Get properties
     * @return properties
     **/
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public ChequeDto groupPublicId(Boolean groupPublicId) {
        this.groupPublicId = groupPublicId;
        return this;
    }

    /**
     * Get groupPublicId
     * @return groupPublicId
     **/
    public Boolean isGroupPublicId() {
        return groupPublicId;
    }

    public void setGroupPublicId(Boolean groupPublicId) {
        this.groupPublicId = groupPublicId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChequeDto chequeDto = (ChequeDto) o;
        return Objects.equals(this.id, chequeDto.id) &&
                Objects.equals(this.externalId, chequeDto.externalId) &&
                Objects.equals(this.orderGuid, chequeDto.orderGuid) &&
                Objects.equals(this.orderCode, chequeDto.orderCode) &&
                Objects.equals(this.groupCode, chequeDto.groupCode) &&
                Objects.equals(this.groupGuid, chequeDto.groupGuid) &&
                Objects.equals(this.totalAmount, chequeDto.totalAmount) &&
                Objects.equals(this.totalDiscount, chequeDto.totalDiscount) &&
                Objects.equals(this.createdTs, chequeDto.createdTs) &&
                Objects.equals(this.type, chequeDto.type) &&
                Objects.equals(this.atolData, chequeDto.atolData) &&
                Objects.equals(this.description, chequeDto.description) &&
                Objects.equals(this.url, chequeDto.url) &&
                Objects.equals(this.userEmail, chequeDto.userEmail) &&
                Objects.equals(this.userName, chequeDto.userName) &&
                Objects.equals(this.userPhone, chequeDto.userPhone) &&
                Objects.equals(this.createdTsSource, chequeDto.createdTsSource) &&
                Objects.equals(this.channel, chequeDto.channel) &&
                Objects.equals(this.items, chequeDto.items) &&
                Objects.equals(this.prepaid, chequeDto.prepaid) &&
                Objects.equals(this.loyalty, chequeDto.loyalty) &&
                Objects.equals(this.cashier, chequeDto.cashier) &&
                Objects.equals(this.posId, chequeDto.posId) &&
                Objects.equals(this.address, chequeDto.address) &&
                Objects.equals(this.placeOfSettlement, chequeDto.placeOfSettlement) &&
                Objects.equals(this.chain, chequeDto.chain) &&
                Objects.equals(this.loyaltyPromoText, chequeDto.loyaltyPromoText) &&
                Objects.equals(this.promoText, chequeDto.promoText) &&
                Objects.equals(this.giftCard, chequeDto.giftCard) &&
                Objects.equals(this.giftCardTs, chequeDto.giftCardTs) &&
                Objects.equals(this.giftCardAmount, chequeDto.giftCardAmount) &&
                Objects.equals(this.bonusCard, chequeDto.bonusCard) &&
                Objects.equals(this.redeemed, chequeDto.redeemed) &&
                Objects.equals(this.awarded, chequeDto.awarded) &&
                Objects.equals(this.loyaltyBalance, chequeDto.loyaltyBalance) &&
                Objects.equals(this.loyaltyActivePoints, chequeDto.loyaltyActivePoints) &&
                Objects.equals(this.loyaltyInactivePoints, chequeDto.loyaltyInactivePoints) &&
                Objects.equals(this.ndsMap, chequeDto.ndsMap) &&
                Objects.equals(this.sent, chequeDto.sent) &&
                Objects.equals(this.mustBeSent, chequeDto.mustBeSent) &&
                Objects.equals(this.paymentMethod, chequeDto.paymentMethod) &&
                Objects.equals(this.cardAmount, chequeDto.cardAmount) &&
                Objects.equals(this.cashAmount, chequeDto.cashAmount) &&
                Objects.equals(this.giftCardDetails, chequeDto.giftCardDetails) &&
                Objects.equals(this.properties, chequeDto.properties) &&
                Objects.equals(this.groupPublicId, chequeDto.groupPublicId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, externalId, orderGuid, orderCode, groupCode, groupGuid, totalAmount, totalDiscount, createdTs, type, atolData, description, url, userEmail, userName, userPhone, createdTsSource, channel, items, prepaid, loyalty, cashier, posId, address, placeOfSettlement, chain, loyaltyPromoText, promoText, giftCard, giftCardTs, giftCardAmount, bonusCard, redeemed, awarded, loyaltyBalance, loyaltyActivePoints, loyaltyInactivePoints, ndsMap, sent, mustBeSent, paymentMethod, cardAmount, cashAmount, giftCardDetails, properties, groupPublicId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ru.detmir.sap.model.cheque.ChequeDto {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    orderGuid: ").append(toIndentedString(orderGuid)).append("\n");
        sb.append("    orderCode: ").append(toIndentedString(orderCode)).append("\n");
        sb.append("    groupCode: ").append(toIndentedString(groupCode)).append("\n");
        sb.append("    groupGuid: ").append(toIndentedString(groupGuid)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
        sb.append("    createdTs: ").append(toIndentedString(createdTs)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    atolData: ").append(toIndentedString(atolData)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    createdTsSource: ").append(toIndentedString(createdTsSource)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
        sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
        sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
        sb.append("    posId: ").append(toIndentedString(posId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    placeOfSettlement: ").append(toIndentedString(placeOfSettlement)).append("\n");
        sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
        sb.append("    loyaltyPromoText: ").append(toIndentedString(loyaltyPromoText)).append("\n");
        sb.append("    promoText: ").append(toIndentedString(promoText)).append("\n");
        sb.append("    giftCard: ").append(toIndentedString(giftCard)).append("\n");
        sb.append("    giftCardTs: ").append(toIndentedString(giftCardTs)).append("\n");
        sb.append("    giftCardAmount: ").append(toIndentedString(giftCardAmount)).append("\n");
        sb.append("    bonusCard: ").append(toIndentedString(bonusCard)).append("\n");
        sb.append("    redeemed: ").append(toIndentedString(redeemed)).append("\n");
        sb.append("    awarded: ").append(toIndentedString(awarded)).append("\n");
        sb.append("    loyaltyBalance: ").append(toIndentedString(loyaltyBalance)).append("\n");
        sb.append("    loyaltyActivePoints: ").append(toIndentedString(loyaltyActivePoints)).append("\n");
        sb.append("    loyaltyInactivePoints: ").append(toIndentedString(loyaltyInactivePoints)).append("\n");
        sb.append("    ndsMap: ").append(toIndentedString(ndsMap)).append("\n");
        sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
        sb.append("    mustBeSent: ").append(toIndentedString(mustBeSent)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    cardAmount: ").append(toIndentedString(cardAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    giftCardDetails: ").append(toIndentedString(giftCardDetails)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    groupPublicId: ").append(toIndentedString(groupPublicId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
