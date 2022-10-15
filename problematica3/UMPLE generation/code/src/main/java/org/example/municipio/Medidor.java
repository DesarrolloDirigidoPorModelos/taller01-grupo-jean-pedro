package org.example.municipio;/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/



// line 13 "model.ump"
// line 32 "model.ump"
public class Medidor
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Medidor Attributes
  private String codigo;
  private String marca;
  private String ubicacion;
  private double costo;

  //Medidor Associations
  private Cliente cliente;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Medidor(String aCodigo, String aMarca, String aUbicacion, double aCosto, Cliente aCliente)
  {
    codigo = aCodigo;
    marca = aMarca;
    ubicacion = aUbicacion;
    costo = aCosto;
    boolean didAddCliente = setCliente(aCliente);
    if (!didAddCliente)
    {
      throw new RuntimeException("Unable to create medidor due to cliente. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

    public Medidor(String aCodigo, String aMarca, String aUbicacion, double aCosto)
    {
        codigo = aCodigo;
        marca = aMarca;
        ubicacion = aUbicacion;
        costo = aCosto;
    }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCodigo(String aCodigo)
  {
    boolean wasSet = false;
    codigo = aCodigo;
    wasSet = true;
    return wasSet;
  }

  public boolean setMarca(String aMarca)
  {
    boolean wasSet = false;
    marca = aMarca;
    wasSet = true;
    return wasSet;
  }

  public boolean setUbicacion(String aUbicacion)
  {
    boolean wasSet = false;
    ubicacion = aUbicacion;
    wasSet = true;
    return wasSet;
  }

  public boolean setCosto(double aCosto)
  {
    boolean wasSet = false;
    costo = aCosto;
    wasSet = true;
    return wasSet;
  }

  public String getCodigo()
  {
    return codigo;
  }

  public String getMarca()
  {
    return marca;
  }

  public String getUbicacion()
  {
    return ubicacion;
  }

  public double getCosto()
  {
    return costo;
  }
  /* Code from template association_GetOne */
  public Cliente getCliente()
  {
    return cliente;
  }
  /* Code from template association_SetOneToMany */
  public boolean setCliente(Cliente aCliente)
  {
    boolean wasSet = false;
    if (aCliente == null)
    {
      return wasSet;
    }

    Cliente existingCliente = cliente;
    cliente = aCliente;
    if (existingCliente != null && !existingCliente.equals(aCliente))
    {
      existingCliente.removeMedidor(this);
    }
    cliente.addMedidor(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Cliente placeholderCliente = cliente;
    this.cliente = null;
    if(placeholderCliente != null)
    {
      placeholderCliente.removeMedidor(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "codigo" + ":" + getCodigo()+ "," +
            "marca" + ":" + getMarca()+ "," +
            "ubicacion" + ":" + getUbicacion()+ "," +
            "costo" + ":" + getCosto()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cliente = "+(getCliente()!=null?Integer.toHexString(System.identityHashCode(getCliente())):"null");
  }
}