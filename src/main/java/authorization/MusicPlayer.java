package authorization;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {} // удаляется после определения своего конструктора

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}