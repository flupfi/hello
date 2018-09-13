package ch.jamas.hello.springbatch;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource = new DataSource();
		return null;
	}

}
