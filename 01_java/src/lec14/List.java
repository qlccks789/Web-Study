package lec14;

public interface List<E> {
	public boolean isEmpty();
	public void add(int index, E data);
	public void add(E data);
	public E get(int index);
	public int size();
	public void remove(int index);
	public void clear();
	public String toString();
}
