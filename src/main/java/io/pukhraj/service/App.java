package io.pukhraj.service;
import org.glassfish.jersey.server.ResourceConfig;


public class App extends ResourceConfig{
    public App() {
       packages("io.pukhraj");
       register(new MyApplicationBinder());  
    }
}