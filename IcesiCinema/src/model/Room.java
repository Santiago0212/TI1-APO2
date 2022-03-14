package model;

public class Room {
	protected int sizeX;
	protected int sizeY;
	protected String name;
	public Client clients[][];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClientName(int x, int y) {
		String clientName = clients[x][y].getName();
		return clientName;
	}
	
	public boolean isAvailable(int x, int y) {
		boolean available = false;
		if(clients[x][y]==null) {
			available = true;
		}
		return available;
	}
	
	public void assingClient(Client client, int x, int y) {
		clients[x][y] = client;
	}
	
}
