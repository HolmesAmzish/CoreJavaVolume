package Network;

import java.io.*;
import java.net.*;

/**
 * This program demonstrates the InetAddress class, Supply a host name as command-line
 * argument, or run without commend-line arguments to see the address of the local host.
 * @version 1.02 2012-06-05
 * @author Cay Horstmann
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address;
        if (args.length > 0) {
            String host = args[0];
            address = InetAddress.getByName(host);
        } else {
            address = InetAddress.getLocalHost();
        }
        System.out.println(address);
    }
}