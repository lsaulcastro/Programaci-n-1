
package agenda;


public class Contactos {
   private String _nombre = "";
    private String _direccion="";
    private String _codPostal="";
    private String _telefono="";
    public Contactos ct;
    
    //Constructor
    public Contactos(){}
    //Construtor sobrecargado
    public Contactos(String _n, String _d,String _codP, String _telefono){this._nombre = _n;this._direccion = _d;this._codPostal = _codP;this._telefono = _telefono;}
    
    //Gets and sets
    public void setNombre(String n){this._nombre = n;}
    public String getNombre(){return this._nombre;}
    public void setDireccion(String d){this._direccion = d;}
    public String getDireccion(){return this._direccion;}
    public void setCodipostal(String cod){this._codPostal = cod;}
    public void setTelefono(String tele){this._telefono = tele;}
    public String getTelefono(){return this._telefono;}  
    public String getCodigopostal(){return this._codPostal;}
    //Mostrar contactos
    public void MostradContac(){
    
        System.out.println("_____________________________\nNombre: " + this._nombre + "\nDireccion: " + this._direccion + "\nCodigo postal: " + this._codPostal + "\nTelefono: " + this._telefono + "\n__________________________");
    
    }
//    public Contactos getInstance(){
//        if (ct != null) {
//            ct = new Contactos();
//        }
//        return this;
//    }
    
    public void AgregarContactos(String nom, String dire,String cod,String te){
            
    this._nombre = nom;this._direccion = dire;this._codPostal = cod;this._telefono = te;
    }

    
}
