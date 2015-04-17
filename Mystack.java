import java.util.ArrayList;
class Mystack extends ArrayList<Object>{
	
	
	public void push(String string){
		
		super.add(string);
	}
	
	public boolean isEmpty(){
		
		return super.isEmpty();
	}	

	public Object peek(){

		return super.get(getSize() - 1);
	}	

	public int getSize(){

		return super.size();
	}

	public Object pop(){
    		
		Object o = super.get(getSize() - 1);
    		super.remove(getSize() - 1);
    		return o;
	}

	@Override
	public String toString(){
		
		return "stack: " + super.toString();
	}
}
