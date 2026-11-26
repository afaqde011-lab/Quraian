package h00;

import java.util.AbstractList;
import java.util.List;

public abstract class h extends AbstractList implements List, v00.c {
    public abstract int a();

    public abstract Object c(int i);

    @Override
    public final Object remove(int i) {
        return c(i);
    }

    @Override
    public final int size() {
        return a();
    }
}
