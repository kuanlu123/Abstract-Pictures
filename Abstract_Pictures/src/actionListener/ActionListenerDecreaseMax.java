package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Main;
import uerInterface.UI;

public class ActionListenerDecreaseMax implements ActionListener {
	JButton jb;
	Main m;
	UI ui;

	public ActionListenerDecreaseMax(UI _ui, JButton _jb, Main _m) {
		m = _m;
		ui = _ui;
		jb = _jb;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (jb.isEnabled() && m.passesVal >= 1) {
			ui.updateImageDecreaseMax();

			if (m.passesVal < 6) {
				ui.updateImageIncreaseMax();
			}
		}

	}
}
