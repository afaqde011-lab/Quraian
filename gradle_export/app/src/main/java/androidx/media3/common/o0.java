package androidx.media3.common;

import com.google.android.gms.internal.measurement.b5;
import java.io.Serializable;
import java.util.HashSet;

public final class o0 {

    public String f1358a = null;

    public int f1359b;

    public int f1360c;

    public Object f1361d;

    public Serializable f1362e;

    public Object f1363f;

    public Serializable f1364g;

    public o0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f1361d = hashSet;
        this.f1362e = new HashSet();
        this.f1359b = 0;
        this.f1360c = 0;
        this.f1364g = new HashSet();
        hashSet.add(ii.p.a(cls));
        for (Class cls2 : clsArr) {
            b5.m(cls2, "Null interface");
            ((HashSet) this.f1361d).add(ii.p.a(cls2));
        }
    }

    public void a(ii.j jVar) {
        if (((HashSet) this.f1361d).contains(jVar.f7699a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f1362e).add(jVar);
    }

    public ii.b b() {
        if (((ii.e) this.f1363f) != null) {
            return new ii.b(this.f1358a, new HashSet((HashSet) this.f1361d), new HashSet((HashSet) this.f1362e), this.f1359b, this.f1360c, (ii.e) this.f1363f, (HashSet) this.f1364g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.f1359b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f1359b = i10;
    }
}
