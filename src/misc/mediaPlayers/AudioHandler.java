package misc.mediaPlayers;

import java.util.ArrayList;

public class AudioHandler {

    AudioPlayer menuMusic = new AudioPlayer();
    ArrayList<AudioPlayer> sounds = new ArrayList<AudioPlayer>();

    public AudioHandler() {

    }

    public void setMenuMusic(String menuMusicPath) {
        this.menuMusic.changeMusic(menuMusicPath);
    }

    public void playMenuMusic() {
        menuMusic.play();
    }

    public void stopMenuMusic() {
        menuMusic.stop();
    }

    public void closeMenuMusic() {
        menuMusic.close();
    }

    public void loopMenuMusic() {
        menuMusic.loop();
    }

    public void loopMenuMusic(int count) {
        menuMusic.loop(count);
    }

    public void playSound(AudioPlayer sound) {
        sounds.add(sound);
        sound.play();
    }

    public void clearFinishedSounds() {
        for (int i = sounds.size() - 1; i >= 0; i--) {
            if (sounds.get(i).isFinished()) {
                sounds.remove(i);
            }
        }
    }

}
