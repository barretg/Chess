package model;

import utilities.GAME_PHASE;

public class ChessModel {
	
	IModel2ViewAdapter _model2View;
	
	public ChessModel(IModel2ViewAdapter m2v) {
		_model2View = m2v;
	}

	public void updatePhase(GAME_PHASE phase) {
		//do phase update things in the model and then tell the view to update.
		
		_model2View.updatePhase(phase);
	}

	public void start() {
		//do startup things
	}

}
