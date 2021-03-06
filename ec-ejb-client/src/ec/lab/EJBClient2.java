package ec.lab;

import javax.naming.NamingException;
import javax.naming.InitialContext;


import ec.lab.SBStatefulRemote;

public class EJBClient2 {
    public static void main(String[] args) throws NamingException {
        
        SBStatefulRemote sbstateful = (SBStatefulRemote) InitialContext
        .doLookup("ec-ejb/SBStateful!ec.lab.SBStatefulRemote");
        
        System.out.println(sbstateful.Predict(70, "admin"));
        System.out.println(sbstateful.Predict(60, "guest"));
        System.out.println("RMI done!");
    }

}
