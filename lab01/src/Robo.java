public class Robo
{
    public String nome;
    public int x;
    public int y;
    

    public Robo(String nome_in, int x_in, int y_in){
        this.nome = nome_in;
        this.x = x_in;
        this.y = y_in;
    }

    public void mover(int delta_x, int delta_y){
        this.x = x + delta_x;
        this.y = y + delta_y;
    }

    public void imprime(){
        System.out.println("posicao do robo: " + x + "," + y);
    }
}