package Menu;

import Modelos.*;
import Utilidades.LectorTeclado;

public class MenuImpresion {
    public int opcion;
    LectorTeclado lt = new LectorTeclado();
    personManager pm;
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
                for (int i = 0; i < pm.personas.size(); i++) {
                    pm.personas.get(i).describirPersona();
                }
                break;
            case 2:

                for (int i = 1; i < pm.personas.size(); i++) {
                    System.out.print(pm.personas.get(i).getTipoPersona() + pm.personas.get(i).getNombre() +
                                    pm.personas.get(i).getApellido() + pm.personas.get(i).getIdentidad());
                    pm.personas.get(i).describirPersona2();
                }
                break;
            case 3:
                System.out.println("Gracias por utilizar el programa");
                break;
        }
    }
    public MenuImpresion(personManager pm){
        this.pm = pm;
    }

   
}
