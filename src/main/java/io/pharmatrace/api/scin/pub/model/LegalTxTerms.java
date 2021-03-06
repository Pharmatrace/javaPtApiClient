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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LegalTxTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-24T07:05:03.871+01:00[Europe/Berlin]")
public class LegalTxTerms {
  public static final String SERIALIZED_NAME_TIMESTAMP_VALID_FROM = "timestamp_valid_from";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_VALID_FROM)
  private Long timestampValidFrom;

  public static final String SERIALIZED_NAME_TIMESTAMP_VALID_UNTIL = "timestamp_valid_until";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_VALID_UNTIL)
  private Long timestampValidUntil;

  public static final String SERIALIZED_NAME_VALIDITY_TOLERANCE = "validity_tolerance";
  @SerializedName(SERIALIZED_NAME_VALIDITY_TOLERANCE)
  private Long validityTolerance;

  public static final String SERIALIZED_NAME_TERMS_ID = "terms_id";
  @SerializedName(SERIALIZED_NAME_TERMS_ID)
  private String termsId;

  public static final String SERIALIZED_NAME_TERMS_VERSION = "terms_version";
  @SerializedName(SERIALIZED_NAME_TERMS_VERSION)
  private String termsVersion;

  public static final String SERIALIZED_NAME_TERMS_ID_PREVIOUS_VERSION = "terms_id_previous_version";
  @SerializedName(SERIALIZED_NAME_TERMS_ID_PREVIOUS_VERSION)
  private String termsIdPreviousVersion;

  public static final String SERIALIZED_NAME_TERMS_TEXT = "terms_text";
  @SerializedName(SERIALIZED_NAME_TERMS_TEXT)
  private String termsText;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LEGISLATION = "legislation";
  @SerializedName(SERIALIZED_NAME_LEGISLATION)
  private String legislation;

  public LegalTxTerms timestampValidFrom(Long timestampValidFrom) {
    this.timestampValidFrom = timestampValidFrom;
    return this;
  }

   /**
   * GMT, Unix Epoch
   * @return timestampValidFrom
  **/
  @ApiModelProperty(value = "GMT, Unix Epoch")
  public Long getTimestampValidFrom() {
    return timestampValidFrom;
  }

  public void setTimestampValidFrom(Long timestampValidFrom) {
    this.timestampValidFrom = timestampValidFrom;
  }

  public LegalTxTerms timestampValidUntil(Long timestampValidUntil) {
    this.timestampValidUntil = timestampValidUntil;
    return this;
  }

   /**
   * GMT, Unix Epoch
   * @return timestampValidUntil
  **/
  @ApiModelProperty(value = "GMT, Unix Epoch")
  public Long getTimestampValidUntil() {
    return timestampValidUntil;
  }

  public void setTimestampValidUntil(Long timestampValidUntil) {
    this.timestampValidUntil = timestampValidUntil;
  }

  public LegalTxTerms validityTolerance(Long validityTolerance) {
    this.validityTolerance = validityTolerance;
    return this;
  }

   /**
   * tolerance window for transactions that begin but do not finish under the governance of these terms (in ms)
   * @return validityTolerance
  **/
  @ApiModelProperty(value = "tolerance window for transactions that begin but do not finish under the governance of these terms (in ms)")
  public Long getValidityTolerance() {
    return validityTolerance;
  }

  public void setValidityTolerance(Long validityTolerance) {
    this.validityTolerance = validityTolerance;
  }

  public LegalTxTerms termsId(String termsId) {
    this.termsId = termsId;
    return this;
  }

   /**
   * unique id hash of the transaction terms and conditions
   * @return termsId
  **/
  @ApiModelProperty(value = "unique id hash of the transaction terms and conditions")
  public String getTermsId() {
    return termsId;
  }

  public void setTermsId(String termsId) {
    this.termsId = termsId;
  }

  public LegalTxTerms termsVersion(String termsVersion) {
    this.termsVersion = termsVersion;
    return this;
  }

   /**
   * optional version mark of the terms
   * @return termsVersion
  **/
  @ApiModelProperty(value = "optional version mark of the terms")
  public String getTermsVersion() {
    return termsVersion;
  }

  public void setTermsVersion(String termsVersion) {
    this.termsVersion = termsVersion;
  }

  public LegalTxTerms termsIdPreviousVersion(String termsIdPreviousVersion) {
    this.termsIdPreviousVersion = termsIdPreviousVersion;
    return this;
  }

   /**
   * optional link to the previous version of these terms
   * @return termsIdPreviousVersion
  **/
  @ApiModelProperty(value = "optional link to the previous version of these terms")
  public String getTermsIdPreviousVersion() {
    return termsIdPreviousVersion;
  }

  public void setTermsIdPreviousVersion(String termsIdPreviousVersion) {
    this.termsIdPreviousVersion = termsIdPreviousVersion;
  }

  public LegalTxTerms termsText(String termsText) {
    this.termsText = termsText;
    return this;
  }

   /**
   * text of the terms and conditions
   * @return termsText
  **/
  @ApiModelProperty(value = "text of the terms and conditions")
  public String getTermsText() {
    return termsText;
  }

  public void setTermsText(String termsText) {
    this.termsText = termsText;
  }

  public LegalTxTerms language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO language code, e.g. en_us
   * @return language
  **/
  @ApiModelProperty(value = "ISO language code, e.g. en_us")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public LegalTxTerms legislation(String legislation) {
    this.legislation = legislation;
    return this;
  }

   /**
   * legislation enforcing these terms
   * @return legislation
  **/
  @ApiModelProperty(value = "legislation enforcing these terms")
  public String getLegislation() {
    return legislation;
  }

  public void setLegislation(String legislation) {
    this.legislation = legislation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTxTerms legalTxTerms = (LegalTxTerms) o;
    return Objects.equals(this.timestampValidFrom, legalTxTerms.timestampValidFrom) &&
        Objects.equals(this.timestampValidUntil, legalTxTerms.timestampValidUntil) &&
        Objects.equals(this.validityTolerance, legalTxTerms.validityTolerance) &&
        Objects.equals(this.termsId, legalTxTerms.termsId) &&
        Objects.equals(this.termsVersion, legalTxTerms.termsVersion) &&
        Objects.equals(this.termsIdPreviousVersion, legalTxTerms.termsIdPreviousVersion) &&
        Objects.equals(this.termsText, legalTxTerms.termsText) &&
        Objects.equals(this.language, legalTxTerms.language) &&
        Objects.equals(this.legislation, legalTxTerms.legislation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampValidFrom, timestampValidUntil, validityTolerance, termsId, termsVersion, termsIdPreviousVersion, termsText, language, legislation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTxTerms {\n");
    sb.append("    timestampValidFrom: ").append(toIndentedString(timestampValidFrom)).append("\n");
    sb.append("    timestampValidUntil: ").append(toIndentedString(timestampValidUntil)).append("\n");
    sb.append("    validityTolerance: ").append(toIndentedString(validityTolerance)).append("\n");
    sb.append("    termsId: ").append(toIndentedString(termsId)).append("\n");
    sb.append("    termsVersion: ").append(toIndentedString(termsVersion)).append("\n");
    sb.append("    termsIdPreviousVersion: ").append(toIndentedString(termsIdPreviousVersion)).append("\n");
    sb.append("    termsText: ").append(toIndentedString(termsText)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
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

