package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Julia;
import uerInterface.UI;

//Action Listener for Julia. This is used for changing the image to Julia when you click on Julia under Fractal Tab.
public class ActionListenerJulia implements ActionListener {
	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerJulia(UI _ui) {
		ui = _ui;
	}

	// This method makes it so it changes the fractal when you click on Julia
	// under Fractal Tab.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.changeFractal(new Julia());

	}

}
