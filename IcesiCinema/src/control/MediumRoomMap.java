package control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import model.Client;
import model.Function;

public class MediumRoomMap {
	private Client client;
	private Function function;
	
	public MediumRoomMap(Client client, Function function) {
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
    private Button sillaF7BTN;

    @FXML
    private Button sillaF6BTN;

    @FXML
    private Button sillaE7BTN;

    @FXML
    private Button sillaE6BTN;

    @FXML
    private Button sillaF5BTN;

    @FXML
    private Button sillaE5BTN;

    @FXML
    private Button sillaF4BTN;

    @FXML
    private Button sillaE4BTN;

    @FXML
    private Button sillaF3BTN;

    @FXML
    private Button sillaE3BTN;

    @FXML
    private Button sillaF2BTN;

    @FXML
    private Button sillaE2BTN;

    @FXML
    private Button sillaF1BTN;

    @FXML
    private Button sillaE1BTN;

    @FXML
    void addSilla(ActionEvent event) {
    	if(event.getSource()==sillaA1BTN) {
    		if(function.room.isAvailable(0, 0)) {
    			function.room.assingClient(client, 0, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA2BTN) {
    		if(function.room.isAvailable(0, 1)) {
    			function.room.assingClient(client, 0, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA3BTN) {
    		if(function.room.isAvailable(0, 2)) {
    			function.room.assingClient(client, 0, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA4BTN) {
    		if(function.room.isAvailable(0, 3)) {
    			function.room.assingClient(client, 0, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA5BTN) {
    		if(function.room.isAvailable(0, 4)) {
    			function.room.assingClient(client, 0, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA6BTN) {
    		if(function.room.isAvailable(0, 5)) {
    			function.room.assingClient(client, 0, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaA7BTN) {
    		if(function.room.isAvailable(0, 6)) {
    			function.room.assingClient(client, 0, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB1BTN) {
    		if(function.room.isAvailable(1, 0)) {
    			function.room.assingClient(client, 1, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB2BTN) {
    		if(function.room.isAvailable(1, 1)) {
    			function.room.assingClient(client, 1, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB3BTN) {
    		if(function.room.isAvailable(1, 2)) {
    			function.room.assingClient(client, 1, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB4BTN) {
    		if(function.room.isAvailable(1, 3)) {
    			function.room.assingClient(client, 1, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB5BTN) {
    		if(function.room.isAvailable(1, 4)) {
    			function.room.assingClient(client, 1, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB6BTN) {
    		if(function.room.isAvailable(1, 5)) {
    			function.room.assingClient(client, 1, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaB7BTN) {
    		if(function.room.isAvailable(1, 6)) {
    			function.room.assingClient(client, 1, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC1BTN) {
    		if(function.room.isAvailable(2, 0)) {
    			function.room.assingClient(client, 2, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC2BTN) {
    		if(function.room.isAvailable(2, 1)) {
    			function.room.assingClient(client, 2, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC3BTN) {
    		if(function.room.isAvailable(2, 2)) {
    			function.room.assingClient(client, 2, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC4BTN) {
    		if(function.room.isAvailable(2, 3)) {
    			function.room.assingClient(client, 2, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC5BTN) {
    		if(function.room.isAvailable(2, 4)) {
    			function.room.assingClient(client, 2, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC6BTN) {
    		if(function.room.isAvailable(2, 5)) {
    			function.room.assingClient(client, 2, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaC7BTN) {
    		if(function.room.isAvailable(2, 6)) {
    			function.room.assingClient(client, 2, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD1BTN) {
    		if(function.room.isAvailable(3, 0)) {
    			function.room.assingClient(client, 3, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD2BTN) {
    		if(function.room.isAvailable(3, 1)) {
    			function.room.assingClient(client, 3, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD3BTN) {
    		if(function.room.isAvailable(3, 2)) {
    			function.room.assingClient(client, 3, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD4BTN) {
    		if(function.room.isAvailable(3, 3)) {
    			function.room.assingClient(client, 3, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD5BTN) {
    		if(function.room.isAvailable(3, 4)) {
    			function.room.assingClient(client, 3, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD6BTN) {
    		if(function.room.isAvailable(3, 5)) {
    			function.room.assingClient(client, 3, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaD7BTN) {
    		if(function.room.isAvailable(3, 6)) {
    			function.room.assingClient(client, 3, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE1BTN) {
    		if(function.room.isAvailable(4, 0)) {
    			function.room.assingClient(client, 4, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE2BTN) {
    		if(function.room.isAvailable(4, 1)) {
    			function.room.assingClient(client, 4, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE3BTN) {
    		if(function.room.isAvailable(4, 2)) {
    			function.room.assingClient(client, 4, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE4BTN) {
    		if(function.room.isAvailable(4, 3)) {
    			function.room.assingClient(client, 4, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE5BTN) {
    		if(function.room.isAvailable(4, 4)) {
    			function.room.assingClient(client, 4, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE6BTN) {
    		if(function.room.isAvailable(4, 5)) {
    			function.room.assingClient(client, 4, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaE7BTN) {
    		if(function.room.isAvailable(4, 6)) {
    			function.room.assingClient(client, 4, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF1BTN) {
    		if(function.room.isAvailable(5, 0)) {
    			function.room.assingClient(client, 5, 0);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF2BTN) {
    		if(function.room.isAvailable(5, 1)) {
    			function.room.assingClient(client, 5, 1);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF3BTN) {
    		if(function.room.isAvailable(5, 2)) {
    			function.room.assingClient(client, 5, 2);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF4BTN) {
    		if(function.room.isAvailable(5, 3)) {
    			function.room.assingClient(client, 5, 3);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF5BTN) { 
    		if(function.room.isAvailable(5, 4)) {
    			function.room.assingClient(client, 5, 4);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF6BTN) {
    		if(function.room.isAvailable(5, 5)) {
    			function.room.assingClient(client, 5, 5);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}else if(event.getSource()==sillaF7BTN) {
    		if(function.room.isAvailable(5, 6)) {
    			function.room.assingClient(client, 5, 6);
    			successfullyAssignedChairlAlert();
    		} else {
    			inUseChairAlert();
    		}
    	}
    }
    
    public void inUseChairAlert() {
    	Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setHeaderText(null);
	    alert.setTitle("Error");
	    alert.setContentText("La silla que intenta reservar ya está ocupada.");
	    alert.showAndWait();
    }
    
    public void successfullyAssignedChairlAlert() {
    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setHeaderText(null);
	    alert.setTitle("Exito");
	    alert.setContentText("Ha reservado satisfactoriamente.");
	    alert.showAndWait();
    }
}
