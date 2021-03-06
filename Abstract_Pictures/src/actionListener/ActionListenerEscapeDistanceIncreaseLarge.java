package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Main;
import uerInterface.UI;

//This is the ActionListener class for increase the escape time distance by .5 .
public class ActionListenerEscapeDistanceIncreaseLarge implements ActionListener {
	JButton jb;
	Main m;
	UI ui;

	// The constructor needed to take in three parameters this time because in
	// order to change the escape time you need a JButton
	// (for when it is clicked), a UI(to update to screen) and the main in case
	// we need to make for boundaries for for escape time distance.
	public ActionListenerEscapeDistanceIncreaseLarge(UI _ui, JButton _jb, Main _m) {
		m = _m;
		ui = _ui;
		jb = _jb;
	}

	// This method makes it so if the JButton is clicked it will increase the
	// escape distance.
	@Override
	public void actionPerformed(ActionEvent e) {

		if (jb.isEnabled()) {
			ui.updateImageIncreaseLarge();
		}

	}
}
