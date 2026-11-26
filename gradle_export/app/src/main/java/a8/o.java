package a8;

import a1.u0;
import android.net.Uri;
import androidx.media3.common.x0;
import com.google.android.gms.internal.measurement.z3;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class o implements t {
    public static final int[] F = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final u0 G = new u0(new n(0));
    public static final u0 H = new u0(new n(1));
    public d2 A;
    public int D;
    public int E;
    public tf.w C = new tf.w(20);
    public boolean B = true;

    public final void a(int i10, ArrayList arrayList) {
        switch (i10) {
            case 0:
                arrayList.add(new h9.a());
                break;
            case 1:
                arrayList.add(new h9.c());
                break;
            case 2:
                arrayList.add(new h9.d());
                break;
            case 3:
                arrayList.add(new b8.a());
                break;
            case 4:
                q qVarH = G.H(0);
                if (qVarH == null) {
                    arrayList.add(new f8.c());
                } else {
                    arrayList.add(qVarH);
                }
                break;
            case 5:
                arrayList.add(new g8.b());
                break;
            case 6:
                arrayList.add(new s8.f(this.C, this.B ? 0 : 2));
                break;
            case 7:
                arrayList.add(new t8.d());
                break;
            case 8:
                tf.w wVar = this.C;
                int i11 = this.B ? 0 : 32;
                r0 r0Var = t0.B;
                arrayList.add(new u8.h(wVar, i11, d2.E, null));
                arrayList.add(new u8.l(this.C, this.B ? 0 : 16));
                break;
            case 9:
                arrayList.add(new v8.d());
                break;
            case 10:
                arrayList.add(new h9.a0());
                break;
            case 11:
                if (this.A == null) {
                    r0 r0Var2 = t0.B;
                    this.A = d2.E;
                }
                arrayList.add(new h9.e0(1 ^ (this.B ? 1 : 0), this.C, new e7.e0(0L), new h9.f(this.A)));
                break;
            case 12:
                arrayList.add(new i9.c());
                break;
            case 14:
                arrayList.add(new i8.a(this.D));
                break;
            case 15:
                q qVarH2 = H.H(new Object[0]);
                if (qVarH2 != null) {
                    arrayList.add(qVarH2);
                }
                break;
            case 16:
                arrayList.add(new c8.b(1 ^ (this.B ? 1 : 0), this.C));
                break;
            case 17:
                arrayList.add(new e8.a(1));
                break;
            case TYPE_SINT64_VALUE:
                arrayList.add(new d8.a(1));
                break;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                arrayList.add(new e8.a(0));
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                arrayList.add(new h8.b(this.E));
                break;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                arrayList.add(new d8.a(0));
                break;
        }
    }

    @Override
    public final synchronized q[] e() {
        return f(Uri.EMPTY, new HashMap());
    }

    @Override
    public final synchronized q[] f(Uri uri, Map map) {
        ArrayList arrayList;
        int i10;
        int iG;
        int i11;
        int i12;
        try {
            int[] iArr = F;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String strN = x0.n(str);
                strN.getClass();
                i10 = 20;
                switch (strN) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/eac3":
                        i10 = 0;
                        break;
                    case "video/mp2p":
                        i10 = 10;
                        break;
                    case "video/mp2t":
                        i10 = 11;
                        break;
                    case "video/webm":
                    case "audio/x-matroska":
                    case "application/webm":
                    case "audio/webm":
                    case "video/x-matroska":
                        i10 = 6;
                        break;
                    case "audio/amr-wb":
                    case "audio/amr":
                    case "audio/3gpp":
                        i10 = 3;
                        break;
                    case "image/avif":
                        i10 = 21;
                        break;
                    case "image/jpeg":
                        i10 = 14;
                        break;
                    case "image/webp":
                        i10 = 18;
                        break;
                    case "application/mp4":
                    case "audio/mp4":
                    case "video/mp4":
                        i10 = 8;
                        break;
                    case "video/x-msvideo":
                        i10 = 16;
                        break;
                    case "text/vtt":
                        i10 = 13;
                        break;
                    case "image/bmp":
                        i10 = 19;
                        break;
                    case "image/png":
                        i10 = 17;
                        break;
                    case "video/x-flv":
                        i10 = 5;
                        break;
                    case "audio/ac4":
                        i10 = 1;
                        break;
                    case "audio/ogg":
                        i10 = 9;
                        break;
                    case "audio/wav":
                        i10 = 12;
                        break;
                    case "audio/flac":
                        i10 = 4;
                        break;
                    case "audio/midi":
                        i10 = 15;
                        break;
                    case "audio/mpeg":
                        i10 = 7;
                        break;
                }
                if (i10 != -1) {
                    a(i10, arrayList);
                }
                iG = z3.G(uri);
                if (iG != -1 && iG != i10) {
                    a(iG, arrayList);
                }
                for (i11 = 0; i11 < 21; i11++) {
                    i12 = iArr[i11];
                    if (i12 == i10 && i12 != iG) {
                        a(i12, arrayList);
                    }
                }
            }
            i10 = -1;
            if (i10 != -1) {
                a(i10, arrayList);
            }
            iG = z3.G(uri);
            if (iG != -1) {
                a(iG, arrayList);
            }
            while (i11 < 21) {
                i12 = iArr[i11];
                if (i12 == i10) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (q[]) arrayList.toArray(new q[0]);
    }
}
