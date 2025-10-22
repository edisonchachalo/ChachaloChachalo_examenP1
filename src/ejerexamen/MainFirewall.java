package ejerexamen;

public class MainFirewall {
    public static void main(String[] args) {
        Firewall f1 = new Firewall("Bloqueo SSH",22,false);

        f1.mostrarEstado();

        f1.activar();
        f1.bloquearIntento(22); //intento bloqueo
        f1.bloquearIntento(465); // intento permitido
        f1.bloquearIntento(22); //intento bloqueo

        f1.mostrarEstado();

        f1.desactivar();
        f1.bloquearIntento(22);

        f1.mostrarEstado();
    }
}
