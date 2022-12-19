
public class Cuadrado extends Figura
{
    double lado;

    public Cuadrado(double lado)
    {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    @Override
    protected void calcularArea()
    {
        area = lado * lado;
    }

    @Override
    protected void calcularPerimetro() {
        perimetro = lado * 4;
    }
}
