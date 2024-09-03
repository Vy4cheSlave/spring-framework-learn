package authorization;

public interface Music{
    String getSong();
    default void doInit() {
        System.out.printf("Initialization\n");
    }
    default void doDestroy() {
        System.out.printf("Destroying\n");
    }
}