/*Hey everyone, my childcare ended up cancelling last minute due to illness so at the very least I'll be in late today. I'm scrambling to get something set up so I can come in. For the morning challenge, please try Programming Exercise 2 at the end of Chapter 7 (the baby names one). If I'm still not in by the time that is done. Work on the debugging exercises I slacked out yesterday for Ch. 7. Please be courteous to whoever they get to sit in and sub. Hopefully I'll see you a little later. */
import javax.swing.JOptionPane;
public class BabyNames {
	public static void main(String[] args) {
		String name1;
		String name2;
		String name3;


		name1 = JOptionPane.showInputDialog(null, "Enter a baby name!");
		name2 = JOptionPane.showInputDialog(null, "Enter another baby name!");
		name3 = JOptionPane.showInputDialog(null, "Enter a third baby name!");

		JOptionPane.showInputDialog(null, " You entered \n" + name1 + "\n" + name2 + "\n" + name3);
		JOptionPane.showInputDialog(null, " These are the word combinations you get \n"  + name1 + "-"  + name2 + "\n" + name3 + "-" + name2 + "-" + name1);
	}
}