package Sprint1.Tasca2.Nivel1.Ejercicio1;

class VendaBuidaException extends Exception{
    private String mensaje;

    public VendaBuidaException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }


}