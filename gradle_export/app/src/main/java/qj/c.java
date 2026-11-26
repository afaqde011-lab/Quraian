package qj;

import a30.e;
import a5.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import ba.p0;
import ba.p1;
import ba.q0;
import c4.b0;
import ca.e0;
import ca.l;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.n;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import d0.y1;
import d10.f0;
import d10.l0;
import d10.l1;
import d10.o0;
import d40.o;
import e7.i0;
import e7.u;
import fh.r1;
import g1.c3;
import g9.g;
import i2.t;
import j10.h0;
import j10.m;
import j10.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.KotlinNothingValueException;
import m10.a0;
import m10.i;
import m10.j0;
import m10.k0;
import m10.r0;
import m10.w;
import m10.y;
import nf.m1;
import r3.p;
import ri.t1;
import ta.c0;
import u.f;
import w1.d;
import x.b1;
import x8.j;
import x8.k;
import z4.j1;
import z4.r;

public class c implements e, p1, q, b0, d, com.google.android.gms.common.internal.e, m, qd.c, e0.b, z4.e, zd.b, r, fg.b, r1, p, n0, k {
    public static volatile c C;
    public final int A;
    public Object B;

    public c(int i10) {
        this.A = 13;
        this.B = o.c(new int[i10]);
    }

    public c(int i10, byte b7) {
        this.A = i10;
        switch (i10) {
            case 1:
                break;
            case 3:
                this.B = new h(this);
                break;
            case 5:
                this.B = new AtomicReference(null);
                break;
            case 7:
                this.B = new LinkedHashSet();
                break;
            case 9:
                this.B = rd.a.J(bd.e.A);
                break;
            case 12:
                w1.c cVar = new w1.c();
                this.B = cVar;
                if (!cVar.B) {
                    if (cVar.C) {
                        x1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.C = true;
                    break;
                }
                break;
            case 14:
                new f(null);
                this.B = new HashMap();
                break;
            case 28:
                this.B = new u();
                break;
            default:
                this.B = new HashSet();
                break;
        }
    }

    public c(n nVar, re.a aVar, int i10) {
        this.A = i10;
        this.B = aVar;
    }

    public c(l1 l1Var) {
        this.A = 17;
        kotlin.jvm.internal.m.e(l1Var, "container");
        this.B = l1Var;
    }

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public c(String str) {
        this.A = 25;
        Parcel parcelObtain = Parcel.obtain();
        this.B = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public Object A(k0 k0Var, Object obj) {
        return y(k0Var, obj);
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        eg.f fVar = (eg.f) this.B;
        eg.e eVar = fVar.N;
        if (eVar != null) {
            fVar.G.Y.remove(eVar);
        }
        eg.e eVar2 = new eg.e(fVar.J, j1Var);
        fVar.N = eVar2;
        eVar2.e(fVar.getWindow());
        BottomSheetBehavior bottomSheetBehavior = fVar.G;
        eg.e eVar3 = fVar.N;
        ArrayList arrayList = bottomSheetBehavior.Y;
        if (!arrayList.contains(eVar3)) {
            arrayList.add(eVar3);
        }
        return j1Var;
    }

    public Object C(r0 r0Var, Object obj) {
        return null;
    }

    @Override
    public void D(byte[] bArr, int i10, int i11, j jVar, e7.h hVar) {
        d7.b bVarA;
        u uVar = (u) this.B;
        uVar.L(i11 + i10, bArr);
        uVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (uVar.a() > 0) {
            c0.r("Incomplete Mp4Webvtt Top Level box header found.", uVar.a() >= 8);
            int iM = uVar.m();
            if (uVar.m() == 1987343459) {
                int i12 = iM - 8;
                CharSequence charSequenceF = null;
                d7.a aVarA = null;
                while (i12 > 0) {
                    c0.r("Incomplete vtt cue box header found.", i12 >= 8);
                    int iM2 = uVar.m();
                    int iM3 = uVar.m();
                    int i13 = iM2 - 8;
                    byte[] bArr2 = uVar.f5182a;
                    int i14 = uVar.f5183b;
                    String str = i0.f5136a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    uVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (iM3 == 1937011815) {
                        g gVar = new g();
                        g9.h.e(str2, gVar);
                        aVarA = gVar.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = g9.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = RuntimeVersion.SUFFIX;
                }
                if (aVarA != null) {
                    aVarA.f4723a = charSequenceF;
                    aVarA.f4724b = null;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = g9.h.f6282a;
                    g gVar2 = new g();
                    gVar2.f6273c = charSequenceF;
                    bVarA = gVar2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                uVar.O(iM - 8);
            }
        }
        hVar.accept(new x8.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public Object E(w wVar, Object obj) {
        return null;
    }

    @Override
    public void F() {
        ((NestedScrollView) this.B).D.abortAnimation();
    }

    public void G(int i10, a5.g gVar, String str, Bundle bundle) {
    }

    public void H(e0 e0Var, m00.c cVar) throws KotlinNothingValueException {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i10 = lVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.C = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.A;
        l00.a aVar = l00.a.A;
        int i11 = lVar.C;
        if (i11 != 0) {
            if (i11 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        d40.p1 p1Var = (d40.p1) this.B;
        lVar.C = 1;
        p1Var.collect(e0Var, lVar);
    }

    public a5.g I(int i10) {
        return null;
    }

    public long J() {
        int i10 = t.f7168h;
        long j9 = ((Parcel) this.B).readLong();
        long j10 = 63 & j9;
        return j10 < 16 ? j9 : (j9 & (-64)) | (j10 + 1);
    }

    public long K() {
        long j9;
        Parcel parcel = (Parcel) this.B;
        byte b7 = parcel.readByte();
        if (b7 == 1) {
            j9 = 4294967296L;
        } else {
            j9 = b7 == 2 ? 8589934592L : 0L;
        }
        return y3.p.a(j9, 0L) ? y3.o.f16599c : kh.o.F(parcel.readFloat(), j9);
    }

    public a5.g L(int i10) {
        return null;
    }

    public cd.b M(rc.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "amplitude");
        return (cd.b) ((g00.p) this.B).getValue();
    }

    public void N(Set set) {
        Object value;
        int[] iArr;
        kotlin.jvm.internal.m.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        d40.p1 p1Var = (d40.p1) this.B;
        do {
            value = p1Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = set.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!p1Var.i(value, iArr));
    }

    public boolean O(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.A) {
            case 10:
                bf.b bVar = new bf.b((xf.g) obj2);
                m1 m1Var = (m1) ((nf.l1) obj).getService();
                cf.r rVar = (cf.r) this.B;
                m1Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(m1Var.f11247f);
                int i10 = nf.l.f11236a;
                parcelObtain.writeStrongBinder(bVar);
                parcelObtain.writeInt(1);
                rVar.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    m1Var.f11246e.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            default:
                hf.a aVar = new hf.a(0, (xf.g) obj2);
                hf.k kVar = (hf.k) ((hf.j) obj).getService();
                ke.h hVar = (ke.h) this.B;
                Parcel parcelD = kVar.d();
                int i11 = hf.h.f7055a;
                parcelD.writeStrongBinder(aVar);
                hf.h.c(parcelD, hVar);
                kVar.f(2, parcelD);
                return;
        }
    }

    public a30.d b(n20.b bVar) {
        a30.d dVarB;
        kotlin.jvm.internal.m.e(bVar, "classId");
        for (b30.c cVar : j10.w.i((h0) this.B, bVar.a)) {
            if ((cVar instanceof b30.c) && (dVarB = cVar.J.b(bVar)) != null) {
                return dVarB;
            }
        }
        return null;
    }

    @Override
    public Object c(Object obj, Object obj2) {
        return ((eh.k) this.B).apply(obj2);
    }

    @Override
    public boolean d(float f3) {
        if (f3 == 0.0f) {
            return false;
        }
        F();
        ((NestedScrollView) this.B).j((int) f3);
        return true;
    }

    public Object e(m10.c0 c0Var, Object obj) {
        return null;
    }

    @Override
    public long f(y3.k kVar, long j9, y3.m mVar, long j10) {
        long j11 = ((y3.j) ((u00.a) this.B).invoke()).f16590a;
        int iA = c0.b.a(kVar.f16592a + ((int) (j11 >> 32)), (int) (j10 >> 32), (int) (j9 >> 32), mVar == y3.m.A);
        return (((long) c0.b.a(kVar.f16593b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j9 & 4294967295L), true)) & 4294967295L) | (((long) iA) << 32);
    }

    @Override
    public int g(View view) {
        return (view.getTop() - ((q0) view.getLayoutParams()).f2393b.top) - ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).topMargin;
    }

    public Object get() {
        String packageName = ((Context) ((f00.a) this.B).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public Object h(m10.h hVar, Object obj) {
        return null;
    }

    public Object i(m10.i0 i0Var, Object obj) throws a40.b0 {
        int i10;
        l1 l1Var = (l1) this.B;
        kotlin.jvm.internal.m.e(i0Var, "descriptor");
        List listB0 = i0Var.b0();
        kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
        if (listB0.isEmpty()) {
            i10 = (i0Var.U != null ? 1 : 0) + (i0Var.V != null ? 1 : 0);
        } else {
            i10 = -1;
        }
        if (i0Var.G) {
            if (i10 == -1) {
                return new d10.t(l1Var, i0Var);
            }
            if (i10 == 0) {
                return new d10.n(l1Var, i0Var);
            }
            if (i10 == 1) {
                return new d10.p(l1Var, i0Var);
            }
            if (i10 == 2) {
                return new d10.r(l1Var, i0Var);
            }
        } else {
            if (i10 == -1) {
                return new o0(l1Var, i0Var);
            }
            if (i10 == 0) {
                return new f0(l1Var, i0Var);
            }
            if (i10 == 1) {
                return new d10.i0(l1Var, i0Var);
            }
            if (i10 == 2) {
                return new l0(l1Var, i0Var);
            }
        }
        throw new a40.b0("Unsupported property: " + i0Var);
    }

    @Override
    public int j() {
        return ((p0) this.B).F();
    }

    @Override
    public int k(int i10) {
        c3 c3Var = (c3) this.B;
        if (i10 <= c3Var.A - 1) {
            return i10;
        }
        if (i10 <= c3Var.B - 1) {
            return i10 - 1;
        }
        int i11 = c3Var.C;
        return i10 <= i11 + 1 ? i10 - 2 : i11;
    }

    @Override
    public Object l(y1 y1Var, Float f3, Float f10, u00.k kVar, e0.g gVar) {
        float fFloatValue = f3.floatValue();
        float fFloatValue2 = f10.floatValue();
        Object objB = e0.l.b(y1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, x.c.b(0.0f, fFloatValue2, 28), (b1) this.B, kVar, gVar);
        return objB == l00.a.A ? objB : (e0.a) objB;
    }

    public Object n(i iVar, Object obj) {
        return y(iVar, obj);
    }

    public Object o(Object obj, a0 a0Var) {
        return null;
    }

    @Override
    public void onBillingServiceDisconnected() {
    }

    @Override
    public void onBillingSetupFinished(qd.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "result");
        if (hVar.f12892a == 0) {
            MainActivity mainActivity = (MainActivity) this.B;
            int i10 = MainActivity.R;
            mainActivity.j();
        }
    }

    @Override
    public int p() {
        return 2;
    }

    public Object q(j0 j0Var, Object obj) {
        return y(j0Var, obj);
    }

    @Override
    public int r() {
        p0 p0Var = (p0) this.B;
        return p0Var.f2389o - p0Var.C();
    }

    public Object s(m10.f fVar, Object obj) {
        return null;
    }

    @Override
    public float t() {
        return -((NestedScrollView) this.B).getVerticalScrollFactorCompat();
    }

    public String toString() {
        switch (this.A) {
            case 27:
                StringBuilder sb2 = new StringBuilder();
                b20.p pVar = (b20.p) this.B;
                sb2.append(pVar);
                sb2.append(": ");
                sb2.append(((Map) ze.d.A(pVar.J, b20.p.N[0])).keySet());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public Object u(m10.u uVar, Object obj) {
        return null;
    }

    public Object v(y yVar, Object obj) {
        return null;
    }

    @Override
    public View w(int i10) {
        return ((p0) this.B).u(i10);
    }

    @Override
    public int x(View view) {
        return view.getBottom() + ((q0) view.getLayoutParams()).f2393b.bottom + ((ViewGroup.MarginLayoutParams) ((q0) view.getLayoutParams())).bottomMargin;
    }

    public Object y(j10.u uVar, Object obj) {
        return new d10.l((l1) this.B, uVar);
    }

    @Override
    public int z(int i10) {
        c3 c3Var = (c3) this.B;
        if (i10 < c3Var.A) {
            return i10;
        }
        if (i10 < c3Var.B) {
            return i10 + 1;
        }
        int i11 = c3Var.C;
        return i10 <= i11 ? i10 + 2 : i11 + 2;
    }
}
