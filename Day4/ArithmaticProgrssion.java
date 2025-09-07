public class ArithmaticProgrssion extends Progression {
    protected long increment; 

    public ArithmaticProgrssion() { 
        this(1,0);
    }

    public ArithmaticProgrssion(long stepsize) { this(stepsize, 0);}

    public ArithmaticProgrssion(long stepsize, long start) { 
        super(start); 
        increment = stepsize; 
    }

    protected void advance() { 
        current += increment; 
    }
}
