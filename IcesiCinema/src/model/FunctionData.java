package model;

import java.util.ArrayList;
import java.util.Date;

public class FunctionData {
private ArrayList<Function> functions;
	
	public FunctionData() {
		functions = new ArrayList<>();
	}
	
	public boolean addFunction(Function function) {
		
		boolean added = false;
		
		if(canAdd(function.getDate(),function.getDuration(),function.getRoom())) {
			functions.add(function);
			added = true;
		}
		
		return added;
	}
	
	public boolean canAdd(Date date, double duration, Room room) {
		boolean addable = true;
		
		Date now = new Date();
		
		if(date.compareTo(now)<0) {
			addable = false;
		} else {
			for(int i=0; i<functions.size() && addable; i++) {
				long substraction1 = (functions.get(i).getDate().getTime() - date.getTime())/1000; //Se divide entre 1000 para obtener segundos

				if(substraction1<duration && room.equals(functions.get(i).getRoom())) {
					addable = false;
				}
				
				long substraction2 = (long) ((functions.get(i).getDate().getTime() - (date.getTime() + duration))/1000); //Se divide entre 1000 para obtener segundos

				if(substraction2<duration && room.equals(functions.get(i).getRoom())) {
					addable = false;
				}
				
				long substraction3 = (long) (((functions.get(i).getDate().getTime() + functions.get(i).getDuration()) - date.getTime())/1000); //Se divide entre 1000 para obtener segundos

				if(substraction3<duration && room.equals(functions.get(i).getRoom())) {
					addable = false;
				}
				
				long substraction4 = (long) (((functions.get(i).getDate().getTime() + functions.get(i).getDuration()) - (date.getTime() + duration))/1000); //Se divide entre 1000 para obtener segundos

				if(substraction4<duration && room.equals(functions.get(i).getRoom())) {
					addable = false;
				}
				
			}
		}
		
		
		return addable;
	}
	
}
