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


package io.pharmatrace.api.scin.public.model;

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
import java.math.BigDecimal;

/**
 * Wallet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-11-03T17:38:32.273+01:00[Europe/Berlin]")
public class Wallet {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_OWNER_STAKEHOLDER_ID = "owner_stakeholder_id";
  @SerializedName(SERIALIZED_NAME_OWNER_STAKEHOLDER_ID)
  private String ownerStakeholderId;

  public Wallet balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * current balance
   * @return balance
  **/
  @ApiModelProperty(value = "current balance")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Wallet walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * wallet uuid
   * @return walletId
  **/
  @ApiModelProperty(value = "wallet uuid")
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  public Wallet displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * descriptive name of the wallet so user can identify it if s/he has multiple wallets
   * @return displayName
  **/
  @ApiModelProperty(value = "descriptive name of the wallet so user can identify it if s/he has multiple wallets")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Wallet ownerStakeholderId(String ownerStakeholderId) {
    this.ownerStakeholderId = ownerStakeholderId;
    return this;
  }

   /**
   * id of the wallet owner (normally an organization
   * @return ownerStakeholderId
  **/
  @ApiModelProperty(value = "id of the wallet owner (normally an organization")
  public String getOwnerStakeholderId() {
    return ownerStakeholderId;
  }

  public void setOwnerStakeholderId(String ownerStakeholderId) {
    this.ownerStakeholderId = ownerStakeholderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.balance, wallet.balance) &&
        Objects.equals(this.walletId, wallet.walletId) &&
        Objects.equals(this.displayName, wallet.displayName) &&
        Objects.equals(this.ownerStakeholderId, wallet.ownerStakeholderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, walletId, displayName, ownerStakeholderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ownerStakeholderId: ").append(toIndentedString(ownerStakeholderId)).append("\n");
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

