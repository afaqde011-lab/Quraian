package q40;

import java.util.List;

public final class o implements n40.e {
    public final g00.p a;

    public o(u00.a aVar) {
        this.a = rd.a.J(aVar);
    }

    @Override
    public final String a() {
        return b().a();
    }

    public final n40.e b() {
        return (n40.e) this.a.getValue();
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return b().d(name);
    }

    @Override
    public final int e() {
        return b().e();
    }

    @Override
    public final String f(int i) {
        return b().f(i);
    }

    @Override
    public final List g(int i) {
        return b().g(i);
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final va.a getKind() {
        return b().getKind();
    }

    @Override
    public final n40.e h(int i) {
        return b().h(i);
    }

    @Override
    public final boolean i(int i) {
        return b().i(i);
    }

    @Override
    public final boolean isInline() {
        return false;
    }
}
