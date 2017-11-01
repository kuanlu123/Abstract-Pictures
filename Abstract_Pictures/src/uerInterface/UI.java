package uerInterface;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import actionListener.ActionListenerAlien;
import actionListener.ActionListenerBlue;
import actionListener.ActionListenerBurningShip;
import actionListener.ActionListenerClose;
import actionListener.ActionListenerDecreaseMax;
import actionListener.ActionListenerEscapeCheck;
import actionListener.ActionListenerEscapeDistanceDecrease;
import actionListener.ActionListenerEscapeDistanceDecreaseLarge;
import actionListener.ActionListenerEscapeDistanceDecreaseSmall;
import actionListener.ActionListenerEscapeDistanceIncrease;
import actionListener.ActionListenerEscapeDistanceIncreaseLarge;
import actionListener.ActionListenerEscapeDistanceIncreaseSmall;
import actionListener.ActionListenerGray;
import actionListener.ActionListenerIncreaseMax;
import actionListener.ActionListenerJulia;
import actionListener.ActionListenerMandelbrot;
import actionListener.ActionListenerMultibrot;
import actionListener.ActionListenerRainbow;
import actionListener.ActionListenerResetEscapeTimeDistance;
import actionListener.ActionListenerZoomIn;
import actionListener.MaxEscapeDistanceCheckActionListener;
import actionListener.ResetZoomActionListener;

import java.awt.event.ActionListener;
import java.awt.image.IndexColorModel;

import edu.buffalo.fractal.FractalPanel;
import model.BurningShip;
import model.Julia;
import model.Main;
import model.Mandelbrot;
import model.Multibrot;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;

// This class is for creating the user interface things such as the menu, window, screen.
public class UI {
	// These are just declaring all the different variables we will need for the
	// interface. The variables are pretty self
	// explanatory for what it does. The fractalPanel is taken from Matthew
	// Hertz phase 2 site.
	private JFrame Window;
	private JMenu Menu, Menu2, Menu3, Menu4, Menu5;
	private FractalPanel ShowFractal = new FractalPanel();
	private Main main;
	private JMenuBar menuBar;
	private JPanel jp;
	private JMenuItem Close, Mandelbrot, BurningShip, Multibrot, Julia, Rainbow, Blue, Grey, Alien, EscapeDistance,
			ResetZoom, MaxEscapeDistance;
	private JButton increase, decrease, increaseSmall, decreaseSmall, increaseLarge, decreaseLarge, resetEscapeDistance,
			IncreaseMax, DecreaseMax;
	private JLabel jl, jl2;

	// This makes the UI run and basically connects it to the main. The run()
	// calls the run method which is right below this method.
	public UI(Main m) {
		main = m;
		run();

	}

	// This method basically takes care of all the updates on the Window.
	public void run() {
		// Creating new instances of variables type and Names.
		Window = new JFrame();
		menuBar = new JMenuBar();
		increase = new JButton("Incease (.1) Escape Distance");
		decrease = new JButton("Decrease (.1) Escape Distance");
		increaseSmall = new JButton("Increase small (.01) Escape Distance");
		increaseLarge = new JButton("Increase large ( .5) Escape Distance");
		decreaseSmall = new JButton("Decrease small (.01) Escape Distance");
		decreaseLarge = new JButton("Decrease large (.5) Escape Distance");
		resetEscapeDistance = new JButton("Reset Escape Distance");
		IncreaseMax = new JButton("Increase Max EscapeDistance");
		DecreaseMax = new JButton("Decrease Max EscapeDistance");
		Menu = new JMenu("File");
		Menu2 = new JMenu("Fractal");
		Menu3 = new JMenu("Color");
		Menu4 = new JMenu("CheckEscapeDisance");
		Menu5 = new JMenu("ResetZoom");
		jl = new JLabel();
		jl2 = new JLabel();
		jp = new JPanel();
		Close = new JMenuItem("Close");
		Mandelbrot = new JMenuItem("Mandelbrot");
		BurningShip = new JMenuItem("BurningShip");
		Multibrot = new JMenuItem("Multibrot");
		Julia = new JMenuItem("Julia");
		Rainbow = new JMenuItem("Rainbow");
		Blue = new JMenuItem("Blue");
		Grey = new JMenuItem("Grey");
		Alien = new JMenuItem("Alien");
		MaxEscapeDistance = new JMenuItem("MaxEscapeDistance");
		EscapeDistance = new JMenuItem("EscapeDistance");
		ResetZoom = new JMenuItem("ResetZoom");
		// Adding the menu items into the menu. The menu items are the sub tab
		// under the main tabs.
		Menu.add(Close);
		Menu2.add(Mandelbrot);
		Menu2.add(BurningShip);
		Menu2.add(Multibrot);
		Menu2.add(Julia);
		Menu3.add(Rainbow);
		Menu3.add(Blue);
		Menu3.add(Grey);
		Menu3.add(Alien);
		Menu4.add(EscapeDistance);
		Menu4.add(MaxEscapeDistance);
		Menu5.add(ResetZoom);
		// Adding buttons ,FractalPanel and JLabel to JPanel.
		jp.add(ShowFractal);
		jp.add(increaseSmall);
		jp.add(increase);
		jp.add(increaseLarge);
		jp.add(decreaseSmall);
		jp.add(decrease);
		jp.add(decreaseLarge);
		jp.add(IncreaseMax);
		jp.add(DecreaseMax);
		jp.add(resetEscapeDistance);
		jp.add(jl);
		jp.add(jl2);

		jp.setVisible(true);

		// Adding the Menu to MenuBar.
		menuBar.add(Menu);
		menuBar.add(Menu2);
		menuBar.add(Menu3);
		menuBar.add(Menu4);
		menuBar.add(Menu5);
		// Calling all the ActionListeners.
		Close.addActionListener(new ActionListenerClose());
		Mandelbrot.addActionListener(new ActionListenerMandelbrot(this));
		Julia.addActionListener(new ActionListenerJulia(this));
		Multibrot.addActionListener(new ActionListenerMultibrot(this));
		BurningShip.addActionListener(new ActionListenerBurningShip(this));
		Grey.addActionListener(new ActionListenerGray(this));
		Rainbow.addActionListener(new ActionListenerRainbow(this));
		Blue.addActionListener(new ActionListenerBlue(this));
		Alien.addActionListener(new ActionListenerAlien(this));
		increase.addActionListener(new ActionListenerEscapeDistanceIncrease(this, increase, main));
		decrease.addActionListener(new ActionListenerEscapeDistanceDecrease(this, decrease, main));
		EscapeDistance.addActionListener(new ActionListenerEscapeCheck(main, jl));
		increaseSmall.addActionListener(new ActionListenerEscapeDistanceIncreaseSmall(this, increaseSmall, main));
		increaseLarge.addActionListener(new ActionListenerEscapeDistanceIncreaseLarge(this, increaseLarge, main));
		decreaseSmall.addActionListener(new ActionListenerEscapeDistanceDecreaseSmall(this, decreaseSmall, main));
		decreaseLarge.addActionListener(new ActionListenerEscapeDistanceDecreaseLarge(this, decreaseLarge, main));
		resetEscapeDistance.addActionListener(new ActionListenerResetEscapeTimeDistance(this));
		IncreaseMax.addActionListener(new ActionListenerIncreaseMax(this, IncreaseMax, main));
		DecreaseMax.addActionListener(new ActionListenerDecreaseMax(this, DecreaseMax, main));
		ShowFractal.addMouseListener(new ActionListenerZoomIn(this));
		ShowFractal.addMouseMotionListener(new ActionListenerZoomIn(this));
		ResetZoom.addActionListener(new ResetZoomActionListener(this, main, null));
		MaxEscapeDistance.addActionListener(new MaxEscapeDistanceCheckActionListener(main, jl2));
		// Setting size of JButtons.
		increase.setPreferredSize(new Dimension(20, 20));
		decrease.setPreferredSize(new Dimension(20, 20));
		increaseSmall.setPreferredSize(new Dimension(20, 20));
		increaseLarge.setPreferredSize(new Dimension(20, 20));
		decreaseSmall.setPreferredSize(new Dimension(20, 20));
		decreaseLarge.setPreferredSize(new Dimension(20, 20));
		resetEscapeDistance.setPreferredSize(new Dimension(20, 20));
		// Set text of EscapeTime.
		jl.setText(String.valueOf("Current Escape Distance: " + main.distanceVal));
		jl2.setText(String.valueOf("Current Max Escape Distance: " + main.passesVal));
		ShowFractal.setSize(2048, 2048);
		// Fixing layouts and Making the Window work.
		jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));
		Window.add(jp);
		Window.setJMenuBar(menuBar);
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.pack();

	}

	// changesFractal to make changing Images work for each set. This is for
	// Fractal option in the menu.
	public void changeFractal(Main m) {
		main = m;
		ShowFractal.updateImage(m.gridMake());
		Window.pack();
	}

	// This is the method to get Colors. This is for Color option in the menu.
	public void setIndexColorModel(IndexColorModel cmf) {
		ShowFractal.setIndexColorModel(cmf);
		changeFractal(main);

	}

	// This is the same as changeFractal but used for escape Distance. I needed
	// two different methods otherwise it would mix up
	// and not update the right picture.
	public void updateImage(Main m) {
		main = m;
		ShowFractal.updateImage(main.gridMake());
		Window.pack();
	}

	// These methods decreases escapeDistance.
	public void updateImageDecrease() {
		main.distanceVal -= .1;
		updateImage(main);
	}

	// decreases escape distances
	public void updateImageDecreaseSmall() {
		main.distanceVal -= .01;
		updateImage(main);
	}

	// decreases escape distances
	public void updateImageDecreaseLarge() {
		main.distanceVal -= .5;
		updateImage(main);
	}

	// These methods increases escapeDistance.
	public void updateImageIncrease() {
		main.distanceVal += .1;
		updateImage(main);
	}

	// increases escape distance
	public void updateImageIncreaseSmall() {
		main.distanceVal += .01;
		updateImage(main);
	}

	// increases escape distance
	public void updateImageIncreaseLarge() {
		main.distanceVal += .5;
		updateImage(main);
	}

	public void resetEscapeDistance() {
		main.distanceVal = 2;
		updateImage(main);
	}

	public void updateImageIncreaseMax() {
		main.passesVal += 5;
		updateImage(main);
	}

	public void updateImageDecreaseMax() {
		main.passesVal -= 5;
		updateImage(main);
	}

	// Method to reset your zoom back to original position.
	public void Resetzoom() {
		if (main.minX == main.minX1) {
			updateImage(new Mandelbrot());

		}

		if (main.minX == main.minX2) {
			updateImage(new Julia());
		}
		if (main.minX == main.minX3) {
			updateImage(new BurningShip());
		}
		if (main.minX == main.minX4) {
			updateImage(new Multibrot());
		}
		updateImage(main);

	}

	// This formula makes the picture zoom in when you click your mouse at the
	// specified x and y coordinates. It will recalculate the
	// fractal and make it zoomed in.
	public void zoomin(Point p) {
		if (main.minX == main.minX1) {
			main.minX = main.xCalculate(4 * p.x) - (main.rangeX / 3);
			main.minX1 = main.minX;
		}
		if (main.minX == main.minX2) {
			main.minX = main.xCalculate(4 * p.x) - (main.rangeX / 3);
			main.minX2 = main.minX;
		}
		if (main.minX == main.minX3) {
			main.minX = main.xCalculate(4 * p.x) - (main.rangeX / 3);
			main.minX3 = main.minX;
		}
		if (main.minX == main.minX4) {
			main.minX = main.xCalculate(4 * p.x) - (main.rangeX / 3);
			main.minX4 = main.minX;
		}
		main.maxX = main.xCalculate(4 * p.x) + (main.rangeX / 3);
		main.minY = main.yCalculate(4 * p.y) - (main.rangeY / 3);
		main.maxY = main.yCalculate(4 * p.y) + (main.rangeY / 3);
		main.rangeX = Math.abs(main.maxX - main.minX);
		main.rangeY = Math.abs(main.maxY - main.minY);
		updateImage(main);
	}

	// This should make it so you can drag / shift the screen when you right
	// click.
	public void move(Point _move) {

		if (main.minX == main.minX1) {
			main.minX = main.minX + (main.xCalculate(4 * _move.x) - main.xCalculate(main.center));
			main.minX1 = main.minX;
		}
		if (main.minX == main.minX2) {
			main.minX = main.minX + (main.xCalculate(4 * _move.x) - main.xCalculate(main.center));
			main.minX2 = main.minX;
		}
		if (main.minX == main.minX3) {
			main.minX = main.minX + (main.xCalculate(4 * _move.x) - main.xCalculate(main.center));
			main.minX3 = main.minX;
		}
		if (main.minX == main.minX4) {
			main.minX = main.minX + (main.xCalculate(4 * _move.x) - main.xCalculate(main.center));
			main.minX4 = main.minX;
		}
		main.maxX = main.maxX + (main.xCalculate(4 * _move.x) - main.xCalculate(main.center));
		main.maxY = main.maxY + (main.yCalculate(4 * _move.y) - main.yCalculate(main.center));
		main.minY = main.minY + (main.yCalculate(4 * _move.y) - main.yCalculate(main.center));
		main.rangeX = Math.abs(main.maxX - main.minX);
		main.rangeY = Math.abs(main.maxY - main.minY);
		updateImage(main);
	}

}
