package SOLID.EmployeeInterface;

public class DeveloperISP implements Workable, MeetingAttendable {
    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("Writing code");

    }

    @Override
    public void attendMeetings() {
        // TODO Auto-generated method stub
        System.out.println("Attending meetings");

    }
}
