package kbae.spring.batch.processors;

import kbae.spring.batch.domain.Person;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * The Class PersonProcessor.
 */
@Component("personProcessor")
public class PersonProcessor implements ItemProcessor<Person, Person> {

	/**
	 * (non-Javadoc).
	 * 
	 * @param arg0
	 *            the arg0
	 * @return the person
	 * @throws Exception
	 *             the exception
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
	 */
	@Override
	public Person process(final Person inPerson) throws Exception {
		if (!StringUtils.startsWithIgnoreCase(inPerson.getName(), "Mr.")) {
			inPerson.setName("Mr. " + inPerson.getName());
		}// if
		return inPerson;
	}// process

}// class
