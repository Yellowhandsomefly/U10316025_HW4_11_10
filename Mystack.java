import java.util.ArrayList;
class Mystack extends ArrayList<Object>{
	
	/**Add a new string to arrayList*/
	public void push(String string){
		
		super.add(string);
	}
	
	/**Return true if arrayList is empty*/
	public boolean isEmpty(){
		
		return super.isEmpty();
	}	

	/**Return a top string*/
	public Object peek(){

		return super.get(getSize() - 1);
	}	

	/**Return the size of arrayList*/
	public int getSize(){

		return super.size();
	}

	/**Return a top string and delete the string*/
	public Object pop(){
    		
		Object o = super.get(getSize() - 1);
    		super.remove(getSize() - 1);
    		return o;
	}

	/**Return a string representation of all the elements*/
	@Override
	public String toString(){
		
		return "stack: " + super.toString();
	}
}
