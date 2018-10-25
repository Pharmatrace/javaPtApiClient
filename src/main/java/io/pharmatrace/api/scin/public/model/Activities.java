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
import io.pharmatrace.api.scin.public.model.Activity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Activities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-25T12:40:20.883+02:00[Europe/Berlin]")
public class Activities {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<Activity> history = null;

  public Activities offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Position in pagination.
   * @return offset
  **/
  @ApiModelProperty(value = "Position in pagination.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Activities limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of items to retrieve (100 max).
   * @return limit
  **/
  @ApiModelProperty(value = "Number of items to retrieve (100 max).")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Activities count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of items available.
   * @return count
  **/
  @ApiModelProperty(value = "Total number of items available.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Activities history(List<Activity> history) {
    this.history = history;
    return this;
  }

  public Activities addHistoryItem(Activity historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<Activity>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")
  public List<Activity> getHistory() {
    return history;
  }

  public void setHistory(List<Activity> history) {
    this.history = history;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activities activities = (Activities) o;
    return Objects.equals(this.offset, activities.offset) &&
        Objects.equals(this.limit, activities.limit) &&
        Objects.equals(this.count, activities.count) &&
        Objects.equals(this.history, activities.history);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, count, history);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activities {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

