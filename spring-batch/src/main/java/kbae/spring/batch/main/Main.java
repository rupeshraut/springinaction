package kbae.spring.batch.main;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws JobExecutionAlreadyRunningException
	 *             the job execution already running exception
	 * @throws JobRestartException
	 *             the job restart exception
	 * @throws JobInstanceAlreadyCompleteException
	 *             the job instance already complete exception
	 * @throws JobParametersInvalidException
	 *             the job parameters invalid exception
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws Exception {

		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/spring/application-context.xml");
		System.out.println("Bean Definition Count >> " + applicationContext.getBeanDefinitionCount());

		Thread.sleep(Long.MAX_VALUE);
	}// main()
}// Main
