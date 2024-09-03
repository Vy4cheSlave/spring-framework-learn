package authorization;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {};

    public static ClassicalMusic doFactory() {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Classical music";
    }
}