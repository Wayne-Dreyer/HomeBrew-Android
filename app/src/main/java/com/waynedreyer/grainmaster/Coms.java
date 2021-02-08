package com.waynedreyer.grainmaster;

//import org.java_websocket.client.WebSocketClient;
//import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

public class Coms
{
    private Coms firstInstance;

    public Coms()
    {

    }

    public Coms getInstance()
    {
        if(firstInstance == null)
        {
            firstInstance = new Coms();
        }
        return firstInstance;
    }
}
