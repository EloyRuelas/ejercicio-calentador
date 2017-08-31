
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
    
    /**
     * Nos permite aumentar la temperatura del calentador.
     */
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
    
    /**
     * Nos permite disminuir la temperatura del calentador.
     */
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
    
    /**
     * Nos permite ver que temperatura tiene el calentador.
     * @return Regresa la tempertura actual del calentador.
     */
    public int checarTemperatura()
    {
            return temperatura;
    }
    
    /**
     * Nos permite modificar el incremento que queramos nostros para el calentador.
     * @param modIncre Es la variable por la que le decimos cuanto queremos que incremente el calentador.
     */
    public void modificarIncremento(int modIncre)
    {
        if(modIncre>0)
        {
            incremento=modIncre;
        }
    }
}