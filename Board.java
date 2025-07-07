package sANDl;

import java.util.HashMap;
import java.util.Map;

public class Board {
	
	Cells[] cells;
	Map<Integer, Integer> snakes = new HashMap<>();
	Map<Integer, Integer> ladders = new HashMap<>();
	
	
	public Board(int maxValue) {
		super();
		this.cells = initCells(maxValue);
		this.snakes = initSnakes();
		this.ladders = initLadders();
		
	}
	
	public Cells[] getCells() {
		return cells;
	}
	public void setCells(Cells[] cells) {
		this.cells = cells;
	}
	public Map<Integer, Integer> getSnakes() {
		return snakes;
	}
	public void setSnakes(Map<Integer, Integer> snakes) {
		this.snakes = snakes;
	}
	public Map<Integer, Integer> getLadders() {
		return ladders;
	}
	public void setLadders(Map<Integer, Integer> ladders) {
		this.ladders = ladders;
	}
	
	private Map<Integer, Integer> initSnakes(){
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		mp.put(85, 42);
        mp.put(73, 15);
        mp.put(67, 22);
        mp.put(50, 25);
        mp.put(91, 10);
        
		return mp;
	}
	
	
	private Map<Integer, Integer> initLadders(){
		
		Map<Integer, Integer> mp = new HashMap<>();
		
		mp.put(12, 45);
        mp.put(23, 67);
        mp.put(35, 90);
        mp.put(41, 88);
        mp.put(19, 55);
        
		return mp;
	}
	
	private Cells[] initCells(int maxValue) {
		
		Cells[] cells = new Cells[maxValue+1];
		
		for(int i=1;i<=maxValue;i++) {
			
			Cells cell = new Cells(i, true, false);
			if(snakes.containsKey(i))
			cell.isSafe=false;
			
			if(ladders.containsKey(i))
			cell.isLadder = true;
			
			cells[i] = cell;
		}
		
		return cells;
	}

	public int updatedPos(int i) {
		
		int newPosition = i;
		
	    if(!cells[i].isSafe) {
	        newPosition = snakes.get(i);
	    } 
	    
	    else if(cells[i].isLadder) {
	    	newPosition = ladders.get(i);
	    }
	    
	    return newPosition;

	} 
	
}
