package p40;

import java.util.List;
import java.util.Set;

public final class w0 implements n40.e, j {
    public final n40.e a;
    public final String b;
    public final Set c;

    public w0(n40.e original) {
        kotlin.jvm.internal.m.e(original, "original");
        this.a = original;
        this.b = original.a() + '?';
        this.c = o0.b(original);
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public final Set b() {
        return this.c;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.a.d(name);
    }

    @Override
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return kotlin.jvm.internal.m.a(this.a, ((w0) obj).a);
        }
        return false;
    }

    @Override
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override
    public final va.a getKind() {
        return this.a.getKind();
    }

    @Override
    public final n40.e h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
