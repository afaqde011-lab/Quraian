package androidx.work.impl;

import a10.d;
import a2.f;
import ab.c;
import ab.u;
import ab.w;
import androidx.work.impl.WorkDatabase_Impl;
import ba.y;
import ca.g;
import g00.p;
import hb.e;
import hb.h;
import hb.k;
import hb.m;
import hb.x;
import hb.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import rd.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {
    public final p l;
    public final p m;

    public final p f1909n;

    public final p f1910o;

    public final p f1911p;

    public final p f1912q;

    public final p f1913r;

    public WorkDatabase_Impl() {
        final int i10 = 0;
        this.l = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i11 = 1;
        this.m = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i12 = 2;
        this.f1909n = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i13 = 3;
        this.f1910o = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i14 = 4;
        this.f1911p = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i15 = 5;
        this.f1912q = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        final int i16 = 6;
        this.f1913r = a.J(new u00.a(this) {
            public final WorkDatabase_Impl B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return new hb.x(this.B);
                    case 1:
                        return new hb.c(this.B);
                    case 2:
                        return new hb.z(this.B);
                    case 3:
                        return new hb.h(this.B);
                    case 4:
                        return new hb.k(this.B);
                    case 5:
                        return new hb.m(this.B);
                    default:
                        return new hb.e(this.B);
                }
            }
        });
        a.J(new f(this, 2));
    }

    @Override
    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(13, 14, 10));
        arrayList.add(new u(0));
        arrayList.add(new c(16, 17, 11));
        arrayList.add(new c(17, 18, 12));
        arrayList.add(new c(18, 19, 13));
        arrayList.add(new u(1));
        arrayList.add(new c(20, 21, 14));
        arrayList.add(new c(22, 23, 15));
        arrayList.add(new c(23, 24, 16));
        return arrayList;
    }

    @Override
    public final g d() {
        return new g(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override
    public final y e() {
        return new w(this);
    }

    @Override
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b0 b0Var = a0.a;
        d dVarB = b0Var.b(x.class);
        h00.x xVar = h00.x.A;
        linkedHashMap.put(dVarB, xVar);
        linkedHashMap.put(b0Var.b(hb.c.class), xVar);
        linkedHashMap.put(b0Var.b(z.class), xVar);
        linkedHashMap.put(b0Var.b(h.class), xVar);
        linkedHashMap.put(b0Var.b(k.class), xVar);
        linkedHashMap.put(b0Var.b(m.class), xVar);
        linkedHashMap.put(b0Var.b(e.class), xVar);
        linkedHashMap.put(b0Var.b(hb.f.class), xVar);
        return linkedHashMap;
    }

    @Override
    public final hb.c r() {
        return (hb.c) this.m.getValue();
    }

    @Override
    public final e s() {
        return (e) this.f1913r.getValue();
    }

    @Override
    public final h t() {
        return (h) this.f1910o.getValue();
    }

    @Override
    public final k u() {
        return (k) this.f1911p.getValue();
    }

    @Override
    public final m v() {
        return (m) this.f1912q.getValue();
    }

    @Override
    public final x w() {
        return (x) this.l.getValue();
    }

    @Override
    public final z x() {
        return (z) this.f1909n.getValue();
    }
}
