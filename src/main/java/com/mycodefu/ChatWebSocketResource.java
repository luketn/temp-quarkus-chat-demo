package com.mycodefu;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnError;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import jakarta.websocket.Session;
import org.eclipse.microprofile.context.ManagedExecutor;

import java.io.IOException;

@ServerEndpoint("/chat/{name}")
@ApplicationScoped
public class ChatWebSocketResource {

    @Inject
    C3P0 c3p0;
    @Inject
    ManagedExecutor managedExecutor;

    @OnOpen
    public void onOpen(Session session, @PathParam("name") String name) {
        managedExecutor.runAsync(() -> {
            String greeting = c3p0.greet(name);
            try {
                session.getBasicRemote().sendText(greeting);
            } catch (IOException e) {}
        });
    }

    @OnClose
    public void onClose(Session session, @PathParam("username") String username) {

    }

    @OnError
    public void onError(Session session, @PathParam("username") String username, Throwable throwable) {

    }

    @OnMessage
    public void onMessage(String message, @PathParam("username") String username) {

    }

}