package trazasPrueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principal {
	private static final Logger LOGGER = LoggerFactory.getLogger(Principal.class);

	public static void main(String[] args) {
		LOGGER.info("Inicio de la aplicación");
		System.out.println("hola");
		LOGGER.info("Fin de la aplicación");
	}
}
