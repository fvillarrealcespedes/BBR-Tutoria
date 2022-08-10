package cl.bbr.b2c.tutoria.utils;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class TutoriaUtils {

	public ArrayList<Integer> parseToInteger(String texto) {
		ArrayList<Integer> numberArray = new ArrayList<Integer>();
		String[] array = texto.split(", ");
		for(int i = 0; i<array.length; i++) {
			numberArray.add(Integer.parseInt(array[i]));
		}
		return numberArray;
	}
	
}
