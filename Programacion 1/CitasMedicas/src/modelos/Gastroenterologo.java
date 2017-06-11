package modelos;

public class Gastroenterologo extends Medico {

	public Gastroenterologo(String nombre, char sexo, boolean acepta_seguro) {
		super(nombre, sexo, acepta_seguro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cotizarCita(Paciente cliente)
	{
		if(cliente.isTiene_seguro_medico())
			return 500.00;
		else
			return 1000.00;
	}
	
}
