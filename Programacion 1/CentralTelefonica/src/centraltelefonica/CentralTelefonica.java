
package centraltelefonica;


public class CentralTelefonica {

   
    public static void main(String[] args) {
       MenuLLamada();
    }
    
    public static void MenuLLamada(){
    
        System.out.println("#################################\n#     Opciones de llamadas"
                + "      #\n#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n#1. LLamada Local"
                + "               #\n#2. LLamada Provincial          #\n#3. Registro de LLamadas        #\n#################################");
    }
    public static void MenuLLamadaProvincial(){
    
        System.out.println("#################################\n#     Opciones de Provincial      #\n#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#\n#1. Realizar LLamada"
                + "            #\n#2. Registros de llamadas       #\n#################################");
    }
}
