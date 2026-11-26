package p1;

public final class l0 extends kh.o {

    public int f12278b;

    public int f12280d;

    public int f12282f;

    public k20.d[] f12277a = new k20.d[16];

    public int[] f12279c = new int[16];

    public Object[] f12281e = new Object[16];

    public final void j0() {
        this.f12278b = 0;
        this.f12280d = 0;
        h00.n.y0(0, this.f12282f, (Object) null, this.f12281e);
        this.f12282f = 0;
    }

    public final void k0(l1.a aVar, o1.k kVar, v1.i iVar, k0 k0Var) {
        if (this.f12278b != 0) {
            androidx.media3.common.k kVar2 = new androidx.media3.common.k(this);
            l0 l0Var = (l0) kVar2.f1301e;
            while (true) {
                k20.d dVar = l0Var.f12277a[kVar2.f1298b];
                o1.b bVarF = dVar.f(kVar2);
                l1.a aVar2 = aVar;
                o1.k kVar3 = kVar;
                v1.i iVar2 = iVar;
                k0 k0Var2 = k0Var;
                try {
                    dVar.d(kVar2, aVar2, kVar3, iVar2, k0Var2);
                    int i10 = kVar2.f1298b;
                    int i11 = l0Var.f12278b;
                    if (i10 < i11) {
                        k20.d dVar2 = l0Var.f12277a[i10];
                        kVar2.f1299c += dVar2.b;
                        kVar2.f1300d += dVar2.c;
                        int i12 = i10 + 1;
                        kVar2.f1298b = i12;
                        if (i12 >= i11) {
                            break;
                        }
                        aVar = aVar2;
                        kVar = kVar3;
                        iVar = iVar2;
                        k0Var = k0Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    if (k0Var2 == null) {
                        throw th2;
                    }
                    ab.a0.H0(th2, new d0.g(bVarF, kVar3, k0Var2, 9));
                    throw th2;
                }
            }
        }
        j0();
    }

    public final boolean l0() {
        return this.f12278b == 0;
    }

    public final void m0(k20.d dVar) {
        int i10 = this.f12278b;
        k20.d[] dVarArr = this.f12277a;
        if (i10 == dVarArr.length) {
            k20.d[] dVarArr2 = new k20.d[(i10 > 1024 ? 1024 : i10) + i10];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, i10);
            this.f12277a = dVarArr2;
        }
        int i11 = this.f12280d;
        int i12 = dVar.b;
        int i13 = dVar.c;
        int i14 = i11 + i12;
        int[] iArr = this.f12279c;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = (length > 1024 ? 1024 : length) + length;
            if (i15 >= i14) {
                i14 = i15;
            }
            int[] iArr2 = new int[i14];
            h00.n.p0(0, 0, length, iArr, iArr2);
            this.f12279c = iArr2;
        }
        int i16 = this.f12282f + i13;
        Object[] objArr = this.f12281e;
        int length2 = objArr.length;
        if (i16 > length2) {
            int i17 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i17 >= i16) {
                i16 = i17;
            }
            Object[] objArr2 = new Object[i16];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f12281e = objArr2;
        }
        k20.d[] dVarArr3 = this.f12277a;
        int i18 = this.f12278b;
        this.f12278b = i18 + 1;
        dVarArr3[i18] = dVar;
        this.f12280d += dVar.b;
        this.f12282f += i13;
    }
}
