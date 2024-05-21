package Sprint3.Tasca1.Nivel1;

import java.util.ArrayList;
import java.util.Collection;

public class Undo {
    private static Undo instance;
    private  ArrayList<String> list;

    private Undo(){
        list = new ArrayList<>();
    }
    public static Undo getInstance(){
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }
    public void add(String order){
        instance.list.add(order);
    }
    public void undoLast(){
        if(list.isEmpty()){
            System.out.println("NINGUN ELEMENTO DISPONIBLE!");
        }else {
            list.removeLast();
        }
    }
    public void showAll(){
        if(list.isEmpty()){
            System.out.println("LISTA VACIA!");
        }
        for(String order : list){
            System.out.println(order);
        }
    }
}
