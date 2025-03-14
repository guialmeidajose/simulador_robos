
public class Main
{
    public static void main(String[] args)
    {
        Robo testar = new Robo("Hall-9000", 5, 10);
        Ambiente local = new Ambiente(25, 30);

        testar.imprime();
        testar.mover(4, 5);
        testar.imprime();
        local.dentroDosLimites(testar.x, testar.y);
        testar.mover(14, 20);
        testar.imprime();
    }
}