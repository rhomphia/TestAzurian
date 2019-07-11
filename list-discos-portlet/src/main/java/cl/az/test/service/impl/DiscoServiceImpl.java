package cl.az.test.service.impl;

import cl.az.test.helper.Constants;
import cl.az.test.service.IDiscoService;
import cl.az.test.service.client.RestClient;
import cl.az.test.service.model.Disco;
import cl.az.test.service.model.ListCount;

import java.util.Arrays;


public class DiscoServiceImpl implements IDiscoService {

    public ListCount<Disco> list(int start, int delta) throws Exception {
        RestClient restClient = new RestClient();
        ListCount<Disco> discos = new ListCount<Disco>();
        Disco[] discosTotal = (Disco[])restClient.get(Constants.LIST_SERVICE_ENDPOINT + "0/0", Disco[].class);
        Disco[] discosArray = (Disco[])restClient.get(Constants.LIST_SERVICE_ENDPOINT +start+"/"+delta, Disco[].class);
        discos.setCount(discosTotal.length);
        discos.setList(Arrays.asList(discosArray));
        return discos;
    }
}
