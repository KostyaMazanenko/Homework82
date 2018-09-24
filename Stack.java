package com.gmail.kostamazanenko;

public class Stack {
	private Object[] stack;
	private int maxSize;
	private int size = 0;
	private BlackList bl;
	
	public Stack(int maxSize, BlackList bl) {
		super();
		this.maxSize = maxSize;
		stack = new Object[maxSize];
		this.bl = bl;
	}
	
	public boolean isFull() {
		for (int i = 0; i < stack.length; i++) {
			if(stack[i] == null) {
				return false;
			}
		}
		
		return true;
	}
	
	public void add(Object obj) {
		if(bl.isContainClass(obj.getClass())) {
			System.out.println("Black list contain " + obj.getClass());
			return;
		}
		
		if(stack[0] == null) {
			stack[0] = obj;
			return;
		}
		
		for (int i = size; i > 0; i--) {
			Object temp = stack[i];
			stack[i] = stack[i - 1];
			stack[i - 1] = temp;
		}
		
		stack[0] = obj;
		
		size++;	
	}
	
	public void remove() {
		stack[0] = null;
		
		for (int i = 0; i < size; i--) {
			Object temp = stack[i];
			stack[i] = stack[i + 1];
			stack[i + 1] = temp;
		}
		
		size--;
	}
	
	public Object getHead() {
		return stack[0];
	}
	
	
	
}
