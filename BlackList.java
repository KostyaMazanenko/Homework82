package com.gmail.kostamazanenko;

public class BlackList {
	Class[] bl;

	public BlackList(int size) {
		super();
		bl = new Class[size];
	}

	public BlackList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public boolean isContainClass(Class cl) {
		
		for (int i = 0; i < bl.length; i++) {
			if(bl[i] == cl) {
				return true;
			}
		}
		
		return false;
	}
	
	public void addClass(Class cl) {
		if(isContainClass(cl)) {
			return;
		}
		
		for (int i = 0; i < bl.length; i++) {
			if(bl[i] == null) {
				bl[i] = cl;
				return;
			}
		}
	}
	
	public void removeClass(Class cl) {
		if(!isContainClass(cl)) {
			return;
		}
		
		for (int i = 0; i < bl.length; i++) {
			if(bl[i] == cl) {
				bl[i] = null;
				return;
			}
		}
	}
}
