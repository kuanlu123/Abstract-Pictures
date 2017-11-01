package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import model.Main;

public class MaxEscapeDistanceCheckActionListener implements ActionListener {
	Main m;
	JLabel jl2;

	// This is the constructor. It takes in Main because we need to check the
	// escape distance value and we need a Jlabel because
	// that is what will set the text and print out the escape distance on the
	// screen.
	public MaxEscapeDistanceCheckActionListener(Main _m, JLabel _jl) {
		m = _m;
		jl2 = _jl;
	}

	// This method is what prints on the escape distance when you click on
	// MaxEscapeDistance under the tab CheckEscapeDistance.
	@Override
	public void actionPerformed(ActionEvent e) {
		Math.round(m.distanceVal);
		double valueRounded = m.passesVal;
		jl2.setText(String.valueOf("Current Max Escape Distance: " + valueRounded));

	}
}
