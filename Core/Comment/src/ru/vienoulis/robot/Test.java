package ru.vienoulis.robot;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        RobotConnection connection;
        long l = 0;
        float f = l;
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        try (RobotConnection connection = robotConnectionManager.getConnection()){
            connection.moveRobotTo(toX, toY);
        }catch (RobotConnectionException e ){
            try (RobotConnection connection = robotConnectionManager.getConnection()){
                connection.moveRobotTo(toX, toY);
            }catch (RobotConnectionException i){
                try (RobotConnection connection = robotConnectionManager.getConnection()){
                    connection.moveRobotTo(toX, toY);
                } catch (RobotConnectionException ex){
                    ex.printStackTrace();
                }
            }

        }
    }
}
