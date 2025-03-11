public class Ambiente{
    public int altura;
    public int largura;

    public Ambiente(int a_in, int l_in){
        this.altura = a_in;
        this.largura = l_in;
    }

    public boolean dentroDosLimites(int x, int y){
        return x >= 0 && y >= 0 && x < largura && y < altura;
    }
}