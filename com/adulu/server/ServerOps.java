package com.adulu.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.adulu.RMIInterface;

public class ServerOps extends UnicastRemoteObject implements RMIInterface {

    protected ServerOps() throws RemoteException {
        super();
    }

    public static final long serialVersionUID = 1L;

    @Override
    public String helloTo(String name) throws RemoteException {
        System.err.println(name + " is trying to contact");
        return "Server says hello to " + name;
    }

    @Override
    public int hashBaby(String bringIt) throws RemoteException {
        return bringIt.hashCode();
    }

    public static void main(String[] args) {
        try {

            Naming.rebind("//localhost/SuperServer", new ServerOps());
            System.err.println("Server is ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
