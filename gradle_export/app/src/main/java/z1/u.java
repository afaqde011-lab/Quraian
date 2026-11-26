package z1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import l1.n1;

public final class u {

    public final u00.k f17064a;

    public boolean f17066c;

    public y8.g f17071h;

    public t f17072i;

    public final AtomicReference f17065b = new AtomicReference(null);

    public final m3.a f17067d = new m3.a(this, 24);

    public final q0.a f17068e = new q0.a(this, 27);

    public final m1.e f17069f = new m1.e(0, new t[16]);

    public final Object f17070g = new Object();

    public long f17073j = -1;

    public u(u00.k kVar) {
        this.f17064a = kVar;
    }

    public final void a() {
        synchronized (this.f17070g) {
            m1.e eVar = this.f17069f;
            Object[] objArr = eVar.A;
            int i10 = eVar.C;
            for (int i11 = 0; i11 < i10; i11++) {
                t tVar = (t) objArr[i11];
                tVar.f17057e.a();
                tVar.f17058f.a();
                tVar.l.a();
                tVar.m.clear();
            }
        }
    }

    public final void b(Object obj) {
        int i10;
        synchronized (this.f17070g) {
            try {
                m1.e eVar = this.f17069f;
                int i11 = eVar.C;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    t tVar = (t) eVar.A[i12];
                    u.c0 c0Var = (u.c0) tVar.f17058f.k(obj);
                    if (c0Var == null) {
                        i10 = i12;
                    } else {
                        Object[] objArr = c0Var.f14832b;
                        int[] iArr = c0Var.f14833c;
                        long[] jArr = c0Var.f14831a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j9 = jArr[i14];
                                i10 = i12;
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((j9 & 255) < 128) {
                                            int i17 = (i14 << 3) + i16;
                                            Object obj2 = objArr[i17];
                                            int i18 = iArr[i17];
                                            tVar.c(obj, obj2);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i15 != 8) {
                                        break;
                                    }
                                    if (i14 != length) {
                                        break;
                                    }
                                    i14++;
                                    i12 = i10;
                                } else if (i14 != length) {
                                    break;
                                    break;
                                } else {
                                    i14++;
                                    i12 = i10;
                                }
                            }
                        } else {
                            i10 = i12;
                        }
                    }
                    if (!tVar.f17058f.j()) {
                        i13++;
                    } else if (i13 > 0) {
                        Object[] objArr2 = eVar.A;
                        objArr2[i10 - i13] = objArr2[i10];
                    }
                    i12 = i10 + 1;
                }
                int i19 = i11 - i13;
                h00.n.y0(i19, i11, (Object) null, eVar.A);
                eVar.C = i19;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() throws KotlinNothingValueException {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f17070g) {
            z10 = this.f17066c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f17065b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        l1.l.b("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                if (atomicReference.compareAndSet(obj, obj2)) {
                    set = set2;
                    break;
                }
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f17070g) {
                m1.e eVar = this.f17069f;
                Object[] objArr = eVar.A;
                int i10 = eVar.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    z11 = ((t) objArr[i11]).a(set) || z11;
                }
            }
        }
    }

    public final void d(Object obj, u00.k kVar, u00.a aVar) {
        m1.e eVar;
        Object obj2;
        t tVar;
        boolean z10;
        t tVar2;
        long j9;
        long j10;
        t tVar3;
        f f0Var;
        long j11;
        u.c0 c0Var;
        int i10;
        long j12;
        u.c0 c0Var2;
        long jB = v1.d.b();
        synchronized (this.f17070g) {
            eVar = this.f17069f;
            Object[] objArr = eVar.A;
            int i11 = eVar.C;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i12];
                if (((t) obj2).f17053a == kVar) {
                    break;
                } else {
                    i12++;
                }
            }
            tVar = (t) obj2;
            z10 = true;
            if (tVar == null) {
                kotlin.jvm.internal.m.c(kVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.d0.d(1, kVar);
                tVar = new t(kVar);
                eVar.b(tVar);
            }
            tVar2 = this.f17072i;
            j9 = this.f17073j;
        }
        Object obj3 = eVar;
        if (j9 != -1) {
            obj3 = eVar;
            if (j9 != jB) {
                StringBuilder sbN = w.c.n("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j9, "), currentThread={id=");
                sbN.append(jB);
                sbN.append(", name=");
                sbN.append(Thread.currentThread().getName());
                sbN.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                n1.a(sbN.toString());
                obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.f17070g) {
                try {
                    this.f17072i = tVar;
                    this.f17073j = jB;
                } catch (Throwable th2) {
                    th = th2;
                    j10 = obj3;
                }
            }
            q0.a aVar2 = this.f17068e;
            Object obj4 = tVar.f17054b;
            u.c0 c0Var3 = tVar.f17055c;
            int i13 = tVar.f17056d;
            tVar.f17054b = obj;
            tVar.f17055c = (u.c0) tVar.f17058f.g(obj);
            if (tVar.f17056d == -1) {
                tVar.f17056d = Long.hashCode(l.j().g());
            }
            l1.f0 f0Var2 = tVar.f17061i;
            m1.e eVarP = l1.q.p();
            try {
                eVarP.b(f0Var2);
                if (aVar2 == null) {
                    aVar.invoke();
                    tVar3 = tVar;
                } else {
                    f fVar = (f) l.f17037b.get();
                    if (fVar instanceof f0) {
                        tVar3 = tVar;
                        if (((f0) fVar).f17028t == v1.d.b()) {
                            u00.k kVar2 = ((f0) fVar).f17026r;
                            u00.k kVar3 = ((f0) fVar).f17027s;
                            try {
                                ((f0) fVar).f17026r = l.k(true, aVar2, kVar2);
                                ((f0) fVar).f17027s = kVar3;
                                aVar.invoke();
                                ((f0) fVar).f17026r = kVar2;
                                ((f0) fVar).f17027s = kVar3;
                            } catch (Throwable th3) {
                                ((f0) fVar).f17026r = kVar2;
                                ((f0) fVar).f17027s = kVar3;
                                throw th3;
                            }
                        }
                    } else {
                        tVar3 = tVar;
                    }
                    if (fVar == null || (fVar instanceof b)) {
                        f0Var = new f0(fVar instanceof b ? (b) fVar : null, aVar2, null, true, false);
                    } else {
                        f0Var = fVar.u(aVar2);
                    }
                    try {
                        f fVarJ = f0Var.j();
                        try {
                            aVar.invoke();
                            f.q(fVarJ);
                            f0Var.c();
                        } catch (Throwable th4) {
                            try {
                                f.q(fVarJ);
                                throw th4;
                            } catch (Throwable th5) {
                                th = th5;
                                try {
                                    f0Var.c();
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                    eVarP.k(eVarP.C - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                eVarP.k(eVarP.C - 1);
                t tVar4 = tVar3;
                Object obj5 = tVar4.f17054b;
                kotlin.jvm.internal.m.b(obj5);
                int i14 = tVar4.f17056d;
                u.c0 c0Var4 = tVar4.f17055c;
                if (c0Var4 != null) {
                    try {
                        long[] jArr = c0Var4.f14831a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j13 = jArr[i15];
                                boolean z11 = z10;
                                u.c0 c0Var5 = c0Var4;
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                                    int i17 = 0;
                                    while (i17 < i16) {
                                        if ((j13 & 255) < 128) {
                                            i10 = i17;
                                            int i18 = (i15 << 3) + i10;
                                            j12 = j13;
                                            c0Var2 = c0Var5;
                                            Object obj6 = c0Var2.f14832b[i18];
                                            j11 = j9;
                                            try {
                                                boolean z12 = c0Var2.f14833c[i18] != i14 ? z11 : false;
                                                if (z12) {
                                                    tVar4.c(obj5, obj6);
                                                }
                                                if (z12) {
                                                    c0Var2.f(i18);
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                j10 = j11;
                                                synchronized (this.f17070g) {
                                                    this.f17072i = tVar2;
                                                    this.f17073j = j10;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i10 = i17;
                                            j12 = j13;
                                            c0Var2 = c0Var5;
                                            j11 = j9;
                                        }
                                        i17 = i10 + 1;
                                        long j14 = j11;
                                        c0Var5 = c0Var2;
                                        j13 = j12 >> 8;
                                        j9 = j14;
                                    }
                                    c0Var = c0Var5;
                                    j11 = j9;
                                    if (i16 != 8) {
                                        break;
                                    }
                                } else {
                                    c0Var = c0Var5;
                                    j11 = j9;
                                }
                                if (i15 == length) {
                                    break;
                                }
                                i15++;
                                c0Var4 = c0Var;
                                z10 = z11;
                                j9 = j11;
                            }
                        } else {
                            j11 = j9;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        j11 = j9;
                        j10 = j11;
                        synchronized (this.f17070g) {
                            this.f17072i = tVar2;
                            this.f17073j = j10;
                            throw th;
                        }
                    }
                } else {
                    j11 = j9;
                }
                tVar4.f17054b = obj4;
                tVar4.f17055c = c0Var3;
                tVar4.f17056d = i13;
                synchronized (this.f17070g) {
                    this.f17072i = tVar2;
                    this.f17073j = j11;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            j10 = j9;
        }
    }

    public final void e() {
        m3.a aVar = this.f17067d;
        l.e(l.f17036a);
        synchronized (l.f17038c) {
            l.f17043h = h00.q.Z0(aVar, (Collection) l.f17043h);
        }
        this.f17071h = new y8.g(aVar, 2);
    }
}
