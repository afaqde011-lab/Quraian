package o2;

import android.graphics.Bitmap;
import com.google.protobuf.RuntimeVersion;
import l1.i1;

public final class e0 extends c0 {

    public final c f11560b;

    public String f11561c;

    public boolean f11562d;

    public final a f11563e;

    public kotlin.jvm.internal.n f11564f;

    public final i1 f11565g;

    public i2.m f11566h;

    public final i1 f11567i;

    public long f11568j;

    public float f11569k;
    public float l;
    public final d0 m;

    public e0(c cVar) {
        this.f11560b = cVar;
        cVar.f11529i = new d0(this, 0);
        this.f11561c = RuntimeVersion.SUFFIX;
        this.f11562d = true;
        this.f11563e = new a();
        this.f11564f = g.C;
        this.f11565g = l1.q.z(null);
        this.f11567i = l1.q.z(new h2.e(0L));
        this.f11568j = 9205357640488583168L;
        this.f11569k = 1.0f;
        this.l = 1.0f;
        this.m = new d0(this, 1);
    }

    @Override
    public final void a(k2.d dVar) {
        e(dVar, 1.0f, null);
    }

    public final void e(k2.d dVar, float f3, i2.m mVar) {
        int i10;
        i2.m mVar2;
        i2.d dVarF;
        char c10;
        long j9;
        long jB;
        i2.m mVar3;
        int i11;
        int i12;
        c cVar = this.f11560b;
        boolean z10 = cVar.f11524d;
        i1 i1Var = this.f11565g;
        if (!z10 || cVar.f11525e == 16) {
            i10 = 0;
        } else {
            i2.m mVar4 = (i2.m) i1Var.getValue();
            int i13 = g0.f11581a;
            if (!(mVar4 instanceof i2.m) ? mVar4 == null : (i12 = mVar4.f7146c) == 5 || i12 == 3) {
                i10 = 0;
            } else if (!(mVar instanceof i2.m) ? mVar == null : (i11 = mVar.f7146c) == 5 || i11 == 3) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        boolean z11 = this.f11562d;
        a aVar = this.f11563e;
        if (z11 || !h2.e.a(this.f11568j, dVar.b())) {
            if (i10 == 1) {
                jB = cVar.f11525e;
                int i14 = g0.f11581a;
                if (i2.t.d(jB) != 1.0f) {
                    jB = i2.t.b(1.0f, jB);
                }
                mVar2 = new i2.m(jB, 5);
            } else {
                mVar2 = null;
            }
            this.f11566h = mVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
            i1 i1Var2 = this.f11567i;
            this.f11569k = fIntBitsToFloat / Float.intBitsToFloat((int) (((h2.e) i1Var2.getValue()).f6558a >> 32));
            this.l = Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((h2.e) i1Var2.getValue()).f6558a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() & 4294967295L))))) & 4294967295L);
            y3.m layoutDirection = dVar.getLayoutDirection();
            dVarF = aVar.f11512a;
            i2.a aVarA = aVar.f11513b;
            if (dVarF != null || aVarA == null) {
                c10 = ' ';
                j9 = 4294967295L;
            } else {
                int i15 = (int) (jCeil >> 32);
                Bitmap bitmap = dVarF.f7117a;
                c10 = ' ';
                j9 = 4294967295L;
                if (i15 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || aVar.f11515d != i10) {
                }
                aVar.f11514c = jCeil;
                k2.b bVar = aVar.f11516e;
                long jM0 = kh.n.m0(jCeil);
                k2.a aVar2 = bVar.A;
                y3.c cVar2 = aVar2.f8916a;
                y3.m mVar5 = aVar2.f8917b;
                i2.s sVar = aVar2.f8918c;
                i2.a aVar3 = aVarA;
                long j10 = aVar2.f8919d;
                aVar2.f8916a = dVar;
                aVar2.f8917b = layoutDirection;
                aVar2.f8918c = aVar3;
                aVar2.f8919d = jM0;
                aVar3.i();
                k2.d.R(bVar, i2.t.f7162b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.invoke(bVar);
                aVar3.q();
                k2.a aVar4 = bVar.A;
                aVar4.f8916a = cVar2;
                aVar4.f8917b = mVar5;
                aVar4.f8918c = sVar;
                aVar4.f8919d = j10;
                dVarF.f7117a.prepareToDraw();
                this.f11562d = false;
                this.f11568j = dVar.b();
            }
            dVarF = i2.b0.f((int) (jCeil >> c10), (int) (jCeil & j9), i10);
            aVarA = i2.b0.a(dVarF);
            aVar.f11512a = dVarF;
            aVar.f11513b = aVarA;
            aVar.f11515d = i10;
            aVar.f11514c = jCeil;
            k2.b bVar2 = aVar.f11516e;
            long jM1 = kh.n.m0(jCeil);
            k2.a aVar5 = bVar2.A;
            y3.c cVar3 = aVar5.f8916a;
            y3.m mVar6 = aVar5.f8917b;
            i2.s sVar2 = aVar5.f8918c;
            i2.a aVar6 = aVarA;
            long j11 = aVar5.f8919d;
            aVar5.f8916a = dVar;
            aVar5.f8917b = layoutDirection;
            aVar5.f8918c = aVar6;
            aVar5.f8919d = jM1;
            aVar6.i();
            k2.d.R(bVar2, i2.t.f7162b, 0L, 0L, 0.0f, null, 0, 62);
            this.m.invoke(bVar2);
            aVar6.q();
            k2.a aVar7 = bVar2.A;
            aVar7.f8916a = cVar3;
            aVar7.f8917b = mVar6;
            aVar7.f8918c = sVar2;
            aVar7.f8919d = j11;
            dVarF.f7117a.prepareToDraw();
            this.f11562d = false;
            this.f11568j = dVar.b();
        } else {
            i2.d dVar2 = aVar.f11512a;
            if (i10 != (dVar2 != null ? dVar2.a() : 0)) {
                if (i10 == 1) {
                    jB = cVar.f11525e;
                    int i16 = g0.f11581a;
                    if (i2.t.d(jB) != 1.0f) {
                        jB = i2.t.b(1.0f, jB);
                    }
                    mVar2 = new i2.m(jB, 5);
                } else {
                    mVar2 = null;
                }
                this.f11566h = mVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.b() >> 32));
                i1 i1Var3 = this.f11567i;
                this.f11569k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((h2.e) i1Var3.getValue()).f6558a >> 32));
                this.l = Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((h2.e) i1Var3.getValue()).f6558a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (dVar.b() & 4294967295L))))) & 4294967295L);
                y3.m layoutDirection2 = dVar.getLayoutDirection();
                dVarF = aVar.f11512a;
                i2.a aVarA2 = aVar.f11513b;
                if (dVarF != null) {
                    c10 = ' ';
                    j9 = 4294967295L;
                    dVarF = i2.b0.f((int) (jCeil2 >> c10), (int) (jCeil2 & j9), i10);
                    aVarA2 = i2.b0.a(dVarF);
                    aVar.f11512a = dVarF;
                    aVar.f11513b = aVarA2;
                    aVar.f11515d = i10;
                } else {
                    c10 = ' ';
                    j9 = 4294967295L;
                    dVarF = i2.b0.f((int) (jCeil2 >> c10), (int) (jCeil2 & j9), i10);
                    aVarA2 = i2.b0.a(dVarF);
                    aVar.f11512a = dVarF;
                    aVar.f11513b = aVarA2;
                    aVar.f11515d = i10;
                }
                aVar.f11514c = jCeil2;
                k2.b bVar3 = aVar.f11516e;
                long jM2 = kh.n.m0(jCeil2);
                k2.a aVar8 = bVar3.A;
                y3.c cVar4 = aVar8.f8916a;
                y3.m mVar7 = aVar8.f8917b;
                i2.s sVar3 = aVar8.f8918c;
                i2.a aVar9 = aVarA2;
                long j12 = aVar8.f8919d;
                aVar8.f8916a = dVar;
                aVar8.f8917b = layoutDirection2;
                aVar8.f8918c = aVar9;
                aVar8.f8919d = jM2;
                aVar9.i();
                k2.d.R(bVar3, i2.t.f7162b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.invoke(bVar3);
                aVar9.q();
                k2.a aVar10 = bVar3.A;
                aVar10.f8916a = cVar4;
                aVar10.f8917b = mVar7;
                aVar10.f8918c = sVar3;
                aVar10.f8919d = j12;
                dVarF.f7117a.prepareToDraw();
                this.f11562d = false;
                this.f11568j = dVar.b();
            }
        }
        if (mVar != null) {
            mVar3 = mVar;
        } else {
            mVar3 = ((i2.m) i1Var.getValue()) != null ? (i2.m) i1Var.getValue() : this.f11566h;
        }
        i2.d dVar3 = aVar.f11512a;
        if (dVar3 == null) {
            y2.a.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        k2.d.y(dVar, dVar3, aVar.f11514c, 0L, f3, mVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f11561c);
        sb2.append("\n\tviewportWidth: ");
        i1 i1Var = this.f11567i;
        sb2.append(Float.intBitsToFloat((int) (((h2.e) i1Var.getValue()).f6558a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((h2.e) i1Var.getValue()).f6558a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
