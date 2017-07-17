package Modelo;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author sauld
 */
public class FicheroCSV {

    public final String _miArchivoLocalNombre = "LlamadasLocales.csv";
    public final String _miArchivoProvincialNombre = "LlamadasProvinciales.csv";
    public File _miArchivo;
    public int contador = 0;

    public FicheroCSV() {
    }

    public void Registrar(String numOrigen,
            String numDestino, double duracion, double calcularsueldo) {

        String separador = ",";
        _miArchivo = new File(_miArchivoLocalNombre);

        if (!_miArchivo.exists()) {

            {
                try {
                    _miArchivo.createNewFile();
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

    public void Registrar(int franja, String numOrigen, String numDestino, double duracion, double calcularsueldo) {
        // String numeOrigen = numOrigen, numeDestino = numDestino;
        String separador = ",";
        _miArchivo = new File(_miArchivoProvincialNombre);
        if (!_miArchivo.exists()) {

            {
                try {
                    _miArchivo.createNewFile();
                    FileWriter _escribir = new FileWriter(_miArchivo, true);
                    StringBuilder sb = new StringBuilder();

                    sb.append(numOrigen);
                    sb.append(separador);
                    sb.append(numDestino);
                    sb.append(separador);
                    sb.append(duracion);
                    sb.append(separador);
                    sb.append(franja);
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

    public void Leer(int x) {
        contador = 0;
        if (x == 0) {
            FileReader _leer = null;
            String[] campos = null;
            BufferedReader _almacenamiento = null;
            _miArchivo = new File(_miArchivoLocalNombre);
            String cadena = null;
            try {
                _leer = new FileReader(_miArchivo);
                _almacenamiento = new BufferedReader(_leer);
                cadena = _almacenamiento.readLine();
                while (cadena != null) {
                    ++contador;
                    campos = cadena.split(",");
                    System.out.println(Arrays.toString(campos));
                    cadena = _almacenamiento.readLine();

                }
            } catch (IOException e) {
                System.out.println("Error! " + e.getMessage());
            } finally {

//                try {
//                 //   _almacenamiento.close();
////                    _leer.close();
//                    System.out.println("\n\nArchivos Cerrados....");
//                } catch (IOException ex) {
//                    System.out.println("Error! " + ex.getMessage());
//
//                }
            }
        } else {
            FileReader _leer = null;
            String[] campos = null;
            BufferedReader _almacenamiento = null;
            _miArchivo = new File(_miArchivoProvincialNombre);
            String cadena = null;
            try {
                _leer = new FileReader(_miArchivo);
                _almacenamiento = new BufferedReader(_leer);
                cadena = _almacenamiento.readLine();
                while (cadena != null) {
                    ++contador;
                    campos = cadena.split(",");
                    System.out.println(Arrays.toString(campos));
                    cadena = _almacenamiento.readLine();

                }
            } catch (IOException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }
        System.out.println("~~Total de llamadas: " + contador);
        //return Arrays.toString(campos);
    }

}
