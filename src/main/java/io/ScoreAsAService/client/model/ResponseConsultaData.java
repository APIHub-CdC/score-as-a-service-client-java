package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResponseConsultaData
 */

public class ResponseConsultaData {
  @SerializedName("FechaConsulta")
  private String fechaConsulta = null;

  @SerializedName("NombreOtorgante")
  private String nombreOtorgante = null;

  @SerializedName("TipoCredito")
  private String tipoCredito = null;

  @SerializedName("ImporteCredito")
  private BigDecimal importeCredito = null;

  @SerializedName("ClaveUnidadMonetaria")
  private String claveUnidadMonetaria = null;

  @SerializedName("cveOtorgante")
  private String cveOtorgante = null;

  @SerializedName("descTipoNegocioOtor")
  private String descTipoNegocioOtor = null;

  public ResponseConsultaData fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }

  /**
   * FechaConsulta
   * 
   * @return fechaConsulta
   **/

  public String getFechaConsulta() {
    return fechaConsulta;
  }

  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }

  /**
   * NombreOtorgante
   * 
   * @return nombreOtorgante
   **/

  public String getNombreOtorgante() {
    return nombreOtorgante;
  }

  /**
   * TipoCredito
   * 
   * @return tipoCredito
   **/

  public String getTipoCredito() {
    return tipoCredito;
  }

  /**
   * ImporteCredito
   * 
   * @return importeCredito
   **/

  public BigDecimal getImporteCredito() {
    return importeCredito;
  }

  /**
   * ClaveUnidadMonetaria
   * 
   * @return claveUnidadMonetaria
   **/

  public String getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }

  /**
   * cveOtorgante
   * 
   * @return cveOtorgante
   **/

  public String getCveOtorgante() {
    return cveOtorgante;
  }

  /**
   * descTipoNegocioOtor
   * 
   * @return descTipoNegocioOtor
   **/

  public String getDescTipoNegocioOtor() {
    return descTipoNegocioOtor;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseConsultaData responseConsultaData = (ResponseConsultaData) o;
    return Objects.equals(this.fechaConsulta, responseConsultaData.fechaConsulta) &&
        Objects.equals(this.nombreOtorgante, responseConsultaData.nombreOtorgante) &&
        Objects.equals(this.tipoCredito, responseConsultaData.tipoCredito) &&
        Objects.equals(this.importeCredito, responseConsultaData.importeCredito) &&
        Objects.equals(this.claveUnidadMonetaria, responseConsultaData.claveUnidadMonetaria) &&
        Objects.equals(this.cveOtorgante, responseConsultaData.cveOtorgante) &&
        Objects.equals(this.descTipoNegocioOtor, responseConsultaData.descTipoNegocioOtor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, nombreOtorgante, tipoCredito, importeCredito, claveUnidadMonetaria, cveOtorgante,
        descTipoNegocioOtor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseConsultaData {\n");

    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
    sb.append("    importeCredito: ").append(toIndentedString(importeCredito)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    cveOtorgante: ").append(toIndentedString(cveOtorgante)).append("\n");
    sb.append("    descTipoNegocioOtor: ").append(toIndentedString(descTipoNegocioOtor)).append("\n");
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
