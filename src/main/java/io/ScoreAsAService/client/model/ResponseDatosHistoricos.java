package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * OK
 */
public class ResponseDatosHistoricos {
  @SerializedName("httpStatus")
  private BigDecimal httpStatus = null;

  @SerializedName("success")
  private String success = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private List<ResponseDatosHistoricosData> data = null;

  public ResponseDatosHistoricos httpStatus(BigDecimal httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * estado
   * 
   * @return httpStatus
   **/

  public BigDecimal getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(BigDecimal httpStatus) {
    this.httpStatus = httpStatus;
  }

  public ResponseDatosHistoricos success(String success) {
    this.success = success;
    return this;
  }

  /**
   * success
   * 
   * @return success
   **/

  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  public ResponseDatosHistoricos message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message
   * 
   * @return message
   **/

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ResponseDatosHistoricos data(List<ResponseDatosHistoricosData> data) {
    this.data = data;
    return this;
  }

  public ResponseDatosHistoricos addDataItem(ResponseDatosHistoricosData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<ResponseDatosHistoricosData>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * 
   * @return data
   **/

  public List<ResponseDatosHistoricosData> getData() {
    return data;
  }

  public void setData(List<ResponseDatosHistoricosData> data) {
    this.data = data;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDatosHistoricos responseDatosHistoricos = (ResponseDatosHistoricos) o;
    return Objects.equals(this.httpStatus, responseDatosHistoricos.httpStatus) &&
        Objects.equals(this.success, responseDatosHistoricos.success) &&
        Objects.equals(this.message, responseDatosHistoricos.message) &&
        Objects.equals(this.data, responseDatosHistoricos.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatus, success, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDatosHistoricos {\n");

    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
