package ca;

import a1.e2;
import a40.g1;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ri.t1;

public final class l0 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};

    public final t f3053a;

    public final LinkedHashMap f3054b;

    public final LinkedHashMap f3055c;

    public final boolean f3056d;

    public final g1 f3057e;

    public final String[] f3059g;

    public final k f3060h;

    public final qj.c f3061i;

    public final AtomicBoolean f3062j = new AtomicBoolean(false);

    public u00.a f3063k = new a2.f(13);

    public final LinkedHashMap f3058f = new LinkedHashMap();

    public l0(t tVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z10, g1 g1Var) {
        String lowerCase;
        this.f3053a = tVar;
        this.f3054b = linkedHashMap;
        this.f3055c = linkedHashMap2;
        this.f3056d = z10;
        this.f3057e = g1Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
            this.f3058f.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f3054b.get(strArr[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i10] = lowerCase2;
        }
        this.f3059g = strArr2;
        for (Map.Entry entry : this.f3054b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.m.d(lowerCase3, "toLowerCase(...)");
            if (this.f3058f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.m.d(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f3058f;
                linkedHashMap3.put(lowerCase4, h00.d0.O(linkedHashMap3, lowerCase3));
            }
        }
        this.f3060h = new k(this.f3059g.length);
        this.f3061i = new qj.c(this.f3059g.length);
    }

    public static final Object a(l0 l0Var, n nVar, m00.c cVar) {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i10 = c0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(l0Var, cVar);
            }
        } else {
            c0Var = new c0(l0Var, cVar);
        }
        Object objC = c0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = c0Var.D;
        if (i11 == 0) {
            t1.O(objC);
            u00.k bVar = new bw.b(8);
            c0Var.A = nVar;
            c0Var.D = 1;
            objC = nVar.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", bVar, c0Var);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) c0Var.A;
            t1.O(objC);
            return set;
        }
        nVar = (n) c0Var.A;
        t1.O(objC);
        Set set2 = (Set) objC;
        if (!set2.isEmpty()) {
            c0Var.A = set2;
            c0Var.D = 2;
            if (v.v(nVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c0Var) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    public static final Object b(l0 l0Var, m00.c cVar) throws Throwable {
        f0 f0Var;
        l9.f0 f0Var2;
        t tVar = l0Var.f3053a;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i10 = f0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(l0Var, cVar);
            }
        } else {
            f0Var = new f0(l0Var, cVar);
        }
        Object obj = f0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = f0Var.D;
        if (i11 == 0) {
            t1.O(obj);
            l9.f0 f0Var3 = tVar.f3096g;
            boolean zC = f0Var3.c();
            h00.z zVar = h00.z.A;
            if (!zC) {
                return zVar;
            }
            try {
                if (!l0Var.f3062j.compareAndSet(true, false)) {
                    f0Var3.v();
                    return zVar;
                }
                if (!((Boolean) l0Var.f3063k.invoke()).booleanValue()) {
                    f0Var3.v();
                    return zVar;
                }
                g0 g0Var = new g0(l0Var, null, 1);
                f0Var.A = f0Var3;
                f0Var.D = 1;
                Object objQ = tVar.q(false, g0Var, f0Var);
                if (objQ == aVar) {
                    return aVar;
                }
                f0Var2 = f0Var3;
                obj = objQ;
            } catch (Throwable th2) {
                th = th2;
                f0Var2 = f0Var3;
                f0Var2.v();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var2 = f0Var.A;
            try {
                t1.O(obj);
            } catch (Throwable th3) {
                th = th3;
                f0Var2.v();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            l0Var.f3061i.N(set);
            l0Var.f3057e.invoke(set);
        }
        f0Var2.v();
        return set;
    }

    public static final java.lang.Object c(ca.l0 r17, ca.b0 r18, int r19, m00.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: ca.l0.c(ca.l0, ca.b0, int, m00.c):java.lang.Object");
    }

    public static final java.lang.Object d(ca.l0 r8, ca.b0 r9, int r10, m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: ca.l0.d(ca.l0, ca.b0, int, m00.c):java.lang.Object");
    }

    public final void e(u00.a aVar, u00.a aVar2) {
        kotlin.jvm.internal.m.e(aVar, "onRefreshScheduled");
        kotlin.jvm.internal.m.e(aVar2, "onRefreshCompleted");
        if (this.f3062j.compareAndSet(false, true)) {
            aVar.invoke();
            f40.c cVar = this.f3053a.f3090a;
            k00.c cVar2 = null;
            if (cVar != null) {
                a40.c0.y(cVar, new a40.y(), (a40.a0) null, new a1.d(this, aVar2, cVar2, 24), 2);
            } else {
                kotlin.jvm.internal.m.k("coroutineScope");
                throw null;
            }
        }
    }

    public final Object f(m00.c cVar) {
        j0 j0Var;
        l9.f0 f0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object obj = j0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = j0Var.D;
        if (i11 == 0) {
            t1.O(obj);
            t tVar = this.f3053a;
            l9.f0 f0Var2 = tVar.f3096g;
            if (f0Var2.c()) {
                try {
                    e2 e2Var = new e2(this, (k00.c) null, 11);
                    j0Var.A = f0Var2;
                    j0Var.D = 1;
                    if (tVar.q(false, e2Var, j0Var) == aVar) {
                        return aVar;
                    }
                    f0Var = f0Var2;
                    f0Var.v();
                } catch (Throwable th2) {
                    th = th2;
                    f0Var = f0Var2;
                    f0Var.v();
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0Var = j0Var.A;
            try {
                t1.O(obj);
                f0Var.v();
            } catch (Throwable th3) {
                th = th3;
                f0Var.v();
                throw th;
            }
        }
        return g00.b0.a;
    }
}
