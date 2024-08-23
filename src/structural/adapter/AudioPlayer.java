package structural.adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String songName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,songName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, songName);
        }
    }
}