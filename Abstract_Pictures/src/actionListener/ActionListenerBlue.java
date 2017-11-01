package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ColorModelFactory;
import uerInterface.UI;

// This is the ActionListener for changing fractal to blue Color.
public class ActionListenerBlue implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerBlue(UI _ui) {
		ui = _ui;
	}

	// This created the blue background which the color tab is clicked.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.setIndexColorModel(ColorModelFactory.createBluesColorModel(255));

	}

}
