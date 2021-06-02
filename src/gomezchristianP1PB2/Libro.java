package gomezchristianP1PB2;

public abstract class Libro {

	private Integer codigo;
	private String nombre;
	private String autor;
	private Estudiante estudiante;
	private Boolean estadoPrestamo;
	
	public Libro (Integer codigo,String nombre,String autor) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.autor=autor;
		
	}
	
	public void asignarEstudiante(Estudiante estudiante)
	{
		
		this.estudiante = estudiante;
		
		
	}
	
	public Boolean LibroDisponible() 
	{
		LibroGeografia librogeografia2=new LibroGeografia (3455,"Atlas","Ricardo Souza");
		if(librogeografia2.getEstudiante()!=null)
		
		{
			estadoPrestamo=Boolean.TRUE;
			return estadoPrestamo;
			
		}
		else {
			estadoPrestamo=Boolean.FALSE;
			return estadoPrestamo;
		
		}
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	
}
