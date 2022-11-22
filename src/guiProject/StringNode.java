package guiProject;


public class StringNode {
	
	private int pos;
	private String data;
	
	public StringNode(){ //unargumented constructor, sets data to null, position at 0
		setPos(0);
		setData(null);
	}
	
	public StringNode(int pos, String data){ //Constructor, takes in string and int for position
		setPos(pos);
		setData(data);
	}
	
	public StringNode(StringNode in){
		this.pos = in.getPos();
		this.data = in.getData();
	}
	
	public void setPos(int pos){
		this.pos = pos;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public int getPos(){
		return pos;
	}
	
	public String getData(){
		return data;
	}
	
	public String toString(){
		
		return "Position: " + pos + "Data: " + data; 
	}
	
	

}