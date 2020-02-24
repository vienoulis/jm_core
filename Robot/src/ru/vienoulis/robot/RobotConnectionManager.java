package ru.vienoulis.robot;

public class RobotConnectionManager implements AutoCloseable{
    public RobotConnection getConnection() {
        return new RobotConnection();
    }

    @Override
    public void close() throws Exception {

    }
}
