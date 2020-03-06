package ru.vienoulis.robot;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setX(-2);
        robot.setY(-1);
        robot.setDirection(Direction.RIGHT);
        int x = -1;
        int y = -2;
        moveRobot(robot, x, y);
        System.out.println(robot.getX() + "  " + robot.getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = null;
        if (robot.getY() < toY) {
            direction = Direction.UP;
        } else if (robot.getY() > toY) {
            direction = Direction.DOWN;
        }
        while (direction != null && !robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        direction = null;
        while (toY != robot.getY()) {
            robot.stepForward();
        }
        if (robot.getX() < toX) {
            direction = Direction.RIGHT;
        } else if (robot.getX() > toX) {
            direction = Direction.LEFT;
        }
        while (direction != null && !robot.getDirection().equals(direction)) {
            robot.turnLeft();
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }
    }

}
