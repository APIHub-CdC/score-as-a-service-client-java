package io.ScoreAsAService.client.model;

import java.math.BigDecimal;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ScoreMeses60
 */
public class ScoreMeses60 {
  @SerializedName("periodo")
  private String periodo = null;

  @SerializedName("score")
  private BigDecimal score = null;

  @SerializedName("cveReasonCode1")
  private String cveReasonCode1 = null;

  @SerializedName("descripcionRc1")
  private String descripcionRc1 = null;

  @SerializedName("cveReasonCode2")
  private String cveReasonCode2 = null;

  @SerializedName("descripcionRc2")
  private String descripcionRc2 = null;

  @SerializedName("cveReasonCode3")
  private String cveReasonCode3 = null;

  @SerializedName("descripcionRc3")
  private String descripcionRc3 = null;

  @SerializedName("cveReasonCode4")
  private String cveReasonCode4 = null;

  @SerializedName("descripcionRc4")
  private String descripcionRc4 = null;

  public ScoreMeses60 periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }

  /**
   * periodo
   * 
   * @return periodo
   **/

  public String getPeriodo() {
    return periodo;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public ScoreMeses60 score(BigDecimal score) {
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

  public ScoreMeses60 cveReasonCode1(String cveReasonCode1) {
    this.cveReasonCode1 = cveReasonCode1;
    return this;
  }

  /**
   * cveReasonCode1
   * 
   * @return cveReasonCode1
   **/

  public String getCveReasonCode1() {
    return cveReasonCode1;
  }

  public void setCveReasonCode1(String cveReasonCode1) {
    this.cveReasonCode1 = cveReasonCode1;
  }

  public ScoreMeses60 descripcionRc1(String descripcionRc1) {
    this.descripcionRc1 = descripcionRc1;
    return this;
  }

  /**
   * descripcionRc1
   * 
   * @return descripcionRc1
   **/

  public String getDescripcionRc1() {
    return descripcionRc1;
  }

  public void setDescripcionRc1(String descripcionRc1) {
    this.descripcionRc1 = descripcionRc1;
  }

  public ScoreMeses60 cveReasonCode2(String cveReasonCode2) {
    this.cveReasonCode2 = cveReasonCode2;
    return this;
  }

  /**
   * cveReasonCode2
   * 
   * @return cveReasonCode2
   **/

  public String getCveReasonCode2() {
    return cveReasonCode2;
  }

  public void setCveReasonCode2(String cveReasonCode2) {
    this.cveReasonCode2 = cveReasonCode2;
  }

  public ScoreMeses60 descripcionRc2(String descripcionRc2) {
    this.descripcionRc2 = descripcionRc2;
    return this;
  }

  /**
   * descripcionRc2
   * 
   * @return descripcionRc2
   **/

  public String getDescripcionRc2() {
    return descripcionRc2;
  }

  public void setDescripcionRc2(String descripcionRc2) {
    this.descripcionRc2 = descripcionRc2;
  }

  public ScoreMeses60 cveReasonCode3(String cveReasonCode3) {
    this.cveReasonCode3 = cveReasonCode3;
    return this;
  }

  /**
   * cveReasonCode3
   * 
   * @return cveReasonCode3
   **/

  public String getCveReasonCode3() {
    return cveReasonCode3;
  }

  public void setCveReasonCode3(String cveReasonCode3) {
    this.cveReasonCode3 = cveReasonCode3;
  }

  public ScoreMeses60 descripcionRc3(String descripcionRc3) {
    this.descripcionRc3 = descripcionRc3;
    return this;
  }

  /**
   * descripcionRc3
   * 
   * @return descripcionRc3
   **/

  public String getDescripcionRc3() {
    return descripcionRc3;
  }

  public void setDescripcionRc3(String descripcionRc3) {
    this.descripcionRc3 = descripcionRc3;
  }

  public ScoreMeses60 cveReasonCode4(String cveReasonCode4) {
    this.cveReasonCode4 = cveReasonCode4;
    return this;
  }

  /**
   * cveReasonCode4
   * 
   * @return cveReasonCode4
   **/

  public String getCveReasonCode4() {
    return cveReasonCode4;
  }

  public void setCveReasonCode4(String cveReasonCode4) {
    this.cveReasonCode4 = cveReasonCode4;
  }

  public ScoreMeses60 descripcionRc4(String descripcionRc4) {
    this.descripcionRc4 = descripcionRc4;
    return this;
  }

  /**
   * descripcionRc4
   * 
   * @return descripcionRc4
   **/

  public String getDescripcionRc4() {
    return descripcionRc4;
  }

  public void setDescripcionRc4(String descripcionRc4) {
    this.descripcionRc4 = descripcionRc4;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreMeses60 scoreMeses60 = (ScoreMeses60) o;
    return Objects.equals(this.periodo, scoreMeses60.periodo) &&
        Objects.equals(this.score, scoreMeses60.score) &&
        Objects.equals(this.cveReasonCode1, scoreMeses60.cveReasonCode1) &&
        Objects.equals(this.descripcionRc1, scoreMeses60.descripcionRc1) &&
        Objects.equals(this.cveReasonCode2, scoreMeses60.cveReasonCode2) &&
        Objects.equals(this.descripcionRc2, scoreMeses60.descripcionRc2) &&
        Objects.equals(this.cveReasonCode3, scoreMeses60.cveReasonCode3) &&
        Objects.equals(this.descripcionRc3, scoreMeses60.descripcionRc3) &&
        Objects.equals(this.cveReasonCode4, scoreMeses60.cveReasonCode4) &&
        Objects.equals(this.descripcionRc4, scoreMeses60.descripcionRc4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodo, score, cveReasonCode1, descripcionRc1, cveReasonCode2, descripcionRc2, cveReasonCode3,
        descripcionRc3, cveReasonCode4, descripcionRc4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreMeses60 {\n");

    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    cveReasonCode1: ").append(toIndentedString(cveReasonCode1)).append("\n");
    sb.append("    descripcionRc1: ").append(toIndentedString(descripcionRc1)).append("\n");
    sb.append("    cveReasonCode2: ").append(toIndentedString(cveReasonCode2)).append("\n");
    sb.append("    descripcionRc2: ").append(toIndentedString(descripcionRc2)).append("\n");
    sb.append("    cveReasonCode3: ").append(toIndentedString(cveReasonCode3)).append("\n");
    sb.append("    descripcionRc3: ").append(toIndentedString(descripcionRc3)).append("\n");
    sb.append("    cveReasonCode4: ").append(toIndentedString(cveReasonCode4)).append("\n");
    sb.append("    descripcionRc4: ").append(toIndentedString(descripcionRc4)).append("\n");
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
