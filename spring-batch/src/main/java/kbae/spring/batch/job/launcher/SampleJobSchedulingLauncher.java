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
@Component("sampleJobSchedulingLauncher")
public class SampleJobSchedulingLauncher {

	/** The job launcher. */
	@Autowired
	private JobLauncher jobLauncher;

	/** The sample job. */
	@Autowired
	private Job sampleJob;

	/**
	 * Launch.
	 * 
	 * @throws Exception
	 *             the exception
	 */
	// @Scheduled(fixedRate=5000)
	public void launch() throws Exception {
		jobLauncher.run(sampleJob, createJobParameters());
	}

	/**
	 * Creates the job parameters.
	 * 
	 * @return the job parameters
	 */
	private JobParameters createJobParameters() {
		final long runTime = System.currentTimeMillis();

		return new JobParametersBuilder().addString("STEP_ONE", "Spring Batch").addString("STEP_TWO", "SPring Integration")
				.addString("STEP_THREE", "SPring Rocks!!!").addLong("TIME", runTime).toJobParameters();
	}// createJobParameters()

}
