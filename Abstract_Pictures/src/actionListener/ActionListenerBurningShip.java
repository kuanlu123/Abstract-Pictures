package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BurningShip;
import uerInterface.UI;

// Action Listener for BurningShip. This is used for changing the image to BurningShip when you click on BurningShip under Fractal Tab.
public class ActionListenerBurningShip implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerBurningShip(UI _ui) {
		ui = _ui;
	}

	// This method makes it so it changes the fractal when you click on
	// BurningShip under Fractal Tab.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.changeFractal(new BurningShip());
	}

}