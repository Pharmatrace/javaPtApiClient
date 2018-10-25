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

/**
 * Profile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-25T12:40:20.883+02:00[Europe/Berlin]")
public class Profile {
  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_TWITTER_NAME = "twitter_name";
  @SerializedName(SERIALIZED_NAME_TWITTER_NAME)
  private String twitterName;

  public static final String SERIALIZED_NAME_LINKEDIN_NAME = "linkedin_name";
  @SerializedName(SERIALIZED_NAME_LINKEDIN_NAME)
  private String linkedinName;

  public static final String SERIALIZED_NAME_FACEBOOK_NAME = "facebook_name";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_NAME)
  private String facebookName;

  public static final String SERIALIZED_NAME_PICTURE = "picture";
  @SerializedName(SERIALIZED_NAME_PICTURE)
  private String picture;

  public static final String SERIALIZED_NAME_STAKEHOLDER_ID = "stakeholder_id";
  @SerializedName(SERIALIZED_NAME_STAKEHOLDER_ID)
  private String stakeholderId;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the PT network user.
   * @return firstName
  **/
  @ApiModelProperty(value = "First name of the PT network user.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the PT network user.
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name of the PT network user.")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Profile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/
  @ApiModelProperty(value = "Email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profile twitterName(String twitterName) {
    this.twitterName = twitterName;
    return this;
  }

   /**
   * Twitter name
   * @return twitterName
  **/
  @ApiModelProperty(value = "Twitter name")
  public String getTwitterName() {
    return twitterName;
  }

  public void setTwitterName(String twitterName) {
    this.twitterName = twitterName;
  }

  public Profile linkedinName(String linkedinName) {
    this.linkedinName = linkedinName;
    return this;
  }

   /**
   * LinkedIn name
   * @return linkedinName
  **/
  @ApiModelProperty(value = "LinkedIn name")
  public String getLinkedinName() {
    return linkedinName;
  }

  public void setLinkedinName(String linkedinName) {
    this.linkedinName = linkedinName;
  }

  public Profile facebookName(String facebookName) {
    this.facebookName = facebookName;
    return this;
  }

   /**
   * Facebook name
   * @return facebookName
  **/
  @ApiModelProperty(value = "Facebook name")
  public String getFacebookName() {
    return facebookName;
  }

  public void setFacebookName(String facebookName) {
    this.facebookName = facebookName;
  }

  public Profile picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Image URL
   * @return picture
  **/
  @ApiModelProperty(value = "Image URL")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Profile stakeholderId(String stakeholderId) {
    this.stakeholderId = stakeholderId;
    return this;
  }

   /**
   * the PT network member that the user/profile is assigned to.
   * @return stakeholderId
  **/
  @ApiModelProperty(value = "the PT network member that the user/profile is assigned to.")
  public String getStakeholderId() {
    return stakeholderId;
  }

  public void setStakeholderId(String stakeholderId) {
    this.stakeholderId = stakeholderId;
  }

  public Profile active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * true if the user is currently active. Inactive users will be anonymized but not deleted to maintain integrity of transaction history
   * @return active
  **/
  @ApiModelProperty(value = "true if the user is currently active. Inactive users will be anonymized but not deleted to maintain integrity of transaction history")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.lastName, profile.lastName) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.twitterName, profile.twitterName) &&
        Objects.equals(this.linkedinName, profile.linkedinName) &&
        Objects.equals(this.facebookName, profile.facebookName) &&
        Objects.equals(this.picture, profile.picture) &&
        Objects.equals(this.stakeholderId, profile.stakeholderId) &&
        Objects.equals(this.active, profile.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, twitterName, linkedinName, facebookName, picture, stakeholderId, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    twitterName: ").append(toIndentedString(twitterName)).append("\n");
    sb.append("    linkedinName: ").append(toIndentedString(linkedinName)).append("\n");
    sb.append("    facebookName: ").append(toIndentedString(facebookName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    stakeholderId: ").append(toIndentedString(stakeholderId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

