package list;

import java.util.Stack;

public class Stack_diffMethod {

	public static void main(String[] args) {
		//creating obj of Stack
				Stack<String> list=new Stack<>();
				list.add("Shabnin");
				list.add("Nasir");
				list.add("Lobid");
				list.add("Sohag");
				
				System.out.println(list.peek());
				
				System.out.println(list.search("Nasir"));
				
	}

}
