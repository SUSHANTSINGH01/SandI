package sANDl;

public class Cells {

	 int posNum;
	 boolean isSafe;
	 boolean isLadder;
	public int getPosNum() {
		return posNum;
	}
	
	public Cells(int posNum, boolean isSafe, boolean isLadder) {
		super();
		this.posNum = posNum;
		this.isSafe = isSafe;
		this.isLadder = isLadder;
	}

	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	public boolean isSafe() {
		return isSafe;
	}
	public void setSafe(boolean isSafe) {
		this.isSafe = isSafe;
	}
	public boolean isLadder() {
		return isLadder;
	}
	public void setLadder(boolean isLadder) {
		this.isLadder = isLadder;
	}
	 
	 
}
