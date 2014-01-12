package com.dev.web.dal.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class ValueListHanlder.
 * 
 * @param <E>
 *            the element type
 */
public class ValueListHanlder<E> {

	/** The list. */
	private final List<E> list;

	/** The list iterator. */
	private ListIterator<E> listIterator;

	/** The rows per page. */
	private int rowsPerPage;

	/**
	 * Instantiates a new value list hanlder.
	 * 
	 * @param list
	 *            the list
	 */
	public ValueListHanlder(List<E> list) {
		this.list = list;
		this.listIterator = list.listIterator();
	}

	/**
	 * Gets the rows per page.
	 * 
	 * @return the rows per page
	 */
	public int getRowsPerPage() {
		return rowsPerPage;
	}

	/**
	 * Sets the rows per page.
	 * 
	 * @param rowsPerPage
	 *            the new rows per page
	 */
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}

	/**
	 * Gets the size.
	 * 
	 * @return the size
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public int getSize() throws IteratorException {
		if (list == null) {
			throw new IteratorException("list cannot be NULL");
		}
		return list.size();
	}

	/**
	 * Gets the current element.
	 * 
	 * @return the current element
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public E getCurrentElement() throws IteratorException {
		if (list == null) {
			throw new IteratorException("No data found");
		}// if

		return list.get(this.listIterator.nextIndex());
	}

	/**
	 * Gets the previous elements.
	 * 
	 * @return the previous elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getPreviousElements() throws IteratorException {
		if (listIterator == null) {
			throw new IteratorException("No data found");
		}// if

		final LinkedList<E> linkedList = new LinkedList<>();
		int ctr = 0;
		while (listIterator.hasPrevious() && ctr < getRowsPerPage()) {
			linkedList.add(listIterator.previous());
			ctr++;
		}// while
		return linkedList;
	}

	/**
	 * Gets the previous elements.
	 * 
	 * @param count
	 *            the count
	 * @return the previous elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getPreviousElements(int count) throws IteratorException {
		if (listIterator == null) {
			throw new IteratorException("No data found");
		}// if

		final LinkedList<E> linkedList = new LinkedList<>();
		int ctr = 0;
		while (listIterator.hasPrevious() && ctr < count) {
			linkedList.add(listIterator.previous());
			ctr++;
		}// while
		return linkedList;
	}

	/**
	 * Gets the next elements.
	 * 
	 * @return the next elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getNextElements() throws IteratorException {
		if (listIterator == null) {
			throw new IteratorException("No data found");
		}// if

		final LinkedList<E> linkedList = new LinkedList<>();
		int ctr = 0;
		while (listIterator.hasNext() && ctr < getRowsPerPage()) {
			linkedList.add(listIterator.next());
			ctr++;
		}// while
		return linkedList;
	}

	/**
	 * Gets the next elements.
	 * 
	 * @param count
	 *            the count
	 * @return the next elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getNextElements(int count) throws IteratorException {
		if (listIterator == null) {
			throw new IteratorException("No data found");
		}// if

		final LinkedList<E> linkedList = new LinkedList<>();
		int ctr = 0;
		while (listIterator.hasNext() && ctr < count) {
			linkedList.add(listIterator.next());
			ctr++;
		}// while
		
		return linkedList;
	}

	/**
	 * Reset index.
	 * 
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public void resetIndex() throws IteratorException {
		if (listIterator == null) {
			throw new IteratorException("No data found");
		}// if

		listIterator = list.listIterator();
	}

	public static void main(String[] args) throws IteratorException {
		List<String> strings = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			strings.add("" + i);
		}// for

		ValueListHanlder<String> listHanlder = new ValueListHanlder<>(strings);
		listHanlder.setRowsPerPage(5);
		List<String> list = listHanlder.getNextElements();

		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("----------------");
		list = listHanlder.getNextElements();

		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("----------------");
		listHanlder.setRowsPerPage(10);
		list = listHanlder.getPreviousElements();

		for (String string : list) {
			System.out.println(string);
		}
	}
}
