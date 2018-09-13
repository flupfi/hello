package ch.jamas.hello.spring;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class HelloApp {

	final static Logger logger = LoggerFactory.getLogger(HelloApp.class);
	
	final static String HELP = "SELECT * FROM INFORMATION_SCHEMA.HELP";
	final static String DROPUSER = "DROP USER tkpfd";
	final static String CREATEUSER = "CREATE USER IF NOT EXISTS tkpfd IDENTIFIED BY tkpfd ADMIN";
	final static String CREATESCHEAM = "CREATE SCHEMA IF NOT EXISTS tkpfd AUTHORIZATION tkpfd";
	
	//@Autowired
	//DataSource dataSource;
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("helloAppContext.xml");
		logger.info("Context loaded.");
		
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		logger.info("Bean \"helloBean\" loaded.");
		helloSpring.getMessage();
		
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String TABLES = "SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES";
		List<String> tables = jdbcTemplate.queryForList(TABLES, String.class);
		logger.info("Found {} tables.", tables.size());
		
		tables.stream().forEach(tablename -> System.out.println(tablename));
	}

}
