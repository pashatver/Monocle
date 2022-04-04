package com.workspace;

public class Context {

    private static Long PLAYER_ID_SEQUENCE = 0L;

    public static Long newPlayerId() {
        return PLAYER_ID_SEQUENCE += 1;
    }

    public static Long getLastPlayerId() {
        return PLAYER_ID_SEQUENCE;
    }

}
