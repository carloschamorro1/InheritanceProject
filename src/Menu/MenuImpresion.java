package Menu;

import Modelos.*;
import Utilidades.LectorTeclado;

public class MenuImpresion {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    personManager pm;
    MenuAgregar menu = new MenuAgregar(pm);
    public void presentarOpciones() {
        System.out.println("\t \t \t \t Bienvenido (a)");
        System.out.println("1.............. Imprimir Resumen");
        System.out.println("2.............. Imprimir Completo");
        System.out.println("3.............. Salir");
    }

    public int leerOpciones() {
        opcion = lt.leerEntero("Ingrese una opcion", "Ha ingresado una opcion erronea");
        return opcion;
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                imprimirResumen();
                break;
            case 2:
                imprimir();
                break;
            case 3:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
    public MenuImpresion(personManager pm){
        this.pm = pm;
    }

    public void imprimirResumen(){
        for (int i = 0; i < pm.personas.size(); i++) {
            pm.personas.get(i).describirPersona();
        }
    }

    public void imprimir() {
        if (pm.ca >= 6 && pm.cm == 1) {
            pm.personas.get(0).describirPersona();
            System.out.println("Tipo \t Nombre \t \t Apellido \t \t Identidad");
            for (int i = 1; i < pm.personas.size(); i++) {
                System.out.print(pm.personas.get(i).getTipoPersona() + "\t" + pm.personas.get(i).getNombre() + "\t" +
                        pm.personas.get(i).getApellido() + "\t" + pm.personas.get(i).getIdentidad() + "\t");
                pm.personas.get(i).describirPersona2();
            }
        } else if (pm.ca < 6 && pm.cm != 1) {
            System.out.println("\t \t ********ATENCION********");
            System.out.println("No hay suficientes alumnos o no se ha ingresado maestro");
            System.out.println("Informacion ingresada \n");
            System.out.println("Se necesitan 6 alumnos minimo y actualmente se han ingresado: " + pm.ca);
            if (pm.cm == 1)
                System.out.println("Ya se ha ingresado el maestro");
            else
                System.out.println("No se ha ingresado el maestro");
        }
    }
}
