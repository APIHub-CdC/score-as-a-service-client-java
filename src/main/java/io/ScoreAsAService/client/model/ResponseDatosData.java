package io.ScoreAsAService.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * ResponseDatosData
 */
public class ResponseDatosData {
  @SerializedName("npersCve")
  private String npersCve = null;

  @SerializedName("fechaUltimaConsula")
  private String fechaUltimaConsula = null;

  @SerializedName("fechaActualizacion")
  private String fechaActualizacion = null;

  /**
   * npersCve
   * 
   * @return npersCve
   **/

  public String getNpersCve() {
    return npersCve;
  }

  /**
   * fechaUltimaConsula
   * 
   * @return fechaUltimaConsula
   **/

  public String getFechaUltimaConsula() {
    return fechaUltimaConsula;
  }

  /**
   * fechaActualizacion
   * 
   * @return fechaActualizacion
   **/

  public String getFechaActualizacion() {
    return fechaActualizacion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDatosData responseDatosData = (ResponseDatosData) o;
    return Objects.equals(this.npersCve, responseDatosData.npersCve) &&
        Objects.equals(this.fechaUltimaConsula, responseDatosData.fechaUltimaConsula) &&
        Objects.equals(this.fechaActualizacion, responseDatosData.fechaActualizacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(npersCve, fechaUltimaConsula, fechaActualizacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDatosData {\n");

    sb.append("    npersCve: ").append(toIndentedString(npersCve)).append("\n");
    sb.append("    fechaUltimaConsula: ").append(toIndentedString(fechaUltimaConsula)).append("\n");
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
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
