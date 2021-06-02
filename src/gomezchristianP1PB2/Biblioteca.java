package gomezchristianP1PB2;



public class Biblioteca {

	private Libro [] libros;
	
	public Biblioteca() {
		this.libros=new Libro [100];
	}
	
	public void agregoLibro(Libro libro){
		for (int i=0;i<libros.length;i++)
		{
			libros[i]=libro;
			}
	  }
	
}
