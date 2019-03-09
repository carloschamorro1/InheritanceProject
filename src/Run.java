import Menu.MenuPrincipal;

public class Run {

    public void run() {
        MenuPrincipal menu = new MenuPrincipal();
        do {
            menu.presentarOpciones();
            menu.procesarOpcion(menu.leerOpciones());
        } while (menu.opcion != 3);
    }
}
