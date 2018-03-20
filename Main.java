interface MyInterface{
	default int getIncrement(int value){
		return value + 1;
	}
}

public class Main{
	public static void main(String args[]){
		int value = 5;
		MyInterface thing = new MyInterface(){};
		System.out.println(thing.getIncrement(value));
	}
}
