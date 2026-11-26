package ek;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;

public final class t extends s {

    public final dk.o f5454b;

    public t(dk.o oVar, u uVar) {
        super(uVar);
        this.f5454b = oVar;
    }

    @Override
    public final Object d() {
        return this.f5454b.j();
    }

    @Override
    public final Object e(Object obj) {
        return obj;
    }

    @Override
    public final void f(Object obj, ik.a aVar, r rVar) throws IllegalAccessException {
        Field field = rVar.f5446b;
        Object objB = rVar.f5450f.b(aVar);
        if (objB == null && rVar.f5451g) {
            return;
        }
        if (rVar.f5452h) {
            throw new JsonIOException(a1.b.o("Cannot set value of 'static final' ", gk.c.d(field, false)));
        }
        field.set(obj, objB);
    }
}
