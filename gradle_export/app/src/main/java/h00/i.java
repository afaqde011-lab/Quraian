package h00;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class i extends AbstractMap implements Map, v00.e {
    public abstract Set a();

    public abstract Set c();

    public abstract int e();

    @Override
    public final Set entrySet() {
        return a();
    }

    public abstract Collection g();

    @Override
    public final Set keySet() {
        return c();
    }

    @Override
    public final int size() {
        return e();
    }

    @Override
    public final Collection values() {
        return g();
    }
}
