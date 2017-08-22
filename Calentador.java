
public class Calentador
{
    private int temperatura;
    public Calentador()
    {
        temperatura=15;
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