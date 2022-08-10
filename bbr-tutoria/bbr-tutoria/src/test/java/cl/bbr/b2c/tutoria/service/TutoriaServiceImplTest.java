package cl.bbr.b2c.tutoria.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
@PropertySource("classpath:numbers.properties")
public class TutoriaServiceImplTest {
	
	protected final Logger logger = LogManager.getLogger(getClass().getName());
	
	@Autowired
	private TutoriaServiceImpl tutoriaService;
		
	@Value("${LISTA}")
	private String numbers;
	
	@Test
	public void mirrorTest() {

		logger.debug("----------------- mirrorTest() ---------------");
		
		logger.debug(""+this.tutoriaService.mirror("Prueba"));

		logger.debug(""+this.tutoriaService.mirror2("Prueba2"));
		
		logger.debug(""+this.tutoriaService.mirrorDesdeManager("Prueba3"));
		
		logger.debug(""+this.tutoriaService.mirrorNumbersDesdeManager(this.numbers));

		logger.debug(""+this.tutoriaService.mirrorConDto("Prueba5", this.numbers));
		
		logger.debug("----------------- mirrorTest() ---------------");
		
	}	
	
}
