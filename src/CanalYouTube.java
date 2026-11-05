import java.util.List;
import java.util.ArrayList;

public class CanalYouTube implements Subject {

    private List<Observer> observadores =
        new ArrayList<>();

    public void adjuntar(Observer observador) {
        observadores.add(observador);
    }

    public void quitar(Observer observador) {
        observadores.remove(observador);
    }

    public void notificar(String video) {
        for (Observer observador : observadores) {
            observador.actualizar(video);
        }
    }
}
