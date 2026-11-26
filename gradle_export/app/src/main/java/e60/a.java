package e60;

import a1.i;
import a1.u0;
import a10.d;
import b60.c;
import com.google.android.gms.internal.measurement.x5;
import h00.q;
import h00.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.MissingScopeValueException;
import org.koin.core.error.NoDefinitionFoundException;
import s30.f;
import s30.g;
import sd.y1;
import w50.b;

public final class a {
    public final b60.a a;
    public final String b;
    public final boolean c;
    public final c d;
    public final s50.a e;
    public final ArrayList f;
    public Object g;
    public final LinkedHashSet h;
    public volatile ThreadLocal i;
    public boolean j;

    public a(b60.a scopeQualifier, String id, c cVar, s50.a aVar, int i) {
        boolean z = (i & 4) == 0;
        cVar = (i & 8) != 0 ? null : cVar;
        m.e(scopeQualifier, "scopeQualifier");
        m.e(id, "id");
        this.a = scopeQualifier;
        this.b = id;
        this.c = z;
        this.d = cVar;
        this.e = aVar;
        this.f = new ArrayList();
        this.h = new LinkedHashSet();
    }

    public final void a(h00.m mVar) {
        if (!mVar.isEmpty()) {
            mVar.removeFirst();
        }
        if (mVar.isEmpty()) {
            d().remove();
        }
    }

    public final ArrayList b(d clazz) {
        m.e(clazz, "clazz");
        s50.a aVar = this.e;
        y1 y1Var = new y1(aVar.a, this, clazz);
        c cVar = this.d;
        y1Var.f = cVar;
        i iVar = aVar.d;
        iVar.getClass();
        Collection collectionValues = ((ConcurrentHashMap) iVar.C).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            v50.a aVar2 = ((b) obj).a;
            b60.a aVar3 = aVar2.a;
            if (m.a(aVar3, this.a) || m.a(aVar3, cVar)) {
                if (m.a(aVar2.b, clazz) || aVar2.f.contains(clazz)) {
                    arrayList.add(obj);
                }
            }
        }
        List listG0 = q.G0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            Object objB = ((b) it.next()).b(y1Var);
            if (objB == null) {
                objB = null;
            }
            if (objB != null) {
                arrayList2.add(objB);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            v.u0(((a) it2.next()).b(clazz), arrayList3);
        }
        return q.Y0(arrayList3, arrayList2);
    }

    public final Object c(d clazz, b60.b bVar) {
        s50.a aVar = this.e;
        m.e(clazz, "clazz");
        try {
            return f(clazz, null, bVar);
        } catch (ClosedScopeException unused) {
            aVar.a.E0("* Scope closed - no instance found for " + g60.a.a(clazz) + " on scope " + this);
            return null;
        } catch (MissingScopeValueException unused2) {
            aVar.a.E0("* No Scoped value found for type '" + g60.a.a(clazz) + "' on scope '" + this + '\'');
            return null;
        } catch (NoDefinitionFoundException unused3) {
            aVar.a.E0("* No instance found for type '" + g60.a.a(clazz) + "' on scope '" + this + '\'');
            return null;
        }
    }

    public final ThreadLocal d() {
        ThreadLocal threadLocal;
        ThreadLocal threadLocal2 = this.i;
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (this) {
            threadLocal = this.i;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                this.i = threadLocal;
            }
        }
        return threadLocal;
    }

    public final h00.m e(a60.a parameters) {
        m.e(parameters, "parameters");
        h00.m mVar = (h00.m) d().get();
        if (mVar == null) {
            mVar = new h00.m();
            d().set(mVar);
        }
        mVar.addFirst(parameters);
        return mVar;
    }

    public final Object f(d dVar, a60.a aVar, b60.a aVar2) {
        String str;
        s50.a aVar3 = this.e;
        f5.c cVar = aVar3.a;
        x50.a aVar4 = x50.a.A;
        if (((x50.a) cVar.B).compareTo(aVar4) > 0) {
            return h(dVar, aVar, aVar2);
        }
        if (aVar2 != null) {
            str = " with qualifier '" + aVar2 + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        String strK = this.c ? "" : g4.c.k(new StringBuilder(" - scope:'"), this.b, '\'');
        aVar3.a.F0(aVar4, "|- '" + g60.a.a(dVar) + '\'' + str + strK + "...");
        long jA = f.a();
        Object objH = h(dVar, aVar, aVar2);
        long jA2 = g.a(jA);
        f5.c cVar2 = aVar3.a;
        StringBuilder sb = new StringBuilder("|- '");
        sb.append(g60.a.a(dVar));
        sb.append("' in ");
        s30.a aVar5 = s30.b.B;
        sb.append(s30.b.i(jA2, s30.d.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        cVar2.F0(aVar4, sb.toString());
        return objH;
    }

    public final Object g(y1 y1Var) throws NoDefinitionFoundException {
        String str;
        h00.m mVar;
        a60.a aVar;
        b bVarW;
        c cVar;
        u0 u0Var = this.e.b;
        u0Var.getClass();
        a60.a aVar2 = (a60.a) y1Var.e;
        Object obj = null;
        Object objB = (aVar2 == null || aVar2.a.isEmpty()) ? null : ((a60.a) y1Var.e).b((d) y1Var.c);
        if (objB != null) {
            obj = objB;
        } else {
            ThreadLocal threadLocal = this.i;
            objB = (threadLocal == null || (mVar = (h00.m) threadLocal.get()) == null || mVar.isEmpty() || (aVar = (a60.a) mVar.i()) == null) ? null : aVar.b((d) y1Var.c);
            if (objB == null) {
                s50.a aVar3 = (s50.a) u0Var.B;
                i iVar = aVar3.d;
                d dVar = (d) y1Var.c;
                b60.a aVar4 = (b60.a) y1Var.d;
                b60.a aVar5 = this.a;
                boolean z = this.c;
                b bVarW2 = iVar.w(dVar, aVar4, aVar5);
                if (bVarW2 == null) {
                    if (z || (cVar = this.d) == null) {
                        bVarW2 = null;
                    } else {
                        y1Var.f = cVar;
                        bVarW2 = aVar3.d.w(dVar, aVar4, cVar);
                    }
                }
                Object objB2 = bVarW2 != null ? bVarW2.b(y1Var) : null;
                if (objB2 == null) {
                    if (z || aVar4 != null || !dVar.u(this.g) || (objB2 = this.g) == null) {
                        objB2 = null;
                    }
                    if (objB2 == null) {
                        List listR = va.a.R(this);
                        ArrayList scopes = this.f;
                        m.e(scopes, "scopes");
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        h00.m mVar2 = new h00.m(q.C0(scopes));
                        while (!mVar2.isEmpty()) {
                            a aVar6 = (a) mVar2.removeLast();
                            if (linkedHashSet.add(aVar6)) {
                                Iterator it = aVar6.f.iterator();
                                m.d(it, "iterator(...)");
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    m.d(next, "next(...)");
                                    a aVar7 = (a) next;
                                    if (!linkedHashSet.contains(aVar7)) {
                                        mVar2.addLast(aVar7);
                                    }
                                }
                            }
                        }
                        Iterator it2 = q.Y0(linkedHashSet, listR).iterator();
                        a aVar8 = null;
                        do {
                            if (!it2.hasNext()) {
                                bVarW = null;
                                break;
                            }
                            a aVar9 = (a) it2.next();
                            c cVar2 = aVar9.d;
                            if (cVar2 == null || (bVarW = aVar3.d.w(dVar, aVar4, cVar2)) == null) {
                                bVarW = aVar3.d.w(dVar, aVar4, aVar9.a);
                            }
                            if (bVarW != null) {
                                aVar8 = aVar9;
                            }
                        } while (bVarW == null);
                        a aVar10 = aVar8;
                        if (aVar10 == null || bVarW == null) {
                            objB2 = null;
                        } else {
                            f5.c cVar3 = (f5.c) y1Var.a;
                            d dVar2 = (d) y1Var.c;
                            b60.a aVar11 = (b60.a) y1Var.d;
                            a60.a aVar12 = (a60.a) y1Var.e;
                            y1 y1Var2 = new y1(cVar3, aVar10, dVar2, aVar11, aVar12);
                            c cVar4 = aVar10.d;
                            y1Var2.f = cVar4;
                            if (cVar4 != null && !aVar10.c) {
                                y1Var2.f = cVar4;
                            }
                            h00.m mVarE = aVar12 != null ? aVar10.e(aVar12) : null;
                            objB2 = bVarW.b(y1Var2);
                            if (mVarE != null) {
                                aVar10.a(mVarE);
                            }
                        }
                    }
                }
                if (objB2 == null) {
                    Iterator it3 = ((ArrayList) u0Var.C).iterator();
                    if (it3.hasNext()) {
                        throw a1.b.j(it3);
                    }
                } else {
                    obj = objB2;
                }
            } else {
                obj = objB;
            }
        }
        if (obj != null) {
            return obj;
        }
        b60.a aVar13 = (b60.a) y1Var.d;
        if (aVar13 != null) {
            str = " and qualifier '" + aVar13 + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        String msg = "No definition found for type '" + g60.a.a((d) y1Var.c) + '\'' + str + " on scope '" + ((a) y1Var.b) + "'. Check your Modules configuration and add missing type and/or qualifier!";
        m.e(msg, "msg");
        throw new NoDefinitionFoundException(msg);
    }

    public final Object h(d dVar, a60.a aVar, b60.a aVar2) throws ClosedScopeException {
        if (this.j) {
            String msg = "Scope '" + this.b + "' is closed";
            m.e(msg, "msg");
            throw new ClosedScopeException(msg);
        }
        s50.a aVar3 = this.e;
        y1 y1Var = new y1(aVar3.a, this, dVar, aVar2, aVar);
        if (aVar == null) {
            return g(y1Var);
        }
        f5.c cVar = aVar3.a;
        x50.a aVar4 = x50.a.A;
        if (((x50.a) cVar.B).compareTo(aVar4) <= 0) {
            cVar.F0(aVar4, "| >> parameters " + aVar);
        }
        h00.m mVarE = e(aVar);
        try {
            return g(y1Var);
        } finally {
            aVar3.a.E0("| << parameters");
            a(mVarE);
        }
    }

    public final String toString() {
        return x5.n(new StringBuilder("['"), this.b, "']");
    }
}
