class Robo
{
    public String nome;
    private int x;
    private int y;
    

    public Robo(String nome_in, int x_in, int y_in){
        nome = nome_in;
        x = x_in;
        y = y_in;
    }

    public void mover(int delta_x, int delta_y){
        x = x + delta_x;
        y = y + delta_y;
    }

    public void imprime(){
        System.out.println("posicao do robo: " + x + "," + y);
    }
}