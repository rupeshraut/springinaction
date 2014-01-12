package com.dev.web.dal.data;

import java.util.List;

/**
 * The Interface ValueListIterator.
 * 
 * @param <E>
 *            the element type
 */
public interface ValueListIterator<E> {

	/**
	 * Gets the size.
	 * 
	 * @return the size
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public int getSize() throws IteratorException;

	/**
	 * Gets the current element.
	 * 
	 * @return the current element
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public E getCurrentElement() throws IteratorException;

	/**
	 * Gets the previous elements.
	 * 
	 * @param count
	 *            the count
	 * @return the previous elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getPreviousElements(int count) throws IteratorException;

	/**
	 * Gets the next elements.
	 * 
	 * @param count
	 *            the count
	 * @return the next elements
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public List<E> getNextElements(int count) throws IteratorException;

	/**
	 * Reset index.
	 * 
	 * @throws IteratorException
	 *             the iterator exception
	 */
	public void resetIndex() throws IteratorException;

}