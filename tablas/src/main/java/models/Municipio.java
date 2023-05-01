
package models;

import java.util.ArrayList;

public class Municipio {


    private int id;
    private String nomEstado;
    private String nomMunicipio;
    public static ArrayList<Municipio> TablaDatos = new ArrayList<>();


    public Municipio() {

    }

    public Municipio(int id, String nomEstado, String nomMunicipio) {
        this.id = id;
        this.nomEstado = nomEstado;
        this.nomMunicipio = nomMunicipio;
    }
    

    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }


    public String getNomEstado() {
        return nomEstado;
    }

   
    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

   
    public String getNomMunicipio() {
        return nomMunicipio;
    }

   
    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }

   
        public static void llenarDatosTabla(){
        TablaDatos.add(new Municipio(1,"Camepeche", "Seyba"));
        TablaDatos.add(new Municipio(2,"Campeche", "Champo"));
        TablaDatos.add(new Municipio(3,"Campeche", "Carmen"));  
        TablaDatos.add(new Municipio(4,"Campeche", "Tenabo"));
        TablaDatos.add(new Municipio(5,"Campeche", "Palizada"));
        
    }
  
    
    
    public static void eliminarDatosTabla(int id){
        TablaDatos.remove(id);
    }
        
    public static void añadirDatosTabla(int id,String nomEstado, String nomMunicipio){
        TablaDatos.add(new Municipio(id,nomEstado,nomMunicipio));
    }
    
    public static void actualizarDatosTabla(int recNo, int id, String nomEstado, String nomMunicipio){
        TablaDatos.get(recNo).setId(id);
        TablaDatos.get(recNo).setNomEstado(nomEstado);
        TablaDatos.get(recNo).setNomMunicipio(nomMunicipio);
        

    }
    
    @Override
    public String toString() {

        return "Tabla{" + "id: " + getId() + ", Estado: " + getNomEstado() + ", Municipio: " + getNomMunicipio() + '}';


 }
}
