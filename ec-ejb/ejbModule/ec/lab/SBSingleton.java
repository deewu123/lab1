package ec.lab;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class SBSingleton
 */
@Singleton
@LocalBean
public class SBSingleton implements SBSingletonRemote, SBSingletonLocal {
    private int counter = 0;
    /**
     * Default constructor. 
     */
    public SBSingleton() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public int incCounter() {
        counter++;
        return counter;
    }

    @Override
    public String getSBType() {
        return "singleton";
    }

}
