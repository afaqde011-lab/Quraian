package u8;

import a8.h0;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaStatus;
import com.google.protobuf.RuntimeVersion;
import e7.u;
import fh.q0;
import fh.r0;
import fh.t0;
import h9.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import qd.j0;

public abstract class p {

    public static final int[] f15092a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static String b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((t) it.next()).f15124a.f15099g.f1594n;
            if (x0.m(str2)) {
                return "video/mp4";
            }
            if (x0.j(str2)) {
                z10 = true;
            } else if (x0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static boolean c(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f15092a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static o8.e d(int i10, u uVar) {
        int iM = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.O(8);
            String strW = uVar.w(iM - 16);
            return new o8.e("und", strW, strW);
        }
        e7.a.m("MetadataUtil", "Failed to parse comment attribute: " + f7.e.b(i10));
        return null;
    }

    public static o8.a e(u uVar) {
        String str;
        int iM = uVar.m();
        if (uVar.m() != 1684108385) {
            e7.a.m("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = uVar.m();
        byte[] bArr = c.f15009a;
        int i10 = iM2 & 16777215;
        if (i10 == 13) {
            str = "image/jpeg";
        } else {
            str = i10 == 14 ? "image/png" : null;
        }
        if (str == null) {
            a1.b.y("Unrecognized cover art flags: ", i10, "MetadataUtil");
            return null;
        }
        uVar.O(4);
        int i11 = iM - 16;
        byte[] bArr2 = new byte[i11];
        uVar.k(0, i11, bArr2);
        return new o8.a(str, null, 3, bArr2);
    }

    public static o8.o f(int i10, u uVar, String str) {
        int iM = uVar.m();
        if (uVar.m() == 1684108385 && iM >= 22) {
            uVar.O(10);
            int iH = uVar.H();
            if (iH > 0) {
                String strF = g4.c.f(iH, RuntimeVersion.SUFFIX);
                int iH2 = uVar.H();
                if (iH2 > 0) {
                    strF = strF + "/" + iH2;
                }
                return new o8.o(str, null, t0.s(strF));
            }
        }
        e7.a.m("MetadataUtil", "Failed to parse index/count attribute: " + f7.e.b(i10));
        return null;
    }

    public static int g(u uVar) {
        int iM = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.O(8);
            int i10 = iM - 16;
            if (i10 == 1) {
                return uVar.A();
            }
            if (i10 == 2) {
                return uVar.H();
            }
            if (i10 == 3) {
                return uVar.D();
            }
            if (i10 == 4 && (uVar.j() & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                return uVar.E();
            }
        }
        e7.a.m("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static o8.j h(int i10, String str, u uVar, boolean z10, boolean z11) {
        int iG = g(uVar);
        if (z11) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z10 ? new o8.o(str, null, t0.s(Integer.toString(iG))) : new o8.e("und", str, Integer.toString(iG));
        }
        e7.a.m("MetadataUtil", "Failed to parse uint8 attribute: " + f7.e.b(i10));
        return null;
    }

    public static c50.h i(byte[] bArr) {
        UUID[] uuidArr;
        u uVar = new u(bArr);
        if (uVar.f5184c < 32) {
            return null;
        }
        uVar.N(0);
        int iA = uVar.a();
        int iM = uVar.m();
        if (iM != iA) {
            e7.a.m("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = uVar.m();
        if (iM2 != 1886614376) {
            a1.b.y("Atom type is not pssh: ", iM2, "PsshAtomUtil");
            return null;
        }
        int iE = c.e(uVar.m());
        if (iE > 1) {
            a1.b.y("Unsupported pssh version: ", iE, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(uVar.u(), uVar.u());
        if (iE == 1) {
            int iE2 = uVar.E();
            uuidArr = new UUID[iE2];
            for (int i10 = 0; i10 < iE2; i10++) {
                uuidArr[i10] = new UUID(uVar.u(), uVar.u());
            }
        } else {
            uuidArr = null;
        }
        int iE3 = uVar.E();
        int iA2 = uVar.a();
        if (iE3 == iA2) {
            byte[] bArr2 = new byte[iE3];
            uVar.k(0, iE3, bArr2);
            return new c50.h(uuid, iE, bArr2, uuidArr);
        }
        e7.a.m("PsshAtomUtil", "Atom data size (" + iE3 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] j(UUID uuid, byte[] bArr) {
        c50.h hVarI = i(bArr);
        if (hVarI == null) {
            return null;
        }
        UUID uuid2 = (UUID) hVarI.C;
        if (uuid.equals(uuid2)) {
            return (byte[]) hVarI.D;
        }
        e7.a.m("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    public static o8.o k(int i10, u uVar, String str) {
        int iM = uVar.m();
        if (uVar.m() == 1684108385) {
            uVar.O(8);
            return new o8.o(str, null, t0.s(uVar.w(iM - 16)));
        }
        e7.a.m("MetadataUtil", "Failed to parse text attribute: " + f7.e.b(i10));
        return null;
    }

    public static void l(int i10, v0 v0Var, androidx.media3.common.s sVar, v0 v0Var2, v0... v0VarArr) {
        if (v0Var2 == null) {
            v0Var2 = new v0(new u0[0]);
        }
        if (v0Var != null) {
            q0 q0VarM = t0.m();
            for (u0 u0Var : v0Var.f1660a) {
                if (f7.a.class.isAssignableFrom(u0Var.getClass())) {
                    q0VarM.c((u0) f7.a.class.cast(u0Var));
                }
            }
            r0 r0VarListIterator = q0VarM.g().listIterator(0);
            while (r0VarListIterator.hasNext()) {
                f7.a aVar = (f7.a) r0VarListIterator.next();
                if (!aVar.f5489a.equals("com.android.capture.fps") || i10 == 2) {
                    v0Var2 = v0Var2.a(aVar);
                }
            }
        }
        for (v0 v0Var3 : v0VarArr) {
            v0Var2 = v0Var2.b(v0Var3);
        }
        if (v0Var2.f1660a.length > 0) {
            sVar.f1501k = v0Var2;
        }
    }

    public static h0 m(a8.r rVar, boolean z10, boolean z11) {
        h0 h0Var;
        int i10;
        int i11;
        long j9;
        int i12;
        int[] iArr;
        long length = rVar.getLength();
        long j10 = -1;
        long j11 = MediaStatus.COMMAND_EDIT_TRACKS;
        if (length != -1 && length <= MediaStatus.COMMAND_EDIT_TRACKS) {
            j11 = length;
        }
        int i13 = (int) j11;
        u uVar = new u(64);
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i15 < i13) {
                uVar.K(8);
                boolean z13 = true;
                if (rVar.i(uVar.f5182a, i14, 8, true)) {
                    long jC = uVar.C();
                    int iM = uVar.m();
                    if (jC == 1) {
                        j10 = j10;
                        rVar.a(8, 8, uVar.f5182a);
                        i11 = 16;
                        uVar.M(16);
                        jC = uVar.u();
                        i15 = i15;
                    } else {
                        j10 = j10;
                        if (jC == 0) {
                            long length2 = rVar.getLength();
                            if (length2 != j10) {
                                jC = (length2 - rVar.j()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j12 = jC;
                    h0Var = null;
                    long j13 = i11;
                    if (j12 < j13) {
                        if (iM != 1718773093 || i11 != 8) {
                            return new w(iM, j12, i11);
                        }
                        j12 = j13;
                    }
                    int i16 = i15 + i11;
                    if (iM == 1836019574) {
                        i13 += (int) j12;
                        if (length != -1 && i13 > length) {
                            i13 = (int) length;
                        }
                        i15 = i16;
                        i14 = 0;
                    } else {
                        if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                            j9 = length;
                            i12 = 0;
                            i15 = i16;
                        } else if (iM == 1836019558 || iM == 1836475768) {
                            i10 = 1;
                        } else {
                            if (iM == 1835295092) {
                                z12 = true;
                            }
                            if (iM != 1937007212 || j12 <= 1000000) {
                                j9 = length;
                                if ((((long) i16) + j12) - j13 < i13) {
                                    int i17 = (int) (j12 - j13);
                                    i15 = i16 + i17;
                                    if (iM != 1718909296) {
                                        i12 = 0;
                                        if (i17 != 0) {
                                            rVar.m(i17);
                                        }
                                    } else {
                                        if (i17 < 8) {
                                            return new w(iM, i17, 8);
                                        }
                                        uVar.K(i17);
                                        i12 = 0;
                                        rVar.a(0, i17, uVar.f5182a);
                                        int iM2 = uVar.m();
                                        if (c(iM2, z11)) {
                                            z12 = true;
                                        }
                                        uVar.O(4);
                                        int iA = uVar.a() / 4;
                                        if (!z12 && iA > 0) {
                                            iArr = new int[iA];
                                            int i18 = 0;
                                            while (true) {
                                                if (i18 >= iA) {
                                                    z13 = z12;
                                                    break;
                                                }
                                                int iM3 = uVar.m();
                                                iArr[i18] = iM3;
                                                if (c(iM3, z11)) {
                                                    break;
                                                }
                                                i18++;
                                            }
                                        } else {
                                            z13 = z12;
                                            iArr = h0Var;
                                        }
                                        if (!z13) {
                                            return new j0(iArr, iM2);
                                        }
                                        z12 = z13;
                                    }
                                }
                            }
                            i10 = 0;
                        }
                        i14 = i12;
                        length = j9;
                    }
                }
                if (!z12) {
                    return m.A;
                }
                if (z10 != i10) {
                    return i10 != 0 ? i.B : i.C;
                }
                return h0Var;
            }
            h0Var = null;
            i10 = i14;
            if (!z12) {
                return m.A;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return h0Var;
        }
    }
}
