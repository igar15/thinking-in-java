package ru.javaprojects.thinkinginjava.chapter6.exercise8.inner;

public class ConnectionManager {
    private static final int CONNECTIONS_LIMIT = 3;
    private static Connection[] connections = null;
    private static int usedConnectionsCounter;

    static {
        connections = new Connection[CONNECTIONS_LIMIT];
        for (int i = 0; i < CONNECTIONS_LIMIT; i++) {
            connections[i] = new Connection(i);
        }
        usedConnectionsCounter = 0;
    }

    public static Connection getConnection() {
        if (usedConnectionsCounter == CONNECTIONS_LIMIT) {
            return null;
        }
        return connections[usedConnectionsCounter++];
    }
}