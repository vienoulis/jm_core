//package ru.vienoulis.robot;
//
//public class Test {
//    public static void main(String[] args) {
//        Robot robot = new Robot();
//        robot.setX(-2);
//        robot.setY(-1);
//        robot.setDirection(Direction.LEFT);
//        int x = -1;
//        int y = -2;
//        moveRobot(robot, x, y);
//        System.out.println(robot.getX() + "  " + robot.getY());
//    }
//
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        RobotConnection connection = null;
//        for (int i = 0; i < 3; i++) {
//            try {
//                connection = robotConnectionManager.getConnection();
//                connection.moveRobotTo(toX, toY);
//                break;
//            } catch (RobotConnectionException e) {
//                if (i == 2) {
//                    throw new RobotConnectionException(" ");
//                }
//            } finally {
//                try {
//                    connection.close();
//                } catch (Exception e) {
//
//                }
//            }
//        }
//    }
//
//
//    public static void moveRobot(Robot robot, int toX, int toY) {
//        if (robot.getY() < toY) {
//            if (robot.getDirection().equals(Direction.LEFT)) {
//                robot.turnRight();
//            }
//            while (!robot.getDirection().equals(Direction.UP)) {
//                robot.turnLeft();
//            }
//
//        } else if (robot.getY() > toY) {
//            if (robot.getDirection().equals(Direction.LEFT)) {
//                robot.turnLeft();
//            } else {
//                while (!robot.getDirection().equals(Direction.DOWN)) {
//                    robot.turnRight();
//                }
//            }
//        }
//        while (toY != robot.getY()) {
//            robot.stepForward();
//        }
//        if (robot.getX() < toX) {
//            if (robot.getDirection().equals(Direction.UP)) {
//                robot.turnRight();
//            } else {
//                while (!robot.getDirection().equals(Direction.RIGHT)) {
//                    robot.turnLeft();
//                }
//            }
//        } else if (robot.getX() > toX) {
//            if (robot.getDirection().equals(Direction.UP)) {
//                robot.turnLeft();
//            } else {
//                while (!robot.getDirection().equals(Direction.LEFT)) {
//                    robot.turnRight();
//                }
//            }
//        }
//        while (toX != robot.getX()) {
//            robot.stepForward();
//        }
//    }
//
//}
