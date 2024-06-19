package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Main {
    public static void main(String[] args) {
        // MediaPlayer player = new AudioPlayer();
        // player.playAudio();
        // player.playVideo();
        // player = new VideoPlayer();
        // player.playVideo();

        // AnimalLSP animal = new DogLSP();
        // animal.makeSound();
        // animal = new SnakeLSP();
        // animal.makeSound();

        PrinterLSP printer = new TextPrinterLSP();
        printer.print();
        printer = new ImagePrinterLSP();
        printer.print();

    }

}
