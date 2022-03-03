package model;

public class MiniRoom extends Room {
	
	private boolean chairs[][];
	
	public MiniRoom() {
		super();
		sizeY = 4;
		
		chairs = new boolean[sizeX][sizeY];
		
	}
	
}
