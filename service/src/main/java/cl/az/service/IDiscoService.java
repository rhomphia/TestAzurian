package cl.az.service;

import cl.az.model.Disco;

import java.util.List;

public interface IDiscoService {

    public List<Disco> list(int start, int delta);
}
