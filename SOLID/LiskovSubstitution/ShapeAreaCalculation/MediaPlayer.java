package SOLID.LiskovSubstitution.ShapeAreaCalculation;

public class MediaPlayer {
    public void playAudio() {
        System.out.println("Playing audio");
    }

    public void playVideo() {
        throw new UnsupportedOperationException("Video playback is not supported");
    }
}

class AudioPlayer extends MediaPlayer {
};

class VideoPlayer extends MediaPlayer {
    public void playVideo() {
        System.out.println("Playing video");
    }
}