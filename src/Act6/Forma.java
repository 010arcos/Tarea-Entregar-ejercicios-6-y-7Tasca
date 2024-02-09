package Act6;

abstract class Forma {
    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }


    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract int getArea();

    public abstract int getPerimeter();

}