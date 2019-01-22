package leetcode_284_PeekingIterator;

import java.util.Iterator;

//Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
	
	Iterator<Integer> iterator;
	boolean flag ;
	Integer returnNum;
	
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator = iterator;
	    this.flag = false;
	    this.returnNum = null;
	}

 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		if(!this.flag)
		{
			this.returnNum = this.iterator.next();
			this.flag = true;
		}
		return this.returnNum;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!this.flag)
	    	return this.iterator.next();
	    Integer returnNum = this.returnNum;
	    this.returnNum = null;
	    this.flag = false;
	    return returnNum;
	}

	@Override
	public boolean hasNext() {
	    return (this.flag || this.iterator.hasNext()); 
	}
}