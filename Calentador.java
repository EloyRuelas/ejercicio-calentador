
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
        temperatura=temperatura+incremento;
    }
    
    public void enfriar()
    {
        temperatura=temperatura-incremento;
        
    }
    
    public int checarTemperatura()
    {
        if(temperatura>-10 || temperatura<30)
        {
            return temperatura;
        }
        else
        {
            return 0;
        }
    }
}