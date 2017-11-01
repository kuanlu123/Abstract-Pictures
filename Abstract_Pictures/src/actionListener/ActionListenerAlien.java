package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ColorModelFactory;
import uerInterface.UI;

// This is the ActionListener for changing fractal to Alien Color.
public class ActionListenerAlien implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerAlien(UI _ui) {
		ui = _ui;
	}

	// This created the Alien background which the color tab is clicked.
	// Set escape Distance to .8 to see a alien Ninja for Julia set.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.setIndexColorModel(ColorModelFactory.createAlienColorModel(126));
	}

}
