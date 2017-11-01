package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Multibrot;
import uerInterface.UI;

//Action Listener for Multibrot. This is used for changing the image to Multibrot when you click on Multibrot under Fractal Tab.
public class ActionListenerMultibrot implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerMultibrot(UI _ui) {
		ui = _ui;
	}

	// This method makes it so it changes the fractal when you click on
	// Multibrot under Fractal Tab.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.changeFractal(new Multibrot());

	}

}
