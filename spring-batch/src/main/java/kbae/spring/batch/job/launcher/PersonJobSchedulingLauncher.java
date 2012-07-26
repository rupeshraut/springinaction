package kbae.spring.batch.job.launcher;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Class JobSchedulingLauncher.
 */
@Component("personJobSchedulingLauncher")
public class PersonJobSchedulingLauncher {

	/** The job launcher. */
	@Autowired
	private JobLauncher jobLauncher;

	/** The sample job. */
	@Autowired
	private Job personJob;

	/**
	 * Launch.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	public void launch() throws Exception {
		jobLauncher.run(personJob, createJobParameters());
	}

	/**
	 * Creates the job parameters.
	 * 
	 * @return the job parameters
	 */
	private JobParameters createJobParameters() {
		final long runTime = System.currentTimeMillis();

		return new JobParametersBuilder().addString("PERSON", "Rupesh").addLong("TIME", runTime).toJobParameters();
	}// createJobParameters()

}
