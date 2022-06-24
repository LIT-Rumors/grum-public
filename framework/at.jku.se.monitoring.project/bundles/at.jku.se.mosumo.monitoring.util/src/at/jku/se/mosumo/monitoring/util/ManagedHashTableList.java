package at.jku.se.mosumo.monitoring.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/**
 * 
 * Managed Hashtable: stores a key and a list as value -> a query on the hashtable never returns null but an empty list. The list does not need to be created initially
 * 
 * 
 * @author Michael Vierhauser
 * @param <K>
 *          Key type.
 * @param <V>
 *          Value type.
 * 
 */
public class ManagedHashTableList<K, V> extends Hashtable<K, List<V>> {

	private static final long serialVersionUID = -5755802656779154509L;

	public synchronized boolean removeAll(K key) {
		List<V> list = super.get(key);
		if(list!=null && list.size()>0){
			list.clear();
				return true;
		}
		return false;
	}

	@Override
	public synchronized List<V> get(Object key) {
		if (super.get(key) == null) {
			return Collections.emptyList();
		} else {
			return super.get(key);
		}
	}

	public synchronized void add(K hashCode, V elem) {
		if (super.get(hashCode) == null) {
			List<V> l = new ArrayList<>(); 
			l.add(elem);
			super.put(hashCode, l);
		} else {
			List<V> l = super.get(hashCode);
			l.add(elem);
			// super.put(hashCode, l);
		}

	}
}
