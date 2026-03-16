package org.example.httpServer;

import org.example.httpServer.config.Configuration;
import org.example.httpServer.config.ConfigurationManager;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * Driver class for HTTP Server
 *
 */

public class HttpServer {

    public static void main(String[] args){
        System.out.println("Server Starting...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");
        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("Using Port: " + conf.getPort());
        System.out.println("Using WebRoot: " + conf.getWebroot());

        try {
            ServerSocket serverSocket = new ServerSocket(conf.getPort()); //Listens to a specific port
            Socket socket = serverSocket.accept(); //Prompt
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
