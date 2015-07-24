package com.example.teamaqua.bantometer;


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;

/**
 * Created by Gareth on 24/07/2015.
 */
public class networkInformation {

    static public NetworkInterface getMacAddress()
    {
        NetworkInterface network;
        try {
            network = NetworkInterface.getByInetAddress(getIPAddress());
            return network;
        } catch (SocketException e) {
            return null;
        }
    }

    static public InetAddress getIPAddress()
    {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            return ip;
        } catch (Exception e)
        {
            return null;
        }
    }

}
