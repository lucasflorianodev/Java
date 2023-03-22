package entidade;

public class Roda {

    //Atributo de classe:
    private String Fabricante;
    private int Aro;

    // Método Construtor:
    public Roda(String Fabricante, int Aro){

        this.Fabricante = Fabricante;
        this.Aro = Aro;

    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        Fabricante = Fabricante;
    }

    public int getAro() {
        return Aro;
    }

    public void setAro(int Aro) {
        this.Aro = Aro;
    }
}
