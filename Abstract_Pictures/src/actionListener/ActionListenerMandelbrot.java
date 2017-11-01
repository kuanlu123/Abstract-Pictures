package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.buffalo.fractal.FractalPanel;
import model.Mandelbrot;
import uerInterface.UI;

//Action Listener for Mandelbrot. This is used for changing the image to Mandelbrot when you click on Mandelbrot under Fractal Tab.
public class ActionListenerMandelbrot implements ActionListener {

	UI ui;

	// Constructor for ActionListener class. Used to store value of _ui.
	public ActionListenerMandelbrot(UI _ui) {
		ui = _ui;
	}

	// This method makes it so it changes the fractal when you click on
	// Mandelbrot under Fractal Tab.
	@Override
	public void actionPerformed(ActionEvent e) {
		ui.changeFractal(new Mandelbrot());
	}

}
