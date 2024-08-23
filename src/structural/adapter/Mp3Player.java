package structural.adapter;

public class Mp3Player implements  AdvancedMp3MediaPlayer{
    @Override
    public void playMp3(String songName) {
        System.out.println("The MP3 is playing  " + songName);
    }

}
