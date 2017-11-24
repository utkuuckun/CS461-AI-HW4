package hw4;

public class Pair {

	//properties
	private String first;
	private String second;
	public Pair(Frame first, Frame second){
		this.first = first.getName();
		this.second = second.getName();
	}
	public Pair(Frame first){
		this.first = first.getName();
		this.second = null;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	
	public String toString()
	{
		return first + " - " + second;
	}
	
}
