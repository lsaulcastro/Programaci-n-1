package modelos;

import java.util.Date;

public class Cita {

	private String descripcion;
	private String fecha_cita;
	private Medico medico_consultado;
	private Paciente paciente_cita;
	public Cita()
	{
	
	}
		
	public Cita(String descripcion, String fecha_cita, Medico medico_consultado,
			Paciente paciente_cita) {
		super();
		this.descripcion = descripcion;
		this.fecha_cita = fecha_cita;
		this.medico_consultado = medico_consultado;
		this.paciente_cita = paciente_cita;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha_cita() {
                
		return fecha_cita;
	}
	public void setFecha_cita(String fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public Medico getMedico_consultado() {
		return medico_consultado;
	}
	public void setMedico_consultado(Medico medico_consultado) {
		this.medico_consultado = medico_consultado;
	}
	public Paciente getPaciente_cita() {
		return paciente_cita;
	}
	public void setPaciente_cita(Paciente paciente_cita) {
		this.paciente_cita = paciente_cita;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "El Paciente " + this.paciente_cita.getNombre() +  " ha creado una cita con el medico " + this.medico_consultado.getNombre() + "\nFecha de la Cita es " + this.fecha_cita;
	}
}
