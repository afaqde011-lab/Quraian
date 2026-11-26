package f7;

import androidx.media3.common.u0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import e7.i0;
import e7.u;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import ta.c0;

public final class a implements u0 {

    public final String f5489a;

    public final byte[] f5490b;

    public final int f5491c;

    public final int f5492d;

    public a(String str, byte[] bArr, int i10, int i11) {
        byte b7;
        str.getClass();
        boolean z10 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                c0.s(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b7 = bArr[0]) == 0 || b7 == 1)) {
                    z10 = true;
                }
                c0.s(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                c0.s(z10);
                break;
            case "auxiliary.tracks.map":
                c0.s(i11 == 0);
                break;
        }
        this.f5489a = str;
        this.f5490b = bArr;
        this.f5491c = i10;
        this.f5492d = i11;
    }

    public final ArrayList d() {
        c0.z("Metadata is not an auxiliary tracks map", this.f5489a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f5490b;
        byte b7 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b7; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5489a.equals(aVar.f5489a) && Arrays.equals(this.f5490b, aVar.f5490b) && this.f5491c == aVar.f5491c && this.f5492d == aVar.f5492d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f5490b) + x5.e(527, this.f5489a, 31)) * 31) + this.f5491c) * 31) + this.f5492d;
    }

    public final String toString() {
        String string;
        gh.b bVar;
        gh.d bVar2;
        gh.a aVar;
        char[] cArr;
        int i10;
        int length;
        int i11;
        boolean z10;
        char[] cArr2;
        int i12;
        gh.a aVar2;
        byte[] bArr;
        byte[] bArrCopyOf;
        int i13;
        int i14;
        byte b7;
        byte b10;
        boolean z11;
        char c10;
        char c11;
        char c12;
        char c13;
        int i15 = this.f5492d;
        if (i15 != 0) {
            if (i15 == 1) {
                byte[] bArr2 = this.f5490b;
                String str = i0.f5136a;
                string = new String(bArr2, StandardCharsets.UTF_8);
            } else if (i15 == 23) {
                byte[] bArr3 = this.f5490b;
                c0.o(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
                string = String.valueOf(Float.intBitsToFloat(bi.b.B(bArr3[0], bArr3[1], bArr3[2], bArr3[3])));
            } else if (i15 == 67) {
                byte[] bArr4 = this.f5490b;
                c0.o(bArr4.length, 4, "array too small: %s < %s", bArr4.length >= 4);
                string = String.valueOf(bi.b.B(bArr4[0], bArr4[1], bArr4[2], bArr4[3]));
            } else if (i15 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(this.f5490b[0]));
            } else if (i15 != 78) {
                byte[] bArr5 = this.f5490b;
                String str2 = i0.f5136a;
                bVar = gh.d.f6332d;
                bVar2 = bVar.f6335c;
                if (bVar2 == null) {
                    aVar = bVar.f6333a;
                    cArr = aVar.f6324b;
                    for (char c14 : cArr) {
                        if (w00.a.A(c14)) {
                            length = cArr.length;
                            i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    z10 = false;
                                    break;
                                }
                                c13 = cArr[i11];
                                if (c13 < 'a' && c13 <= 'z') {
                                    z10 = true;
                                    break;
                                }
                                i11++;
                            }
                            c0.z("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                            cArr2 = new char[cArr.length];
                            for (i12 = 0; i12 < cArr.length; i12++) {
                                c12 = cArr[i12];
                                if (w00.a.A(c12)) {
                                    c12 = (char) (c12 ^ ' ');
                                }
                                cArr2[i12] = c12;
                            }
                            aVar2 = new gh.a(x5.n(new StringBuilder(), aVar.f6323a, ".lowerCase()"), cArr2);
                            if (aVar.f6330h) {
                                aVar = aVar2;
                                break;
                            }
                            bArr = aVar2.f6329g;
                            if (aVar2.f6330h) {
                                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i13 = 65; i13 <= 90; i13++) {
                                    i14 = i13 | 32;
                                    b7 = bArr[i13];
                                    b10 = bArr[i14];
                                    if (b7 == -1) {
                                        bArrCopyOf[i13] = b10;
                                    } else {
                                        if (b10 == -1) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        c10 = (char) i13;
                                        c11 = (char) i14;
                                        if (z11) {
                                            throw new IllegalStateException(ze.d.H("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                                        }
                                        bArrCopyOf[i14] = b7;
                                    }
                                }
                                aVar = new gh.a(x5.n(new StringBuilder(), aVar2.f6323a, ".ignoreCase()"), aVar2.f6324b, bArrCopyOf, true);
                                break;
                            }
                            aVar = aVar2;
                            break;
                        }
                    }
                    if (aVar == bVar.f6333a) {
                        bVar2 = bVar;
                    } else {
                        bVar2 = new gh.b(aVar);
                    }
                    bVar.f6335c = bVar2;
                }
                int length2 = bArr5.length;
                c0.y(0, length2, bArr5.length);
                gh.a aVar3 = bVar2.f6333a;
                int i16 = aVar3.f6327e;
                int i17 = aVar3.f6328f;
                RoundingMode roundingMode = RoundingMode.CEILING;
                StringBuilder sb2 = new StringBuilder(y3.A(length2, i17) * i16);
                try {
                    bVar2.b(sb2, bArr5, length2);
                    string = sb2.toString();
                } catch (IOException e3) {
                    throw new AssertionError(e3);
                }
            } else {
                string = String.valueOf(new u(this.f5490b).G());
            }
        } else if (this.f5489a.equals("auxiliary.tracks.map")) {
            ArrayList arrayListD = d();
            StringBuilder sbQ = x5.q("track types = ");
            new eh.l(String.valueOf(',')).a(sbQ, arrayListD.iterator());
            string = sbQ.toString();
        } else {
            byte[] bArr6 = this.f5490b;
            String str3 = i0.f5136a;
            bVar = gh.d.f6332d;
            bVar2 = bVar.f6335c;
            if (bVar2 == null) {
                aVar = bVar.f6333a;
                cArr = aVar.f6324b;
                while (i10 < r6) {
                    if (w00.a.A(c14)) {
                        length = cArr.length;
                        i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                z10 = false;
                                break;
                            }
                            c13 = cArr[i11];
                            if (c13 < 'a') {
                            }
                            i11++;
                        }
                        c0.z("Cannot call lowerCase() on a mixed-case alphabet", !z10);
                        cArr2 = new char[cArr.length];
                        while (i12 < cArr.length) {
                            c12 = cArr[i12];
                            if (w00.a.A(c12)) {
                                c12 = (char) (c12 ^ ' ');
                            }
                            cArr2[i12] = c12;
                        }
                        aVar2 = new gh.a(x5.n(new StringBuilder(), aVar.f6323a, ".lowerCase()"), cArr2);
                        if (aVar.f6330h) {
                            aVar = aVar2;
                            break;
                        }
                        bArr = aVar2.f6329g;
                        if (aVar2.f6330h) {
                            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            while (i13 <= 90) {
                                i14 = i13 | 32;
                                b7 = bArr[i13];
                                b10 = bArr[i14];
                                if (b7 == -1) {
                                    bArrCopyOf[i13] = b10;
                                } else {
                                    if (b10 == -1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    c10 = (char) i13;
                                    c11 = (char) i14;
                                    if (z11) {
                                        throw new IllegalStateException(ze.d.H("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c10), Character.valueOf(c11)));
                                    }
                                    bArrCopyOf[i14] = b7;
                                }
                            }
                            aVar = new gh.a(x5.n(new StringBuilder(), aVar2.f6323a, ".ignoreCase()"), aVar2.f6324b, bArrCopyOf, true);
                            break;
                        }
                        aVar = aVar2;
                        break;
                    }
                }
                if (aVar == bVar.f6333a) {
                    bVar2 = bVar;
                } else {
                    bVar2 = new gh.b(aVar);
                }
                bVar.f6335c = bVar2;
            }
            int length3 = bArr6.length;
            c0.y(0, length3, bArr6.length);
            gh.a aVar4 = bVar2.f6333a;
            int i18 = aVar4.f6327e;
            int i19 = aVar4.f6328f;
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            StringBuilder sb3 = new StringBuilder(y3.A(length3, i19) * i18);
            bVar2.b(sb3, bArr6, length3);
            string = sb3.toString();
        }
        return w.c.l(new StringBuilder("mdta: key="), this.f5489a, ", value=", string);
    }
}
