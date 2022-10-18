package io.ScoreAsAService.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Informacion para consultar
 */
public class RequestValidaScore {
  @SerializedName("nperscve")
  private String nperscve = null;

  public RequestValidaScore nperscve(String nperscve) {
    this.nperscve = nperscve;
    return this;
  }

  /**
   * nperscve
   * 
   * @return nperscve
   **/

  public String getNperscve() {
    return nperscve;
  }

  public void setNperscve(String nperscve) {
    this.nperscve = nperscve;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestValidaScore requestValidaScore = (RequestValidaScore) o;
    return Objects.equals(this.nperscve, requestValidaScore.nperscve);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nperscve);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestValidaScore {\n");

    sb.append("    nperscve: ").append(toIndentedString(nperscve)).append("\n");
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
