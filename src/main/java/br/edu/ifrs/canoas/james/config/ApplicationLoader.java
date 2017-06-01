package br.edu.ifrs.canoas.james.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by rodrigo on 3/28/17.
 *
 * Allows to load application parameters during startup
 */
@Component
public class ApplicationLoader implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(ApplicationLoader.class);

	@Override
	public void run(String... strings) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (String option : strings) {
			sb.append(" ").append(option);
		}
		sb = sb.length() == 0 ? sb.append("No Options Specified") : sb;
		logger.info(String.format("WAR launched with following options: %s", sb.toString()));
	}
}