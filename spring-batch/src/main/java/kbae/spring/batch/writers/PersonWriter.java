package kbae.spring.batch.writers;

import java.util.List;

import kbae.spring.batch.domain.Person;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

/**
 * The Class PersonWriter.
 */
@Component("personWriter")
public class PersonWriter implements ItemWriter<Person> {

	/**
	 * 
	 * @param persons
	 *            the persons
	 * @throws Exception
	 *             the exception
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	@Override
	public void write(List<? extends Person> persons) throws Exception {
		for (Person person : persons) {
			System.out.println(person);
		}// for
	}// write

}// /class
