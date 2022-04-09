package java.service;

public class Context {
    private static Integer PLAYER_ID_SEQUENCE = 0;
    public static Integer newPlayerID() {
        return PLAYER_ID_SEQUENCE += 1;
    }
    public static Integer getLastPlayerID() {
        return PLAYER_ID_SEQUENCE;
    }
}