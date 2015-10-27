import controller.KassaController;
import model.Kassa;
import view.ConsoleView;

public class Main {
  public static void main(String[] args) {
    Kassa kassa = new Kassa();
    ConsoleView view = new ConsoleView();

    KassaController controller = new KassaController(kassa, view);

    view.display();

  }
}
