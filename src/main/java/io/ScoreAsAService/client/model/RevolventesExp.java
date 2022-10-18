package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * RevolventesExp
 */
public class RevolventesExp {
  @SerializedName("refPeriodo")
  private String refPeriodo = null;

  @SerializedName("porUtilRevolventeExp")
  private BigDecimal porUtilRevolventeExp = null;

  public RevolventesExp refPeriodo(String refPeriodo) {
    this.refPeriodo = refPeriodo;
    return this;
  }

  /**
   * refPeriodo
   * 
   * @return refPeriodo
   **/

  public String getRefPeriodo() {
    return refPeriodo;
  }

  public void setRefPeriodo(String refPeriodo) {
    this.refPeriodo = refPeriodo;
  }

  public RevolventesExp porUtilRevolventeExp(BigDecimal porUtilRevolventeExp) {
    this.porUtilRevolventeExp = porUtilRevolventeExp;
    return this;
  }

  /**
   * porUtilRevolventeExp
   * 
   * @return porUtilRevolventeExp
   **/

  public BigDecimal getPorUtilRevolventeExp() {
    return porUtilRevolventeExp;
  }

  public void setPorUtilRevolventeExp(BigDecimal porUtilRevolventeExp) {
    this.porUtilRevolventeExp = porUtilRevolventeExp;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevolventesExp revolventesExp = (RevolventesExp) o;
    return Objects.equals(this.refPeriodo, revolventesExp.refPeriodo) &&
        Objects.equals(this.porUtilRevolventeExp, revolventesExp.porUtilRevolventeExp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPeriodo, porUtilRevolventeExp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevolventesExp {\n");

    sb.append("    refPeriodo: ").append(toIndentedString(refPeriodo)).append("\n");
    sb.append("    porUtilRevolventeExp: ").append(toIndentedString(porUtilRevolventeExp)).append("\n");
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
