
package Modelo;

/**
 *
 * @author sauld
 */
public class ContactosLaborales extends Contactos{
    private String _telefonoOficina;
    private String _nombreCom;
    private  String _extensionOfici;

    public ContactosLaborales() { }

    public ContactosLaborales(String _n, String _d, String _codP, String _telefono, String _correo, String _url, String _teOfi , String _nombreCom , String _extencionOfi) {
        super(_n, _d, _codP, _telefono, _correo, _url);
        this._telefonoOficina = _teOfi;
        this._nombreCom = _nombreCom;
        this._extensionOfici = _extencionOfi;
    }
    
    //Setter
    public void setTelefonoOfi(String te){this._telefonoOficina = te;}
  //  public void setCorreoEmp(String em){this.correoEmpresa = em;}
    public void setNombreCompi(String com){this._nombreCom = com;}
    public void setExtensionOfici(String ex){this._extensionOfici = ex;}
   // public void setURLlinkedin(String url){this.urlLinkedin = url;}
    //Getter
    public String getTelefonoOfi(){return this._telefonoOficina;}
   // public String getCorreoEmpresa(){return this.correoEmpresa;}
    public String getNombreCom(){return this._nombreCom;}
    public String getExtencionOfici(){return this._extensionOfici;}
  //  public String getURLlinkedin(){return this.urlLinkedin;}

    @Override
    public void MostradContac() {
        super.MostradContac(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Linkedin: " + getUrl() + "\nTelefono Oficina: " + this._telefonoOficina + "\nExtencion de oficina: " + this._telefonoOficina + "\n___________________________");
    }
}
