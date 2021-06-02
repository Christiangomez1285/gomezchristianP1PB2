package gomezchristianP1PB2;

public class LibroHistoria extends Libro implements Fotocopiable {
	
	public LibroHistoria (Integer codigo,String nombre,String autor)
	{
		super(codigo,nombre,autor);
		
	}

	@Override
	public String RealizarFotocopia() {
		
		return "Fotocopia Historia";
	}

}
