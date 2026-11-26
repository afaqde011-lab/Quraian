package y7;

import e7.i0;

public final class z implements Runnable {
    public final int A;
    public final k7.n B;

    public z(k7.n nVar, int i10, long j9) {
        this.A = 3;
        this.B = nVar;
    }

    public z(k7.n nVar, long j9, int i10) {
        this.A = 4;
        this.B = nVar;
    }

    public z(k7.n nVar, androidx.media3.common.t tVar, i7.d dVar) {
        this.A = 6;
        this.B = nVar;
    }

    public z(k7.n nVar, Object obj, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    public z(k7.n nVar, String str, long j9, long j10) {
        this.A = 0;
        this.B = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        k7.n nVar = this.B;
        switch (i10) {
            case 0:
                i7.v vVar = nVar.f9112b;
                String str = i0.f5136a;
                j7.f fVar = vVar.A.f7501s;
                fVar.b0(fVar.a0(), 1016, new j2.n(27));
                break;
            case 1:
                i7.v vVar2 = nVar.f9112b;
                String str2 = i0.f5136a;
                j7.f fVar2 = vVar2.A.f7501s;
                fVar2.b0(fVar2.a0(), 1030, new j2.n(6));
                break;
            case 2:
                i7.v vVar3 = nVar.f9112b;
                String str3 = i0.f5136a;
                j7.f fVar3 = vVar3.A.f7501s;
                fVar3.b0(fVar3.a0(), 1019, new j2.n(14));
                break;
            case 3:
                i7.v vVar4 = nVar.f9112b;
                String str4 = i0.f5136a;
                j7.f fVar4 = vVar4.A.f7501s;
                fVar4.b0(fVar4.Y((s7.a0) fVar4.D.F), 1018, new j7.c(4));
                break;
            case 4:
                i7.v vVar5 = nVar.f9112b;
                String str5 = i0.f5136a;
                j7.f fVar5 = vVar5.A.f7501s;
                fVar5.b0(fVar5.Y((s7.a0) fVar5.D.F), 1021, new j7.c(5));
                break;
            case 5:
                i7.v vVar6 = nVar.f9112b;
                String str6 = i0.f5136a;
                j7.f fVar6 = vVar6.A.f7501s;
                fVar6.b0(fVar6.a0(), 1015, new j7.c(16));
                break;
            default:
                i7.v vVar7 = nVar.f9112b;
                String str7 = i0.f5136a;
                j7.f fVar7 = vVar7.A.f7501s;
                fVar7.b0(fVar7.a0(), 1017, new j7.c(12));
                break;
        }
    }
}
