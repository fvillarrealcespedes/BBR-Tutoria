package cl.bbr.b2c.tutoria.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bbr.b2c.tutoria.dto.TutoriaDto;
import cl.bbr.b2c.tutoria.manager.TutoriaManager;
import cl.bbr.b2c.tutoria.utils.TutoriaUtils;


@Service
public class TutoriaServiceImpl implements TutoriaService {

	@Autowired
	private TutoriaServiceImpl2 tutoriaServiceImpl2;
	
	@Autowired
	private TutoriaManager tutoriaManager;
	
	@Autowired
	private TutoriaUtils tutoriaUtils;
	
	public String mirror(String texto) {
		return texto;
	}

	public String mirror2(String texto) {
		return this.tutoriaServiceImpl2.mirror(texto);
	}
	
	public String mirrorDesdeManager(String texto) {
		return this.tutoriaManager.mirror(texto);
	}

	public ArrayList<Integer> mirrorNumbersDesdeManager(String texto) {
		return this.tutoriaManager.mirrorNumbers(this.tutoriaUtils.parseToInteger(texto));
	}
	
	public TutoriaDto mirrorConDto(String texto1, String texto2) {
		TutoriaDto tutoriaDto = new TutoriaDto();		
		tutoriaDto.setTexto(texto1);
		tutoriaDto.setArrayNumber(this.tutoriaUtils.parseToInteger(texto2));
		return this.tutoriaManager.mirrorConDto(tutoriaDto);
	}

}
