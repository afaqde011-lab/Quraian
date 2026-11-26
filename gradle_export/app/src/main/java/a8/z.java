package a8;

import androidx.media3.common.ParserException;
import fh.t0;
import java.util.Collections;
import java.util.List;

public final class z {

    public final List f326a;

    public final int f327b;

    public final int f328c;

    public final int f329d;

    public final int f330e;

    public final int f331f;

    public final int f332g;

    public final int f333h;

    public final int f334i;

    public final int f335j;

    public final int f336k;
    public final float l;
    public final int m;

    public final String f337n;

    public final oj.q f338o;

    public z(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f3, int i20, String str, oj.q qVar) {
        this.f326a = list;
        this.f327b = i10;
        this.f328c = i11;
        this.f329d = i12;
        this.f330e = i13;
        this.f331f = i14;
        this.f332g = i15;
        this.f333h = i16;
        this.f334i = i17;
        this.f335j = i18;
        this.f336k = i19;
        this.l = f3;
        this.m = i20;
        this.f337n = str;
        this.f338o = qVar;
    }

    public static z a(e7.u uVar, boolean z10, oj.q qVar) throws ParserException {
        boolean z11;
        com.google.android.gms.internal.cast.o oVarH;
        int i10 = 4;
        try {
            if (z10) {
                uVar.O(4);
            } else {
                uVar.O(21);
            }
            int iA = uVar.A() & 3;
            int iA2 = uVar.A();
            int i11 = uVar.f5183b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iA2) {
                    break;
                }
                uVar.O(1);
                int iH = uVar.H();
                for (int i15 = 0; i15 < iH; i15++) {
                    int iH2 = uVar.H();
                    i14 += iH2 + 4;
                    uVar.O(iH2);
                }
                i13++;
            }
            uVar.N(i11);
            byte[] bArr = new byte[i14];
            oj.q qVar2 = qVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f3 = 1.0f;
            String strA = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < iA2) {
                int iA3 = uVar.A() & 63;
                int iH3 = uVar.H();
                int i28 = i12;
                oj.q qVarJ = qVar2;
                while (i28 < iH3) {
                    boolean z12 = z11;
                    int iH4 = uVar.H();
                    int i29 = iA;
                    System.arraycopy(f7.p.f5547a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(uVar.f5182a, uVar.f5183b, bArr, i30, iH4);
                    if (iA3 == 32 && i28 == 0) {
                        qVarJ = f7.p.j(i30, i30 + iH4, bArr);
                    } else {
                        if (iA3 == 33 && i28 == 0) {
                            f7.l lVarI = f7.p.i(bArr, i30, i30 + iH4, qVarJ);
                            i16 = lVarI.f5514a + 1;
                            i17 = lVarI.f5520g;
                            int i31 = lVarI.f5521h;
                            i19 = lVarI.f5516c + 8;
                            i20 = lVarI.f5517d + 8;
                            int i32 = lVarI.f5524k;
                            i18 = i31;
                            int i33 = lVarI.l;
                            int i34 = lVarI.m;
                            float f10 = lVarI.f5522i;
                            int i35 = lVarI.f5523j;
                            f7.i iVar = lVarI.f5515b;
                            if (iVar != null) {
                                strA = e7.e.a(iVar.f5501a, iVar.f5502b, iVar.f5503c, iVar.f5504d, iVar.f5505e, iVar.f5506f);
                            }
                            i25 = i35;
                            f3 = f10;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (iA3 == 39 && i28 == 0 && (oVarH = f7.p.h(i30, i30 + iH4, bArr)) != null && qVarJ != null) {
                            i12 = 0;
                            i24 = oVarH.A == ((f7.h) ((t0) qVarJ.B).get(0)).f5500b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i27 = i30 + iH4;
                    uVar.O(iH4);
                    i28++;
                    z11 = z12;
                    iA = i29;
                    i10 = 4;
                }
                i26++;
                qVar2 = qVarJ;
                i10 = 4;
            }
            return new z(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iA + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f3, i25, strA, qVar2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw ParserException.a(e3, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
