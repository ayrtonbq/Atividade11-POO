
public class Quadrado extends FormaGeométrica {
    private double lado;
    
    public double getLado() {
        return lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }    
    
    
}
