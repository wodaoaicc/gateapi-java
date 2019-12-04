/*
 * Gate API v4
 * APIv4 provides spot, margin and futures trading operations. There are public APIs to retrieve the real-time market statistics, and private APIs which needs authentication to trade on user's behalf.
 *
 * Contact: support@mail.gate.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.gate.gateapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Batch order details
 */
@ApiModel(description = "Batch order details")

public class BatchOrder {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_SUCCEEDED = "succeeded";
  @SerializedName(SERIALIZED_NAME_SUCCEEDED)
  private Boolean succeeded;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  /**
   * Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OPEN("open"),
    
    CLOSED("closed"),
    
    CANCELLED("cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CURRENCY_PAIR = "currency_pair";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIR)
  private String currencyPair;

  /**
   * Order type. limit - limit order
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LIMIT("limit");

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

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.LIMIT;

  /**
   * Account type. spot - use spot account; margin - use margin account
   */
  @JsonAdapter(AccountEnum.Adapter.class)
  public enum AccountEnum {
    SPOT("spot"),
    
    MARGIN("margin");

    private String value;

    AccountEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountEnum fromValue(String text) {
      for (AccountEnum b : AccountEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AccountEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountEnum account = AccountEnum.SPOT;

  /**
   * Order side
   */
  @JsonAdapter(SideEnum.Adapter.class)
  public enum SideEnum {
    BUY("buy"),
    
    SELL("sell");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SideEnum fromValue(String text) {
      for (SideEnum b : SideEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SideEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SideEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private SideEnum side;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  /**
   * Time in force
   */
  @JsonAdapter(TimeInForceEnum.Adapter.class)
  public enum TimeInForceEnum {
    GTC("gtc"),
    
    IOC("ioc");

    private String value;

    TimeInForceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeInForceEnum fromValue(String text) {
      for (TimeInForceEnum b : TimeInForceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TimeInForceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeInForceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeInForceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeInForceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "time_in_force";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private TimeInForceEnum timeInForce = TimeInForceEnum.GTC;

  public static final String SERIALIZED_NAME_LEFT = "left";
  @SerializedName(SERIALIZED_NAME_LEFT)
  private String left;

  public static final String SERIALIZED_NAME_FILL_PRICE = "fill_price";
  @SerializedName(SERIALIZED_NAME_FILL_PRICE)
  private String fillPrice;

  public BatchOrder text(String text) {
    this.text = text;
    return this;
  }

   /**
   * User defined information. If not empty, must follow the rules below:  1. prefixed with &#x60;t-&#x60; 2. no longer than 16 bytes without &#x60;t-&#x60; prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) 
   * @return text
  **/
  @ApiModelProperty(value = "User defined information. If not empty, must follow the rules below:  1. prefixed with `t-` 2. no longer than 16 bytes without `t-` prefix 3. can only include 0-9, A-Z, a-z, underscore(_), hyphen(-) or dot(.) ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public BatchOrder succeeded(Boolean succeeded) {
    this.succeeded = succeeded;
    return this;
  }

   /**
   * Whether order succeeds
   * @return succeeded
  **/
  @ApiModelProperty(value = "Whether order succeeds")
  public Boolean getSucceeded() {
    return succeeded;
  }

  public void setSucceeded(Boolean succeeded) {
    this.succeeded = succeeded;
  }

  public BatchOrder label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Error label, empty string if order succeeds
   * @return label
  **/
  @ApiModelProperty(value = "Error label, empty string if order succeeds")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public BatchOrder message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Detailed error message, empty string if order succeeds
   * @return message
  **/
  @ApiModelProperty(value = "Detailed error message, empty string if order succeeds")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

   /**
   * Order ID
   * @return id
  **/
  @ApiModelProperty(value = "Order ID")
  public String getId() {
    return id;
  }

   /**
   * Order creation time
   * @return createTime
  **/
  @ApiModelProperty(value = "Order creation time")
  public String getCreateTime() {
    return createTime;
  }

   /**
   * Order status  - &#x60;open&#x60;: to be filled - &#x60;closed&#x60;: filled - &#x60;cancelled&#x60;: cancelled
   * @return status
  **/
  @ApiModelProperty(value = "Order status  - `open`: to be filled - `closed`: filled - `cancelled`: cancelled")
  public StatusEnum getStatus() {
    return status;
  }

  public BatchOrder currencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
    return this;
  }

   /**
   * Currency pair
   * @return currencyPair
  **/
  @ApiModelProperty(value = "Currency pair")
  public String getCurrencyPair() {
    return currencyPair;
  }

  public void setCurrencyPair(String currencyPair) {
    this.currencyPair = currencyPair;
  }

  public BatchOrder type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Order type. limit - limit order
   * @return type
  **/
  @ApiModelProperty(value = "Order type. limit - limit order")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BatchOrder account(AccountEnum account) {
    this.account = account;
    return this;
  }

   /**
   * Account type. spot - use spot account; margin - use margin account
   * @return account
  **/
  @ApiModelProperty(value = "Account type. spot - use spot account; margin - use margin account")
  public AccountEnum getAccount() {
    return account;
  }

  public void setAccount(AccountEnum account) {
    this.account = account;
  }

  public BatchOrder side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * Order side
   * @return side
  **/
  @ApiModelProperty(value = "Order side")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public BatchOrder amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Trade amount
   * @return amount
  **/
  @ApiModelProperty(value = "Trade amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BatchOrder price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Order price
   * @return price
  **/
  @ApiModelProperty(value = "Order price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public BatchOrder timeInForce(TimeInForceEnum timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Time in force
   * @return timeInForce
  **/
  @ApiModelProperty(value = "Time in force")
  public TimeInForceEnum getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(TimeInForceEnum timeInForce) {
    this.timeInForce = timeInForce;
  }

   /**
   * Amount left to fill
   * @return left
  **/
  @ApiModelProperty(value = "Amount left to fill")
  public String getLeft() {
    return left;
  }

   /**
   * Fill price of the order
   * @return fillPrice
  **/
  @ApiModelProperty(value = "Fill price of the order")
  public String getFillPrice() {
    return fillPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchOrder batchOrder = (BatchOrder) o;
    return Objects.equals(this.text, batchOrder.text) &&
        Objects.equals(this.succeeded, batchOrder.succeeded) &&
        Objects.equals(this.label, batchOrder.label) &&
        Objects.equals(this.message, batchOrder.message) &&
        Objects.equals(this.id, batchOrder.id) &&
        Objects.equals(this.createTime, batchOrder.createTime) &&
        Objects.equals(this.status, batchOrder.status) &&
        Objects.equals(this.currencyPair, batchOrder.currencyPair) &&
        Objects.equals(this.type, batchOrder.type) &&
        Objects.equals(this.account, batchOrder.account) &&
        Objects.equals(this.side, batchOrder.side) &&
        Objects.equals(this.amount, batchOrder.amount) &&
        Objects.equals(this.price, batchOrder.price) &&
        Objects.equals(this.timeInForce, batchOrder.timeInForce) &&
        Objects.equals(this.left, batchOrder.left) &&
        Objects.equals(this.fillPrice, batchOrder.fillPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, succeeded, label, message, id, createTime, status, currencyPair, type, account, side, amount, price, timeInForce, left, fillPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchOrder {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    succeeded: ").append(toIndentedString(succeeded)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currencyPair: ").append(toIndentedString(currencyPair)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    fillPrice: ").append(toIndentedString(fillPrice)).append("\n");
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

