package l7;

import androidx.media3.common.t;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tf.w;
import v7.r;

public final class m {

    public final w7.m f10094a;

    public final oj.q f10095b;

    public final int[] f10096c;

    public final int f10097d;

    public final g7.f f10098e;

    public final long f10099f;

    public final int f10100g;

    public final p f10101h;

    public final k[] f10102i;

    public r f10103j;

    public m7.c f10104k;
    public int l;
    public BehindLiveWindowException m;

    public boolean f10105n;

    public m(androidx.media3.common.q qVar, w7.m mVar, m7.c cVar, oj.q qVar2, int i10, int[] iArr, r rVar, int i11, g7.f fVar, long j9, int i12, boolean z10, ArrayList arrayList, p pVar) {
        a8.q hVar;
        t7.d dVar;
        ?? obj = new Object();
        obj.f10094a = mVar;
        obj.f10104k = cVar;
        obj.f10095b = qVar2;
        obj.f10096c = iArr;
        obj.f10103j = rVar;
        obj.f10097d = i11;
        obj.f10098e = fVar;
        obj.l = i10;
        obj.f10099f = j9;
        obj.f10100g = i12;
        obj.f10101h = pVar;
        long jC = cVar.c(i10);
        ArrayList arrayListA = obj.a();
        obj.f10102i = new k[rVar.length()];
        int i13 = 0;
        int i14 = 0;
        m mVar2 = obj;
        while (i14 < mVar2.f10102i.length) {
            m7.m mVar3 = (m7.m) arrayListA.get(rVar.j(i14));
            m7.b bVarT = qVar2.T(mVar3.B);
            k[] kVarArr = mVar2.f10102i;
            int i15 = i14;
            bVarT = bVarT == null ? (m7.b) mVar3.B.get(i13) : bVarT;
            t tVar = mVar3.A;
            qVar.getClass();
            String str = tVar.m;
            if (x0.l(str)) {
                if (qVar.B) {
                    hVar = new x8.g(((w) qVar.C).k(tVar), tVar);
                } else {
                    dVar = null;
                    arrayListA = arrayListA;
                    i15 = i15;
                }
                t7.d dVar2 = dVar;
                int i16 = i15;
                kVarArr[i16] = new k(jC, mVar3, bVarT, dVar2, 0L, mVar3.b());
                i14 = i16 + 1;
                mVar2 = this;
                arrayListA = arrayListA;
                i13 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    hVar = new s8.f((w) qVar.C, qVar.B ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new i8.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new e8.a(1);
                } else {
                    int i17 = z10 ? 4 : 0;
                    hVar = new u8.h((w) qVar.C, qVar.B ? i17 : i17 | 32, arrayList, pVar);
                }
                dVar = new t7.d(hVar, i11, tVar);
                t7.d dVar3 = dVar;
                int i18 = i15;
                kVarArr[i18] = new k(jC, mVar3, bVarT, dVar3, 0L, mVar3.b());
                i14 = i18 + 1;
                mVar2 = this;
                arrayListA = arrayListA;
                i13 = 0;
            }
            dVar = new t7.d(hVar, i11, tVar);
            t7.d dVar4 = dVar;
            int i19 = i15;
            kVarArr[i19] = new k(jC, mVar3, bVarT, dVar4, 0L, mVar3.b());
            i14 = i19 + 1;
            mVar2 = this;
            arrayListA = arrayListA;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f10104k.a(this.l).f10608c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f10096c) {
            arrayList.addAll(((m7.a) list.get(i10)).f10572c);
        }
        return arrayList;
    }

    public final k b(int i10) {
        k[] kVarArr = this.f10102i;
        k kVar = kVarArr[i10];
        m7.b bVarT = this.f10095b.T(((m7.m) kVar.f10091e).B);
        if (bVarT == null || bVarT.equals((m7.b) kVar.f10092f)) {
            return kVar;
        }
        k kVar2 = new k(kVar.f10088b, (m7.m) kVar.f10091e, bVarT, (t7.d) kVar.f10090d, kVar.f10089c, (j) kVar.f10093g);
        kVarArr[i10] = kVar2;
        return kVar2;
    }
}
