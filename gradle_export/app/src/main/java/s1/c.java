package s1;

import java.util.Collection;
import java.util.Set;
import qd.j0;

public class c extends h00.g implements q1.d {
    public static final c C = new c(k.f13620e, 0);
    public final k A;
    public final int B;

    public c(k kVar, int i10) {
        this.A = kVar;
        this.B = i10;
    }

    public final Set a() {
        return new i(this, 0);
    }

    public final Set c() {
        return new i(this, 1);
    }

    @Override
    public boolean containsKey(Object obj) {
        return this.A.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final int e() {
        return this.B;
    }

    public final Collection g() {
        return new r30.g(this, 1);
    }

    @Override
    public Object get(Object obj) {
        return this.A.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public e h() {
        return new e(this);
    }

    public final c i(Object obj, t1.a aVar) {
        j0 j0VarU = this.A.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return j0VarU == null ? this : new c((k) j0VarU.C, this.B + j0VarU.B);
    }
}
