package cl.az.test.service.model;

import java.util.ArrayList;
import java.util.List;

public class ListCount<T> {

    private List<T> list;
    private Integer count;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListCount() {
        this.list = new ArrayList<T>();
        this.count = 0;
    }

    public void add(T t) {
        this.list.add(t);
    }
}
