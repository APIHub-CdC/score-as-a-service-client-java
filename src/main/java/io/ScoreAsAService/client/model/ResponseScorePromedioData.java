package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResponseScorePromedioData
 */
public class ResponseScorePromedioData {
  @SerializedName("nperscve")
  private String nperscve = null;

  @SerializedName("folio")
  private String folio = null;

  @SerializedName("fechaEjec")
  private String fechaEjec = null;

  @SerializedName("edoId")
  private BigDecimal edoId = null;

  @SerializedName("cantEdad")
  private String cantEdad = null;

  @SerializedName("cveTipoGeneracion")
  private String cveTipoGeneracion = null;

  @SerializedName("tipoGeneracion")
  private String tipoGeneracion = null;

  @SerializedName("numScore")
  private BigDecimal numScore = null;

  @SerializedName("promScoreEdoGeneracion")
  private BigDecimal promScoreEdoGeneracion = null;

  @SerializedName("percentilScoreEdoGeneracion")
  private BigDecimal percentilScoreEdoGeneracion = null;

  @SerializedName("promedioScoreGeneracion")
  private BigDecimal promedioScoreGeneracion = null;

  @SerializedName("percentilScoreGeneracion")
  private BigDecimal percentilScoreGeneracion = null;

  @SerializedName("promedioScoreEdo")
  private BigDecimal promedioScoreEdo = null;

  @SerializedName("percentilScoreEdo")
  private BigDecimal percentilScoreEdo = null;

  @SerializedName("promedioScore")
  private BigDecimal promedioScore = null;

  @SerializedName("percentilScore")
  private BigDecimal percentilScore = null;

  @SerializedName("totalScoreEdoGeneracion")
  private BigDecimal totalScoreEdoGeneracion = null;

  @SerializedName("totalScoreGeneracion")
  private BigDecimal totalScoreGeneracion = null;

  @SerializedName("totalScoreEdo")
  private BigDecimal totalScoreEdo = null;

  @SerializedName("totalScore")
  private BigDecimal totalScore = null;

  @SerializedName("totalPersEdoGeneracion")
  private BigDecimal totalPersEdoGeneracion = null;

  @SerializedName("totalPersonasGeneracion")
  private BigDecimal totalPersonasGeneracion = null;

  @SerializedName("totalPersonasEstado")
  private BigDecimal totalPersonasEstado = null;

  @SerializedName("totalPersonas")
  private BigDecimal totalPersonas = null;

  public ResponseScorePromedioData nperscve(String nperscve) {
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

  /**
   * folio
   * 
   * @return folio
   **/

  public String getFolio() {
    return folio;
  }

  /**
   * fechaEjec
   * 
   * @return fechaEjec
   **/

  public String getFechaEjec() {
    return fechaEjec;
  }

  /**
   * edoId
   * 
   * @return edoId
   **/

  public BigDecimal getEdoId() {
    return edoId;
  }

  /**
   * cantEdad
   * 
   * @return cantEdad
   **/

  public String getCantEdad() {
    return cantEdad;
  }

  /**
   * cveTipoGeneracion
   * 
   * @return cveTipoGeneracion
   **/

  public String getCveTipoGeneracion() {
    return cveTipoGeneracion;
  }

  /**
   * tipoGeneracion
   * 
   * @return tipoGeneracion
   **/

  public String getTipoGeneracion() {
    return tipoGeneracion;
  }

  /**
   * numScore
   * 
   * @return numScore
   **/

  public BigDecimal getNumScore() {
    return numScore;
  }

  /**
   * promScoreEdoGeneracion
   * 
   * @return promScoreEdoGeneracion
   **/

  public BigDecimal getPromScoreEdoGeneracion() {
    return promScoreEdoGeneracion;
  }

  /**
   * percentilScoreEdoGeneracion
   * 
   * @return percentilScoreEdoGeneracion
   **/

  public BigDecimal getPercentilScoreEdoGeneracion() {
    return percentilScoreEdoGeneracion;
  }

  /**
   * promedioScoreGeneracion
   * 
   * @return promedioScoreGeneracion
   **/

  public BigDecimal getPromedioScoreGeneracion() {
    return promedioScoreGeneracion;
  }

  /**
   * percentilScoreGeneracion
   * 
   * @return percentilScoreGeneracion
   **/

  public BigDecimal getPercentilScoreGeneracion() {
    return percentilScoreGeneracion;
  }

  /**
   * promedioScoreEdo
   * 
   * @return promedioScoreEdo
   **/

  public BigDecimal getPromedioScoreEdo() {
    return promedioScoreEdo;
  }

  /**
   * percentilScoreEdo
   * 
   * @return percentilScoreEdo
   **/

  public BigDecimal getPercentilScoreEdo() {
    return percentilScoreEdo;
  }

  /**
   * promedioScore
   * 
   * @return promedioScore
   **/

  public BigDecimal getPromedioScore() {
    return promedioScore;
  }

  /**
   * percentilScore
   * 
   * @return percentilScore
   **/

  public BigDecimal getPercentilScore() {
    return percentilScore;
  }

  /**
   * totalScoreEdoGeneracion
   * 
   * @return totalScoreEdoGeneracion
   **/

  public BigDecimal getTotalScoreEdoGeneracion() {
    return totalScoreEdoGeneracion;
  }

  /**
   * totalScoreGeneracion
   * 
   * @return totalScoreGeneracion
   **/

  public BigDecimal getTotalScoreGeneracion() {
    return totalScoreGeneracion;
  }

  /**
   * totalScoreEdo
   * 
   * @return totalScoreEdo
   **/

  public BigDecimal getTotalScoreEdo() {
    return totalScoreEdo;
  }

  /**
   * totalScore
   * 
   * @return totalScore
   **/

  public BigDecimal getTotalScore() {
    return totalScore;
  }

  /**
   * totalPersEdoGeneracion
   * 
   * @return totalPersEdoGeneracion
   **/

  public BigDecimal getTotalPersEdoGeneracion() {
    return totalPersEdoGeneracion;
  }

  /**
   * totalPersonasGeneracion
   * 
   * @return totalPersonasGeneracion
   **/

  public BigDecimal getTotalPersonasGeneracion() {
    return totalPersonasGeneracion;
  }

  /**
   * totalPersonasEstado
   * 
   * @return totalPersonasEstado
   **/

  public BigDecimal getTotalPersonasEstado() {
    return totalPersonasEstado;
  }

  /**
   * totalPersonas
   * 
   * @return totalPersonas
   **/

  public BigDecimal getTotalPersonas() {
    return totalPersonas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseScorePromedioData responseScorePromedioData = (ResponseScorePromedioData) o;
    return Objects.equals(this.nperscve, responseScorePromedioData.nperscve) &&
        Objects.equals(this.folio, responseScorePromedioData.folio) &&
        Objects.equals(this.fechaEjec, responseScorePromedioData.fechaEjec) &&
        Objects.equals(this.edoId, responseScorePromedioData.edoId) &&
        Objects.equals(this.cantEdad, responseScorePromedioData.cantEdad) &&
        Objects.equals(this.cveTipoGeneracion, responseScorePromedioData.cveTipoGeneracion) &&
        Objects.equals(this.tipoGeneracion, responseScorePromedioData.tipoGeneracion) &&
        Objects.equals(this.numScore, responseScorePromedioData.numScore) &&
        Objects.equals(this.promScoreEdoGeneracion, responseScorePromedioData.promScoreEdoGeneracion) &&
        Objects.equals(this.percentilScoreEdoGeneracion, responseScorePromedioData.percentilScoreEdoGeneracion) &&
        Objects.equals(this.promedioScoreGeneracion, responseScorePromedioData.promedioScoreGeneracion) &&
        Objects.equals(this.percentilScoreGeneracion, responseScorePromedioData.percentilScoreGeneracion) &&
        Objects.equals(this.promedioScoreEdo, responseScorePromedioData.promedioScoreEdo) &&
        Objects.equals(this.percentilScoreEdo, responseScorePromedioData.percentilScoreEdo) &&
        Objects.equals(this.promedioScore, responseScorePromedioData.promedioScore) &&
        Objects.equals(this.percentilScore, responseScorePromedioData.percentilScore) &&
        Objects.equals(this.totalScoreEdoGeneracion, responseScorePromedioData.totalScoreEdoGeneracion) &&
        Objects.equals(this.totalScoreGeneracion, responseScorePromedioData.totalScoreGeneracion) &&
        Objects.equals(this.totalScoreEdo, responseScorePromedioData.totalScoreEdo) &&
        Objects.equals(this.totalScore, responseScorePromedioData.totalScore) &&
        Objects.equals(this.totalPersEdoGeneracion, responseScorePromedioData.totalPersEdoGeneracion) &&
        Objects.equals(this.totalPersonasGeneracion, responseScorePromedioData.totalPersonasGeneracion) &&
        Objects.equals(this.totalPersonasEstado, responseScorePromedioData.totalPersonasEstado) &&
        Objects.equals(this.totalPersonas, responseScorePromedioData.totalPersonas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nperscve, folio, fechaEjec, edoId, cantEdad, cveTipoGeneracion, tipoGeneracion, numScore,
        promScoreEdoGeneracion, percentilScoreEdoGeneracion, promedioScoreGeneracion, percentilScoreGeneracion,
        promedioScoreEdo, percentilScoreEdo, promedioScore, percentilScore, totalScoreEdoGeneracion,
        totalScoreGeneracion, totalScoreEdo, totalScore, totalPersEdoGeneracion, totalPersonasGeneracion,
        totalPersonasEstado, totalPersonas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseScorePromedioData {\n");

    sb.append("    nperscve: ").append(toIndentedString(nperscve)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("    fechaEjec: ").append(toIndentedString(fechaEjec)).append("\n");
    sb.append("    edoId: ").append(toIndentedString(edoId)).append("\n");
    sb.append("    cantEdad: ").append(toIndentedString(cantEdad)).append("\n");
    sb.append("    cveTipoGeneracion: ").append(toIndentedString(cveTipoGeneracion)).append("\n");
    sb.append("    tipoGeneracion: ").append(toIndentedString(tipoGeneracion)).append("\n");
    sb.append("    numScore: ").append(toIndentedString(numScore)).append("\n");
    sb.append("    promScoreEdoGeneracion: ").append(toIndentedString(promScoreEdoGeneracion)).append("\n");
    sb.append("    percentilScoreEdoGeneracion: ").append(toIndentedString(percentilScoreEdoGeneracion)).append("\n");
    sb.append("    promedioScoreGeneracion: ").append(toIndentedString(promedioScoreGeneracion)).append("\n");
    sb.append("    percentilScoreGeneracion: ").append(toIndentedString(percentilScoreGeneracion)).append("\n");
    sb.append("    promedioScoreEdo: ").append(toIndentedString(promedioScoreEdo)).append("\n");
    sb.append("    percentilScoreEdo: ").append(toIndentedString(percentilScoreEdo)).append("\n");
    sb.append("    promedioScore: ").append(toIndentedString(promedioScore)).append("\n");
    sb.append("    percentilScore: ").append(toIndentedString(percentilScore)).append("\n");
    sb.append("    totalScoreEdoGeneracion: ").append(toIndentedString(totalScoreEdoGeneracion)).append("\n");
    sb.append("    totalScoreGeneracion: ").append(toIndentedString(totalScoreGeneracion)).append("\n");
    sb.append("    totalScoreEdo: ").append(toIndentedString(totalScoreEdo)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    totalPersEdoGeneracion: ").append(toIndentedString(totalPersEdoGeneracion)).append("\n");
    sb.append("    totalPersonasGeneracion: ").append(toIndentedString(totalPersonasGeneracion)).append("\n");
    sb.append("    totalPersonasEstado: ").append(toIndentedString(totalPersonasEstado)).append("\n");
    sb.append("    totalPersonas: ").append(toIndentedString(totalPersonas)).append("\n");
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
