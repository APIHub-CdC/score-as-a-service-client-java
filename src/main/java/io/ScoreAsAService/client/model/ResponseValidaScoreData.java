package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResponseValidaScoreData
 */
public class ResponseValidaScoreData {
  @SerializedName("score")
  private BigDecimal score = null;

  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;

  @SerializedName("tieneScore")
  private BigDecimal tieneScore = null;

  @SerializedName("tieneFechaNac")
  private BigDecimal tieneFechaNac = null;

  public ResponseValidaScoreData score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * score
   * 
   * @return score
   **/

  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * fechaNacimiento
   * 
   * @return fechaNacimiento
   **/

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  /**
   * tieneScore
   * 
   * @return tieneScore
   **/

  public BigDecimal getTieneScore() {
    return tieneScore;
  }

  /**
   * tieneFechaNac
   * 
   * @return tieneFechaNac
   **/

  public BigDecimal getTieneFechaNac() {
    return tieneFechaNac;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseValidaScoreData responseValidaScoreData = (ResponseValidaScoreData) o;
    return Objects.equals(this.score, responseValidaScoreData.score) &&
        Objects.equals(this.fechaNacimiento, responseValidaScoreData.fechaNacimiento) &&
        Objects.equals(this.tieneScore, responseValidaScoreData.tieneScore) &&
        Objects.equals(this.tieneFechaNac, responseValidaScoreData.tieneFechaNac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, fechaNacimiento, tieneScore, tieneFechaNac);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseValidaScoreData {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    tieneScore: ").append(toIndentedString(tieneScore)).append("\n");
    sb.append("    tieneFechaNac: ").append(toIndentedString(tieneFechaNac)).append("\n");
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
