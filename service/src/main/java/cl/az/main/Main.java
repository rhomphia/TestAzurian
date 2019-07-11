package cl.az.main;

import cl.az.service.DiscoServiceRest;
import cl.az.service.DiscoServiceSoap;
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import javax.xml.ws.Endpoint;
import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;

public class Main {
    /* Clase creada para publicar servicios sin necesidad de un servidor web
    *  Para Servicios SOAP y REST se utilizan los puertos 1234 y 5678 respectivamente
    *  Es necesario cambiar la propiedad packaging de pom.xml para ser empaquetado como jar en lugar de war
    *  */

    public static void main(String[] args ){
        Endpoint.publish("http://localhost:1234/DiscoService", new DiscoServiceSoap());
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(5678).build();
        ResourceConfig config = new ResourceConfig(DiscoServiceRest.class);
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
