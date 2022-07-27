package misc.mediaPlayers;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioPlayer {
    private File musicFile;
    private AudioInputStream audioStream;
    private Clip music;

    public AudioPlayer() {

    }

    public AudioPlayer(String musicFilePath) {
        changeMusic(musicFilePath);
    }

    public void changeMusic(String musicFilePath) {
        if (music != null) {
            music.close();
        }
        try {
            musicFile = new File(musicFilePath);
            audioStream = AudioSystem.getAudioInputStream(musicFile);
            music = AudioSystem.getClip();
            music.open(audioStream);
        } catch (Exception e) {
            System.out.println("Error loading music file: " + musicFilePath);
        }
    }

    public void play() {
        music.start();
    }

    public void stop() {
        music.stop();
    }

    public void close() {
        music.close();
    }

    public void loop() {
        music.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void loop(int count) {
        music.loop(count);
    }

    public boolean isFinished() {
        return music.getFramePosition() == music.getFrameLength();
    }
}
