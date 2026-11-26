package z8;

import a8.n0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import e7.h;
import e7.i0;
import e7.u;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.ArrayList;
import java.util.List;
import x8.j;
import x8.k;

public final class g implements k {
    public static final byte[] H = {0, 7, 8, 15};
    public static final byte[] I = {0, 119, -120, -1};
    public static final byte[] J = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint A;
    public final Paint B;
    public final Canvas C;
    public final b9.a D;
    public final a E;
    public final f F;
    public Bitmap G;

    public g(List list) {
        u uVar = new u((byte[]) list.get(0));
        int iH = uVar.H();
        int iH2 = uVar.H();
        Paint paint = new Paint();
        this.A = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.B = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.C = new Canvas();
        this.D = new b9.a(719, 575, 0, 719, 0, 575);
        this.E = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.F = new f(iH, iH2);
    }

    public static byte[] a(int i10, int i11, n0 n0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) n0Var.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static void e(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c10;
        char c11;
        int i13;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i20;
        n0 n0Var = new n0(bArr.length, bArr);
        int i21 = i11;
        int i22 = i12;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (n0Var.b() != 0) {
            int i23 = 8;
            int i24 = n0Var.i(8);
            if (i24 != 240) {
                int i25 = 3;
                int i26 = 2;
                int i27 = 4;
                switch (i24) {
                    case 16:
                        if (i10 == 3) {
                            bArr2 = bArrA == null ? I : bArrA;
                        } else if (i10 == 2) {
                            bArr2 = bArrA3 == null ? H : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z12 = false;
                        while (true) {
                            int i28 = n0Var.i(2);
                            if (i28 != 0) {
                                i13 = i28;
                                i14 = 1;
                            } else {
                                if (n0Var.h()) {
                                    int i29 = n0Var.i(3) + 3;
                                    i13 = n0Var.i(2);
                                    i14 = i29;
                                } else {
                                    if (n0Var.h()) {
                                        i14 = 1;
                                        c10 = '\b';
                                        c11 = 4;
                                    } else {
                                        int i30 = n0Var.i(2);
                                        if (i30 == 0) {
                                            c10 = '\b';
                                            c11 = 4;
                                            z12 = true;
                                        } else if (i30 == 1) {
                                            c10 = '\b';
                                            c11 = 4;
                                            i14 = 2;
                                        } else if (i30 == 2) {
                                            c10 = '\b';
                                            c11 = 4;
                                            i14 = n0Var.i(4) + 12;
                                            i13 = n0Var.i(2);
                                            z12 = z12;
                                        } else if (i30 != 3) {
                                            z12 = z12;
                                            c10 = '\b';
                                            c11 = 4;
                                        } else {
                                            c10 = '\b';
                                            int i31 = n0Var.i(8) + 29;
                                            i13 = n0Var.i(2);
                                            z12 = z12;
                                            i14 = i31;
                                            c11 = 4;
                                        }
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                    i13 = 0;
                                }
                                if (i14 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i13 = bArr2[i13];
                                    }
                                    paint.setColor(iArr[i13]);
                                    canvas.drawRect(i21, i22, i21 + i14, i22 + 1, paint);
                                }
                                i21 += i14;
                                if (z12) {
                                    n0Var.c();
                                } else {
                                    paint = paint;
                                    z12 = z12;
                                }
                            }
                            c10 = '\b';
                            c11 = 4;
                            if (i14 == 0) {
                            }
                            i21 += i14;
                            if (z12) {
                                n0Var.c();
                            } else {
                                paint = paint;
                                z12 = z12;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i10 == 3 ? bArrA2 == null ? J : bArrA2 : null;
                        boolean z13 = false;
                        while (true) {
                            int i32 = n0Var.i(i27);
                            if (i32 != 0) {
                                z10 = z13;
                                i17 = i32;
                                i15 = 1;
                            } else if (n0Var.h()) {
                                if (n0Var.h()) {
                                    int i33 = n0Var.i(i26);
                                    if (i33 == 0) {
                                        z10 = z13;
                                        i15 = 1;
                                    } else if (i33 != 1) {
                                        if (i33 == i26) {
                                            i15 = n0Var.i(i27) + 9;
                                            i16 = n0Var.i(i27);
                                        } else if (i33 != i25) {
                                            z10 = z13;
                                            i15 = 0;
                                        } else {
                                            i15 = n0Var.i(i23) + 25;
                                            i16 = n0Var.i(i27);
                                        }
                                        i17 = i16;
                                    } else {
                                        z10 = z13;
                                        i15 = i26;
                                    }
                                    i17 = 0;
                                } else {
                                    i15 = n0Var.i(i26) + 4;
                                    i17 = n0Var.i(i27);
                                }
                                z10 = z13;
                            } else {
                                int i34 = n0Var.i(i25);
                                if (i34 != 0) {
                                    i15 = i34 + 2;
                                    z10 = z13;
                                } else {
                                    z10 = true;
                                    i15 = 0;
                                }
                                i17 = 0;
                            }
                            if (i15 == 0 || paint == 0) {
                                i18 = i25;
                                i19 = i26;
                            } else {
                                if (bArr3 != 0) {
                                    i17 = bArr3[i17];
                                }
                                paint.setColor(iArr[i17]);
                                i18 = i25;
                                i19 = 2;
                                canvas.drawRect(i21, i22, i21 + i15, i22 + 1, paint);
                            }
                            i21 += i15;
                            if (z10) {
                                n0Var.c();
                            } else {
                                z13 = z10;
                                i25 = i18;
                                i26 = i19;
                                i27 = 4;
                                i23 = 8;
                            }
                            break;
                        }
                        break;
                    case TYPE_SINT64_VALUE:
                        boolean z14 = false;
                        while (true) {
                            int i35 = n0Var.i(8);
                            if (i35 != 0) {
                                z11 = z14;
                                i20 = 1;
                            } else if (n0Var.h()) {
                                z11 = z14;
                                i20 = n0Var.i(7);
                                i35 = n0Var.i(8);
                            } else {
                                int i36 = n0Var.i(7);
                                if (i36 != 0) {
                                    z11 = z14;
                                    i20 = i36;
                                    i35 = 0;
                                } else {
                                    z11 = true;
                                    i35 = 0;
                                    i20 = 0;
                                }
                            }
                            if (i20 != 0 && paint != 0) {
                                paint.setColor(iArr[i35]);
                                canvas.drawRect(i21, i22, i21 + i20, i22 + 1, paint);
                            }
                            i21 += i20;
                            if (!z11) {
                                z14 = z11;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i24) {
                            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                bArrA3 = a(4, 4, n0Var);
                                break;
                            case 33:
                                bArrA = a(4, 8, n0Var);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, n0Var);
                                break;
                        }
                        break;
                }
            } else {
                i22 += 2;
                i21 = i11;
            }
        }
    }

    public static a f(n0 n0Var, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = n0Var.i(8);
        n0Var.t(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i21 = n0Var.i(i16);
            int i22 = n0Var.i(i16);
            if ((i22 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i22 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i22 & 1) != 0) {
                i14 = n0Var.i(i16);
                i15 = n0Var.i(i16);
                i11 = n0Var.i(i16);
                i13 = n0Var.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = n0Var.i(6) << i18;
                int i24 = n0Var.i(4) << 4;
                i11 = n0Var.i(4) << 4;
                i12 = i19 - 4;
                i13 = n0Var.i(i18) << 6;
                i14 = i23;
                i15 = i24;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d3 = i14;
            double d5 = i15 - 128;
            double d10 = i11 - 128;
            iArr[i21] = d((byte) (255 - (i13 & 255)), i0.h((int) ((1.402d * d5) + d3), 0, 255), i0.h((int) ((d3 - (0.34414d * d10)) - (d5 * 0.71414d)), 0, 255), i0.h((int) ((d10 * 1.772d) + d3), 0, 255));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr2, iArrB, iArrC);
    }

    public static b g(n0 n0Var) {
        byte[] bArr;
        int i10 = n0Var.i(16);
        n0Var.t(4);
        int i11 = n0Var.i(2);
        boolean zH = n0Var.h();
        n0Var.t(1);
        byte[] bArr2 = i0.f5137b;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = n0Var.i(16);
                int i13 = n0Var.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    n0Var.l(i12, bArr2);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    n0Var.l(i13, bArr);
                }
            }
            return new b(i10, zH, bArr2, bArr);
        }
        n0Var.t(n0Var.i(8) * 16);
        bArr = bArr2;
        return new b(i10, zH, bArr2, bArr);
    }

    @Override
    public final void D(byte[] bArr, int i10, int i11, j jVar, h hVar) {
        f fVar;
        boolean z10;
        x8.a aVar;
        char c10;
        char c11;
        char c12;
        int i12;
        int i13;
        d dVar;
        int i14;
        int i15;
        d dVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        n0 n0Var = new n0(i10 + i11, bArr);
        n0Var.q(i10);
        while (true) {
            int iB = n0Var.b();
            fVar = this.F;
            z10 = true;
            if (iB >= 48 && n0Var.i(8) == 15) {
                int i20 = n0Var.i(8);
                int i21 = n0Var.i(16);
                int i22 = n0Var.i(16);
                int iF = n0Var.f() + i22;
                if (i22 * 8 > n0Var.b()) {
                    e7.a.m("DvbParser", "Data field length exceeds limit");
                    n0Var.t(n0Var.b());
                } else {
                    switch (i20) {
                        case 16:
                            if (i21 == fVar.f17298a) {
                                bg.b bVar = fVar.f17306i;
                                n0Var.i(8);
                                int i23 = n0Var.i(4);
                                int i24 = n0Var.i(2);
                                n0Var.t(2);
                                int i25 = i22 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i25 > 0) {
                                    int i26 = n0Var.i(8);
                                    n0Var.t(8);
                                    i25 -= 6;
                                    sparseArray.put(i26, new c(n0Var.i(16), n0Var.i(16)));
                                }
                                bg.b bVar2 = new bg.b(i23, i24, sparseArray);
                                if (i24 != 0) {
                                    fVar.f17306i = bVar2;
                                    fVar.f17300c.clear();
                                    fVar.f17301d.clear();
                                    fVar.f17302e.clear();
                                } else if (bVar != null && bVar.A != i23) {
                                    fVar.f17306i = bVar2;
                                }
                            }
                            break;
                        case 17:
                            bg.b bVar3 = fVar.f17306i;
                            SparseArray sparseArray2 = fVar.f17300c;
                            if (i21 == fVar.f17298a && bVar3 != null) {
                                int i27 = n0Var.i(8);
                                n0Var.t(4);
                                boolean zH = n0Var.h();
                                n0Var.t(3);
                                int i28 = n0Var.i(16);
                                int i29 = n0Var.i(16);
                                n0Var.i(3);
                                int i30 = n0Var.i(3);
                                n0Var.t(2);
                                int i31 = n0Var.i(8);
                                int i32 = n0Var.i(8);
                                int i33 = n0Var.i(4);
                                int i34 = n0Var.i(2);
                                n0Var.t(2);
                                int i35 = i22 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i35 > 0) {
                                    int i36 = n0Var.i(16);
                                    int i37 = n0Var.i(2);
                                    n0Var.i(2);
                                    int i38 = n0Var.i(12);
                                    n0Var.t(4);
                                    int i39 = n0Var.i(12);
                                    int i40 = i35 - 6;
                                    if (i37 == 1 || i37 == 2) {
                                        n0Var.i(8);
                                        n0Var.i(8);
                                        i35 -= 8;
                                    } else {
                                        i35 = i40;
                                    }
                                    sparseArray3.put(i36, new e(i38, i39));
                                }
                                d dVar3 = new d(i27, zH, i28, i29, i30, i31, i32, i33, i34, sparseArray3);
                                if (bVar3.B == 0 && (dVar2 = (d) sparseArray2.get(i27)) != null) {
                                    SparseArray sparseArray4 = dVar2.f17295j;
                                    for (int i41 = 0; i41 < sparseArray4.size(); i41++) {
                                        dVar3.f17295j.put(sparseArray4.keyAt(i41), (e) sparseArray4.valueAt(i41));
                                    }
                                }
                                sparseArray2.put(dVar3.f17286a, dVar3);
                            }
                            break;
                        case TYPE_SINT64_VALUE:
                            if (i21 == fVar.f17298a) {
                                a aVarF = f(n0Var, i22);
                                fVar.f17301d.put(aVarF.f17276a, aVarF);
                            } else if (i21 == fVar.f17299b) {
                                a aVarF2 = f(n0Var, i22);
                                fVar.f17303f.put(aVarF2.f17276a, aVarF2);
                            }
                            break;
                        case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                            if (i21 == fVar.f17298a) {
                                b bVarG = g(n0Var);
                                fVar.f17302e.put(bVarG.f17280a, bVarG);
                            } else if (i21 == fVar.f17299b) {
                                b bVarG2 = g(n0Var);
                                fVar.f17304g.put(bVarG2.f17280a, bVarG2);
                            }
                            break;
                        case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                            if (i21 == fVar.f17298a) {
                                n0Var.t(4);
                                boolean zH2 = n0Var.h();
                                n0Var.t(3);
                                int i42 = n0Var.i(16);
                                int i43 = n0Var.i(16);
                                if (zH2) {
                                    int i44 = n0Var.i(16);
                                    i16 = n0Var.i(16);
                                    i19 = n0Var.i(16);
                                    i17 = n0Var.i(16);
                                    i18 = i44;
                                } else {
                                    i16 = i42;
                                    i17 = i43;
                                    i18 = 0;
                                    i19 = 0;
                                }
                                fVar.f17305h = new b9.a(i42, i43, i18, i16, i19, i17);
                            }
                            break;
                    }
                    n0Var.u(iF - n0Var.f());
                }
            }
        }
        bg.b bVar4 = fVar.f17306i;
        if (bVar4 == null) {
            r0 r0Var = t0.B;
            aVar = new x8.a(-9223372036854775807L, -9223372036854775807L, d2.E);
        } else {
            b9.a aVar2 = fVar.f17305h;
            if (aVar2 == null) {
                aVar2 = this.D;
            }
            Bitmap bitmap = this.G;
            Canvas canvas = this.C;
            if (bitmap == null || aVar2.f2199a + 1 != bitmap.getWidth() || aVar2.f2200b + 1 != this.G.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(aVar2.f2199a + 1, aVar2.f2200b + 1, Bitmap.Config.ARGB_8888);
                this.G = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) bVar4.C;
            int i45 = 0;
            while (i45 < sparseArray5.size()) {
                canvas.save();
                c cVar = (c) sparseArray5.valueAt(i45);
                d dVar4 = (d) fVar.f17300c.get(sparseArray5.keyAt(i45));
                int i46 = cVar.f17284a + aVar2.f2201c;
                int i47 = cVar.f17285b + aVar2.f2203e;
                int i48 = dVar4.f17288c;
                int i49 = dVar4.f17291f;
                int i50 = dVar4.f17289d;
                boolean z11 = z10;
                int i51 = i46 + i48;
                int i52 = i47 + i50;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i46, i47, Math.min(i51, aVar2.f2202d), Math.min(i52, aVar2.f2204f));
                a aVar3 = (a) fVar.f17301d.get(i49);
                if (aVar3 == null && (aVar3 = (a) fVar.f17303f.get(i49)) == null) {
                    aVar3 = this.E;
                }
                SparseArray sparseArray7 = dVar4.f17295j;
                int i53 = i45;
                int i54 = 0;
                while (i54 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i54);
                    SparseArray sparseArray8 = sparseArray7;
                    e eVar = (e) sparseArray7.valueAt(i54);
                    int i55 = i47;
                    b bVar5 = (b) fVar.f17302e.get(iKeyAt);
                    if (bVar5 == null) {
                        bVar5 = (b) fVar.f17304g.get(iKeyAt);
                    }
                    b bVar6 = bVar5;
                    if (bVar6 != null) {
                        Paint paint = bVar6.f17281b ? null : this.A;
                        int i56 = i46;
                        int i57 = dVar4.f17290e;
                        int i58 = i56 + eVar.f17296a;
                        int i59 = i55 + eVar.f17297b;
                        int i60 = i50;
                        Paint paint2 = paint;
                        i14 = i56;
                        i13 = i55;
                        d dVar5 = dVar4;
                        int[] iArr = i57 == 3 ? aVar3.f17279d : i57 == 2 ? aVar3.f17278c : aVar3.f17277b;
                        dVar = dVar5;
                        i15 = i60;
                        e(bVar6.f17282c, iArr, i57, i58, i59, paint2, canvas);
                        e(bVar6.f17283d, iArr, i57, i58, i59 + 1, paint2, canvas);
                    } else {
                        i13 = i55;
                        dVar = dVar4;
                        i14 = i46;
                        i15 = i50;
                    }
                    i54++;
                    i48 = i48;
                    i47 = i13;
                    dVar4 = dVar;
                    i46 = i14;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    aVar2 = aVar2;
                    fVar = fVar;
                    i50 = i15;
                }
                b9.a aVar4 = aVar2;
                ArrayList arrayList2 = arrayList;
                f fVar2 = fVar;
                int i61 = i47;
                d dVar6 = dVar4;
                int i62 = i46;
                int i63 = i48;
                int i64 = i50;
                if (dVar6.f17287b) {
                    int i65 = dVar6.f17290e;
                    if (i65 == 3) {
                        i12 = aVar3.f17279d[dVar6.f17292g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i65 == 2 ? aVar3.f17278c[dVar6.f17293h] : aVar3.f17277b[dVar6.f17294i];
                    }
                    Paint paint3 = this.B;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i62, i61, i51, i52, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.G, i62, i61, i63, i64);
                float f3 = aVar4.f2199a;
                float f10 = aVar4.f2200b;
                arrayList2.add(new d7.b(null, null, null, bitmapCreateBitmap2, i61 / f10, 0, 0, i62 / f3, 0, Integer.MIN_VALUE, -3.4028235E38f, i63 / f3, i64 / f10, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i45 = i53 + 1;
                z10 = z11;
                aVar2 = aVar4;
                arrayList = arrayList2;
                fVar = fVar2;
                sparseArray5 = sparseArray6;
            }
            aVar = new x8.a(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        hVar.accept(aVar);
    }

    @Override
    public final int p() {
        return 2;
    }

    @Override
    public final void reset() {
        f fVar = this.F;
        fVar.f17300c.clear();
        fVar.f17301d.clear();
        fVar.f17302e.clear();
        fVar.f17303f.clear();
        fVar.f17304g.clear();
        fVar.f17305h = null;
        fVar.f17306i = null;
    }
}
