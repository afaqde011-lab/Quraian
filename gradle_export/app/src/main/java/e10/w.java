package e10;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class w implements g {
    public final Member a;
    public final Type b;
    public final Class c;
    public final List d;

    public w(Member member, Type type, Class cls, Type[] typeArr) {
        List listV0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            db.g gVar = new db.g(2);
            ArrayList arrayList = gVar.B;
            gVar.a(cls);
            gVar.f(typeArr);
            listV0 = va.a.S(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listV0 = h00.n.V0(typeArr);
        }
        this.d = listV0;
    }

    @Override
    public final List a() {
        return this.d;
    }

    @Override
    public final Member b() {
        return this.a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    public void d(Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        if (k00.f.A(this) == args.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Callable expects ");
        sb.append(k00.f.A(this));
        sb.append(" arguments, but ");
        throw new IllegalArgumentException(g4.c.g(args.length, " were provided.", sb));
    }

    public final void e(Object obj) {
        if (obj == null || !this.a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override
    public final Type getReturnType() {
        return this.b;
    }
}
