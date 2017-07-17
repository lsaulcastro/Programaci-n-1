package Modelo;


import java.io.*;


/**
 *
 * @author sauld
 */
public class FicheroCSV {

    public final String _miArchivoLocalNombre = "LlamadasLocales.csv";
    public final String _miArchivoProvincialNombre = "LlamadasProvinciales.csv";
    File _miArchivo;

    public FicheroCSV() {
    }

    public void RegistrarLocales(String numOrigen, String numDestino, double duracion, double calcularsueldo) {
//        String numeOrigen = numOrigen, numeDestino = numDestino;
//        double duracioN = duracion;
//        int sele = seleccion;
        String separador = ",";
        //  double calcularSueldo = calcularsueldo;
        _miArchivo = new File(_miArchivoLocalNombre);
//        StringBuilder sb = new StringBuilder();
//        FileWriter _escribir = null;
//        PrintWriter _linea = null;

        if (!_miArchivo.exists()) {
            {
                try {
                    FileWriter _escribir = new FileWriter(_miArchivo, true);
                    StringBuilder sb = new StringBuilder();

                    sb.append(numOrigen);
                    sb.append(separador);
                    sb.append(numDestino);
                    sb.append(separador);
                    sb.append(duracion);
                    sb.append(separador);
                    sb.append(calcularsueldo);
                    sb.append("\n");

                    _escribir.write(sb.toString());
                    _escribir.flush();
                    _escribir.close();
                    System.out.println("\nRegistro guardado...");
                } catch (IOException ex) {
                    System.out.println(ex.getMessage() + " No se pudo crear el archivo");

                }

            }

        } else {
            try {
                FileWriter _escribir = new FileWriter(_miArchivo, true);
                StringBuilder sb = new StringBuilder();

                sb.append(numOrigen);
                sb.append(separador);
                sb.append(numDestino);
                sb.append(separador);
                sb.append(duracion);
                sb.append(separador);
                sb.append(calcularsueldo);
                sb.append("\n");

                _escribir.write(sb.toString());
                _escribir.flush();
                _escribir.close();
                System.out.println("\nRegistro guardado...");
            } catch (IOException ex) {
                System.out.println(ex.getMessage() + " No se pudo crear el archivo");

            }

        }
    }
}
