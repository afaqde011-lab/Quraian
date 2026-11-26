package h20;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g20.l;
import g20.m;
import s20.f;

public final class c implements l {
    public final int A;
    public final e B;

    public c(e eVar, int i) {
        this.A = i;
        this.B = eVar;
    }

    private final void b(n20.e eVar, f fVar) {
    }

    private final void c(n20.e eVar, f fVar) {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void g(n20.e eVar, n20.b bVar, n20.e eVar2) {
    }

    private final void i(n20.e eVar, n20.b bVar, n20.e eVar2) {
    }

    @Override
    public final void a() {
        int i = this.A;
    }

    @Override
    public final m f(n20.e eVar) {
        switch (this.A) {
            case 0:
                String strB = eVar.b();
                if ("d1".equals(strB)) {
                    return new b(this, 0);
                }
                if ("d2".equals(strB)) {
                    return new b(this, 1);
                }
                return null;
            default:
                String strB2 = eVar.b();
                if ("data".equals(strB2) || "filePartClassNames".equals(strB2)) {
                    return new d(this, 0);
                }
                if ("strings".equals(strB2)) {
                    return new d(this, 1);
                }
                return null;
        }
    }

    @Override
    public final l h(n20.b bVar, n20.e eVar) {
        switch (this.A) {
        }
        return null;
    }

    @Override
    public final void j(n20.e eVar, f fVar) {
        int i = this.A;
    }

    @Override
    public final void k(n20.e eVar, Object obj) {
        switch (this.A) {
            case 0:
                String strB = eVar.b();
                boolean zEquals = "k".equals(strB);
                e eVar2 = this.B;
                if (!zEquals) {
                    if (!"mv".equals(strB)) {
                        if (!"xs".equals(strB)) {
                            if (!"xi".equals(strB)) {
                                "pn".equals(strB);
                            } else if (obj instanceof Integer) {
                                eVar2.C = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (!str.isEmpty()) {
                                eVar2.B = str;
                            }
                        }
                    } else if (obj instanceof int[]) {
                        eVar2.A = (int[]) obj;
                    }
                } else if (obj instanceof Integer) {
                    a.B.getClass();
                    a aVar = (a) a.C.get((Integer) obj);
                    if (aVar == null) {
                        aVar = a.UNKNOWN;
                    }
                    eVar2.G = aVar;
                }
                break;
            default:
                String strB2 = eVar.b();
                boolean zEquals2 = DiagnosticsEntry.VERSION_KEY.equals(strB2);
                e eVar3 = this.B;
                if (!zEquals2) {
                    if ("multifileClassName".equals(strB2)) {
                        eVar3.B = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    eVar3.A = (int[]) obj;
                }
                break;
        }
    }

    @Override
    public final void n(n20.e eVar, n20.b bVar, n20.e eVar2) {
        int i = this.A;
    }
}
