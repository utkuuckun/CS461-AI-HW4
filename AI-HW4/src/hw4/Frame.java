package hw4;

public class Frame {
	
	//properties
	private String name;
	private Frame leftSuperclass;
	private Frame rightSuperclass;
	
	public Frame(String name)
	{
		this.name = name;
		leftSuperclass = null;
		rightSuperclass = null;
	}
	public Frame(String name, Frame leftSuper)
	{
		this.name = name;
		leftSuperclass = leftSuper;
		rightSuperclass = null;
	}
	
	public Frame(String name, Frame leftSuper, Frame rightSuper)
	{
		this.name = name;
		leftSuperclass = leftSuper;
		rightSuperclass = rightSuper;
	}
	
	
	public boolean isSuperclass(String name)
	{
		if(leftSuperclass != null && rightSuperclass != null)
			if(leftSuperclass.getName().compareTo(name) == 0 || rightSuperclass.getName().compareTo(name) == 0)
				return true;
		if(leftSuperclass != null && rightSuperclass == null && leftSuperclass.getName().compareTo(name) == 0 )
			return true;
		
		return false;
	}
	
	
	
	public Frame getLeftSuperclass() {
		return leftSuperclass;
	}
	public void setLeftSuperclass(Frame leftSuperclass) {
		this.leftSuperclass = leftSuperclass;
	}
	public Frame getRightSuperclass() {
		return rightSuperclass;
	}
	public void setRightSuperclass(Frame rightSuperclass) {
		this.rightSuperclass = rightSuperclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return getName();
	}
}
