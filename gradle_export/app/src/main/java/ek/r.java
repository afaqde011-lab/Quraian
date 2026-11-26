package ek;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class r {

    public final String f5445a;

    public final Field f5446b;

    public final String f5447c;

    public final Method f5448d;

    public final bk.a0 f5449e;

    public final bk.a0 f5450f;

    public final boolean f5451g;

    public final boolean f5452h;

    public r(String str, Field field, Method method, bk.a0 a0Var, bk.a0 a0Var2, boolean z10, boolean z11) {
        this.f5448d = method;
        this.f5449e = a0Var;
        this.f5450f = a0Var2;
        this.f5451g = z10;
        this.f5452h = z11;
        this.f5445a = str;
        this.f5446b = field;
        this.f5447c = field.getName();
    }

    public final void a(ik.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f5448d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e3) {
                throw new JsonIOException(a1.b.p("Accessor ", gk.c.d(method, false), " threw exception"), e3.getCause());
            }
        } else {
            objInvoke = this.f5446b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.A(this.f5445a);
        this.f5449e.c(bVar, objInvoke);
    }
}
