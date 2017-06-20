
package Modelo;


public class Contactos {
   private String _nombre;
    private String _direccion="";
    private String _codPostal="";
    private String _telefono="";
    private String _correo = "";
    private String _url = "";
    private String _invi = "Ninguna";
    
    //Constructor
    public Contactos(){}
    //Construtor sobrecargado
    //public Contactos(String _n, String _d,String _codP, String _telefono){this._nombre = _n;this._direccion = _d;this._codPostal = _codP;this._telefono = _telefono;}
    public Contactos(String _n, String _d,String _codP, String _telefono,String _correo, String _url){this._nombre = _n;this._direccion = _d;this._codPostal = _codP;this._telefono = _telefono; this._correo = _correo; this._url =_url;}
    
    //Gets and sets
    public void setNombre(String n){this._nombre = n;}
    public String getNombre(){return this._nombre;}
    public void setDireccion(String d){this._direccion = d;}
    public String getDireccion(){return this._direccion;}
    public void setCodipostal(String cod){this._codPostal = cod;}
    public void setTelefono(String tele){this._telefono = tele;}
    public String getTelefono(){return this._telefono;}  
    public String getCodigopostal(){return this._codPostal;}
    public String getUrl() {return _url;}
    public void setUrl(String _url) {this._url = _url;}
    public String getInvi() {return _invi;   }
    public void setInvi(String _invi) {this._invi = _invi;}
    
    
    //Mostrar contactos
    public void MostradContac(){
        
        System.out.println("_____________________________\nNombre: " + this._nombre + "\nDireccion: " + this._direccion + "\nCodigo postal: " + this._codPostal + "\nTelefono: " + this._telefono + "\nCorreo: " + this._correo +"\nInvitaciones: " + this._invi);

        
      //  System.out.println("_____________________________\nNombre: " + this._nombre + "\nDireccion: " + this._direccion + "\nCodigo postal: " + this._codPostal + "\nTelefono: " + this._telefono + "\n__________________________");
    
    }
//    public Contactos getInstance(){
//        if (ct != null) {
//            ct = new Contactos();
//        }
//        return this;
//    }
    
   
    
}
