/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import edu.fcps.karel2.Robot;

public class Lab10 {
	 
	 public static void main(String[] args) {
		String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
       Display.setSpeed(8);
		 Athlete alex = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
		 clearMaze(alex);
	 }
	 
	 public static void clearMaze(Athlete arg) {
	 while (!arg.nextToABeeper()){
       
       if (arg.frontIsClear() && !arg.leftIsClear()){
       arg.move();
       }
       
       if (arg.leftIsClear()){
       arg.turnLeft();
       arg.move();
       }
       
       if (!arg.frontIsClear()&&!arg.leftIsClear()&&arg.rightIsClear()){
       arg.turnRight();
       arg.move();
       }
       
       if (!arg.frontIsClear()&&!arg.leftIsClear()&&!arg.rightIsClear()){
       arg.turnAround();
       arg.move();
       }

}
}
}