package a8;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

public final class e {

    public final ArrayList f241a;

    public final int f242b;

    public final int f243c;

    public final int f244d;

    public final int f245e;

    public final int f246f;

    public final int f247g;

    public final int f248h;

    public final int f249i;

    public final int f250j;

    public final float f251k;
    public final String l;

    public e(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f3, String str) {
        this.f241a = arrayList;
        this.f242b = i10;
        this.f243c = i11;
        this.f244d = i12;
        this.f245e = i13;
        this.f246f = i14;
        this.f247g = i15;
        this.f248h = i16;
        this.f249i = i17;
        this.f250j = i18;
        this.f251k = f3;
        this.l = str;
    }

    public static e a(e7.u uVar) throws ParserException {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f3;
        int i16;
        int i17;
        try {
            uVar.O(4);
            int iA = (uVar.A() & 3) + 1;
            if (iA == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA2 = uVar.A() & 31;
            for (int i18 = 0; i18 < iA2; i18++) {
                int iH = uVar.H();
                int i19 = uVar.f5183b;
                uVar.O(iH);
                byte[] bArr = uVar.f5182a;
                byte[] bArr2 = new byte[iH + 4];
                System.arraycopy(e7.e.f5121a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i19, bArr2, 4, iH);
                arrayList.add(bArr2);
            }
            int iA3 = uVar.A();
            for (int i20 = 0; i20 < iA3; i20++) {
                int iH2 = uVar.H();
                int i21 = uVar.f5183b;
                uVar.O(iH2);
                byte[] bArr3 = uVar.f5182a;
                byte[] bArr4 = new byte[iH2 + 4];
                System.arraycopy(e7.e.f5121a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i21, bArr4, 4, iH2);
                arrayList.add(bArr4);
            }
            if (iA2 > 0) {
                f7.o oVarK = f7.p.k(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i22 = oVarK.f5534e;
                int i23 = oVarK.f5535f;
                int i24 = oVarK.f5537h + 8;
                int i25 = oVarK.f5538i + 8;
                int i26 = oVarK.f5543p;
                int i27 = oVarK.f5544q;
                int i28 = oVarK.f5545r;
                int i29 = oVarK.f5546s;
                float f10 = oVarK.f5536g;
                int i30 = oVarK.f5530a;
                int i31 = oVarK.f5531b;
                int i32 = oVarK.f5532c;
                byte[] bArr5 = e7.e.f5121a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i13 = i27;
                i14 = i28;
                i15 = i29;
                f3 = f10;
                i11 = i23;
                i12 = i24;
                i16 = i25;
                i17 = i26;
                i10 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f3 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new e(arrayList, iA, i10, i11, i12, i16, i17, i13, i14, i15, f3, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw ParserException.a(e3, "Error parsing AVC config");
        }
    }
}
