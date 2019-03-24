/*
 * PharmaTrace Supply Chain Information Network API
 * The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: api@pharmatrace.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.pharmatrace.api.scin.pub.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.pharmatrace.api.scin.pub.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Trade
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-24T07:05:03.871+01:00[Europe/Berlin]")
public class Trade {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_TX_UID = "tx_uid";
  @SerializedName(SERIALIZED_NAME_TX_UID)
  private String txUid;

  public static final String SERIALIZED_NAME_TERMS_ID = "terms_id";
  @SerializedName(SERIALIZED_NAME_TERMS_ID)
  private String termsId;

  public static final String SERIALIZED_NAME_TRANSACTION_CHANNEL = "transaction_channel";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CHANNEL)
  private String transactionChannel;

  public Trade timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * GMT, Unix Epoch
   * @return timestamp
  **/
  @ApiModelProperty(value = "GMT, Unix Epoch")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Trade txUid(String txUid) {
    this.txUid = txUid;
    return this;
  }

   /**
   * unique id hash of the transaction
   * @return txUid
  **/
  @ApiModelProperty(value = "unique id hash of the transaction")
  public String getTxUid() {
    return txUid;
  }

  public void setTxUid(String txUid) {
    this.txUid = txUid;
  }

  public Trade termsId(String termsId) {
    this.termsId = termsId;
    return this;
  }

   /**
   * id reference to the terms and conditions for this transaction
   * @return termsId
  **/
  @ApiModelProperty(value = "id reference to the terms and conditions for this transaction")
  public String getTermsId() {
    return termsId;
  }

  public void setTermsId(String termsId) {
    this.termsId = termsId;
  }

  public Trade transactionChannel(String transactionChannel) {
    this.transactionChannel = transactionChannel;
    return this;
  }

   /**
   * hyperledger channel the transaction has been executed in
   * @return transactionChannel
  **/
  @ApiModelProperty(value = "hyperledger channel the transaction has been executed in")
  public String getTransactionChannel() {
    return transactionChannel;
  }

  public void setTransactionChannel(String transactionChannel) {
    this.transactionChannel = transactionChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trade trade = (Trade) o;
    return Objects.equals(this.timestamp, trade.timestamp) &&
        Objects.equals(this.txUid, trade.txUid) &&
        Objects.equals(this.termsId, trade.termsId) &&
        Objects.equals(this.transactionChannel, trade.transactionChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, txUid, termsId, transactionChannel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txUid: ").append(toIndentedString(txUid)).append("\n");
    sb.append("    termsId: ").append(toIndentedString(termsId)).append("\n");
    sb.append("    transactionChannel: ").append(toIndentedString(transactionChannel)).append("\n");
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

