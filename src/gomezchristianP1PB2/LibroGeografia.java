package gomezchristianP1PB2;

public class LibroGeografia extends Libro implements Fotocopiable{

	public LibroGeografia (Integer codigo,String nombre,String autor)
	{
		super(codigo,nombre,autor);
		
	}

	@Override
	public String RealizarFotocopia() {
		
		return "Fotocopia Geografia";
	}
}
