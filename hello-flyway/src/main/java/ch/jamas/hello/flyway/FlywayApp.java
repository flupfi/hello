package ch.jamas.hello.flyway;

import org.flywaydb.core.Flyway;

public class FlywayApp {

	public static void main(String[] args) {
		Flyway flyway = new Flyway();
		flyway.setDataSource("jdbc:h2:tcp://localhost/~/test", "TKPFD", "TKPFD", "SET SCHEMA TKPFD;");
		flyway.clean();
		flyway.migrate();
	}

}
