abstract class Forma3D extends FormaGeométrica {
    public abstract double calcularVolume();
}

class Cubo extends Forma3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 12 * lado;
    }
}

class Esfera extends Forma3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}

class Cilindro extends Forma3D {
    private double raioBase;
    private double altura;

    public Cilindro(double raioBase, double altura) {
        this.raioBase = raioBase;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raioBase, 2) * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * raioBase * (raioBase + altura);
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}