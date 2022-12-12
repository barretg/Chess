package view;

/**
 * Adapter from the view to the model
 * 
 * @author barretglass
 */
public interface IView2ModelAdapter {
	
	//Make a null adapter
	public static IView2ModelAdapter makeNull() {
		return new IView2ModelAdapter() {
			
		};
	}

}
