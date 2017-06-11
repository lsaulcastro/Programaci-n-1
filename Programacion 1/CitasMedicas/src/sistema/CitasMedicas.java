package sistema;

import java.util.Date;

import modelos.Cita;
import modelos.Gastroenterologo;
import modelos.Medico;
import modelos.Paciente;

public class CitasMedicas {

	public static void main(String[] args) {
		
		Paciente walberto = new Paciente();
		walberto.setNombre("Walberto");
		walberto.setSexo('M');
		walberto.setFecha_nacimiento("04/01/1998");
		walberto.setTiene_seguro_medico(false);
		walberto.setDireccion("Calle #23, Enzanche los pepinos.");
		
		Medico doctorMuelita = new Gastroenterologo("Rene Piedra", 'M', false);
		System.out.println("El Paciente " + walberto + " Debe pagar RD$ " + doctorMuelita.cotizarCita(walberto));
		
		Cita mCita = new Cita();
		mCita.setDescripcion("Chequeo de la ulcera cronica abismal latente en el emisferio izquierdo del estomago");
		mCita.setFecha_cita("31/05/2017");
		mCita.setMedico_consultado(doctorMuelita);
		mCita.setPaciente_cita(walberto);
		
		System.out.println(mCita);
		
	}

}
