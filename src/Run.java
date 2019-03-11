import Menu.MenuPrincipal;
import Menu.personManager;

public class Run {

    public void run(personManager pm) {
        MenuPrincipal menu = new MenuPrincipal(pm);
        do {
            menu.presentarOpciones();
            menu.procesarOpcion(menu.leerOpciones());
        } while (menu.opcion != 3);
    }
}
