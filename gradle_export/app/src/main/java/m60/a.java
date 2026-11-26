package m60;

import bk.m;
import com.google.gson.reflect.TypeToken;
import gi.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import l60.l;
import l60.q0;

public final class a extends l {
    public final m a;

    public a(m mVar) {
        this.a = mVar;
    }

    @Override
    public final l60.m a(Type type) {
        TypeToken typeToken = TypeToken.get(type);
        m mVar = this.a;
        return new b(mVar, mVar.f(typeToken));
    }

    @Override
    public final l60.m b(Type type, Annotation[] annotationArr, q0 q0Var) {
        TypeToken typeToken = TypeToken.get(type);
        m mVar = this.a;
        return new c(mVar, mVar.f(typeToken), 21);
    }
}
