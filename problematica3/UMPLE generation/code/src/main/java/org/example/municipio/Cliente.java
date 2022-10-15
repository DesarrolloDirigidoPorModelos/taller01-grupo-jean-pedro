package org.example.municipio;/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.31.1.5860.78bb27cc6 modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 26 "model.ump"
public class Cliente
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Cliente Attributes
  private String ndi;
  private String nombre;
  private String apellidos;
  private String telefono;
  private String correoElectronico;
  private String direccion;

  //Cliente Associations
  private List<Medidor> medidors;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Cliente(String aNdi, String aNombre, String aApellidos, String aTelefono, String aCorreoElectronico, String aDireccion)
  {
    ndi = aNdi;
    nombre = aNombre;
    apellidos = aApellidos;
    telefono = aTelefono;
    correoElectronico = aCorreoElectronico;
    direccion = aDireccion;
    medidors = new ArrayList<Medidor>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNdi(String aNdi)
  {
    boolean wasSet = false;
    ndi = aNdi;
    wasSet = true;
    return wasSet;
  }

  public boolean setNombre(String aNombre)
  {
    boolean wasSet = false;
    nombre = aNombre;
    wasSet = true;
    return wasSet;
  }

  public boolean setApellidos(String aApellidos)
  {
    boolean wasSet = false;
    apellidos = aApellidos;
    wasSet = true;
    return wasSet;
  }

  public boolean setTelefono(String aTelefono)
  {
    boolean wasSet = false;
    telefono = aTelefono;
    wasSet = true;
    return wasSet;
  }

  public boolean setCorreoElectronico(String aCorreoElectronico)
  {
    boolean wasSet = false;
    correoElectronico = aCorreoElectronico;
    wasSet = true;
    return wasSet;
  }

  public boolean setDireccion(String aDireccion)
  {
    boolean wasSet = false;
    direccion = aDireccion;
    wasSet = true;
    return wasSet;
  }

  public String getNdi()
  {
    return ndi;
  }

  public String getNombre()
  {
    return nombre;
  }

  public String getApellidos()
  {
    return apellidos;
  }

  public String getTelefono()
  {
    return telefono;
  }

  public String getCorreoElectronico()
  {
    return correoElectronico;
  }

  public String getDireccion()
  {
    return direccion;
  }
  /* Code from template association_GetMany */
  public Medidor getMedidor(int index)
  {
    Medidor aMedidor = medidors.get(index);
    return aMedidor;
  }

  public List<Medidor> getMedidors()
  {
    List<Medidor> newMedidors = Collections.unmodifiableList(medidors);
    return newMedidors;
  }

  public int numberOfMedidors()
  {
    int number = medidors.size();
    return number;
  }

  public boolean hasMedidors()
  {
    boolean has = medidors.size() > 0;
    return has;
  }

  public int indexOfMedidor(Medidor aMedidor)
  {
    int index = medidors.indexOf(aMedidor);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMedidors()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Medidor addMedidor(String aCodigo, String aMarca, String aUbicacion, double aCosto)
  {
    return new Medidor(aCodigo, aMarca, aUbicacion, aCosto, this);
  }

  public boolean addMedidor(Medidor aMedidor)
  {
    boolean wasAdded = false;
    if (medidors.contains(aMedidor)) { return false; }
    Cliente existingCliente = aMedidor.getCliente();
    boolean isNewCliente = existingCliente != null && !this.equals(existingCliente);
    if (isNewCliente)
    {
      aMedidor.setCliente(this);
    }
    else
    {
      medidors.add(aMedidor);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeMedidor(Medidor aMedidor)
  {
    boolean wasRemoved = false;
    //Unable to remove aMedidor, as it must always have a cliente
    if (!this.equals(aMedidor.getCliente()))
    {
      medidors.remove(aMedidor);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMedidorAt(Medidor aMedidor, int index)
  {  
    boolean wasAdded = false;
    if(addMedidor(aMedidor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMedidors()) { index = numberOfMedidors() - 1; }
      medidors.remove(aMedidor);
      medidors.add(index, aMedidor);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMedidorAt(Medidor aMedidor, int index)
  {
    boolean wasAdded = false;
    if(medidors.contains(aMedidor))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMedidors()) { index = numberOfMedidors() - 1; }
      medidors.remove(aMedidor);
      medidors.add(index, aMedidor);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMedidorAt(aMedidor, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=medidors.size(); i > 0; i--)
    {
      Medidor aMedidor = medidors.get(i - 1);
      aMedidor.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "ndi" + ":" + getNdi()+ "," +
            "nombre" + ":" + getNombre()+ "," +
            "apellidos" + ":" + getApellidos()+ "," +
            "telefono" + ":" + getTelefono()+ "," +
            "correoElectronico" + ":" + getCorreoElectronico()+ "," +
            "direccion" + ":" + getDireccion()+ "]";
  }
}