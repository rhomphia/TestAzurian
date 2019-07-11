package cl.az.service;

import cl.az.model.Disco;
import cl.az.service.impl.DiscoServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/DiscoService")
public class DiscoServiceRest {
    IDiscoService _discoService;

    private IDiscoService getService(){
        if(_discoService == null){
            _discoService = new DiscoServiceImpl();
        }
        return _discoService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/list/{start}/{delta}")
    public Response list(@PathParam("start") int start,
                         @PathParam("delta") int delta) {
        List<Disco> discos = getService().list(start,delta);
        return Response.status(200).entity(discos).build();
    }

}
