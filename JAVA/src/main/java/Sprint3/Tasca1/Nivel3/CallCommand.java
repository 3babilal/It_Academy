package Sprint3.Tasca1.Nivel3;

import Sprint3.Tasca1.Nivel3.Command.Command;

public class CallCommand {
    private Command start;
    private Command accelerate;
    private Command stop;

    public void setStart(Command start) {
        this.start = start;
    }
    public void setAccelerate(Command accelerate) {
        this.accelerate = accelerate;
    }

    public void setStop(Command stop) {
        this.stop = stop;
    }

    public void start(){
        start.execute();
    }
    public void accelerate(){
        accelerate.execute();
    }
    public void stop(){
        stop.execute();
    }
}
