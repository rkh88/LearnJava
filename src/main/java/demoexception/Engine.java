package demoexception;

public class Engine {

    int fuel;

    public Engine(int fuel) {
        this.fuel = fuel;
    }

    public void work() throws EngineException {
        if (fuel <=0){
            throw new EngineException();
        }
    }
}
