public interface Subject {
    void adjuntar(Observer observador);
    void quitar(Observer observador);
    void notificar(String video);
}