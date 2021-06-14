package demoexception;

public class EngineException  extends  Exception{

    public EngineException(){
        System.out.println("Turn off enginge");
        System.out.println("wait 10 sec");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Try turn on again");
    }
}
