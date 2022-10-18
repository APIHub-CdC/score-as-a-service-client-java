
package io.ScoreAsAService.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * PorPuntualidad
 */
public class PorPuntualidad {
  @SerializedName("puntualidadMes1")
  private String puntualidadMes1 = null;

  @SerializedName("puntualidadMes2")
  private String puntualidadMes2 = null;

  @SerializedName("puntualidadMes3")
  private String puntualidadMes3 = null;

  @SerializedName("puntualidadMes4")
  private String puntualidadMes4 = null;

  @SerializedName("puntualidadMes5")
  private String puntualidadMes5 = null;

  @SerializedName("puntualidadMes6")
  private String puntualidadMes6 = null;

  public PorPuntualidad puntualidadMes1(String puntualidadMes1) {
    this.puntualidadMes1 = puntualidadMes1;
    return this;
  }

   /**
   * puntualidadMes1
   * @return puntualidadMes1
  **/
  
  public String getPuntualidadMes1() {
    return puntualidadMes1;
  }

  public void setPuntualidadMes1(String puntualidadMes1) {
    this.puntualidadMes1 = puntualidadMes1;
  }

  public PorPuntualidad puntualidadMes2(String puntualidadMes2) {
    this.puntualidadMes2 = puntualidadMes2;
    return this;
  }

   /**
   * puntualidadMes2
   * @return puntualidadMes2
  **/
  
  public String getPuntualidadMes2() {
    return puntualidadMes2;
  }

  public void setPuntualidadMes2(String puntualidadMes2) {
    this.puntualidadMes2 = puntualidadMes2;
  }

  public PorPuntualidad puntualidadMes3(String puntualidadMes3) {
    this.puntualidadMes3 = puntualidadMes3;
    return this;
  }

   /**
   * puntualidadMes3
   * @return puntualidadMes3
  **/
  
  public String getPuntualidadMes3() {
    return puntualidadMes3;
  }

  public void setPuntualidadMes3(String puntualidadMes3) {
    this.puntualidadMes3 = puntualidadMes3;
  }

  public PorPuntualidad puntualidadMes4(String puntualidadMes4) {
    this.puntualidadMes4 = puntualidadMes4;
    return this;
  }

   /**
   * puntualidadMes4
   * @return puntualidadMes4
  **/
  
  public String getPuntualidadMes4() {
    return puntualidadMes4;
  }

  public void setPuntualidadMes4(String puntualidadMes4) {
    this.puntualidadMes4 = puntualidadMes4;
  }

  public PorPuntualidad puntualidadMes5(String puntualidadMes5) {
    this.puntualidadMes5 = puntualidadMes5;
    return this;
  }

   /**
   * puntualidadMes5
   * @return puntualidadMes5
  **/
  
  public String getPuntualidadMes5() {
    return puntualidadMes5;
  }

  public void setPuntualidadMes5(String puntualidadMes5) {
    this.puntualidadMes5 = puntualidadMes5;
  }

  public PorPuntualidad puntualidadMes6(String puntualidadMes6) {
    this.puntualidadMes6 = puntualidadMes6;
    return this;
  }

   /**
   * puntualidadMes6
   * @return puntualidadMes6
  **/
  public String getPuntualidadMes6() {
    return puntualidadMes6;
  }

  public void setPuntualidadMes6(String puntualidadMes6) {
    this.puntualidadMes6 = puntualidadMes6;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PorPuntualidad porPuntualidad = (PorPuntualidad) o;
    return Objects.equals(this.puntualidadMes1, porPuntualidad.puntualidadMes1) &&
        Objects.equals(this.puntualidadMes2, porPuntualidad.puntualidadMes2) &&
        Objects.equals(this.puntualidadMes3, porPuntualidad.puntualidadMes3) &&
        Objects.equals(this.puntualidadMes4, porPuntualidad.puntualidadMes4) &&
        Objects.equals(this.puntualidadMes5, porPuntualidad.puntualidadMes5) &&
        Objects.equals(this.puntualidadMes6, porPuntualidad.puntualidadMes6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(puntualidadMes1, puntualidadMes2, puntualidadMes3, puntualidadMes4, puntualidadMes5, puntualidadMes6);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PorPuntualidad {\n");
    
    sb.append("    puntualidadMes1: ").append(toIndentedString(puntualidadMes1)).append("\n");
    sb.append("    puntualidadMes2: ").append(toIndentedString(puntualidadMes2)).append("\n");
    sb.append("    puntualidadMes3: ").append(toIndentedString(puntualidadMes3)).append("\n");
    sb.append("    puntualidadMes4: ").append(toIndentedString(puntualidadMes4)).append("\n");
    sb.append("    puntualidadMes5: ").append(toIndentedString(puntualidadMes5)).append("\n");
    sb.append("    puntualidadMes6: ").append(toIndentedString(puntualidadMes6)).append("\n");
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

