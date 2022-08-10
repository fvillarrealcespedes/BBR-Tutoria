package cl.bbr.b2c.tutoria.manager;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import cl.bbr.b2c.tutoria.dto.TutoriaDto;

@Service
public class TutoriaManager {

	public String mirror(String texto) {
		return texto;
	}
	
	public ArrayList<Integer> mirrorNumbers(ArrayList<Integer> numberArray) {
		return numberArray;
	}
	
	public TutoriaDto mirrorConDto(TutoriaDto tutoriaDto) {
		return tutoriaDto;
	}
	
}
