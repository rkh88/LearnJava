package demoexception;

public class Plain {


    private Engine engine = new Engine(0);

    public void fly(){
        try {
            engine.work();
        } catch (EngineException e) {
            e.printStackTrace();
        }
    }
}
