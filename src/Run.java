import Menu.MenuPrincipal;
import Menu.personManager;
import Modelos.Clases;
import Utilidades.LectorTeclado;

public class Run {
    LectorTeclado lt = new LectorTeclado();
    public void run(personManager pm) {
        agregarClase(pm);
        MenuPrincipal menu = new MenuPrincipal(pm);
        do {
            menu.presentarOpciones();
            menu.procesarOpcion(menu.leerOpciones());
        } while (menu.opcion != 3);
    }

    public void agregarClase(personManager pm){
        System.out.println("\t \t \t \t Bienvenido(a)");
        System.out.println("\t \t Universidad Jose Cecilio del Valle \n");
        pm.personas.add(new Clases(lt.leerString("Por favor ingrese el nombre de la clase"), lt.leerString("Por favor ingrese el horario de la clase"),
                lt.leerString("Por favor ingrese la seccion"),lt.leerString("Por favor ingrese el numero de unidades valorativas"),
                lt.leerString("Por favor ingrese el codigo de la clase")));
    }

}
