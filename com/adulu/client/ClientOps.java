package com.adulu.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.adulu.RMIInterface;

public class ClientOps {
    private static RMIInterface look_up;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

        look_up = (RMIInterface) Naming.lookup("//localhost/SuperServer");

        String txt = JOptionPane.showInputDialog("What is your name?");
        String response = look_up.helloTo(txt);
        JOptionPane.showMessageDialog(null, response);

        txt = JOptionPane.showInputDialog("What shalt though hash?");
        response = Integer.toString(look_up.hashBaby(txt));
        JOptionPane.showMessageDialog(null, "Thy hash is: " + response);

    }
}
