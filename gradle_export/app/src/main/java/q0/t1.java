package q0;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import g1.a5;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class t1 implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public t1(int i10, Object obj, Object obj2, u00.k kVar) {
        this.A = i10;
        this.B = obj;
        this.D = obj2;
        this.C = kVar;
    }

    public t1(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        m3.n0 n0Var;
        m3.n0 n0Var2;
        e2 e2Var;
        e2 e2Var2;
        m3.n0 n0Var3;
        m3.n0 n0Var4;
        e2 e2Var3;
        e2 e2Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        r3.w wVar;
        h7.b bVar;
        r3.w wVar2;
        int i10 = this.A;
        int i11 = 3;
        int i12 = 20;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.D;
        Object obj3 = this.C;
        Object obj4 = this.B;
        switch (i10) {
            case 0:
                u00.k kVar = (u00.k) obj3;
                r3.b0 b0Var2 = (r3.b0) ((kotlin.jvm.internal.z) obj2).A;
                r3.w wVarD = ((q3.e0) obj4).d((List) obj);
                if (b0Var2 != null) {
                    b0Var2.a(null, wVarD);
                }
                kVar.invoke(wVarD);
                return b0Var;
            case 1:
                v1 v1Var = (v1) obj3;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj2;
                e1.n0 n0Var5 = (e1.n0) obj;
                switch (((e1) obj4).ordinal()) {
                    case 0:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (m3.q0.d(n0Var5.f4980f)) {
                                n0Var5.i();
                            } else if (n0Var5.f()) {
                                int iG = m3.q0.g(n0Var5.f4980f);
                                n0Var5.q(iG, iG);
                            } else {
                                int iF = m3.q0.f(n0Var5.f4980f);
                                n0Var5.q(iF, iF);
                            }
                        }
                        return b0Var;
                    case 1:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (m3.q0.d(n0Var5.f4980f)) {
                                n0Var5.m();
                            } else if (n0Var5.f()) {
                                int iF2 = m3.q0.f(n0Var5.f4980f);
                                n0Var5.q(iF2, iF2);
                            } else {
                                int iG2 = m3.q0.g(n0Var5.f4980f);
                                n0Var5.q(iG2, iG2);
                            }
                        }
                        return b0Var;
                    case 2:
                        e1.z0 z0Var = n0Var5.f4979e;
                        z0Var.f5042a = null;
                        m3.h hVar = n0Var5.f4981g;
                        String str = hVar.B;
                        String str2 = hVar.B;
                        if (str.length() > 0) {
                            if (n0Var5.f()) {
                                z0Var.f5042a = null;
                                if (str2.length() > 0 && (numD = n0Var5.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    n0Var5.q(iIntValue, iIntValue);
                                }
                            } else {
                                z0Var.f5042a = null;
                                if (str2.length() > 0 && (numE = n0Var5.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    n0Var5.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return b0Var;
                    case 3:
                        e1.z0 z0Var2 = n0Var5.f4979e;
                        z0Var2.f5042a = null;
                        m3.h hVar2 = n0Var5.f4981g;
                        String str3 = hVar2.B;
                        String str4 = hVar2.B;
                        if (str3.length() > 0) {
                            if (n0Var5.f()) {
                                z0Var2.f5042a = null;
                                if (str4.length() > 0 && (numE2 = n0Var5.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    n0Var5.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                z0Var2.f5042a = null;
                                if (str4.length() > 0 && (numD2 = n0Var5.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    n0Var5.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return b0Var;
                    case 4:
                        n0Var5.j();
                        return b0Var;
                    case 5:
                        n0Var5.l();
                        return b0Var;
                    case 6:
                        n0Var5.o();
                        return b0Var;
                    case 7:
                        n0Var5.n();
                        return b0Var;
                    case 8:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (n0Var5.f()) {
                                n0Var5.o();
                            } else {
                                n0Var5.n();
                            }
                        }
                        return b0Var;
                    case 9:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (n0Var5.f()) {
                                n0Var5.n();
                            } else {
                                n0Var5.o();
                            }
                        }
                        return b0Var;
                    case 10:
                        if (n0Var5.f4981g.B.length() > 0 && (n0Var = n0Var5.f4977c) != null) {
                            int iG3 = n0Var5.g(n0Var, -1);
                            n0Var5.q(iG3, iG3);
                        }
                        return b0Var;
                    case 11:
                        if (n0Var5.f4981g.B.length() > 0 && (n0Var2 = n0Var5.f4977c) != null) {
                            int iG4 = n0Var5.g(n0Var2, 1);
                            n0Var5.q(iG4, iG4);
                        }
                        return b0Var;
                    case 12:
                    case 48:
                        return b0Var;
                    case 13:
                        if (n0Var5.f4981g.B.length() > 0 && (e2Var = n0Var5.f4983i) != null) {
                            int iH = n0Var5.h(e2Var, -1);
                            n0Var5.q(iH, iH);
                        }
                        return b0Var;
                    case 14:
                        if (n0Var5.f4981g.B.length() > 0 && (e2Var2 = n0Var5.f4983i) != null) {
                            int iH2 = n0Var5.h(e2Var2, 1);
                            n0Var5.q(iH2, iH2);
                        }
                        return b0Var;
                    case 15:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            n0Var5.q(0, 0);
                        }
                        return b0Var;
                    case 16:
                        n0Var5.f4979e.f5042a = null;
                        m3.h hVar3 = n0Var5.f4981g;
                        if (hVar3.B.length() > 0) {
                            int length = hVar3.B.length();
                            n0Var5.q(length, length);
                        }
                        return b0Var;
                    case 17:
                        v1Var.f12704b.d(false);
                        return b0Var;
                    case TYPE_SINT64_VALUE:
                        v1Var.f12704b.p();
                        return b0Var;
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        v1Var.f12704b.f();
                        return b0Var;
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        List listA = n0Var5.a(new pp.d(6));
                        if (listA != null) {
                            v1Var.a(listA);
                        }
                        return b0Var;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        List listA2 = n0Var5.a(new pp.d(7));
                        if (listA2 != null) {
                            v1Var.a(listA2);
                        }
                        return b0Var;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        List listA3 = n0Var5.a(new pp.d(8));
                        if (listA3 != null) {
                            v1Var.a(listA3);
                        }
                        return b0Var;
                    case 23:
                        List listA4 = n0Var5.a(new pp.d(9));
                        if (listA4 != null) {
                            v1Var.a(listA4);
                        }
                        return b0Var;
                    case 24:
                        List listA5 = n0Var5.a(new pp.d(10));
                        if (listA5 != null) {
                            v1Var.a(listA5);
                        }
                        return b0Var;
                    case 25:
                        List listA6 = n0Var5.a(new pp.d(11));
                        if (listA6 != null) {
                            v1Var.a(listA6);
                        }
                        return b0Var;
                    case RuntimeVersion.MINOR:
                        n0Var5.f4979e.f5042a = null;
                        m3.h hVar4 = n0Var5.f4981g;
                        if (hVar4.B.length() > 0) {
                            n0Var5.q(0, hVar4.B.length());
                        }
                        return b0Var;
                    case 27:
                        n0Var5.i();
                        n0Var5.p();
                        return b0Var;
                    case 28:
                        n0Var5.m();
                        n0Var5.p();
                        return b0Var;
                    case 29:
                        if (n0Var5.f4981g.B.length() > 0 && (n0Var3 = n0Var5.f4977c) != null) {
                            int iG5 = n0Var5.g(n0Var3, -1);
                            n0Var5.q(iG5, iG5);
                        }
                        n0Var5.p();
                        return b0Var;
                    case 30:
                        if (n0Var5.f4981g.B.length() > 0 && (n0Var4 = n0Var5.f4977c) != null) {
                            int iG6 = n0Var5.g(n0Var4, 1);
                            n0Var5.q(iG6, iG6);
                        }
                        n0Var5.p();
                        return b0Var;
                    case 31:
                        if (n0Var5.f4981g.B.length() > 0 && (e2Var3 = n0Var5.f4983i) != null) {
                            int iH3 = n0Var5.h(e2Var3, -1);
                            n0Var5.q(iH3, iH3);
                        }
                        n0Var5.p();
                        return b0Var;
                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                        if (n0Var5.f4981g.B.length() > 0 && (e2Var4 = n0Var5.f4983i) != null) {
                            int iH4 = n0Var5.h(e2Var4, 1);
                            n0Var5.q(iH4, iH4);
                        }
                        n0Var5.p();
                        return b0Var;
                    case 33:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            n0Var5.q(0, 0);
                        }
                        n0Var5.p();
                        return b0Var;
                    case 34:
                        n0Var5.f4979e.f5042a = null;
                        m3.h hVar5 = n0Var5.f4981g;
                        if (hVar5.B.length() > 0) {
                            int length2 = hVar5.B.length();
                            n0Var5.q(length2, length2);
                        }
                        n0Var5.p();
                        return b0Var;
                    case 35:
                        e1.z0 z0Var3 = n0Var5.f4979e;
                        z0Var3.f5042a = null;
                        m3.h hVar6 = n0Var5.f4981g;
                        String str5 = hVar6.B;
                        String str6 = hVar6.B;
                        if (str5.length() > 0) {
                            if (n0Var5.f()) {
                                z0Var3.f5042a = null;
                                if (str6.length() > 0 && (numE3 = n0Var5.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    n0Var5.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                z0Var3.f5042a = null;
                                if (str6.length() > 0 && (numD3 = n0Var5.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    n0Var5.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        n0Var5.p();
                        return b0Var;
                    case 36:
                        e1.z0 z0Var4 = n0Var5.f4979e;
                        z0Var4.f5042a = null;
                        m3.h hVar7 = n0Var5.f4981g;
                        String str7 = hVar7.B;
                        String str8 = hVar7.B;
                        if (str7.length() > 0) {
                            if (n0Var5.f()) {
                                z0Var4.f5042a = null;
                                if (str8.length() > 0 && (numD4 = n0Var5.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    n0Var5.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                z0Var4.f5042a = null;
                                if (str8.length() > 0 && (numE4 = n0Var5.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    n0Var5.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        n0Var5.p();
                        return b0Var;
                    case 37:
                        n0Var5.j();
                        n0Var5.p();
                        return b0Var;
                    case 38:
                        n0Var5.l();
                        n0Var5.p();
                        return b0Var;
                    case 39:
                        n0Var5.o();
                        n0Var5.p();
                        return b0Var;
                    case 40:
                        n0Var5.n();
                        n0Var5.p();
                        return b0Var;
                    case 41:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (n0Var5.f()) {
                                n0Var5.o();
                            } else {
                                n0Var5.n();
                            }
                        }
                        n0Var5.p();
                        return b0Var;
                    case 42:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            if (n0Var5.f()) {
                                n0Var5.n();
                            } else {
                                n0Var5.o();
                            }
                        }
                        n0Var5.p();
                        return b0Var;
                    case 43:
                        n0Var5.f4979e.f5042a = null;
                        if (n0Var5.f4981g.B.length() > 0) {
                            long j9 = n0Var5.f4980f;
                            int i13 = m3.q0.f10519c;
                            int i14 = (int) (j9 & 4294967295L);
                            n0Var5.q(i14, i14);
                        }
                        return b0Var;
                    case 44:
                        if (v1Var.f12707e) {
                            vVar.A = v1Var.f12703a.f12659x.B.f12653r.b(v1Var.l);
                        } else {
                            v1Var.a(va.a.R(new r3.a("\n", 1)));
                        }
                        return b0Var;
                    case 45:
                        if (v1Var.f12707e) {
                            vVar.A = false;
                        } else {
                            v1Var.a(va.a.R(new r3.a("\t", 1)));
                        }
                        return b0Var;
                    case 46:
                        i2 i2Var = v1Var.f12710h;
                        if (i2Var != null) {
                            i2Var.a(r3.w.b(n0Var5.f4982h, n0Var5.f4981g, n0Var5.f4980f, 4));
                        }
                        i2 i2Var2 = v1Var.f12710h;
                        if (i2Var2 != null) {
                            h7.b bVar2 = i2Var2.f12631a;
                            if (bVar2 == null || (bVar = (h7.b) bVar2.A) == null) {
                                wVar = null;
                            } else {
                                i2Var2.f12631a = bVar;
                                i2Var2.f12633c -= ((r3.w) bVar2.B).f13099a.B.length();
                                i2Var2.f12632b = new h7.b(i2Var2.f12632b, (r3.w) bVar2.B);
                                wVar = (r3.w) bVar.B;
                            }
                            if (wVar != null) {
                                v1Var.f12713k.invoke(wVar);
                            }
                        }
                        return b0Var;
                    case 47:
                        i2 i2Var3 = v1Var.f12710h;
                        if (i2Var3 != null) {
                            h7.b bVar3 = i2Var3.f12632b;
                            if (bVar3 != null) {
                                i2Var3.f12632b = (h7.b) bVar3.A;
                                r3.w wVar3 = (r3.w) bVar3.B;
                                i2Var3.f12631a = new h7.b(i2Var3.f12631a, wVar3);
                                i2Var3.f12633c = wVar3.f13099a.B.length() + i2Var3.f12633c;
                                wVar2 = (r3.w) bVar3.B;
                            } else {
                                wVar2 = null;
                            }
                            if (wVar2 != null) {
                                v1Var.f12713k.invoke(wVar2);
                            }
                        }
                        return b0Var;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 2:
                j0.h hVar8 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar8, "$this$LazyColumn");
                List list = ((ot.t) obj4).a;
                hVar8.r(list.size(), new w0(new pp.d(27), list, 4), new as.r0(20, list), new v1.c(new az.o(list, (qt.j) obj2, (u00.k) obj3, 7), 802480018, true));
                return b0Var;
            case 3:
                androidx.lifecycle.w wVar4 = (androidx.lifecycle.w) obj4;
                kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                lu.v vVar2 = new lu.v((r6.c) obj2, zVar, (u00.k) obj3, 1);
                wVar4.getLifecycle().a(vVar2);
                return new gv.k(wVar4, vVar2, zVar, 3);
            case 4:
                l1.e1 e1Var = (l1.e1) obj2;
                kotlin.jvm.internal.m.e((tm.e) obj, "$this$DampedDragAnimation");
                ((l1.z0) obj3).setValue(Boolean.FALSE);
                e1Var.i(((Boolean) ((u00.a) obj4).invoke()).booleanValue() ? 1.0f : 0.0f);
                return b0Var;
            case 5:
                t9.d dVar = (t9.d) obj4;
                t9.a aVar = (t9.a) obj3;
                s9.c cVar = (s9.c) obj2;
                if (dVar.f14424e == null) {
                    dVar.f14424e = aVar;
                    s9.c.a(cVar, aVar);
                    return new bt.z0(aVar, dVar, 11);
                }
                throw new IllegalArgumentException(("NavigationEventState '" + dVar + "' is already registered with a NavigationEventHandler '" + aVar + "'.").toString());
            case 6:
                Context context = (Context) obj3;
                t0.g gVar = (t0.g) obj2;
                c0.d dVar2 = (c0.d) obj;
                ?? r4 = ((t0.c) obj4).f14313a;
                int size = r4.size();
                for (int i15 = 0; i15 < size; i15++) {
                    t0.b bVar4 = (t0.b) r4.get(i15);
                    if (bVar4 instanceof t0.d) {
                        t0.d dVar3 = (t0.d) bVar4;
                        c0.d.b(dVar2, new m3.a(dVar3, 19), dVar3.f14315c == 0 ? null : new v1.c(new a5(dVar3, 2), -1930700965, true), new l6.c(dVar3, gVar, 24), 6);
                    } else if (bVar4 instanceof t0.h) {
                        t0.h hVar9 = (t0.h) bVar4;
                        if (context != null) {
                            int i16 = hVar9.f14324c;
                            TextClassification textClassification = hVar9.f14323b;
                            if (i16 < 0) {
                                m3.a aVar2 = new m3.a(textClassification, i12);
                                Drawable icon = textClassification.getIcon();
                                c0.d.b(dVar2, aVar2, icon != null ? new v1.c(new a5(icon, i11), -1123224187, true) : null, new l6.c(context, textClassification, 25), 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i16);
                                c0.d.b(dVar2, new m3.a(remoteAction, 21), ((i16 == 0) || remoteAction.shouldShowIcon()) ? new v1.c(new a5(remoteAction, 4), -1261173016, true) : null, new f2(remoteAction, 10), 6);
                            }
                        }
                    } else if (bVar4 instanceof t0.f) {
                        dVar2.f2582a.add(c0.b.f2576b);
                    }
                }
                return b0Var;
            default:
                y1.d dVar4 = (y1.d) obj4;
                y1.i iVar = (y1.i) obj2;
                u.i0 i0Var = dVar4.B;
                if (i0Var.b(obj3)) {
                    throw new IllegalArgumentException(x5.l(obj3, "Key ", " was used multiple times ").toString());
                }
                dVar4.A.remove(obj3);
                i0Var.m(obj3, iVar);
                return new gv.k(dVar4, obj3, iVar, 6);
        }
    }
}
