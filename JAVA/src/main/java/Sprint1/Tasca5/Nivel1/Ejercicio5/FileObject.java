package Sprint1.Tasca5.Nivel1.Ejercicio5;

import java.io.Serializable;

public class FileObject implements Serializable {

    private String name;
    private int number;

    public FileObject(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
