package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Client;
import model.Function;

public class MiniRoomMap {
	
	private Client client;
	private Function function;
	
	public MiniRoomMap(Client client, Function function) {
		this.client = client;
		this.function = function;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

    @FXML
    private Button sillaA1BTN;

    @FXML
    private Button sillaA2BTN;

    @FXML
    private Button sillaA3BTN;

    @FXML
    private Button sillaA4BTN;

    @FXML
    private Button sillaA5BTN;

    @FXML
    private Button sillaA6BTN;

    @FXML
    private Button sillaA7BTN;

    @FXML
    private Button sillaB1BTN;

    @FXML
    private Button sillaB2BTN;

    @FXML
    private Button sillaD7BTN;

    @FXML
    private Button sillaD6BTN;

    @FXML
    private Button sillaD5BTN;

    @FXML
    private Button sillaD4BTN;

    @FXML
    private Button sillaD3BTN;

    @FXML
    private Button sillaD2BTN;

    @FXML
    private Button sillaD1BTN;

    @FXML
    private Button sillaC7BTN;

    @FXML
    private Button sillaC1BTN;

    @FXML
    private Button sillaC6BTN;

    @FXML
    private Button sillaC5BTN;

    @FXML
    private Button sillaC4BTN;

    @FXML
    private Button sillaC3BTN;

    @FXML
    private Button sillaC2BTN;

    @FXML
    private Button sillaB7BTN;

    @FXML
    private Button sillaB6BTN;

    @FXML
    private Button sillaB5BTN;

    @FXML
    private Button sillaB4BTN;

    @FXML
    private Button sillaB3BTN;

    @FXML
    void addSilla(ActionEvent event) {
    	if(event.getSource()==sillaA1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 0);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA2BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 1);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA3BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 2);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA4BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 3);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA5BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 4);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA6BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 5);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaA7BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 6);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 0);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB2BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 1);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB3BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 2);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB4BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 3);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB5BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 4);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB6BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 5);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaB7BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 1, 6);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 0);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC2BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 1);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC3BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 2);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC4BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 3);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC5BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 4);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC6BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 5);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaC7BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 2, 6);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 0);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD2BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 1);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD3BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 2);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD4BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 3);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD5BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 4);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD6BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 5);
    		} else {
    			System.out.println("No disponible");
    		}
    	}else if(event.getSource()==sillaD7BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 3, 6);
    		} else {
    			System.out.println("No disponible");
    		}
    	}
    }

}

