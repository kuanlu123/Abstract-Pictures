package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uerInterface.UI;

// This is the action listener for resetting the escape time distance to 2.
public class ActionListenerResetEscapeTimeDistance implements ActionListener {
	UI ui;

	// The constructor needed to take in a UI(to update to screen)
	public ActionListenerResetEscapeTimeDistance(UI _ui) {
		ui = _ui;
	}

	// This is what calls the method to reset the escape time distance to 2.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.resetEscapeDistance();

	}

}
