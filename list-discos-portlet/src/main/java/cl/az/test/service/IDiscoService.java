package cl.az.test.service;

import cl.az.test.service.model.Disco;
import cl.az.test.service.model.ListCount;

public interface IDiscoService {

    public ListCount<Disco> list(int start, int delta) throws Exception;
}
