public class UsuarioSuscriptor implements Observer {

    private String nombre;

    public UsuarioSuscriptor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String video) {
        System.out.println(
            nombre + " recibió una notificación: " + video
        );
    }
}   