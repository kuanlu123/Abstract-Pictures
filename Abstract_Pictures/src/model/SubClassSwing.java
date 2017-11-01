package model;

import javax.swing.SwingWorker;

public abstract class SubClassSwing extends SwingWorker<WorkerResult, Void> {
	Main m;
	private int grid = 2048;

	public SubClassSwing(Main _m) {
		m = _m;
	}

	public WorkerResult doinbackground() {
		return new WorkerResult(getProgress(), m.gridMake());

	}

}
