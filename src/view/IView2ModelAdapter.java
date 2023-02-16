package view;

import java.awt.Graphics;

import utilities.GAME_PHASE;

/**
 * Adapter from the view to the model
 * 
 * @author barretglass
 */
public interface IView2ModelAdapter {
	
	//Make a null adapter
	public static IView2ModelAdapter makeNull() {
		return new IView2ModelAdapter() {

			@Override
			public void updatePhase(GAME_PHASE phase) {
				//no-op
			}

			@Override
			public void update(Graphics g) {
				//no-op
			}
			
		};
	}

	public void updatePhase(GAME_PHASE phase);

	public void update(Graphics g);

}
