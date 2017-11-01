package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Main;
import uerInterface.UI;

//This is the ActionListener class for decreasing the escape time distance by .5.
public class ActionListenerEscapeDistanceDecreaseLarge implements ActionListener {
	JButton jb;
	Main m;
	UI ui;

	// The constructor needed to take in three parameters this time because in
	// order to change the escape time you need a JButton
	// (for when it is clicked), a UI(to update to screen) and the main to make
	// since the escape time distance is never 0.
	public ActionListenerEscapeDistanceDecreaseLarge(UI _ui, JButton _jb, Main _m) {
		m = _m;
		ui = _ui;
		jb = _jb;

	}

	// This method makes it so if the JButton is clicked it will decrease the
	// escape distance and only if the escape distance is not 0.
	@Override
	public void actionPerformed(ActionEvent e) {
		if (jb.isEnabled() && !(m.distanceVal < 0)) {
			ui.updateImageDecreaseLarge();
			if (m.distanceVal < 0) {
				ui.updateImageIncreaseLarge();
			}
		}

	}
}
