//package ru.vienoulis.robot;
//
//import ru.vienoulis.robot.Direction;
//import ru.vienoulis.robot.Robot;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        for (int i = 0; i < 3; i++) {
//            try (RobotConnection connection = robotConnectionManager.getConnection()) {
//                connection.moveRobotTo(toX, toY);
//                break;
//            } catch (RobotConnectionException e) {
//                if (i == 2) {
//                    throw new RobotConnectionException();
//                }
//            }
//        }
//    }
//
//    public static void moveRobot2(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//
//        try (RobotConnection connection = robotConnectionManager.getConnection()) {
//            connection.moveRobotTo(toX, toY);
//
//        } catch (RobotConnectionException e) {
//            try (RobotConnection connection = robotConnectionManager.getConnection()) {
//                connection.moveRobotTo(toX, toY);
//
//            } catch (RobotConnectionException i) {
//                RobotConnection connection = robotConnectionManager.getConnection();
//
//                connection.moveRobotTo(toX, toY);
//                try {
//                    connection.close();
//                } catch (Exception er) {
//
//                }
//            }
//        }
//    }
//}
