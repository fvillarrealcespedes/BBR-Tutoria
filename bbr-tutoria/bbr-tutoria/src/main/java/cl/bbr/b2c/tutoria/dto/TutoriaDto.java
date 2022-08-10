package cl.bbr.b2c.tutoria.dto;

import java.util.ArrayList;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TutoriaDto {
	
	private String texto;
	private ArrayList<Integer> arrayNumber;

	public TutoriaDto(String texto, ArrayList<Integer> arrayNumber) {
		this.setTexto(texto);
		this.setArrayNumber(arrayNumber);
	}

	@Override
	public String toString() {
		return "Texto: " + texto + ",\n " + "Números: " + arrayNumber; 
	}
}
