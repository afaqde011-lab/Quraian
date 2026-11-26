package bk;

import ek.d1;
import java.io.IOException;
import java.io.StringWriter;

public abstract class q {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final s b() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public final t c() {
        if (this instanceof t) {
            return (t) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ik.b bVar = new ik.b(stringWriter);
            bVar.H = 1;
            d1.f5426z.getClass();
            ek.m.e(bVar, this);
            return stringWriter.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
