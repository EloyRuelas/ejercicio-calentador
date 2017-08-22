
public class Calentador
{
    private int temperatura;
    private int incremento;
    public Calentador()
    {
        temperatura=15;
        incremento=3;
    }
    
    public void calentar()
    {
        temperatura=temperatura+5;
    }
    
    public void enfriar()
    {
        temperatura=temperatura-5;
        
    }
    
    public int checarTemperatura()
    {
        return temperatura;
    }
}