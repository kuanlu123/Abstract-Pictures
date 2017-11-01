package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ColorModelFactory;
import uerInterface.UI;

//This is the ActionListener for changing fractal to rainbow color.
public class ActionListenerRainbow implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerRainbow(UI _ui) {
		ui = _ui;
	}

	// This created the rainbow background which the color tab is clicked.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.setIndexColorModel(ColorModelFactory.createRainbowColorModel(255));
	}

}
