package structural.adapter;

public class MediaAdapter implements  MediaPlayer{

    private AdvancedMp4MediaPlayer advancedMp4MediaPlayer;
    private AdvancedMp3MediaPlayer advancedMp3MediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp3")) {
            advancedMp3MediaPlayer = new Mp3Player();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMp4MediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String songName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            advancedMp3MediaPlayer.playMp3(songName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMp4MediaPlayer.playMp4(songName);
        }
    }
}
