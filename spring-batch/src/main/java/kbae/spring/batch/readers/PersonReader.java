package kbae.spring.batch.readers;

import kbae.spring.batch.domain.Person;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

/**
 * The Class PersonReader.
 */
@Component("personReader")
public class PersonReader implements ItemReader<Person> {

	/**
	 * 
	 * @return the person
	 * @throws Exception
	 *             the exception
	 * @throws UnexpectedInputException
	 *             the unexpected input exception
	 * @throws ParseException
	 *             the parse exception
	 * @throws NonTransientResourceException
	 *             the non transient resource exception
	 * @see org.springframework.batch.item.ItemReader#read()
	 */
	@Override
	public Person read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		return new Person("Rupesh Raut", 33);
	}

}
