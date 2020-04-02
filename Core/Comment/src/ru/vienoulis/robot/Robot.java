package ru.vienoulis.robot;

public class Robot implements RobotConnection, RobotConnectionManager {
    private RobotConnection connection;


    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}
