package m0;

import a40.c0;

public final class l implements u00.a {
    public final int A;
    public final w B;
    public final a40.z C;

    public l(w wVar, a40.z zVar, int i10) {
        this.A = i10;
        this.B = wVar;
        this.C = zVar;
    }

    public final Object invoke() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.A) {
            case 0:
                w wVar = this.B;
                if (wVar.b()) {
                    c0.y(this.C, (k00.i) null, (a40.a0) null, new m(wVar, null, 0), 3);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                w wVar2 = this.B;
                if (wVar2.d()) {
                    c0.y(this.C, (k00.i) null, (a40.a0) null, new m(wVar2, null, 1), 3);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 2:
                w wVar3 = this.B;
                if (wVar3.b()) {
                    c0.y(this.C, (k00.i) null, (a40.a0) null, new m(wVar3, null, 0), 3);
                    z12 = true;
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            default:
                w wVar4 = this.B;
                if (wVar4.d()) {
                    c0.y(this.C, (k00.i) null, (a40.a0) null, new m(wVar4, null, 1), 3);
                    z13 = true;
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }
}
