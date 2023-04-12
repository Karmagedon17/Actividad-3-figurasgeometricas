package figurasgeometricas;
public class triangulorectangulo {
    int base;
    int altura;
    public triangulorectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
}
    double calcularArea() {
        return (base * altura / 2);
}
    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
}
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
}
    String determinarTipoTriángulo() {
        String tipo_triangulo;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            tipo_triangulo = "equilatero";
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            tipo_triangulo = "escaleno";
        else{
            tipo_triangulo = "Isoceles";
        }
        return tipo_triangulo;
    }
}
