package view.controls;

import view.IView2ModelAdapter;

import javax.swing.JButton;

public class StartControls extends AControls {

	private static final long serialVersionUID = -7602364610571488984L;
	
	/**
	 * Create the panel.
	 */
	public StartControls(IView2ModelAdapter v2m) {
		super(v2m);
	}
	
	public void initPanel() {
		JButton btnStart = new JButton("Start Game!");
		add(btnStart);
	}

}
