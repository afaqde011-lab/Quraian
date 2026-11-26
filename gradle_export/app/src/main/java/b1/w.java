package b1;

import a1.w2;
import a40.e1;
import android.view.textclassifier.TextClassifier;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.ListeningTimerModel;
import d0.s2;
import d0.u2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l1.z0;
import m3.q0;
import oo.g1;
import ri.t1;
import x.b1;

public final class w extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public long D;
    public Object E;
    public final Object F;

    public w(long j9, e1.q qVar, CharSequence charSequence, k00.c cVar) {
        super(2, cVar);
        this.A = 4;
        this.E = qVar;
        this.F = charSequence;
        this.D = j9;
    }

    public w(e0 e0Var, long j9, f0.i iVar, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = e0Var;
        this.D = j9;
        this.F = iVar;
    }

    public w(Object obj, long j9, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.F = obj;
        this.D = j9;
        this.C = obj2;
    }

    public w(Object obj, Object obj2, long j9, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
        this.F = obj2;
        this.D = j9;
        this.C = obj3;
    }

    public w(String str, br.i iVar, long j9, int i10, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.F = str;
        this.C = iVar;
        this.D = j9;
        this.B = i10;
    }

    public w(kotlin.jvm.internal.y yVar, kotlin.jvm.internal.y yVar2, l6.f fVar, long j9, k00.c cVar) {
        super(2, cVar);
        this.A = 6;
        this.E = yVar;
        this.F = yVar2;
        this.C = fVar;
        this.D = j9;
    }

    public w(l0.z zVar, x.y yVar, long j9, k00.c cVar) {
        super(2, cVar);
        this.A = 5;
        this.F = zVar;
        this.C = yVar;
        this.D = j9;
    }

    public w(vn.f fVar, String str, k00.c cVar) {
        super(2, cVar);
        this.A = 9;
        this.F = fVar;
        this.C = str;
    }

    public w(w0.g gVar, long j9, x0.f fVar, w0.f fVar2, k00.c cVar) {
        super(2, cVar);
        this.A = 10;
        this.E = gVar;
        this.D = j9;
        this.F = fVar;
        this.C = fVar2;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new w((e1.q) this.E, (CharSequence) this.F, this.D, (e0) this.C, cVar, 0);
            case 1:
                return new w((e0) this.C, this.D, (f0.i) this.F, cVar);
            case 2:
                w wVar = new w((String) this.F, (br.i) this.C, this.D, this.B, cVar);
                wVar.E = obj;
                return wVar;
            case 3:
                w wVar2 = new w((u2) this.F, this.D, (kotlin.jvm.internal.w) this.C, cVar, 3);
                wVar2.E = obj;
                return wVar2;
            case 4:
                w wVar3 = new w(this.D, (e1.q) this.E, (CharSequence) this.F, cVar);
                wVar3.C = obj;
                return wVar3;
            case 5:
                return new w((l0.z) this.F, (x.y) this.C, this.D, cVar);
            case 6:
                return new w((kotlin.jvm.internal.y) this.E, (kotlin.jvm.internal.y) this.F, (l6.f) this.C, this.D, cVar);
            case 7:
                return new w((g1) this.E, (ho.g) this.F, this.D, (g00.q) this.C, cVar, 7);
            case 8:
                return new w((z0) this.F, this.D, (f0.i) this.C, cVar, 8);
            case 9:
                return new w((vn.f) this.F, (String) this.C, cVar);
            case 10:
                return new w((w0.g) this.E, this.D, (x0.f) this.F, (w0.f) this.C, cVar);
            default:
                return new w((e1) this.F, this.D, (f0.i) this.C, cVar, 11);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((ListeningTimerModel) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((s2) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((TextClassifier) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        f0.k kVar;
        f0.k kVar2;
        boolean z10;
        x.y yVar;
        x.b bVar;
        y3.j jVar;
        cl.b bVar2;
        long j9;
        long jLongValue;
        Object obj2;
        lo.y yVar2;
        boolean z11;
        boolean zA;
        boolean zContains;
        String string;
        z0 z0Var;
        f0.k kVar3;
        f0.k kVar4;
        long jCurrentTimeMillis;
        Object objB;
        un.j jVar2;
        long j10;
        String str;
        un.j jVar3;
        long j11;
        long j12;
        f0.l lVar;
        int i10 = 3;
        Object objJ = null;
        int i11 = 2;
        switch (this.A) {
            case 0:
                long j13 = this.D;
                CharSequence charSequence = (CharSequence) this.F;
                e0 e0Var2 = (e0) this.C;
                w2 w2Var = e0Var2.f1940a;
                l00.a aVar = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    e1.q qVar = (e1.q) this.E;
                    this.B = 1;
                    qVar.getClass();
                    if (charSequence.length() != 0 && !q0.d(j13)) {
                        objJ = a40.c0.J(new a1.g(qVar, new e1.p(j13, qVar, charSequence, null), (k00.c) null), qVar.f4984a, this);
                    }
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objJ = obj;
                }
                q0 q0Var = (q0) objJ;
                if (!e0Var2.f1944e && q0Var != null) {
                    long j14 = q0Var.f10520a;
                    if (kotlin.jvm.internal.m.a(w2Var.d().C, charSequence) && q0.c(w2Var.d().D, j13) && !q0.c(j14, w2Var.d().D)) {
                        w2Var.j(j14);
                    }
                }
                return g00.b0.a;
            case 1:
                f0.i iVar = (f0.i) this.F;
                e0 e0Var3 = (e0) this.C;
                l00.a aVar2 = l00.a.A;
                int i13 = this.B;
                if (i13 != 0) {
                    if (i13 == 1) {
                        e0Var = (e0) this.E;
                        t1.O(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar2 = (f0.k) this.E;
                        t1.O(obj);
                    }
                    e0Var3.f1961x = kVar2;
                    return g00.b0.a;
                }
                t1.O(obj);
                f0.k kVar5 = e0Var3.f1961x;
                if (kVar5 != null) {
                    f0.j jVar4 = new f0.j(kVar5);
                    this.E = e0Var3;
                    this.B = 1;
                    if (iVar.a(jVar4, this) == aVar2) {
                        return aVar2;
                    }
                    e0Var = e0Var3;
                }
                kVar = new f0.k(this.D);
                this.E = kVar;
                this.B = 2;
                if (iVar.a(kVar, this) == aVar2) {
                    return aVar2;
                }
                kVar2 = kVar;
                e0Var3.f1961x = kVar2;
                return g00.b0.a;
                e0Var.f1961x = null;
                kVar = new f0.k(this.D);
                this.E = kVar;
                this.B = 2;
                if (iVar.a(kVar, this) == aVar2) {
                    return aVar2;
                }
                kVar2 = kVar;
                e0Var3.f1961x = kVar2;
                return g00.b0.a;
            case 2:
                ListeningTimerModel listeningTimerModel = (ListeningTimerModel) this.E;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (listeningTimerModel.getTodaysDate().compareTo((String) this.F) > 0) {
                    return listeningTimerModel;
                }
                br.i iVar2 = (br.i) this.C;
                Object obj3 = iVar2.c;
                int i14 = this.B;
                synchronized (obj3) {
                    z10 = i14 != iVar2.i;
                }
                if (z10) {
                    return listeningTimerModel;
                }
                long jA = ab.a0.A((kotlin.jvm.internal.m.a(listeningTimerModel.getTodaysDate(), (String) this.F) ? ab.a0.A(listeningTimerModel.getOverallPassedMs() > 0 ? listeningTimerModel.getOverallPassedMs() : listeningTimerModel.getOverallPassedSeconds() * 1000, 0L, 86400000L) : 0L) + this.D, 0L, 86400000L);
                ym.v builder = listeningTimerModel.toBuilder();
                builder.c((String) this.F);
                builder.a(jA);
                builder.b();
                ListeningTimerModel listeningTimerModelBuild = builder.build();
                kotlin.jvm.internal.m.b(listeningTimerModelBuild);
                return listeningTimerModelBuild;
            case 3:
                u2 u2Var = (u2) this.F;
                l00.a aVar4 = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    t1.O(obj);
                    s2 s2Var = (s2) this.E;
                    float fG = u2Var.g(this.D);
                    n nVar = new n((kotlin.jvm.internal.w) this.C, u2Var, s2Var, i11);
                    this.B = 1;
                    if (x.c.f(0.0f, fG, null, nVar, this, 12) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    t1.O(obj);
                    TextClassifier textClassifier = (TextClassifier) this.C;
                    e1.q qVar2 = (e1.q) this.E;
                    CharSequence charSequence2 = (CharSequence) this.F;
                    long j15 = this.D;
                    this.B = 1;
                    if (e1.q.a(qVar2, charSequence2, j15, textClassifier, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                long j16 = this.D;
                x.y yVar3 = (x.y) this.C;
                l0.z zVar = (l0.z) this.F;
                x.b bVar3 = zVar.f9820o;
                l00.a aVar6 = l00.a.A;
                int i17 = this.B;
                try {
                    if (i17 != 0) {
                        if (i17 == 1) {
                            yVar3 = (x.y) this.E;
                            t1.O(obj);
                        } else {
                            if (i17 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1.O(obj);
                        }
                        int i18 = l0.z.f9807t;
                        zVar.f(false);
                        zVar.f9814g = false;
                        return g00.b0.a;
                    }
                    t1.O(obj);
                    if (bVar3.e()) {
                        yVar3 = yVar3 instanceof b1 ? (b1) yVar3 : l0.a0.f9712a;
                    }
                    if (!bVar3.e()) {
                        y3.j jVar5 = new y3.j(j16);
                        this.E = yVar3;
                        this.B = 1;
                        if (bVar3.f(jVar5, this) == aVar6) {
                            return aVar6;
                        }
                    }
                    long jC = y3.j.c(((y3.j) bVar3.d()).f16590a, j16);
                    yVar = yVar3;
                    bVar = zVar.f9820o;
                    jVar = new y3.j(jC);
                    bVar2 = new cl.b(zVar, jC, 3);
                    this.E = null;
                    this.B = 2;
                    if (x.b.c(bVar, jVar, yVar, bVar2, this, 4) == aVar6) {
                        return aVar6;
                    }
                    int i19 = l0.z.f9807t;
                    zVar.f(false);
                    zVar.f9814g = false;
                    return g00.b0.a;
                    zVar.f9810c.invoke();
                    long jC2 = y3.j.c(((y3.j) bVar3.d()).f16590a, j16);
                    yVar = yVar3;
                    bVar = zVar.f9820o;
                    jVar = new y3.j(jC2);
                    bVar2 = new cl.b(zVar, jC2, 3);
                    this.E = null;
                    this.B = 2;
                    if (x.b.c(bVar, jVar, yVar, bVar2, this, 4) == aVar6) {
                        return aVar6;
                    }
                    int i110 = l0.z.f9807t;
                    zVar.f(false);
                    zVar.f9814g = false;
                    break;
                } catch (CancellationException unused) {
                }
                return g00.b0.a;
            case 6:
                l6.f fVar = (l6.f) this.C;
                l00.a aVar7 = l00.a.A;
                int i20 = this.B;
                if (i20 == 0) {
                    t1.O(obj);
                    long j17 = ((kotlin.jvm.internal.y) this.E).A;
                    long j18 = ((kotlin.jvm.internal.y) this.F).A;
                    if (j17 >= j18) {
                        this.B = 1;
                        if (a40.c0.M(this) == aVar7) {
                            return aVar7;
                        }
                        j9 = this.D;
                        ((ce.c) fVar.C.C).u(new gj.h(j9, i10));
                        synchronized (fVar.D) {
                            fVar.F = j9;
                        }
                    } else {
                        this.B = 2;
                        if (a40.c0.l((j18 - j17) / 1000000, this) == aVar7) {
                            return aVar7;
                        }
                        jLongValue = ((Number) fVar.B.invoke()).longValue();
                        ((ce.c) fVar.C.C).u(new gj.h(jLongValue, i10));
                        synchronized (fVar.D) {
                            fVar.F = jLongValue;
                        }
                    }
                } else if (i20 == 1) {
                    t1.O(obj);
                    j9 = this.D;
                    ((ce.c) fVar.C.C).u(new gj.h(j9, i10));
                    synchronized (fVar.D) {
                        fVar.F = j9;
                    }
                } else {
                    if (i20 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    jLongValue = ((Number) fVar.B.invoke()).longValue();
                    ((ce.c) fVar.C.C).u(new gj.h(jLongValue, i10));
                    synchronized (fVar.D) {
                        fVar.F = jLongValue;
                    }
                }
                return g00.b0.a;
            case 7:
                g1 g1Var = (g1) this.E;
                l00.a aVar8 = l00.a.A;
                int i21 = this.B;
                if (i21 == 0) {
                    t1.O(obj);
                    jo.b bVar4 = g1Var.k;
                    ho.g gVar = (ho.g) this.F;
                    this.B = 1;
                    Object objA = bVar4.a(gVar, this);
                    if (objA == aVar8) {
                        return aVar8;
                    }
                    obj2 = objA;
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    obj2 = ((g00.n) obj).A;
                }
                long j19 = this.D;
                g00.q qVar3 = (g00.q) this.C;
                if (g00.n.a(obj2) == null) {
                    ho.r rVar = (ho.r) obj2;
                    ko.n nVar2 = g1Var.l;
                    String str2 = (String) qVar3.B;
                    kotlin.jvm.internal.m.e(rVar, "transcript");
                    kotlin.jvm.internal.m.e(str2, "language");
                    nVar2.getClass();
                    List<ho.s> list = rVar.a;
                    ArrayList<ho.s> arrayList = new ArrayList();
                    for (ho.s sVar : list) {
                        List list2 = sVar.e;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list2) {
                            long j20 = j19;
                            if (((ho.t) obj4).b < j20) {
                                arrayList2.add(obj4);
                            }
                            j19 = j20;
                        }
                        long j21 = j19;
                        ho.s sVar2 = arrayList2.isEmpty() ? null : new ho.s(sVar.a, sVar.b, sVar.c, sVar.d, arrayList2);
                        if (sVar2 != null) {
                            arrayList.add(sVar2);
                        }
                        j19 = j21;
                    }
                    Iterator it = arrayList.iterator();
                    int size = 0;
                    while (it.hasNext()) {
                        size += ((ho.s) it.next()).e.size();
                    }
                    Iterator it2 = list.iterator();
                    int size2 = 0;
                    while (it2.hasNext()) {
                        size2 += ((ho.s) it2.next()).e.size();
                    }
                    boolean z12 = size < size2;
                    if (arrayList.isEmpty()) {
                        z11 = true;
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z11 = true;
                            } else if (((ho.s) it3.next()).a == null) {
                                z11 = false;
                            }
                        }
                    }
                    ArrayList<List> arrayList3 = new ArrayList();
                    for (ho.s sVar3 : arrayList) {
                        List list3 = (List) h00.q.U0(arrayList3);
                        ho.s sVar4 = list3 != null ? (ho.s) h00.q.U0(list3) : null;
                        if (sVar4 == null) {
                            zA = false;
                        } else if (z11) {
                            zA = kotlin.jvm.internal.m.a(sVar4.a, sVar3.a);
                        } else if (sVar4.b.equals(sVar3.b)) {
                            if (list3.size() >= 4) {
                                ho.t tVar = (ho.t) h00.q.U0(sVar4.e);
                                if (tVar == null || (string = r30.k.j1(tVar.a).toString()) == null) {
                                    zContains = true;
                                } else {
                                    Character chValueOf = string.length() == 0 ? null : Character.valueOf(string.charAt(string.length() - 1));
                                    if (chValueOf != null) {
                                        zContains = ko.o.a.contains(chValueOf);
                                    } else {
                                        zContains = true;
                                    }
                                }
                                if (zContains) {
                                    zA = false;
                                }
                            }
                            zA = true;
                        } else {
                            zA = false;
                        }
                        if (!zA || list3 == null) {
                            arrayList3.add(va.a.W(sVar3));
                        } else {
                            list3.add(sVar3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList3, 10));
                    for (List list4 : arrayList3) {
                        ArrayList<ho.t> arrayList5 = new ArrayList();
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            h00.v.u0(((ho.s) it4.next()).e, arrayList5);
                        }
                        long j22 = ((ho.s) h00.q.L0(list4)).c;
                        ArrayList arrayList6 = new ArrayList(h00.r.q0(arrayList5, 10));
                        for (ho.t tVar2 : arrayList5) {
                            arrayList6.add(new lo.a0(tVar2.a, tVar2.b));
                        }
                        arrayList4.add(new lo.v(j22, g4.d0(arrayList6)));
                    }
                    yVar2 = new lo.y(new lo.u(g4.d0(arrayList4), z12, str2.equals("ar")));
                } else {
                    g1Var.C = null;
                    yVar2 = lo.w.a;
                }
                g1Var.i(oo.z0.a((oo.z0) ((vm.a) g1Var).c.d.getValue(), (lo.e) null, 0, (String) null, false, (Long) null, 0.0f, (ru.d) null, (u30.b) null, false, false, false, false, (u30.b) null, false, false, (String) null, false, false, false, yVar2, false, false, false, (lo.i) null, false, 66060287));
                return g00.b0.a;
            case 8:
                f0.i iVar3 = (f0.i) this.C;
                z0 z0Var2 = (z0) this.F;
                l00.a aVar9 = l00.a.A;
                int i22 = this.B;
                if (i22 != 0) {
                    if (i22 == 1) {
                        z0Var = (z0) this.E;
                        t1.O(obj);
                    } else {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar4 = (f0.k) this.E;
                        t1.O(obj);
                    }
                    kVar3 = kVar4;
                    z0Var2.setValue(kVar3);
                    return g00.b0.a;
                }
                t1.O(obj);
                f0.k kVar6 = (f0.k) z0Var2.getValue();
                if (kVar6 != null) {
                    f0.j jVar6 = new f0.j(kVar6);
                    if (iVar3 != null) {
                        this.E = z0Var2;
                        this.B = 1;
                        if (iVar3.a(jVar6, this) == aVar9) {
                            return aVar9;
                        }
                    }
                    z0Var = z0Var2;
                } else {
                    kVar3 = new f0.k(this.D);
                    if (iVar3 != null) {
                        this.E = kVar3;
                        this.B = 2;
                        if (iVar3.a(kVar3, this) == aVar9) {
                            return aVar9;
                        }
                        kVar4 = kVar3;
                        kVar3 = kVar4;
                    }
                }
                z0Var2.setValue(kVar3);
                return g00.b0.a;
                z0Var.setValue(null);
                kVar3 = new f0.k(this.D);
                if (iVar3 != null) {
                    this.E = kVar3;
                    this.B = 2;
                    if (iVar3.a(kVar3, this) == aVar9) {
                        return aVar9;
                    }
                    kVar4 = kVar3;
                    kVar3 = kVar4;
                }
                z0Var2.setValue(kVar3);
                return g00.b0.a;
            case 9:
                g00.m mVarS = g00.b0.a;
                String str3 = (String) this.C;
                vn.f fVar2 = (vn.f) this.F;
                l00.a aVar10 = l00.a.A;
                int i23 = this.B;
                try {
                    if (i23 != 0) {
                        if (i23 == 1) {
                            jCurrentTimeMillis = this.D;
                            t1.O(obj);
                            objB = obj;
                        } else if (i23 == 2) {
                            j10 = this.D;
                            jVar2 = (un.j) this.E;
                            t1.O(obj);
                            str = (String) this.C;
                            this.E = null;
                            this.D = j10;
                            this.B = 3;
                            jVar3 = jVar2;
                            j11 = j10;
                            if (vn.f.a(fVar2, jVar3, str, j11, this) == aVar10) {
                                return aVar10;
                            }
                            j12 = j11;
                        } else {
                            if (i23 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j12 = this.D;
                            t1.O(obj);
                        }
                        fVar2.i.put(str3, new Long(j12));
                        return new g00.n(mVarS);
                    }
                    t1.O(obj);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    this.D = jCurrentTimeMillis;
                    this.B = 1;
                    objB = vn.f.b(fVar2, str3, this);
                    if (objB == aVar10) {
                        return aVar10;
                    }
                    long j23 = jCurrentTimeMillis;
                    un.j jVar7 = (un.j) objB;
                    wn.d dVar = fVar2.b;
                    String str4 = (String) this.C;
                    ArrayList arrayListX = fVar2.d.X(jVar7);
                    this.E = jVar7;
                    this.D = j23;
                    this.B = 2;
                    Object objUpdateData = dVar.a.updateData(new wn.c(str4, dVar, arrayListX, j23, (k00.c) null), this);
                    if (objUpdateData != aVar10) {
                        objUpdateData = mVarS;
                    }
                    if (objUpdateData == aVar10) {
                        return aVar10;
                    }
                    jVar2 = jVar7;
                    j10 = j23;
                    str = (String) this.C;
                    this.E = null;
                    this.D = j10;
                    this.B = 3;
                    jVar3 = jVar2;
                    j11 = j10;
                    if (vn.f.a(fVar2, jVar3, str, j11, this) == aVar10) {
                        return aVar10;
                    }
                    j12 = j11;
                    fVar2.i.put(str3, new Long(j12));
                    return new g00.n(mVarS);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e10) {
                    mVarS = t1.s(e10);
                }
                break;
            case 10:
                l00.a aVar11 = l00.a.A;
                int i24 = this.B;
                if (i24 != 0) {
                    if (i24 == 1) {
                        t1.O(obj);
                    } else {
                        if (i24 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                u00.n nVar3 = ((w0.g) this.E).Q;
                if (nVar3 != null) {
                    h2.b bVar5 = new h2.b(this.D);
                    this.B = 1;
                    if (nVar3.invoke(bVar5, this) == aVar11) {
                        return aVar11;
                    }
                }
                x0.f fVar3 = (x0.f) this.F;
                w0.f fVar4 = (w0.f) this.C;
                this.B = 2;
                if (fVar3.a(fVar4, this) == aVar11) {
                    return aVar11;
                }
                return g00.b0.a;
            default:
                f0.i iVar4 = (f0.i) this.C;
                l00.a aVar12 = l00.a.A;
                int i25 = this.B;
                if (i25 != 0) {
                    if (i25 == 1) {
                        t1.O(obj);
                    } else if (i25 == 2) {
                        lVar = (f0.l) this.E;
                        t1.O(obj);
                        this.E = null;
                        this.B = 3;
                        if (iVar4.a(lVar, this) == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (i25 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                e1 e1Var = (e1) this.F;
                this.B = 1;
                if (e1Var.F(this) == aVar12) {
                    return aVar12;
                }
                f0.k kVar7 = new f0.k(this.D);
                f0.l lVar2 = new f0.l(kVar7);
                this.E = lVar2;
                this.B = 2;
                if (iVar4.a(kVar7, this) == aVar12) {
                    return aVar12;
                }
                lVar = lVar2;
                this.E = null;
                this.B = 3;
                if (iVar4.a(lVar, this) == aVar12) {
                    return aVar12;
                }
                return g00.b0.a;
        }
    }
}
