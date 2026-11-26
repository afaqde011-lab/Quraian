package p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class q0 implements n40.e, j {
    public final String a;
    public final z b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public q0(String str, z zVar, int i) {
        this.a = str;
        this.b = zVar;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = h00.y.A;
        g00.i iVar = g00.i.B;
        final int i4 = 0;
        this.i = rd.a.I(iVar, new u00.a(this) {
            public final q0 B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                l40.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                l40.a[] aVarArrTypeParametersSerializers;
                switch (i4) {
                    case 0:
                        z zVar2 = this.B.b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.B.b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (l40.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.B;
                        return Integer.valueOf(o0.f(q0Var, (n40.e[]) q0Var.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = rd.a.I(iVar, new u00.a(this) {
            public final q0 B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                l40.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                l40.a[] aVarArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        z zVar2 = this.B.b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.B.b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (l40.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.B;
                        return Integer.valueOf(o0.f(q0Var, (n40.e[]) q0Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = rd.a.I(iVar, new u00.a(this) {
            public final q0 B;

            {
                this.B = this;
            }

            @Override
            public final Object invoke() {
                l40.a[] aVarArrChildSerializers;
                ArrayList arrayList;
                l40.a[] aVarArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        z zVar2 = this.B.b;
                        return (zVar2 == null || (aVarArrChildSerializers = zVar2.childSerializers()) == null) ? o0.b : aVarArrChildSerializers;
                    case 1:
                        z zVar3 = this.B.b;
                        if (zVar3 == null || (aVarArrTypeParametersSerializers = zVar3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(aVarArrTypeParametersSerializers.length);
                            for (l40.a aVar : aVarArrTypeParametersSerializers) {
                                arrayList.add(aVar.getDescriptor());
                            }
                        }
                        return o0.c(arrayList);
                    default:
                        q0 q0Var = this.B;
                        return Integer.valueOf(o0.f(q0Var, (n40.e[]) q0Var.j.getValue()));
                }
            }
        });
    }

    @Override
    public final String a() {
        return this.a;
    }

    @Override
    public final Set b() {
        return this.h.keySet();
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final int d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            n40.e eVar = (n40.e) obj;
            if (this.a.equals(eVar.a()) && Arrays.equals((n40.e[]) this.j.getValue(), (n40.e[]) ((q0) obj).j.getValue())) {
                int iE = eVar.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (kotlin.jvm.internal.m.a(h(i2).a(), eVar.h(i2).a()) && kotlin.jvm.internal.m.a(h(i2).getKind(), eVar.h(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final String f(int i) {
        return this.e[i];
    }

    @Override
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? h00.x.A : list;
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public va.a getKind() {
        return n40.i.c;
    }

    @Override
    public n40.e h(int i) {
        return ((l40.a[]) this.i.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override
    public final boolean i(int i) {
        return this.g[i];
    }

    @Override
    public boolean isInline() {
        return false;
    }

    public final void j(String name, boolean z) {
        kotlin.jvm.internal.m.e(name, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return h00.q.R0(ab.a0.I0(0, this.c), ", ", this.a.concat("("), ")", new h00.a(this, 26), 24);
    }
}
