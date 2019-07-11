package cl.az.service;

import cl.az.model.Disco;
import cl.az.service.impl.DiscoServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "DiscoService", targetNamespace = "http://xmlns.azservices.cl/services/v1/DiscoService")
public class DiscoServiceSoap implements IDiscoService{
    IDiscoService _discoService;

    private IDiscoService getService(){
        if(_discoService == null){
            _discoService = new DiscoServiceImpl();
        }
        return _discoService;
    }

    @WebMethod
    @WebResult(name = "disco")
    public List<Disco> list(
            @WebParam(name="start", targetNamespace="http://xmlns.azservices.cl/services/v1/DiscoService") int start,
            @WebParam(name="delta", targetNamespace="http://xmlns.azservices.cl/services/v1/DiscoService") int delta) {
        return getService().list(start, delta);
    }
}
