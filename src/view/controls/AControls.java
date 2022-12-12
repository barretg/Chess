package view.controls;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.IView2ModelAdapter;

public abstract class AControls extends JPanel {
	
	private static final long serialVersionUID = -1262845578719333529L;
	
	IView2ModelAdapter _view2Model;
	
	public static AControls makeEmpty() {
		
		return new AControls(IView2ModelAdapter.makeNull()) {
			
			private static final long serialVersionUID = 687845293531485436L;

			public void initPanel() {
				JLabel emptyLabel = new JLabel("Oops! Something went wrong!");
				add(emptyLabel);
			}
		};
	}
	
	/**
	 * Create the panel.
	 */
	public AControls(IView2ModelAdapter v2m) {
		_view2Model = v2m;
		initPanel();
	}
	
	public abstract void initPanel();
	
	public void start() {
		setVisible(true);
	}
}
