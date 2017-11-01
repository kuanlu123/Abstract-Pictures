package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener for closing the application when you click close on the file tab.
public class ActionListenerClose implements ActionListener {
	// This method makes it so take it application closes you click close under
	// file tab.
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);

	}

}
