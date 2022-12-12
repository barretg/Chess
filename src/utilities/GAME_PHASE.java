package utilities;

public enum GAME_PHASE {
	Start("Start"),
	Play("Play"),
	End("End");

	private String phaseName;
	
	GAME_PHASE(String name) {
		phaseName = name;
	}
	
	public String getName() {
		return phaseName;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	
}
