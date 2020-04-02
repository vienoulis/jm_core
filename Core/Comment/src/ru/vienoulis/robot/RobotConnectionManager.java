package ru.vienoulis.robot;

public interface RobotConnectionManager {
    RobotConnection getConnection() throws RobotConnectionException;
}
