package entidade;

public class Carro {


    private int ano;
    private String modelo;
    private String Fabricante;
    private double potenciaMotor;
    private Roda roda;

    public Carro(int ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda){
        this.roda = roda;
    }

    public void acelerar(){
        System.out.println("O Carro acelerou!");
    }

    public void frear() {
        System.out.println("O Carro Freiou!");
    }
}
