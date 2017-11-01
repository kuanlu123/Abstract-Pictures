package actionListener;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Main;
import uerInterface.UI;

// Action Listener class for resetting zoom.
public class ResetZoomActionListener implements ActionListener {
	UI ui;
	Main main;
	Point p;

	// Constructor for resetting zoom to update the ui and main
	public ResetZoomActionListener(UI _ui, Main _main, Point _p) {
		ui = _ui;
		main = _main;
		p = _p;
	}

	// calls the reset method everything you click to menu option Reset zoom.
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ui.Resetzoom();

	}

}
