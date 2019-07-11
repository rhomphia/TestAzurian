package cl.az.test.service;

import cl.az.test.service.impl.DiscoServiceImpl;
import cl.az.test.service.model.Disco;
import cl.az.test.service.model.ListCount;

public class DiscoServiceUtil {
    private static IDiscoService _discoService;

    private static IDiscoService getService() {
        if (_discoService == null) {
            _discoService = new DiscoServiceImpl();
        }
        return _discoService;
    }

    public static ListCount<Disco> list(int start, int delta) throws Exception {
        return getService().list(start, delta);
    }
}
