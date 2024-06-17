package SOLID.EmployeeInterface;

public class Manager implements Employee {
    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("Overseeing projects");

    }

    @Override
    public void attendMeetings() {
        // TODO Auto-generated method stub
        System.out.println("Attending meetings");

    }

    @Override
    public void manage() {
        // TODO Auto-generated method stub
        System.out.println("Managing team");

    }

}
