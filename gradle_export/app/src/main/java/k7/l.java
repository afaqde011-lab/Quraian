package k7;

public final class l implements Runnable {
    public final int A;
    public final n B;

    public l(n nVar, int i10, long j9, long j10) {
        this.A = 1;
        this.B = nVar;
    }

    public l(n nVar, long j9) {
        this.A = 2;
        this.B = nVar;
    }

    public l(n nVar, androidx.media3.common.t tVar, i7.d dVar) {
        this.A = 9;
        this.B = nVar;
    }

    public l(n nVar, Object obj, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    public l(n nVar, String str, long j9, long j10) {
        this.A = 4;
        this.B = nVar;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        n nVar = this.B;
        switch (i10) {
            case 0:
                i7.v vVar = nVar.f9112b;
                String str = e7.i0.f5136a;
                j7.f fVar = vVar.A.f7501s;
                fVar.b0(fVar.a0(), 1029, new j2.n(26));
                break;
            case 1:
                i7.v vVar2 = nVar.f9112b;
                String str2 = e7.i0.f5136a;
                j7.f fVar2 = vVar2.A.f7501s;
                fVar2.b0(fVar2.a0(), 1011, new j7.c(24));
                break;
            case 2:
                i7.v vVar3 = nVar.f9112b;
                String str3 = e7.i0.f5136a;
                j7.f fVar3 = vVar3.A.f7501s;
                fVar3.b0(fVar3.a0(), 1010, new j7.c(25));
                break;
            case 3:
                i7.v vVar4 = nVar.f9112b;
                String str4 = e7.i0.f5136a;
                j7.f fVar4 = vVar4.A.f7501s;
                fVar4.b0(fVar4.a0(), 1032, new j7.c(27));
                break;
            case 4:
                i7.v vVar5 = nVar.f9112b;
                String str5 = e7.i0.f5136a;
                j7.f fVar5 = vVar5.A.f7501s;
                fVar5.b0(fVar5.a0(), 1008, new j2.n(12));
                break;
            case 5:
                i7.v vVar6 = nVar.f9112b;
                String str6 = e7.i0.f5136a;
                j7.f fVar6 = vVar6.A.f7501s;
                fVar6.b0(fVar6.a0(), 1012, new j7.e(0));
                break;
            case 6:
                i7.v vVar7 = nVar.f9112b;
                String str7 = e7.i0.f5136a;
                j7.f fVar7 = vVar7.A.f7501s;
                fVar7.b0(fVar7.a0(), 1007, new j7.c(3));
                break;
            case 7:
                i7.v vVar8 = nVar.f9112b;
                String str8 = e7.i0.f5136a;
                j7.f fVar8 = vVar8.A.f7501s;
                fVar8.b0(fVar8.a0(), 1031, new j7.c(13));
                break;
            case 8:
                i7.v vVar9 = nVar.f9112b;
                String str9 = e7.i0.f5136a;
                j7.f fVar9 = vVar9.A.f7501s;
                fVar9.b0(fVar9.a0(), 1014, new j7.c(19));
                break;
            default:
                i7.v vVar10 = nVar.f9112b;
                String str10 = e7.i0.f5136a;
                j7.f fVar10 = vVar10.A.f7501s;
                fVar10.b0(fVar10.a0(), 1009, new j7.c(15));
                break;
        }
    }
}
