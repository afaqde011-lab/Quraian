package k8;

import a10.h0;
import a8.n0;
import androidx.media3.common.v0;
import e7.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public final class b extends h0 {

    public final int f9195f;

    public final v0 t(j8.a aVar, ByteBuffer byteBuffer) {
        switch (this.f9195f) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                n0 n0Var = new n0(byteBuffer.limit(), byteBuffer.array());
                n0Var.t(12);
                int iF = (n0Var.f() + n0Var.i(12)) - 4;
                n0Var.t(44);
                n0Var.u(n0Var.i(12));
                n0Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (n0Var.f() < iF) {
                    n0Var.t(48);
                    int i10 = n0Var.i(8);
                    n0Var.t(4);
                    int iF2 = n0Var.f() + n0Var.i(12);
                    String str = null;
                    String str2 = null;
                    while (n0Var.f() < iF2) {
                        int i11 = n0Var.i(8);
                        int i12 = n0Var.i(8);
                        int iF3 = n0Var.f() + i12;
                        if (i11 == 2) {
                            int i13 = n0Var.i(16);
                            n0Var.t(8);
                            if (i13 == 3) {
                                while (n0Var.f() < iF3) {
                                    int i14 = n0Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i14];
                                    n0Var.l(i14, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i15 = n0Var.i(8);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        n0Var.u(n0Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i11 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i12];
                            n0Var.l(i12, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        n0Var.q(iF3 * 8);
                    }
                    n0Var.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i10, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new v0(arrayList);
            default:
                u uVar = new u(byteBuffer.limit(), byteBuffer.array());
                String strV = uVar.v();
                strV.getClass();
                String strV2 = uVar.v();
                strV2.getClass();
                return new v0(new l8.a(strV, strV2, uVar.u(), uVar.u(), Arrays.copyOfRange(uVar.f5182a, uVar.f5183b, uVar.f5184c)));
        }
    }
}
