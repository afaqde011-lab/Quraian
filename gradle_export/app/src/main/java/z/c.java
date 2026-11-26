package z;

public final class c extends kotlin.jvm.internal.j implements u00.k {
    public final int A;

    public c(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.A = i12;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                h hVar = (h) ((kotlin.jvm.internal.c) this).receiver;
                u.z zVar = hVar.f16920d0;
                if (zBooleanValue) {
                    hVar.L1();
                } else {
                    if (hVar.Q != null) {
                        Object[] objArr = zVar.f14915c;
                        long[] jArr = zVar.f14913a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j9 = jArr[i10];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8;
                                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        if ((255 & j9) < 128) {
                                            a40.c0.y(hVar.p1(), (k00.i) null, (a40.a0) null, new f(hVar, (f0.k) objArr[(i10 << 3) + i13], null, 0), 3);
                                        }
                                        j9 >>= i11;
                                        i13++;
                                        i11 = i11;
                                    }
                                    if (i12 == i11) {
                                        if (i10 != length) {
                                            i10++;
                                        }
                                    }
                                } else if (i10 != length) {
                                    i10++;
                                }
                            }
                        }
                        f0.k kVar = hVar.f16922f0;
                        if (kVar != null) {
                            a40.c0.y(hVar.p1(), (k00.i) null, (a40.a0) null, new f(hVar, kVar, null, 1), 3);
                        }
                    }
                    zVar.a();
                    hVar.f16922f0 = null;
                    hVar.M1();
                }
                break;
            case 1:
                zy.e eVar = (zy.e) obj;
                kotlin.jvm.internal.m.e(eVar, "p0");
                ((zy.p) ((kotlin.jvm.internal.c) this).receiver).k(eVar);
                break;
            default:
                zy.e eVar2 = (zy.e) obj;
                kotlin.jvm.internal.m.e(eVar2, "p0");
                ((zy.p) ((kotlin.jvm.internal.c) this).receiver).k(eVar2);
                break;
        }
        return g00.b0.a;
    }
}
