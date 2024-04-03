package Sprint1.Tasca2.Nivel1.Ejercicio1;

class VendaBuidaException extends Exception{
    private String message;

    public VendaBuidaException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}