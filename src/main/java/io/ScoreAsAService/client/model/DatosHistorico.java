package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * DatosHistorico
 */
public class DatosHistorico {
  @SerializedName("npersCve")
  private String npersCve = null;

  @SerializedName("cuenta")
  private String cuenta = null;

  @SerializedName("totalCtasAbiertas")
  private String totalCtasAbiertas = null;

  @SerializedName("tipoCuenta")
  private String tipoCuenta = null;

  @SerializedName("tipoOtorgante")
  private String tipoOtorgante = null;

  @SerializedName("estatusCuenta")
  private String estatusCuenta = null;

  @SerializedName("creditoAsignado")
  private BigDecimal creditoAsignado = null;

  public DatosHistorico npersCve(String npersCve) {
    this.npersCve = npersCve;
    return this;
  }

   /**
   * npersCve
   * @return npersCve
  **/
  
  public String getNpersCve() {
    return npersCve;
  }

  public void setNpersCve(String npersCve) {
    this.npersCve = npersCve;
  }

  public DatosHistorico cuenta(String cuenta) {
    this.cuenta = cuenta;
    return this;
  }

   /**
   * cuenta
   * @return cuenta
  **/
  
  public String getCuenta() {
    return cuenta;
  }

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  public DatosHistorico totalCtasAbiertas(String totalCtasAbiertas) {
    this.totalCtasAbiertas = totalCtasAbiertas;
    return this;
  }

   /**
   * totalCtasAbiertas
   * @return totalCtasAbiertas
  **/
  
  public String getTotalCtasAbiertas() {
    return totalCtasAbiertas;
  }

  public void setTotalCtasAbiertas(String totalCtasAbiertas) {
    this.totalCtasAbiertas = totalCtasAbiertas;
  }

  public DatosHistorico tipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }

   /**
   * tipoCuenta
   * @return tipoCuenta
  **/
  
  public String getTipoCuenta() {
    return tipoCuenta;
  }

  public void setTipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }

  public DatosHistorico tipoOtorgante(String tipoOtorgante) {
    this.tipoOtorgante = tipoOtorgante;
    return this;
  }

   /**
   * tipoOtorgante
   * @return tipoOtorgante
  **/
  
  public String getTipoOtorgante() {
    return tipoOtorgante;
  }

  public void setTipoOtorgante(String tipoOtorgante) {
    this.tipoOtorgante = tipoOtorgante;
  }

  public DatosHistorico estatusCuenta(String estatusCuenta) {
    this.estatusCuenta = estatusCuenta;
    return this;
  }

   /**
   * estatusCuenta
   * @return estatusCuenta
  **/
  
  public String getEstatusCuenta() {
    return estatusCuenta;
  }

  public void setEstatusCuenta(String estatusCuenta) {
    this.estatusCuenta = estatusCuenta;
  }

  public DatosHistorico creditoAsignado(BigDecimal creditoAsignado) {
    this.creditoAsignado = creditoAsignado;
    return this;
  }

   /**
   * 180000
   * @return creditoAsignado
  **/
  
  public BigDecimal getCreditoAsignado() {
    return creditoAsignado;
  }

  public void setCreditoAsignado(BigDecimal creditoAsignado) {
    this.creditoAsignado = creditoAsignado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosHistorico datosHistorico = (DatosHistorico) o;
    return Objects.equals(this.npersCve, datosHistorico.npersCve) &&
        Objects.equals(this.cuenta, datosHistorico.cuenta) &&
        Objects.equals(this.totalCtasAbiertas, datosHistorico.totalCtasAbiertas) &&
        Objects.equals(this.tipoCuenta, datosHistorico.tipoCuenta) &&
        Objects.equals(this.tipoOtorgante, datosHistorico.tipoOtorgante) &&
        Objects.equals(this.estatusCuenta, datosHistorico.estatusCuenta) &&
        Objects.equals(this.creditoAsignado, datosHistorico.creditoAsignado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(npersCve, cuenta, totalCtasAbiertas, tipoCuenta, tipoOtorgante, estatusCuenta, creditoAsignado);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosHistorico {\n");
    
    sb.append("    npersCve: ").append(toIndentedString(npersCve)).append("\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
    sb.append("    totalCtasAbiertas: ").append(toIndentedString(totalCtasAbiertas)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoOtorgante: ").append(toIndentedString(tipoOtorgante)).append("\n");
    sb.append("    estatusCuenta: ").append(toIndentedString(estatusCuenta)).append("\n");
    sb.append("    creditoAsignado: ").append(toIndentedString(creditoAsignado)).append("\n");
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

