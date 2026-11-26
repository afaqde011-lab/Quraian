package c8;

import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import e7.i0;
import e7.u;
import fh.d2;
import fh.n0;
import fh.r0;
import fh.t0;
import fh.w;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class f implements a {

    public final t0 f3011a;

    public final int f3012b;

    public f(int i10, d2 d2Var) {
        this.f3012b = i10;
        this.f3011a = d2Var;
    }

    public static f b(int i10, u uVar) {
        String str;
        a gVar;
        String str2;
        int i11 = 4;
        w.g(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = uVar.f5184c;
        int iA = -2;
        int i13 = 0;
        while (uVar.a() > 8) {
            int iO = uVar.o();
            int iO2 = uVar.f5183b + uVar.o();
            uVar.M(iO2);
            if (iO != 1414744396) {
                d dVar = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iT = uVar.t();
                                if (iT == 1) {
                                    str = "audio/raw";
                                } else if (iT == 85) {
                                    str = "audio/mpeg";
                                } else if (iT == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iT != 8192) {
                                    str = iT != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iT2 = uVar.t();
                                    int iO3 = uVar.o();
                                    uVar.O(6);
                                    int iT3 = uVar.t();
                                    String str3 = i0.f5136a;
                                    int iW = i0.w(iT3, ByteOrder.LITTLE_ENDIAN);
                                    int iT4 = uVar.a() > 0 ? uVar.t() : 0;
                                    s sVar = new s();
                                    sVar.m = x0.n(str);
                                    sVar.E = iT2;
                                    sVar.F = iO3;
                                    if (str.equals("audio/raw") && iW != 0) {
                                        sVar.G = iW;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iT4 > 0) {
                                        byte[] bArr = new byte[iT4];
                                        uVar.k(0, iT4, bArr);
                                        sVar.f1504p = t0.s(bArr);
                                    }
                                    gVar = new g(new t(sVar));
                                } else {
                                    a1.b.y("Ignoring track with unsupported format tag ", iT, "StreamFormatChunk");
                                }
                            } else {
                                e7.a.m("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + i0.z(iA));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            uVar.O(i11);
                            int iO4 = uVar.o();
                            int iO5 = uVar.o();
                            uVar.O(i11);
                            int iO6 = uVar.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                s sVar2 = new s();
                                sVar2.f1508t = iO4;
                                sVar2.f1509u = iO5;
                                sVar2.m = x0.n(str2);
                                gVar = new g(new t(sVar2));
                            } else {
                                a1.b.y("Ignoring track with unsupported compression ", iO6, "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = uVar.o();
                        uVar.O(8);
                        int iO8 = uVar.o();
                        int iO9 = uVar.o();
                        uVar.O(i11);
                        uVar.o();
                        uVar.O(12);
                        gVar = new c(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = uVar.o();
                        uVar.O(12);
                        uVar.o();
                        int iO11 = uVar.o();
                        int iO12 = uVar.o();
                        uVar.O(i11);
                        int iO13 = uVar.o();
                        int iO14 = uVar.o();
                        uVar.O(i11);
                        dVar = new d(iO10, iO11, iO12, iO13, iO14, uVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(uVar.y(uVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(uVar.o(), uVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                int i14 = i13 + 1;
                int iB = n0.b(objArrCopyOf.length, i14);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i13] = gVar;
                i13 = i14;
            }
            uVar.N(iO2);
            uVar.M(i12);
            i11 = 4;
        }
        return new f(i10, t0.l(i13, objArrCopyOf));
    }

    public final a a(Class cls) {
        r0 r0VarListIterator = this.f3011a.listIterator(0);
        while (r0VarListIterator.hasNext()) {
            a aVar = (a) r0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.f3012b;
    }
}
