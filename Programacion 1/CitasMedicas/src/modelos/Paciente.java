package modelos;

import java.util.Date;

public class Paciente {

	private String nombre;
	private String fecha_nacimiento;
	private String direccion;
	private char sexo;
	private boolean tiene_seguro_medico;
	
	public Paciente()
	{
		
	}
	
	public Paciente(String nombre, char sexo, boolean seguro)
	{
		this.nombre = nombre;
		this.sexo = sexo;
		this.tiene_seguro_medico = seguro;
	}
	
	public Paciente(String nombre, String fecha_nacimiento, String direccion,
			char sexo, boolean tiene_seguro_medico) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.sexo = sexo;
		this.tiene_seguro_medico = tiene_seguro_medico;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isTiene_seguro_medico() {
		return tiene_seguro_medico;
	}
	public void setTiene_seguro_medico(boolean tiene_seguro_medico) {
		this.tiene_seguro_medico = tiene_seguro_medico;
	}
	
	
	@Override
	public String toString() {
		String tipo_seguro;
		if(this.tiene_seguro_medico)
		{
			tipo_seguro = " Plan Basico ";
		}
		else
			tipo_seguro = " No tiene ";
		
		return this.nombre + " de sexo " + this.sexo + "\nTipo seguro " + tipo_seguro;
	}
	
	
}
