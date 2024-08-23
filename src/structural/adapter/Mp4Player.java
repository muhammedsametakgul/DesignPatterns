package structural.adapter;

public class Mp4Player implements AdvancedMp4MediaPlayer{
    @Override
    public void playMp4(String songName) {
        System.out.println("The MP4 is playing " + songName);
    }
}
