package cl.bbr.b2c.tutoria.service;

import java.util.ArrayList;

public interface TutoriaService {

	public String mirror( String texto );
	
	public String mirror2( String texto );

	public String mirrorDesdeManager( String texto );

	public ArrayList<Integer> mirrorNumbersDesdeManager( String texto );
}
