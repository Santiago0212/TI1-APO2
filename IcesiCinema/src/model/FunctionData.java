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
			for(Function f : functions) {
				
				double addingInf = date.getTime()/1000;
				double addingSup = (date.getTime()/1000) + duration;
				
				double currentInf = f.getDate().getTime()/1000;
				double currentSup = (f.getDate().getTime()/1000) + f.getDuration();
				
				if(duration==0) {
					addable = false;
				}
				
				//Si la pelicula comienza durante una que ya existe
				if(addingInf>currentInf && addingInf<currentSup) {
					addable = false;
				}
				
				//Si la pelicula termina durante una que ya existe
				if(addingSup>currentInf && addingSup<currentSup) {
					addable = false;
				}
				
				
				if(currentInf>addingInf && currentInf<addingSup) {
					addable = false;
				}
				
				if(currentInf>addingInf && currentSup<addingSup) {
					addable = false;
				}
				
				if(addingInf==currentInf && addingSup==currentSup) {
					addable = false;
				}
				
			}
		}
		
		
		return addable;
	}
	
}
