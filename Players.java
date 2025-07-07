package sANDl;

public class Players {

	String name;
	int posNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	
	public Players(String name, int posNum) {
		super();
		this.name = name;
		this.posNum = posNum;
	}	
}
