package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utilities.GAME_PHASE;
import view.controls.AControls;
import view.controls.EndControls;
import view.controls.PlayControls;
import view.controls.StartControls;
import javax.swing.JLabel;

/**
 * The main view class for the Chess MVC.
 * 
 * @author barretglass
 *
 */
public class ChessGUI extends JFrame {

	private static final long serialVersionUID = -6312809072912568634L;
	private JPanel contentPane;
	private AControls pnlControls;
	private JPanel pnlGame;
	private JPanel pnlSouth;
	
	private IView2ModelAdapter _view2Model;
	private JLabel lblNewLabel;

	/**
	 * Create the GUI for the chess game.
	 */
	public ChessGUI(IView2ModelAdapter v2m) {
		_view2Model = v2m;
		initGUI();
	}
	
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		pnlGame = new JPanel();
		contentPane.add(pnlGame, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("There will be a game here eventually....");
		pnlGame.add(lblNewLabel);
		
		pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		pnlControls = AControls.makeEmpty();
		pnlSouth.add(pnlControls);
	}
	
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setVisible(true);
					_view2Model.updatePhase(GAME_PHASE.Start);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void updatePhase(GAME_PHASE phase) {
		switch(phase) {
			case Start:
				pnlControls = new StartControls(_view2Model);
//				System.out.println("Start phase!");
				break;
			case Play:
				pnlControls = new PlayControls(_view2Model);
				break;
			case End:
				pnlControls = new EndControls(_view2Model);
				break;
			default:
				break;
		}
		
		pnlSouth.removeAll();
		pnlSouth.add(pnlControls);
		
		pnlControls.start();
//		System.out.println("Started!");
		
		validate();
		repaint();
	}

}
