package m3;

import android.app.RemoteAction;
import android.graphics.RectF;
import android.view.textclassifier.TextClassification;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import e1.v0;
import g1.a3;
import g1.l1;
import g1.z6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k9.b3;
import kotlin.KotlinNothingValueException;
import q0.f2;
import q0.g2;
import q0.r1;

public final class a implements u00.n {
    public final int A;
    public final Object B;

    public a(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public a(Object obj, int i10, int i11) {
        this.A = i11;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        boolean zH;
        Object next;
        String str;
        g00.k kVar;
        String str2;
        boolean z10;
        Object next2;
        y1.f fVar;
        Object obj3;
        Object objY0;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj4 = this.B;
        switch (i10) {
            case 0:
                h2.c cVarE = i2.b0.E((RectF) obj);
                h2.c cVarE2 = i2.b0.E((RectF) obj2);
                switch (((b3) obj4).A) {
                    case 15:
                        zH = cVarE.h(cVarE2);
                        break;
                    default:
                        zH = cVarE2.a(cVarE.c());
                        break;
                }
                return Boolean.valueOf(zH);
            case 1:
                ((Integer) obj2).getClass();
                mu.m.b((ju.f) obj4, (l1.j) obj, l1.q.K(49));
                return b0Var;
            case 2:
                ((Integer) obj2).getClass();
                mu.d.z((u30.b) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 3:
                ((Integer) obj2).getClass();
                nx.a.b((ReciterLauncher) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 4:
                ((nz.n) obj4).j(new nz.f(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                return b0Var;
            case 5:
                ((Integer) obj2).getClass();
                ((oo.c0) obj4).j((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 6:
                ((Integer) obj2).getClass();
                pn.a.b((qn.a) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 7:
                lo.r rVar = (lo.r) obj4;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6.b(rVar.b, null, dl.a.n, kh.o.z(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, jVar, 24576, 0, 262122);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 8:
                g1.b3 b3Var = (g1.b3) obj4;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l1 l1Var = l1.f5852a;
                    long j9 = dl.a.M;
                    long j10 = dl.a.i;
                    long j11 = dl.a.l;
                    a3.b(b3Var, null, null, l1.b(j9, j10, j10, j10, j10, j10, j10, j10, j11, j10, j11, j10, j10, j10, jVar2, 31814784), pp.c.c, null, false, null, jVar2, 12607488);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 9:
                ((Integer) obj2).getClass();
                q0.q.n((v0) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 10:
                ((r1) obj4).e(((h2.b) obj2).f6544a);
                return b0Var;
            case 11:
                ((Integer) obj2).getClass();
                ((g2) obj4).a((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 12:
                q9.h hVar = (q9.h) obj4;
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    hVar.f12794b.a(jVar3, 0);
                } else {
                    g0Var3.V();
                }
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                qo.z.f((lo.e) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 14:
                ((Integer) obj2).getClass();
                qt.a.a((ot.e) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.m.e(charSequence, "$this$DelimitedRangesSequence");
                int iK0 = r30.k.K0(charSequence, (char[]) obj4, iIntValue4, false);
                if (iK0 < 0) {
                    return null;
                }
                return new g00.k(Integer.valueOf(iK0), 1);
            case 16:
                List list = (List) obj4;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.m.e(charSequence2, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    String str3 = (String) h00.q.c1(list);
                    int iJ0 = r30.k.J0(charSequence2, str3, iIntValue5, false, 4);
                    if (iJ0 < 0) {
                        kVar = null;
                    } else {
                        kVar = new g00.k(Integer.valueOf(iJ0), str3);
                    }
                } else {
                    int i11 = iIntValue5 >= 0 ? iIntValue5 : 0;
                    z00.e eVar = new z00.e(i11, charSequence2.length(), 1);
                    boolean z11 = charSequence2 instanceof String;
                    boolean z12 = false;
                    int i12 = ((z00.c) eVar).C;
                    int i13 = ((z00.c) eVar).B;
                    if (z11) {
                        if ((i12 <= 0 || i11 > i13) && (i12 >= 0 || i13 > i11)) {
                            kVar = null;
                        } else {
                            int i14 = i11;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str4 = (String) next2;
                                        z10 = z12;
                                        if (!r30.r.s0(0, i14, str4.length(), str4, (String) charSequence2, z10)) {
                                            z12 = z10;
                                        }
                                    } else {
                                        z10 = z12;
                                        next2 = null;
                                    }
                                }
                                String str5 = (String) next2;
                                if (str5 != null) {
                                    kVar = new g00.k(Integer.valueOf(i14), str5);
                                } else if (i14 != i13) {
                                    i14 += i12;
                                    z12 = z10;
                                } else {
                                    kVar = null;
                                }
                            }
                        }
                    } else if ((i12 <= 0 || i11 > i13) && (i12 >= 0 || i13 > i11)) {
                        kVar = null;
                    } else {
                        int i15 = i11;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    kVar = new g00.k(Integer.valueOf(i15), str);
                                } else if (i15 != i13) {
                                    i15 += i12;
                                } else {
                                    kVar = null;
                                }
                            } while (!r30.k.Q0(str2, 0, charSequence2, i15, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                kVar = new g00.k(Integer.valueOf(i15), str);
                            } else if (i15 != i13) {
                                i15 += i12;
                            } else {
                                kVar = null;
                            }
                        }
                    }
                }
                if (kVar != null) {
                    return new g00.k(kVar.A, Integer.valueOf(((String) kVar.B).length()));
                }
                return null;
            case 17:
                q9.c cVar = (q9.c) obj4;
                l1.j jVar4 = (l1.j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar4;
                if (g0Var4.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    cVar.b().invoke(jVar4, 0);
                } else {
                    g0Var4.V();
                }
                return b0Var;
            case TYPE_SINT64_VALUE:
                tm.i iVar = (tm.i) obj4;
                v2.s sVar = (v2.s) obj;
                kotlin.jvm.internal.m.e(sVar, "change");
                ta.c0.M(iVar.a, null, null, null, new rm.c(iVar, sVar, (k00.c) null, 10), 31);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((Integer) obj2).getClass();
                l1.g0 g0Var5 = (l1.g0) ((l1.j) obj);
                g0Var5.c0(666084174);
                String str6 = ((t0.d) obj4).f14314b;
                g0Var5.r(false);
                return str6;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((Integer) obj2).intValue();
                l1.g0 g0Var6 = (l1.g0) ((l1.j) obj);
                g0Var6.c0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj4).getLabel());
                g0Var6.r(false);
                return strValueOf;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((Integer) obj2).intValue();
                l1.g0 g0Var7 = (l1.g0) ((l1.j) obj);
                g0Var7.c0(-1376593684);
                String string = ((RemoteAction) obj4).getTitle().toString();
                g0Var7.r(false);
                return string;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((Integer) obj2).getClass();
                ((x.g0) obj4).a((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 23:
                y1.b bVar = (y1.b) obj;
                List list2 = (List) ((u00.n) obj4).invoke(bVar, obj2);
                int size = list2.size();
                for (int i16 = 0; i16 < size; i16++) {
                    Object obj5 = list2.get(i16);
                    if (obj5 != null && (fVar = bVar.B) != null && !fVar.a(obj5)) {
                        throw new IllegalArgumentException(("item at index " + i16 + " can't be saved: " + obj5).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 24:
                z1.u uVar = (z1.u) obj4;
                Set set = (Set) obj;
                AtomicReference atomicReference = uVar.f17065b;
                do {
                    obj3 = atomicReference.get();
                    if (obj3 == null) {
                        objY0 = set;
                    } else if (obj3 instanceof Set) {
                        objY0 = va.a.S(obj3, set);
                    } else {
                        if (!(obj3 instanceof List)) {
                            l1.l.b("Unexpected notification");
                            throw new KotlinNothingValueException();
                        }
                        objY0 = h00.q.Y0(va.a.R(set), (Collection) obj3);
                    }
                } while (!atomicReference.compareAndSet(obj3, objY0));
                if (uVar.c()) {
                    uVar.f17064a.invoke(new f2(uVar, 24));
                }
                return b0Var;
            default:
                ((Integer) obj2).getClass();
                ze.d.b((DeleteAccountCodeLauncher) obj4, (l1.j) obj, l1.q.K(1));
                return b0Var;
        }
    }
}
