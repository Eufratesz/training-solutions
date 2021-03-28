package interfaces.example;

public interface Writable {
    int DEFAULT_CONTENT_SIZE = 100;

    boolean write(String text);
}
