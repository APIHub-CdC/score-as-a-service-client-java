package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * RevolcentesCta
 */
public class RevolcentesCta {
  @SerializedName("refPeriodo")
  private String refPeriodo = null;

  @SerializedName("cuenta")
  private String cuenta = null;

  @SerializedName("porUtilRevolventeCta")
  private BigDecimal porUtilRevolventeCta = null;

  @SerializedName("numeroOtorgante")
  private String numeroOtorgante = null;

  @SerializedName("tipoOtorgante")
  private String tipoOtorgante = null;

  public RevolcentesCta refPeriodo(String refPeriodo) {
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

  public RevolcentesCta cuenta(String cuenta) {
    this.cuenta = cuenta;
    return this;
  }

  /**
   * cuenta
   * 
   * @return cuenta
   **/

  public String getCuenta() {
    return cuenta;
  }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public RevolcentesCta porUtilRevolventeCta(BigDecimal porUtilRevolventeCta) {
    this.porUtilRevolventeCta = porUtilRevolventeCta;
    return this;
  }

  /**
   * porUtilRevolventeCta
   * 
   * @return porUtilRevolventeCta
   **/

  public BigDecimal getPorUtilRevolventeCta() {
    return porUtilRevolventeCta;
  }

  public void setPorUtilRevolventeCta(BigDecimal porUtilRevolventeCta) {
    this.porUtilRevolventeCta = porUtilRevolventeCta;
  }

  public RevolcentesCta numeroOtorgante(String numeroOtorgante) {
    this.numeroOtorgante = numeroOtorgante;
    return this;
  }

  /**
   * numeroOtorgante
   * 
   * @return numeroOtorgante
   **/

  public String getNumeroOtorgante() {
    return numeroOtorgante;
  }

  public void setNumeroOtorgante(String numeroOtorgante) {
    this.numeroOtorgante = numeroOtorgante;
  }

  public RevolcentesCta tipoOtorgante(String tipoOtorgante) {
    this.tipoOtorgante = tipoOtorgante;
    return this;
  }

  /**
   * tipoOtorgante
   * 
   * @return tipoOtorgante
   **/

  public String getTipoOtorgante() {
    return tipoOtorgante;
  }

  public void setTipoOtorgante(String tipoOtorgante) {
    this.tipoOtorgante = tipoOtorgante;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevolcentesCta revolcentesCta = (RevolcentesCta) o;
    return Objects.equals(this.refPeriodo, revolcentesCta.refPeriodo) &&
        Objects.equals(this.cuenta, revolcentesCta.cuenta) &&
        Objects.equals(this.porUtilRevolventeCta, revolcentesCta.porUtilRevolventeCta) &&
        Objects.equals(this.numeroOtorgante, revolcentesCta.numeroOtorgante) &&
        Objects.equals(this.tipoOtorgante, revolcentesCta.tipoOtorgante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPeriodo, cuenta, porUtilRevolventeCta, numeroOtorgante, tipoOtorgante);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevolcentesCta {\n");

    sb.append("    refPeriodo: ").append(toIndentedString(refPeriodo)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
    sb.append("    porUtilRevolventeCta: ").append(toIndentedString(porUtilRevolventeCta)).append("\n");
    sb.append("    numeroOtorgante: ").append(toIndentedString(numeroOtorgante)).append("\n");
    sb.append("    tipoOtorgante: ").append(toIndentedString(tipoOtorgante)).append("\n");
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
