package gomezchristianP1PB2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LibrosTest {

	@Test
	public void queSePuedaCrearUnLibrodeHistoria() {
		Libro librohistoria=new LibroHistoria (1234,"Guerra Mundial","Juan Perez");
		assertNotNull(librohistoria);
			
	}
	

	@Test
	public void queSePuedaCrearUnLibrodeGeografia() {
		Libro librogeografia=new LibroGeografia (3455,"Atlas","Ricardo Souza");
		assertNotNull(librogeografia);
			
	}
	
	@Test
	public void queSePuedaCrearUnLibrodeMatematicas() {
		Libro libromatematicas=new LibroMatematicas (3244,"Matematica avanzada","Estaban Ramirez");
		assertNotNull(libromatematicas);
			
	}
	
	@Test
	public void queSePuedaAsignarUnLibroAUnEstudiante() {
		Libro libromatematicas2=new LibroMatematicas (3444,"Analisis 1","Jorge Mena");
		Estudiante estudiante = new Estudiante (38125444,"Gonzalez","Carlos");
		libromatematicas2.asignarEstudiante(estudiante);
		assertEquals(38125444,libromatematicas2.getEstudiante().getDni(),0.01);
	}
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeHistoria() {
		LibroHistoria librohistoria2=new LibroHistoria (1234,"Guerra Mundial","Juan Perez");
		librohistoria2.RealizarFotocopia();
		assertEquals("Fotocopia Historia",librohistoria2.RealizarFotocopia());
		}
	
	@Test
	public void queSePuedaFotocopiarUnLibroDeGeografia() {
		LibroGeografia librogeografia2=new LibroGeografia (3455,"Atlas","Ricardo Souza");
		librogeografia2.RealizarFotocopia();
		assertEquals("Fotocopia Geografia",librogeografia2.RealizarFotocopia());
		}

	@Test
	public void queSiHayUnLibroPrestadoNoEsteDisponible(){
		Libro libromatematicas3=new LibroMatematicas (3444,"Analisis 1","Jorge Mena");
		Estudiante estudiante = new Estudiante (38125444,"Gonzalez","Carlos");
		libromatematicas3.asignarEstudiante(estudiante);
		assertFalse(libromatematicas3.LibroDisponible());
		
	}
	
}
