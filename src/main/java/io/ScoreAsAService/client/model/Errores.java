
package io.ScoreAsAService.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Errores
 */
public class Errores {
  @SerializedName("errores")
  private List<Error> errores = null;

  public Errores errores(List<Error> errores) {
    this.errores = errores;
    return this;
  }

  public Errores addErroresItem(Error erroresItem) {
    if (this.errores == null) {
      this.errores = new ArrayList<Error>();
    }
    this.errores.add(erroresItem);
    return this;
  }

   /**
   * Get errores
   * @return errores
  **/
  
  public List<Error> getErrores() {
    return errores;
  }

  public void setErrores(List<Error> errores) {
    this.errores = errores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errores errores = (Errores) o;
    return Objects.equals(this.errores, errores.errores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errores {\n");
    
    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
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

