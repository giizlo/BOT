package logic;

public interface RequestHanger {
    void handle(Request request, OutputWriter writer);
}
