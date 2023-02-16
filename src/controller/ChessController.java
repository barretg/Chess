package controller;

import java.awt.Graphics;

import model.ChessModel;
import model.IModel2ViewAdapter;
import utilities.GAME_PHASE;
import view.ChessGUI;
import view.IView2ModelAdapter;

public class ChessController {
	
	private ChessGUI _view;
	private ChessModel _model;
	
	public ChessController() {
		_view = new ChessGUI(new IView2ModelAdapter() {

			@Override
			public void updatePhase(GAME_PHASE phase) {
				_model.updatePhase(phase);
			}

			@Override
			public void update(Graphics g) {
				_model.update(g);
			}
			
		});
		
		_model = new ChessModel(new IModel2ViewAdapter() {

			@Override
			public void updatePhase(GAME_PHASE phase) {
				_view.updatePhase(phase);
			}
			
		});
	}
	
	public void start() { 
		_view.start();
		_model.start();
	}
	
	/**
	 * Main file for the application
	 * @param args the cmd line arguments
	 */
	public static void main(String args[]) {
		ChessController controller = new ChessController();
		controller.start();
	}
}
