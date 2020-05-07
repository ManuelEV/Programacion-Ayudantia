public class Calculadora {

    private int a;
    private int b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar(){
        return a+b;
    }

    public int restar(){
        return a-b;
    }

    public int multiplicar(){
        return a*b;
    }

    public double dividir(){
        return ((double) a)/b;
    }

    public double potencia(){
        return Math.pow(a, b);
    }

    public double raizCuadrada(){
        return Math.sqrt(a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
