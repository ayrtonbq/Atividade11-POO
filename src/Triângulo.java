
public class Triângulo extends FormaGeométrica {
    private double base;
    private double altura;
    
    public double getBase() {
    	return base;
    }
    
    public void setBase() {
    	this.base = base;
    }
    
    public double getAltura() {
    	return altura;
    }
    
    public void setAltura() {
    	this.altura = altura;
    }
    
    public Triângulo(double base, double altura) {
    	this.base = base;
    	this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
    	return (base * altura) / 2.0;
    }
    
    public double calcularPerimetro() {
    	return 0.0;
    }   

}
