package cl.az.service.impl;

import cl.az.model.Disco;
import cl.az.service.IDiscoService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



public class DiscoServiceImpl implements IDiscoService {
    private static EntityManager eManager;


    public List<Disco> list(int start, int delta) {
            EntityManagerFactory factory = Persistence
                    .createEntityManagerFactory("pu");
            eManager = factory.createEntityManager();
            eManager.getTransaction().begin();
            List<Disco> listDisco = eManager.createQuery("select d from Disco d", Disco.class)
                    .setFirstResult(start)
                    .setMaxResults(delta).getResultList();
            eManager.getTransaction().commit();
            eManager.close();
            factory.close();
            return listDisco;
    }
}
