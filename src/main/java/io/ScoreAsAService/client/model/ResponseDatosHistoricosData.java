package io.ScoreAsAService.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResponseDatosHistoricosData
 */
public class ResponseDatosHistoricosData {
  @SerializedName("datosHistoricos")
  private List<DatosHistorico> datosHistoricos = null;

  @SerializedName("scoreMeses60")
  private List<ScoreMeses60> scoreMeses60 = null;

  @SerializedName("revolcentesCta")
  private List<RevolcentesCta> revolcentesCta = null;

  @SerializedName("revolventesExp")
  private List<RevolventesExp> revolventesExp = null;

  @SerializedName("porPuntualidad")
  private List<PorPuntualidad> porPuntualidad = null;

  public ResponseDatosHistoricosData datosHistoricos(List<DatosHistorico> datosHistoricos) {
    this.datosHistoricos = datosHistoricos;
    return this;
  }

  public ResponseDatosHistoricosData addDatosHistoricosItem(DatosHistorico datosHistoricosItem) {
    if (this.datosHistoricos == null) {
      this.datosHistoricos = new ArrayList<DatosHistorico>();
    }
    this.datosHistoricos.add(datosHistoricosItem);
    return this;
  }

  /**
   * Get datosHistoricos
   * 
   * @return datosHistoricos
   **/

  public List<DatosHistorico> getDatosHistoricos() {
    return datosHistoricos;
  }

  public void setDatosHistoricos(List<DatosHistorico> datosHistoricos) {
    this.datosHistoricos = datosHistoricos;
  }

  public ResponseDatosHistoricosData scoreMeses60(List<ScoreMeses60> scoreMeses60) {
    this.scoreMeses60 = scoreMeses60;
    return this;
  }

  public ResponseDatosHistoricosData addScoreMeses60Item(ScoreMeses60 scoreMeses60Item) {
    if (this.scoreMeses60 == null) {
      this.scoreMeses60 = new ArrayList<ScoreMeses60>();
    }
    this.scoreMeses60.add(scoreMeses60Item);
    return this;
  }

  /**
   * Get scoreMeses60
   * 
   * @return scoreMeses60
   **/

  public List<ScoreMeses60> getScoreMeses60() {
    return scoreMeses60;
  }

  public void setScoreMeses60(List<ScoreMeses60> scoreMeses60) {
    this.scoreMeses60 = scoreMeses60;
  }

  public ResponseDatosHistoricosData revolcentesCta(List<RevolcentesCta> revolcentesCta) {
    this.revolcentesCta = revolcentesCta;
    return this;
  }

  public ResponseDatosHistoricosData addRevolcentesCtaItem(RevolcentesCta revolcentesCtaItem) {
    if (this.revolcentesCta == null) {
      this.revolcentesCta = new ArrayList<RevolcentesCta>();
    }
    this.revolcentesCta.add(revolcentesCtaItem);
    return this;
  }

  /**
   * Get revolcentesCta
   * 
   * @return revolcentesCta
   **/

  public List<RevolcentesCta> getRevolcentesCta() {
    return revolcentesCta;
  }

  public void setRevolcentesCta(List<RevolcentesCta> revolcentesCta) {
    this.revolcentesCta = revolcentesCta;
  }

  public ResponseDatosHistoricosData revolventesExp(List<RevolventesExp> revolventesExp) {
    this.revolventesExp = revolventesExp;
    return this;
  }

  public ResponseDatosHistoricosData addRevolventesExpItem(RevolventesExp revolventesExpItem) {
    if (this.revolventesExp == null) {
      this.revolventesExp = new ArrayList<RevolventesExp>();
    }
    this.revolventesExp.add(revolventesExpItem);
    return this;
  }

  /**
   * Get revolventesExp
   * 
   * @return revolventesExp
   **/

  public List<RevolventesExp> getRevolventesExp() {
    return revolventesExp;
  }

  public void setRevolventesExp(List<RevolventesExp> revolventesExp) {
    this.revolventesExp = revolventesExp;
  }

  public ResponseDatosHistoricosData porPuntualidad(List<PorPuntualidad> porPuntualidad) {
    this.porPuntualidad = porPuntualidad;
    return this;
  }

  public ResponseDatosHistoricosData addPorPuntualidadItem(PorPuntualidad porPuntualidadItem) {
    if (this.porPuntualidad == null) {
      this.porPuntualidad = new ArrayList<PorPuntualidad>();
    }
    this.porPuntualidad.add(porPuntualidadItem);
    return this;
  }

  /**
   * Get porPuntualidad
   * 
   * @return porPuntualidad
   **/

  public List<PorPuntualidad> getPorPuntualidad() {
    return porPuntualidad;
  }

  public void setPorPuntualidad(List<PorPuntualidad> porPuntualidad) {
    this.porPuntualidad = porPuntualidad;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDatosHistoricosData responseDatosHistoricosData = (ResponseDatosHistoricosData) o;
    return Objects.equals(this.datosHistoricos, responseDatosHistoricosData.datosHistoricos) &&
        Objects.equals(this.scoreMeses60, responseDatosHistoricosData.scoreMeses60) &&
        Objects.equals(this.revolcentesCta, responseDatosHistoricosData.revolcentesCta) &&
        Objects.equals(this.revolventesExp, responseDatosHistoricosData.revolventesExp) &&
        Objects.equals(this.porPuntualidad, responseDatosHistoricosData.porPuntualidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datosHistoricos, scoreMeses60, revolcentesCta, revolventesExp, porPuntualidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDatosHistoricosData {\n");

    sb.append("    datosHistoricos: ").append(toIndentedString(datosHistoricos)).append("\n");
    sb.append("    scoreMeses60: ").append(toIndentedString(scoreMeses60)).append("\n");
    sb.append("    revolcentesCta: ").append(toIndentedString(revolcentesCta)).append("\n");
    sb.append("    revolventesExp: ").append(toIndentedString(revolventesExp)).append("\n");
    sb.append("    porPuntualidad: ").append(toIndentedString(porPuntualidad)).append("\n");
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
