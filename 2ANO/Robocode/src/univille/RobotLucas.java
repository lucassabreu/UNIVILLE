package univille;

import robocode.AdvancedRobot;

/**
 * @author lucas.abreu
 */
public class RobotLucas extends AdvancedRobot {
    @Override
    public void run() {
        while(true) {
            ahead(10);
            turnLeft(30);
        }
    }
}
