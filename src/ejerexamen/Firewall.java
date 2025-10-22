package ejerexamen;

public class Firewall {
    //Atributos
    private String regla;
    private int puerto;
    private boolean estado;
    private int intentosBloqueo;

    //constructor por defecto
    public Firewall(){

    }
    //Constructor por parámetros
    public Firewall(String regla, int puerto, boolean estado){
        this.regla=regla;
        setPuerto(puerto);
        this.estado=estado;
        this.intentosBloqueo = 0;
    }

    //Métodos set
    public void setRegla(String regla) {
        this.regla = regla;
    }

    public void setPuerto(int puerto) {
        if (puerto >= 1 && puerto <= 65535){
            this.puerto = puerto;
            System.out.println("\nPuerto Válido");
        }else {
            System.out.println("\nPuerto Inválido");
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Métodos get
    public String getRegla() {
        return regla;
    }

    public int getPuerto() {
        return puerto;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getIntentosBloqueo() {
        return intentosBloqueo;
    }

    //Métodos utilitarios
    public void activar() {
        estado=true;
        System.out.println("→ Regla ACTIVADA");
    }

    public void desactivar(){
        estado=false;
        System.out.println("→ Regla DESACTIVADA");
    }

    public void bloquearIntento(int puertoIntento){
        if (estado && puertoIntento == puerto){
            intentosBloqueo++;
            System.out.println("Intento bloqueado en puerto: "+puerto);
        }else {
            System.out.println("Intento permitido en puerto: "+puerto);
        }
    }

    public void mostrarEstado(){
        System.out.println("\nRegla: "+regla);
        System.out.println("Puerto bloqueado: "+puerto);
        System.out.println("Estado: "+(estado?"Activado":"Desactivado"));
        System.out.println("Intentos bloqueados: "+intentosBloqueo+"\n");
    }

}
