package SOLID.LSPBird;

public class OstrichLSP extends BirdLSP {
    @Override
    public void move() {
        run();
    }

    public void run() {
        System.out.println("Running");
    }
}
