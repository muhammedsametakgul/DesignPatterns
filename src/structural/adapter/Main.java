package structural.adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song1");
        audioPlayer.play("mp4", "song1.video");

    }
}
