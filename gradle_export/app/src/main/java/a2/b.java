package a2;

import java.util.ArrayList;

public abstract class b implements g20.m {
    public final ArrayList A;

    public b(int i10) {
        switch (i10) {
            case 1:
                this.A = new ArrayList();
                break;
            default:
                this.A = new ArrayList();
                break;
        }
    }

    public void a() {
        k((String[]) this.A.toArray(new String[0]));
    }

    public boolean b(int i10, o1.c cVar, Object obj) {
        ArrayList arrayListD = cVar.d();
        boolean z10 = false;
        if (arrayListD != null) {
            int size = arrayListD.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = arrayListD.get(i11);
                if (obj2 instanceof o1.b) {
                    if (obj2.equals(obj)) {
                        e(cVar.e(), cVar, obj2);
                        return true;
                    }
                } else {
                    if (!(obj2 instanceof o1.c)) {
                        throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                    }
                    if (b(i10, (o1.c) obj2, obj)) {
                        e(cVar.e(), cVar, obj2);
                        return true;
                    }
                }
            }
        } else {
            if (!cVar.a()) {
                e(i10, cVar, null);
                return true;
            }
            int iC = cVar.c();
            int iB = cVar.b();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iC <= iIntValue && iIntValue < iB) || (iC == iB && iC == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    e(cVar.e(), cVar, null);
                }
                return z10;
            }
        }
        return false;
    }

    public void c(Object obj) {
        if (obj instanceof String) {
            this.A.add((String) obj);
        }
    }

    public void d(s20.f fVar) {
    }

    public void e(int i10, o1.c cVar, Object obj) {
        this.A.add(new c(i10, null, null));
    }

    public abstract int f(o1.b bVar);

    public void g(int i10, Object obj, o1.c cVar, Object obj2) {
        if (kotlin.jvm.internal.m.a(obj, l1.i.f9868a)) {
            e(i10, cVar, null);
        }
    }

    public o1.c h(Object obj) {
        if (obj instanceof o1.b) {
            return j((o1.b) obj);
        }
        if (obj instanceof o1.c) {
            return (o1.c) obj;
        }
        throw new IllegalStateException(("Unexpected child source info " + obj).toString());
    }

    public g20.l i(n20.b bVar) {
        return null;
    }

    public abstract o1.c j(o1.b bVar);

    public abstract void k(String[] strArr);

    public void l(n20.b bVar, n20.e eVar) {
    }
}
