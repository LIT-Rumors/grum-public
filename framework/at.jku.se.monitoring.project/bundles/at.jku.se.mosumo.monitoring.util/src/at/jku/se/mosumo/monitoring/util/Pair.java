package at.jku.se.mosumo.monitoring.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Pair<T, U> {

	protected T first;
	protected U second;

	/**
	 * Convenience factory method.
	 * <p/>
	 * Usage: Pair<X,Y> pair = Pair.create(x,y);
	 * 
	 * @param first
	 * @param second
	 * @return A new instance given the params.
	 */
	public static <FIRST_TYPE, SECOND_TYPE> Pair<FIRST_TYPE, SECOND_TYPE> create(final FIRST_TYPE first,
			final SECOND_TYPE second) {
		return new Pair<>(first, second);
	}

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public synchronized T getFirst() {
		return first;
	}

	public synchronized void setFirst(T first) {
		this.first = first;
	}

	public synchronized U getSecond() {
		return second;
	}

	public synchronized void setSecond(U second) {
		this.second = second;
	}

	@Override
	public synchronized String toString() {
		return String.format("Pair [first=%s, second=%s]", first, second);
	}

	@Override
	public synchronized int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public synchronized boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pair<?, ?> other = (Pair<?, ?>) obj;
		if (first == null) {
			if (other.first != null) {
				return false;
			}
		} else if (!first.equals(other.first)) {
			return false;
		}
		if (second == null) {
			if (other.second != null) {
				return false;
			}
		} else if (!second.equals(other.second)) {
			return false;
		}
		return true;
	}

	public static<FIRST_TYPE, SECOND_TYPE> List<Pair<FIRST_TYPE,SECOND_TYPE>> createFromCollection(FIRST_TYPE first, Collection<SECOND_TYPE> second) {
		List<Pair<FIRST_TYPE,SECOND_TYPE>> elems = new ArrayList<>();
		for(SECOND_TYPE sc : second){
			elems.add(Pair.create(first, sc));
		}
		return elems;
	}
	
	@SuppressWarnings("unchecked")
	public static <FIRST_TYPE, SECOND_TYPE> Pair<FIRST_TYPE, SECOND_TYPE> cast(Object pair){
		return (Pair<FIRST_TYPE, SECOND_TYPE>) pair;
	}
}
