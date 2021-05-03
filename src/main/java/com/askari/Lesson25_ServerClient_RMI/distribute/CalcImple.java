package com.askari.Lesson25_ServerClient_RMI.distribute;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Maryam Askari
 * Date: 1/28/2021
 * Time: 4:27 PM
 * Project: IntelliJ IDEA
 */
public class CalcImple extends UnicastRemoteObject implements Calc {

    // Vaghty Classe UnicastRemoteObject ra farakhani mikonim bayad hatman constructor an ra ham biarim.

    protected CalcImple() throws RemoteException, MalformedURLException { /* Bayad hatman RemoteException ra throws konad
         In khataie hast ke dar RMI momkene rokh bedahad.
         Bayad hatman dar constructor yekseri dastorat ra benevisim.
         */
        System.out.println("Daram Miam***********");
        java.rmi.registry.LocateRegistry.createRegistry(1099); // Porte RMI : 1099
        // Objecte khode CalcImple ra dar sathe shabake ba hame share kon (rebind)
        java.rmi.Naming.rebind("havij",this); // dar sathe shabake hame in esm ra be onvane Object mibinand
    }

    public static void main(String[] args) throws MalformedURLException, RemoteException {
        CalcImple calc = new CalcImple();
    }

    @Override
    public int sum(int a, int b) {
        System.out.println("This is SUM +++++++");
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        System.out.println("This is MINUS -------");
        return a-b;
    }

    @Override
    public double multi(int a, int b) {
        System.out.println("This is MULTI ***********");
        return a*b;
    }

    @Override
    public double divide(int a, int b) {
        System.out.println("This is DIVIDE /////////////");
        if(b==0)
            return 0;
        return a/b;
    }
}
