package actionListener;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import uerInterface.UI;

// Class for mouseListener zooming in and mousemotionlistener
public class ActionListenerZoomIn implements MouseListener, MouseMotionListener {
	UI ui;
	Point currentpointPress;

	// constructor for this zoom in class to update the ui.
	public ActionListenerZoomIn(UI _ui) {
		ui = _ui;
	}

	// Method makes it so that when mouse is left clicked it should zoom in at
	// the specific x and y locations you mouse is at.
	// When you right click it will move / drag the screen to wherever you want
	// it to go
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Point currentpointClick = arg0.getPoint();
		if (arg0.getButton() == MouseEvent.BUTTON1) {
			ui.zoomin(currentpointClick);
		} else if (arg0.getButton() == MouseEvent.BUTTON3) {
			ui.move(currentpointClick);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	// When mouse pressed it should get the current point of when ur pressed it.
	@Override
	public void mousePressed(MouseEvent arg0) {

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	// When you drag your mouse it should move the screen as well.
	public void mouseDragged(MouseEvent arg0) {
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

	}

}
