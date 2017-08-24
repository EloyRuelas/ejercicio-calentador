
public class Calentador
{
    private int temperatura;
    private int incremento;
    private int min;
    private int max;
    public Calentador(int temMin, int temMax)
    {
        temperatura=15;
        incremento=3;
        min=temMin;
        max=temMax;
    }
    
    public void calentar()
    {
        if(temperatura<=max)
        {
            temperatura=temperatura+incremento;
            if(temperatura>max)
            {
                temperatura-=incremento;
            }
        }
    }
    
    public void enfriar()
    {
        if(temperatura>=min)
        {
            temperatura=temperatura-incremento;
            if(temperatura<min)
            {
                temperatura+=incremento;
            }
        }
    }
    
    public int checarTemperatura()
    {
            return temperatura;
    }
    public void modificarIncremento(int modIncre)
    {
        if(modIncre>0)
        {
            incremento=modIncre;
        }
    }
}