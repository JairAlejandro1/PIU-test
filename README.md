<h1> CREACION DEL PROYECTO </h1>

Primero creamos nuestra proyecto junto con 3 packages que usaremos luego, dentro el package “Tablas” irá nuestra clase “Main” donde manejaremos la visibilidad de nuestro JFrame From. En el packages de “Views” irádicho JFrame From y enel ultimo package irá la clase “General” de la cual ocuparemos varios datos.

![](https://github.com/JairAlejandro1/Imagenes/blob/d566d44c20cb7676878805f1644dcc433fddf3f4/re1.png)

En la clase “General” creamos las variables de “ID, nomEstado y nomMunicipio” con sus setters y getters. En ella crearemos tambien un Array y un ToString. Luego de eso se crean 4 metodos, llenarDatosTabla, eliminarDatosTabla, añadirDatosTabla y actualizarDatosTabla, todos ellos dentro de la misma clase "General".

```

package models;

import java.util.ArrayList;

public class General {

    private int id;
    private String nomEstado;
    private String nomMunicipio;
    public static ArrayList<General> TablaDatos = new ArrayList<>();

    public General() {

    }

    public General(int id, String nomEstado, String nomMunicipio) {
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

    public static void llenarDatosTabla() {
        TablaDatos.add(new General(1, "Camepeche", "SeybaPlaya"));
        TablaDatos.add(new General(2, "Campeche", "Champo"));
        TablaDatos.add(new General(3, "Campeche", "Carmen"));
        TablaDatos.add(new General(4, "Campeche", "Tenabo"));
        TablaDatos.add(new General(5, "Campeche", "Palizada"));

    }

    public static void eliminarDatosTabla(int id) {
        TablaDatos.remove(id);
    }

    public static void añadirDatosTabla(int id, String nomEstado, String nomMunicipio) {
        TablaDatos.add(new General(id, nomEstado, nomMunicipio));
    }

    public static void actualizarDatosTabla(int recNo, int id, String nomEstado, String nomMunicipio) {
        TablaDatos.get(recNo).setId(id);
        TablaDatos.get(recNo).setNomEstado(nomEstado);
        TablaDatos.get(recNo).setNomMunicipio(nomMunicipio);

    }

    @Override
    public String toString() {

        return "Tabla{" + "id: " + getId() + ", Estado: " + getNomEstado() + ", Municipio: " + getNomMunicipio() + '}';

    }
}

```

En el package "Views" en el JFrame From colocamos 4 JLabels, 4 JTextField, 4 JButton y por ultimo un JTable de la siguiente manera:

![](https://github.com/JairAlejandro1/Imagenes/blob/d566d44c20cb7676878805f1644dcc433fddf3f4/re1.png)







