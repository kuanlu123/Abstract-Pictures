package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import model.Main;

// This is the ActionListener class for checking the current escape distance.
public class ActionListenerEscapeCheck implements ActionListener {
	Main m;
	JLabel jl;

	// This is the constructor. It takes in Main because we need to check the
	// escape distance value and we need a Jlabel because
	// that is what will set the text and print out the escape distance on the
	// screen.
	public ActionListenerEscapeCheck(Main _m, JLabel _jl) {
		m = _m;
		jl = _jl;
	}

	// This method is what prints on the escape distance when you click on
	// EscapeDistance under the tab CheckEscapeDistance.
	@Override
	public void actionPerformed(ActionEvent e) {
		Math.round(m.distanceVal);
		double valueRounded = Math.round(m.distanceVal * 100D) / 100D;
		jl.setText(String.valueOf("Current Escape Distance: " + valueRounded));

	}

}
