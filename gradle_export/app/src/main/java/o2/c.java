package o2;

import com.google.protobuf.RuntimeVersion;
import i2.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class c extends c0 {

    public float[] f11522b;

    public final ArrayList f11523c = new ArrayList();

    public boolean f11524d = true;

    public long f11525e = i2.t.f7167g;

    public List f11526f;

    public boolean f11527g;

    public i2.g f11528h;

    public u00.k f11529i;

    public final b3.a f11530j;

    public String f11531k;
    public float l;
    public float m;

    public float f11532n;

    public float f11533o;

    public float f11534p;

    public float f11535q;

    public float f11536r;

    public boolean f11537s;

    public c() {
        int i10 = g0.f11581a;
        this.f11526f = h00.x.A;
        this.f11527g = true;
        this.f11530j = new b3.a(this, 24);
        this.f11531k = RuntimeVersion.SUFFIX;
        this.f11533o = 1.0f;
        this.f11534p = 1.0f;
        this.f11537s = true;
    }

    @Override
    public final void a(k2.d dVar) throws NoWhenBranchMatchedException {
        if (this.f11537s) {
            float[] fArrA = this.f11522b;
            if (fArrA == null) {
                fArrA = i2.h0.a();
                this.f11522b = fArrA;
            } else {
                i2.h0.d(fArrA);
            }
            i2.h0.f(fArrA, this.f11535q + this.m, this.f11536r + this.f11532n);
            float f3 = this.l;
            if (fArrA.length >= 16) {
                double d3 = ((double) f3) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d3);
                float fCos = (float) Math.cos(d3);
                float f10 = fArrA[0];
                float f11 = fArrA[4];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = -fSin;
                float f14 = (f11 * fCos) + (f10 * f13);
                float f15 = fArrA[1];
                float f16 = fArrA[5];
                float f17 = (fSin * f16) + (fCos * f15);
                float f18 = (f16 * fCos) + (f15 * f13);
                float f19 = fArrA[2];
                float f20 = fArrA[6];
                float f21 = (fSin * f20) + (fCos * f19);
                float f22 = (f20 * fCos) + (f19 * f13);
                float f23 = fArrA[3];
                float f24 = fArrA[7];
                float f25 = (fSin * f24) + (fCos * f23);
                fArrA[0] = f12;
                fArrA[1] = f17;
                fArrA[2] = f21;
                fArrA[3] = f25;
                fArrA[4] = f14;
                fArrA[5] = f18;
                fArrA[6] = f22;
                fArrA[7] = (fCos * f24) + (f13 * f23);
            }
            float f26 = this.f11533o;
            float f27 = this.f11534p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f26;
                fArrA[1] = fArrA[1] * f26;
                fArrA[2] = fArrA[2] * f26;
                fArrA[3] = fArrA[3] * f26;
                fArrA[4] = fArrA[4] * f27;
                fArrA[5] = fArrA[5] * f27;
                fArrA[6] = fArrA[6] * f27;
                fArrA[7] = fArrA[7] * f27;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            i2.h0.f(fArrA, -this.m, -this.f11532n);
            this.f11537s = false;
        }
        if (this.f11527g) {
            if (!this.f11526f.isEmpty()) {
                i2.g gVarA = this.f11528h;
                if (gVarA == null) {
                    gVarA = i2.j.a();
                    this.f11528h = gVarA;
                }
                b.e(this.f11526f, gVarA);
            }
            this.f11527g = false;
        }
        a1.i iVarG0 = dVar.G0();
        long jQ = iVarG0.q();
        iVarG0.n().i();
        try {
            a1.i iVar = (a1.i) ((hf.c) iVarG0.B).B;
            float[] fArr = this.f11522b;
            if (fArr != null) {
                iVar.n().m(fArr);
            }
            i2.g gVar = this.f11528h;
            if (!this.f11526f.isEmpty() && gVar != null) {
                iVar.n().e(gVar);
            }
            ArrayList arrayList = this.f11523c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((c0) arrayList.get(i10)).a(dVar);
            }
        } finally {
            w.c.t(iVarG0, jQ);
        }
    }

    @Override
    public final u00.k b() {
        return this.f11529i;
    }

    @Override
    public final void d(b3.a aVar) {
        this.f11529i = aVar;
    }

    public final void e(int i10, c0 c0Var) {
        ArrayList arrayList = this.f11523c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f11530j);
        c();
    }

    public final void f(long j9) {
        if (this.f11524d && j9 != 16) {
            long j10 = this.f11525e;
            if (j10 == 16) {
                this.f11525e = j9;
                return;
            }
            int i10 = g0.f11581a;
            if (i2.t.h(j10) == i2.t.h(j9) && i2.t.g(j10) == i2.t.g(j9) && i2.t.e(j10) == i2.t.e(j9)) {
                return;
            }
            this.f11524d = false;
            this.f11525e = i2.t.f7167g;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof c) {
                c cVar = (c) c0Var;
                if (cVar.f11524d && this.f11524d) {
                    f(cVar.f11525e);
                    return;
                } else {
                    this.f11524d = false;
                    this.f11525e = i2.t.f7167g;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        i2.q qVar = hVar.f11582b;
        if (this.f11524d && qVar != null) {
            if (qVar instanceof v0) {
                f(((v0) qVar).f7174a);
            } else {
                this.f11524d = false;
                this.f11525e = i2.t.f7167g;
            }
        }
        i2.q qVar2 = hVar.f11587g;
        if (this.f11524d && qVar2 != null) {
            if (qVar2 instanceof v0) {
                f(((v0) qVar2).f7174a);
            } else {
                this.f11524d = false;
                this.f11525e = i2.t.f7167g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f11531k);
        ArrayList arrayList = this.f11523c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(c0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
