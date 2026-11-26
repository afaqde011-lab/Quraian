package m3;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import i2.v0;
import java.util.ArrayList;
import java.util.List;
import k9.b3;
import kotlin.NoWhenBranchMatchedException;

public final class q {

    public final ce.c f10510a;

    public final int f10511b;

    public final boolean f10512c;

    public final float f10513d;

    public final float f10514e;

    public final int f10515f;

    public final ArrayList f10516g;

    public final ArrayList f10517h;

    public q(ce.c cVar, long j9, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int iG;
        int i14;
        this.f10510a = cVar;
        this.f10511b = i10;
        if (y3.a.j(j9) != 0 || y3.a.i(j9) != 0) {
            s3.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) cVar.F;
        int size = arrayList2.size();
        float f3 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= size) {
                i12 = 0;
                z10 = false;
                break;
            }
            t tVar = (t) arrayList2.get(i15);
            u3.c cVar2 = tVar.f10533a;
            int iH = y3.a.h(j9);
            if (y3.a.c(j9)) {
                i13 = i15;
                iG = y3.a.g(j9) - ((int) Math.ceil(f3));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i13 = i15;
                iG = y3.a.g(j9);
            }
            i12 = 0;
            b bVar = new b(cVar2, this.f10511b - i16, i11, y3.b.b(0, iH, 0, iG, 5));
            float fB = bVar.b() + f3;
            n3.i iVar = bVar.f10416d;
            int i17 = i16 + iVar.f11044g;
            arrayList.add(new s(bVar, tVar.f10534b, tVar.f10535c, i16, i17, f3, fB));
            if (!iVar.f11041d) {
                if (i17 == this.f10511b) {
                    i14 = i13;
                    if (i14 != va.a.M((ArrayList) this.f10510a.F)) {
                    }
                } else {
                    i14 = i13;
                }
                i15 = i14 + 1;
                i16 = i17;
                f3 = fB;
            }
            z10 = true;
            i16 = i17;
            f3 = fB;
            break;
        }
        this.f10514e = f3;
        this.f10515f = i16;
        this.f10512c = z10;
        this.f10517h = arrayList;
        this.f10513d = y3.a.h(j9);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i18 = i12; i18 < size2; i18++) {
            s sVar = (s) arrayList.get(i18);
            ?? r10 = sVar.f10525a.f10418f;
            ArrayList arrayList4 = new ArrayList(r10.size());
            int size3 = r10.size();
            for (int i19 = i12; i19 < size3; i19++) {
                h2.c cVar3 = (h2.c) r10.get(i19);
                arrayList4.add(cVar3 != null ? sVar.a(cVar3) : null);
            }
            h00.v.u0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f10510a.C).size()) {
            int size4 = ((List) this.f10510a.C).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i20 = i12; i20 < size4; i20++) {
                arrayList5.add(null);
            }
            arrayList3 = h00.q.Y0(arrayList5, arrayList3);
        }
        this.f10516g = arrayList3;
    }

    public final void a(float[] fArr, long j9) {
        k(q0.g(j9));
        l(q0.f(j9));
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.A = 0;
        h0.g(this.f10517h, j9, new e00.q(j9, fArr, xVar, new kotlin.jvm.internal.w()));
    }

    public final float b(int i10) {
        m(i10);
        ArrayList arrayList = this.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        return bVar.f10416d.e(i10 - sVar.f10528d) + sVar.f10530f;
    }

    public final int c(int i10, boolean z10) {
        int iF;
        m(i10);
        ArrayList arrayList = this.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        int i11 = i10 - sVar.f10528d;
        n3.i iVar = bVar.f10416d;
        if (z10) {
            Layout layout = iVar.f11043f;
            ThreadLocal threadLocal = n3.j.f11053a;
            if (layout.getEllipsisCount(i11) <= 0 || iVar.f11039b != TextUtils.TruncateAt.END) {
                ce.c cVarC = iVar.c();
                Layout layout2 = (Layout) cVarC.B;
                iF = cVarC.A(layout2.getLineEnd(i11), layout2.getLineStart(i11));
            } else {
                iF = layout.getEllipsisStart(i11) + layout.getLineStart(i11);
            }
        } else {
            iF = iVar.f(i11);
        }
        return iF + sVar.f10526b;
    }

    public final int d(int i10) {
        int iD;
        int length = ((h) this.f10510a.B).B.length();
        ArrayList arrayList = this.f10517h;
        if (i10 >= length) {
            iD = va.a.M(arrayList);
        } else {
            iD = i10 < 0 ? 0 : h0.d(i10, arrayList);
        }
        s sVar = (s) arrayList.get(iD);
        return sVar.f10525a.f10416d.f11043f.getLineForOffset(sVar.d(i10)) + sVar.f10528d;
    }

    public final int e(float f3) {
        ArrayList arrayList = this.f10517h;
        s sVar = (s) arrayList.get(h0.f(arrayList, f3));
        int i10 = sVar.f10527c - sVar.f10526b;
        int i11 = sVar.f10528d;
        if (i10 == 0) {
            return i11;
        }
        b bVar = sVar.f10525a;
        float f10 = f3 - sVar.f10530f;
        n3.i iVar = bVar.f10416d;
        return iVar.f11043f.getLineForVertical(((int) f10) - iVar.f11045h) + i11;
    }

    public final float f(int i10) {
        m(i10);
        ArrayList arrayList = this.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        return bVar.f10416d.g(i10 - sVar.f10528d) + sVar.f10530f;
    }

    public final int g(long j9) {
        int i10 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        ArrayList arrayList = this.f10517h;
        s sVar = (s) arrayList.get(h0.f(arrayList, fIntBitsToFloat));
        int i11 = sVar.f10527c;
        int i12 = sVar.f10526b;
        if (i11 - i12 == 0) {
            return i12;
        }
        b bVar = sVar.f10525a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i10) - sVar.f10530f)) & 4294967295L);
        n3.i iVar = bVar.f10416d;
        int lineForVertical = iVar.f11043f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - iVar.f11045h);
        return iVar.f11043f.getOffsetForHorizontal(lineForVertical, (iVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i12;
    }

    public final long h(h2.c cVar, int i10, b3 b3Var) {
        long jB;
        long j9;
        float f3 = cVar.f6547b;
        ArrayList arrayList = this.f10517h;
        int iF = h0.f(arrayList, f3);
        float f10 = ((s) arrayList.get(iF)).f10531g;
        float f11 = cVar.f6549d;
        if (f10 >= f11 || iF == va.a.M(arrayList)) {
            s sVar = (s) arrayList.get(iF);
            return sVar.b(true, sVar.f10525a.c(sVar.c(cVar), i10, b3Var));
        }
        int iF2 = h0.f(arrayList, f11);
        long jB2 = q0.f10518b;
        while (true) {
            jB = q0.f10518b;
            if (!q0.c(jB2, jB) || iF > iF2) {
                break;
            }
            s sVar2 = (s) arrayList.get(iF);
            jB2 = sVar2.b(true, sVar2.f10525a.c(sVar2.c(cVar), i10, b3Var));
            iF++;
        }
        if (q0.c(jB2, jB)) {
            return jB;
        }
        while (true) {
            j9 = q0.f10518b;
            if (!q0.c(jB, j9) || iF > iF2) {
                break;
            }
            s sVar3 = (s) arrayList.get(iF2);
            jB = sVar3.b(true, sVar3.f10525a.c(sVar3.c(cVar), i10, b3Var));
            iF2--;
        }
        return q0.c(jB, j9) ? jB2 : h0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(i2.s sVar, long j9, i2.s0 s0Var, x3.l lVar, k2.e eVar) {
        sVar.i();
        ArrayList arrayList = this.f10517h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar2 = (s) arrayList.get(i10);
            sVar2.f10525a.f(sVar, j9, s0Var, lVar, eVar);
            sVar.p(0.0f, sVar2.f10525a.b());
        }
        sVar.q();
    }

    public final void j(i2.s sVar, i2.q qVar, float f3, i2.s0 s0Var, x3.l lVar, k2.e eVar) throws NoWhenBranchMatchedException {
        sVar.i();
        ArrayList arrayList = this.f10517h;
        if (arrayList.size() <= 1 || (qVar instanceof v0)) {
            u3.i.b(this, sVar, qVar, f3, s0Var, lVar, eVar);
        } else {
            if (!(qVar instanceof i2.r0)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                s sVar2 = (s) arrayList.get(i10);
                fB += sVar2.f10525a.b();
                fMax = Math.max(fMax, sVar2.f10525a.d());
            }
            Shader shaderB = ((i2.r0) qVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = ((s) arrayList.get(i11)).f10525a;
                bVar.g(sVar, new i2.r(shaderB), f3, s0Var, lVar, eVar);
                sVar.p(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        sVar.q();
    }

    public final void k(int i10) {
        boolean z10 = false;
        ce.c cVar = this.f10510a;
        if (i10 >= 0 && i10 < ((h) cVar.B).B.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbQ = oi.k.q("offset(", i10, ") is out of bounds [0, ");
        sbQ.append(((h) cVar.B).B.length());
        sbQ.append(')');
        s3.a.a(sbQ.toString());
    }

    public final void l(int i10) {
        boolean z10 = false;
        ce.c cVar = this.f10510a;
        if (i10 >= 0 && i10 <= ((h) cVar.B).B.length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbQ = oi.k.q("offset(", i10, ") is out of bounds [0, ");
        sbQ.append(((h) cVar.B).B.length());
        sbQ.append(']');
        s3.a.a(sbQ.toString());
    }

    public final void m(int i10) {
        boolean z10 = false;
        int i11 = this.f10515f;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        s3.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }
}
