package androidx.lifecycle;

import android.os.Looper;
import d40.p1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

public final class y extends q {

    public final boolean f1020b;

    public r.a f1021c = new r.a();

    public p f1022d;

    public final WeakReference f1023e;

    public int f1024f;

    public boolean f1025g;

    public boolean f1026h;

    public final ArrayList f1027i;

    public final p1 f1028j;

    public y(w wVar, boolean z10) {
        this.f1020b = z10;
        p pVar = p.B;
        this.f1022d = pVar;
        this.f1027i = new ArrayList();
        this.f1023e = new WeakReference(wVar);
        this.f1028j = d40.o.c(pVar);
    }

    @Override
    public final void a(v vVar) {
        u fVar;
        Object obj;
        w wVar;
        o oVar;
        kotlin.jvm.internal.m.e(vVar, "observer");
        f("addObserver");
        p pVar = this.f1022d;
        p pVar2 = p.A;
        if (pVar != pVar2) {
            pVar2 = p.B;
        }
        x xVar = new x();
        HashMap map = a0.f972a;
        boolean z10 = vVar instanceof u;
        boolean z11 = vVar instanceof DefaultLifecycleObserver;
        int i10 = 1;
        if (z10 && z11) {
            fVar = new f((DefaultLifecycleObserver) vVar, (u) vVar);
        } else if (z11) {
            fVar = new f((DefaultLifecycleObserver) vVar, (u) null);
        } else if (z10) {
            fVar = (u) vVar;
        } else {
            Class<?> cls = vVar.getClass();
            if (a0.b(cls) == 2) {
                Object obj2 = a0.f973b.get(cls);
                kotlin.jvm.internal.m.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    a0.a((Constructor) list.get(0), vVar);
                    throw null;
                }
                int size = list.size();
                i[] iVarArr = new i[size];
                if (size > 0) {
                    a0.a((Constructor) list.get(0), vVar);
                    throw null;
                }
                fVar = new ia.b(iVarArr, i10);
            } else {
                fVar = new f(vVar);
            }
        }
        xVar.f1014b = fVar;
        xVar.f1013a = pVar2;
        r.a aVar = this.f1021c;
        r.c cVarA = aVar.a(vVar);
        if (cVarA != null) {
            obj = cVarA.B;
        } else {
            HashMap map2 = aVar.E;
            r.c cVar = new r.c(vVar, xVar);
            aVar.D++;
            r.c cVar2 = aVar.B;
            if (cVar2 == null) {
                aVar.A = cVar;
                aVar.B = cVar;
            } else {
                cVar2.C = cVar;
                cVar.D = cVar2;
                aVar.B = cVar;
            }
            map2.put(vVar, cVar);
            obj = null;
        }
        if (((x) obj) == null && (wVar = (w) this.f1023e.get()) != null) {
            boolean z12 = this.f1024f != 0 || this.f1025g;
            p pVarE = e(vVar);
            this.f1024f++;
            while (xVar.f1013a.compareTo(pVarE) < 0 && this.f1021c.E.containsKey(vVar)) {
                p pVar3 = xVar.f1013a;
                ArrayList arrayList = this.f1027i;
                arrayList.add(pVar3);
                m mVar = o.Companion;
                p pVar4 = xVar.f1013a;
                mVar.getClass();
                kotlin.jvm.internal.m.e(pVar4, "state");
                int iOrdinal = pVar4.ordinal();
                if (iOrdinal == 1) {
                    oVar = o.ON_CREATE;
                } else if (iOrdinal != 2) {
                    oVar = iOrdinal != 3 ? null : o.ON_RESUME;
                } else {
                    oVar = o.ON_START;
                }
                if (oVar == null) {
                    throw new IllegalStateException("no event up from " + xVar.f1013a);
                }
                xVar.a(wVar, oVar);
                arrayList.remove(arrayList.size() - 1);
                pVarE = e(vVar);
            }
            if (!z12) {
                j();
            }
            this.f1024f--;
        }
    }

    @Override
    public final p b() {
        return this.f1022d;
    }

    @Override
    public final d40.z0 c() {
        return new d40.z0(this.f1028j);
    }

    @Override
    public final void d(v vVar) {
        kotlin.jvm.internal.m.e(vVar, "observer");
        f("removeObserver");
        this.f1021c.b(vVar);
    }

    public final p e(v vVar) {
        HashMap map = this.f1021c.E;
        r.c cVar = map.containsKey(vVar) ? ((r.c) map.get(vVar)).D : null;
        p pVar = cVar != null ? ((x) cVar.B).f1013a : null;
        ArrayList arrayList = this.f1027i;
        p pVar2 = arrayList.isEmpty() ? null : (p) g4.c.d(1, arrayList);
        p pVar3 = this.f1022d;
        kotlin.jvm.internal.m.e(pVar3, "state1");
        if (pVar == null || pVar.compareTo(pVar3) >= 0) {
            pVar = pVar3;
        }
        return (pVar2 == null || pVar2.compareTo(pVar) >= 0) ? pVar : pVar2;
    }

    public final void f(String str) {
        if (this.f1020b) {
            q.a.g0().f12555a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a1.b.p("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void g(o oVar) {
        kotlin.jvm.internal.m.e(oVar, "event");
        f("handleLifecycleEvent");
        h(oVar.a());
    }

    public final void h(p pVar) throws NoWhenBranchMatchedException {
        if (this.f1022d == pVar) {
            return;
        }
        w wVar = (w) this.f1023e.get();
        p pVar2 = this.f1022d;
        kotlin.jvm.internal.m.e(pVar2, "current");
        kotlin.jvm.internal.m.e(pVar, "next");
        if (pVar2 == p.B && pVar == p.A) {
            throw new IllegalStateException(("State must be at least '" + p.C + "' to be moved to '" + pVar + "' in component " + wVar).toString());
        }
        p pVar3 = p.A;
        if (pVar2 == pVar3 && pVar2 != pVar) {
            throw new IllegalStateException(("State is '" + pVar3 + "' and cannot be moved to `" + pVar + "` in component " + wVar).toString());
        }
        this.f1022d = pVar;
        if (this.f1025g || this.f1024f != 0) {
            this.f1026h = true;
            return;
        }
        this.f1025g = true;
        j();
        this.f1025g = false;
        if (this.f1022d == pVar3) {
            this.f1021c = new r.a();
        }
    }

    public final void i(p pVar) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(pVar, "state");
        f("setCurrentState");
        h(pVar);
    }

    public final void j() throws NoWhenBranchMatchedException {
        o oVar;
        w wVar = (w) this.f1023e.get();
        if (wVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            r.a aVar = this.f1021c;
            if (aVar.D != 0) {
                r.c cVar = aVar.A;
                kotlin.jvm.internal.m.b(cVar);
                p pVar = ((x) cVar.B).f1013a;
                r.c cVar2 = this.f1021c.B;
                kotlin.jvm.internal.m.b(cVar2);
                p pVar2 = ((x) cVar2.B).f1013a;
                if (pVar == pVar2 && this.f1022d == pVar2) {
                    break;
                }
                this.f1026h = false;
                p pVar3 = this.f1022d;
                r.c cVar3 = this.f1021c.A;
                kotlin.jvm.internal.m.b(cVar3);
                int iCompareTo = pVar3.compareTo(((x) cVar3.B).f1013a);
                ArrayList arrayList = this.f1027i;
                if (iCompareTo < 0) {
                    r.a aVar2 = this.f1021c;
                    r.b bVar = new r.b(aVar2.B, aVar2.A, 1);
                    aVar2.C.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f1026h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        kotlin.jvm.internal.m.b(entry);
                        v vVar = (v) entry.getKey();
                        x xVar = (x) entry.getValue();
                        while (xVar.f1013a.compareTo(this.f1022d) > 0 && !this.f1026h && this.f1021c.E.containsKey(vVar)) {
                            m mVar = o.Companion;
                            p pVar4 = xVar.f1013a;
                            mVar.getClass();
                            o oVarA = m.a(pVar4);
                            if (oVarA == null) {
                                throw new IllegalStateException("no event down from " + xVar.f1013a);
                            }
                            arrayList.add(oVarA.a());
                            xVar.a(wVar, oVarA);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                r.c cVar4 = this.f1021c.B;
                if (!this.f1026h && cVar4 != null && this.f1022d.compareTo(((x) cVar4.B).f1013a) > 0) {
                    r.a aVar3 = this.f1021c;
                    aVar3.getClass();
                    r.d dVar = new r.d(aVar3);
                    aVar3.C.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f1026h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        v vVar2 = (v) entry2.getKey();
                        x xVar2 = (x) entry2.getValue();
                        while (xVar2.f1013a.compareTo(this.f1022d) < 0 && !this.f1026h && this.f1021c.E.containsKey(vVar2)) {
                            arrayList.add(xVar2.f1013a);
                            m mVar2 = o.Companion;
                            p pVar5 = xVar2.f1013a;
                            mVar2.getClass();
                            kotlin.jvm.internal.m.e(pVar5, "state");
                            int iOrdinal = pVar5.ordinal();
                            if (iOrdinal == 1) {
                                oVar = o.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                oVar = iOrdinal != 3 ? null : o.ON_RESUME;
                            } else {
                                oVar = o.ON_START;
                            }
                            if (oVar == null) {
                                throw new IllegalStateException("no event up from " + xVar2.f1013a);
                            }
                            xVar2.a(wVar, oVar);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f1026h = false;
        this.f1028j.j(this.f1022d);
    }
}
