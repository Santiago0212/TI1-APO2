package model;

public class MediumRoom extends Room {
	
	private boolean chairs[][];
	
	public MediumRoom() {
		super();
		sizeY = 6;
		
		chairs = new boolean[sizeX][sizeY];
		
	}
	
}
