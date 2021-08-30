import javax.swing.*;

class GUI{
	public GUI(){
		JButton button1 = new JButton("PRESS1");

		JFrame mainWindow = new JFrame("Gui top");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(450, 300);

		mainWindow.getContentPane().add(button1);
		mainWindow.setVisible(true);
	}
}