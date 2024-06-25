package SOLID.WorkerISP;

public class HumanWorkerISP implements Workable, Eatable {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Human eating");

    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("Human working");

    }

}
