package modelos;

public class Medico {

	private String nombre;
	private char sexo;
	private boolean acepta_seguro;
			
	public Medico(String nombre, char sexo, boolean acepta_seguro) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.acepta_seguro = acepta_seguro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isAcepta_seguro() {
		return acepta_seguro;
	}
	public void setAcepta_seguro(boolean acepta_seguro) {
		this.acepta_seguro = acepta_seguro;
	}
	
	public double cotizarCita(Paciente cliente)
	{
		if(cliente.isTiene_seguro_medico())
			return 100.00;
		else
			return 250.00;
	}
	
}
