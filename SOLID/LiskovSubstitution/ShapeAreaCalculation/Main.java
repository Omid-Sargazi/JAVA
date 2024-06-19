package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.playAudio();
        player.playVideo();
        player = new VideoPlayer();
        player.playVideo();

    }

}
