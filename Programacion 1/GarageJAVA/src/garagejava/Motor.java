package garagejava;




public class Motor {
    //Atributos privados de tipo int.
    private int litros_de_aceit = 0;
    private int potencia;
    //Constructos con un parametro para la potencia
    public Motor(int poten){this.potencia = poten;}
    //Getter para cada atributo(Potencia y aceite)
    public int getLitrosAceite(){return this.litros_de_aceit; }
    public int getPotnecia(){return this.potencia;}
    //Setter para cada atributo(Potnecia y aceite)
    public void setLitrosAceite(int aceite){this.litros_de_aceit = aceite;}
    public void setPotencia(int potenc){this.potencia = potenc;}
}
