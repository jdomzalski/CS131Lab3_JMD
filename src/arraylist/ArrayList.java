package arraylist;

import java.util.*;

/**
 * This is a class used to represent ArrayList
 * 
 * @author Programming Lab 3 Summer 2022
 * @param <T>
 */

public class ArrayList<T> {

	private final int DEFAULT_SIZE = 10;
	private int currentItem = 0;
	private T arList[];

	@SuppressWarnings("unchecked")
	public ArrayList() {
		/*
		 * The code below will cause a compile error because T is cast to object if we
		 * cast object to whatever T is (like a String) we will cause a runtime error.
		 * We could use a java collection like ArrayList for this.
		 */
		// arList=new T[DEFAULT_SIZE];

		// this is the proper way to initialize this object using a call to new Object.
		arList = (T[]) new Object[DEFAULT_SIZE];
	}// end empty-argument constructor

	@SuppressWarnings("unchecked")
	public ArrayList(int length) {
		// arList=new T[length]; //causes a compile error (see above)
		arList = (T[]) new Object[length];

	}// end preferred constructor

	/**
	 * addItem method that allows us to pass in any generic object. Method checks
	 * the parameters of the ArrayList to make sure it can add Object
	 * 
	 * @param item
	 * @return
	 */
	public boolean addItem(T item) {

		if (currentItem <= arList.length) {
			arList[currentItem] = item;
			currentItem = (currentItem + 1);
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE + ", ListSize=" + arList.length + ", currentItem="
				+ currentItem + ", arList=" + Arrays.toString(arList) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}// end class
