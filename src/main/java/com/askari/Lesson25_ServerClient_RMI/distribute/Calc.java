package com.askari.Lesson25_ServerClient_RMI.distribute;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Maryam Askari
 * Date: 1/28/2021
 * Time: 4:24 PM
 * Project: IntelliJ IDEA
 */
public interface Calc extends Remote {
    public int sum(int a, int b) throws RemoteException;
    public int minus(int a,int b) throws RemoteException;
    public double multi(int a, int b) throws RemoteException;
    public double divide(int a, int b) throws RemoteException;
}
