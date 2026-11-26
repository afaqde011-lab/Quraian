package y8;

import com.google.android.gms.cast.MediaError;
import e7.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m10.z;

public final class c extends i {

    public final int f16787i;

    public final int f16788j;

    public final int f16789k;

    public List f16791o;

    public List f16792p;

    public int f16793q;

    public int f16794r;

    public boolean f16795s;

    public boolean f16796t;

    public byte f16797u;

    public byte f16798v;

    public boolean f16800x;

    public long f16801y;

    public static final int[] f16785z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, MediaError.DetailedErrorCode.MEDIA_DECODE, MediaError.DetailedErrorCode.MEDIA_NETWORK, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 105, 106, 107, 108, 109, MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, MediaError.DetailedErrorCode.MEDIAKEYS_WEBCRYPTO, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    public final u f16786h = new u();
    public final ArrayList m = new ArrayList();

    public b f16790n = new b(0, 4);

    public int f16799w = 0;
    public final long l = 16000000;

    public c(String str, int i10) {
        this.f16787i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f16789k = 0;
            this.f16788j = 0;
        } else if (i10 == 2) {
            this.f16789k = 1;
            this.f16788j = 0;
        } else if (i10 == 3) {
            this.f16789k = 0;
            this.f16788j = 1;
        } else if (i10 != 4) {
            e7.a.m("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f16789k = 0;
            this.f16788j = 0;
        } else {
            this.f16789k = 1;
            this.f16788j = 1;
        }
        l(0);
        k();
        this.f16800x = true;
        this.f16801y = -9223372036854775807L;
    }

    @Override
    public final z f() {
        List list = this.f16791o;
        this.f16792p = list;
        list.getClass();
        return new z(list);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f16791o = null;
        this.f16792p = null;
        l(0);
        this.f16794r = 4;
        this.f16790n.f16784h = 4;
        k();
        this.f16795s = false;
        this.f16796t = false;
        this.f16797u = (byte) 0;
        this.f16798v = (byte) 0;
        this.f16799w = 0;
        this.f16800x = true;
        this.f16801y = -9223372036854775807L;
    }

    @Override
    public final void g(h hVar) {
        boolean z10;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = hVar.E;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        u uVar = this.f16786h;
        uVar.L(iLimit, bArrArray);
        boolean z11 = false;
        while (true) {
            int iA = uVar.a();
            int i14 = this.f16787i;
            if (iA < i14) {
                if (z11) {
                    int i15 = this.f16793q;
                    if (i15 == 1 || i15 == 3) {
                        this.f16791o = j();
                        this.f16801y = this.f16843e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iA2 = i14 == 2 ? -4 : uVar.A();
            int iA3 = uVar.A();
            int iA4 = uVar.A();
            if ((iA2 & 2) == 0 && (iA2 & 1) == this.f16788j) {
                byte b7 = (byte) (iA3 & 127);
                byte b10 = (byte) (iA4 & 127);
                if (b7 != 0 || b10 != 0) {
                    boolean z12 = this.f16795s;
                    if ((iA2 & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iA3] && zArr[iA4]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f16795s = z10;
                    if (!z10 || (b7 & 240) != 16) {
                        this.f16796t = false;
                        if (!z10) {
                            if (1 > b7 && b7 <= 15) {
                                this.f16800x = false;
                            } else if ((b7 & 246) == 20) {
                                if (b10 == 32 && b10 != 47) {
                                    switch (b10) {
                                        default:
                                            switch (b10) {
                                                case 42:
                                                case 43:
                                                    this.f16800x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f16800x = true;
                                            break;
                                    }
                                } else {
                                    this.f16800x = true;
                                }
                            }
                            if (this.f16800x) {
                                i10 = b7 & 224;
                                if (i10 == 0) {
                                    this.f16799w = (b7 >> 3) & 1;
                                }
                                if (this.f16799w != this.f16789k) {
                                    if (i10 == 0) {
                                        i11 = b7 & 247;
                                        if (i11 == 17 || (b10 & 240) != 48) {
                                            i12 = b7 & 246;
                                            if (i12 != 18 && (b10 & 224) == 32) {
                                                this.f16790n.b();
                                                this.f16790n.a((char) ((b7 & 1) == 0 ? E[b10 & 31] : F[b10 & 31]));
                                            } else if (i11 != 17 && (b10 & 240) == 32) {
                                                this.f16790n.a(' ');
                                                boolean z13 = (b10 & 1) == 1;
                                                b bVar = this.f16790n;
                                                bVar.f16777a.add(new a((b10 >> 1) & 7, bVar.f16779c.length(), z13));
                                            } else if ((b7 & 240) != 16 && (b10 & 192) == 64) {
                                                int i16 = f16785z[b7 & 7];
                                                if ((b10 & 32) != 0) {
                                                    i16++;
                                                }
                                                b bVar2 = this.f16790n;
                                                if (i16 != bVar2.f16780d) {
                                                    if (this.f16793q != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f16793q, this.f16794r);
                                                        this.f16790n = bVar3;
                                                        this.m.add(bVar3);
                                                    }
                                                    this.f16790n.f16780d = i16;
                                                }
                                                boolean z14 = (b10 & 16) == 16;
                                                boolean z15 = (b10 & 1) == 1;
                                                int i17 = (b10 >> 1) & 7;
                                                b bVar4 = this.f16790n;
                                                bVar4.f16777a.add(new a(z14 ? 8 : i17, bVar4.f16779c.length(), z15));
                                                if (z14) {
                                                    this.f16790n.f16781e = A[i17];
                                                }
                                            } else if (i11 != 23 && b10 >= 33 && b10 <= 35) {
                                                this.f16790n.f16782f = b10 - 32;
                                            } else if (i12 == 20 && (b10 & 240) == 32) {
                                                if (b10 == 32) {
                                                    l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            l(1);
                                                            this.f16794r = 2;
                                                            this.f16790n.f16784h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f16794r = 3;
                                                            this.f16790n.f16784h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.f16794r = 4;
                                                            this.f16790n.f16784h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f16793q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f16791o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1 || i13 == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1 && !this.f16790n.e()) {
                                                                                b bVar5 = this.f16790n;
                                                                                arrayList = bVar5.f16778b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f16779c.setLength(0);
                                                                                bVar5.f16777a.clear();
                                                                                iMin = Math.min(bVar5.f16784h, bVar5.f16780d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f16791o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f16790n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.f16790n.a((char) D[b10 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f16790n;
                                        iArr = C;
                                        bVar6.a((char) iArr[(b7 & 127) - 32]);
                                        if ((b10 & 224) != 0) {
                                            this.f16790n.a((char) iArr[(b10 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            k();
                            z11 = true;
                        }
                    } else if (this.f16796t && this.f16797u == b7 && this.f16798v == b10) {
                        this.f16796t = false;
                    } else {
                        this.f16796t = true;
                        this.f16797u = b7;
                        this.f16798v = b10;
                        if (!z10) {
                            if (1 > b7) {
                                if ((b7 & 246) == 20) {
                                    if (b10 == 32) {
                                        this.f16800x = true;
                                    } else {
                                        this.f16800x = true;
                                    }
                                }
                            } else if ((b7 & 246) == 20) {
                                if (b10 == 32) {
                                    this.f16800x = true;
                                } else {
                                    this.f16800x = true;
                                }
                            }
                            if (this.f16800x) {
                                i10 = b7 & 224;
                                if (i10 == 0) {
                                    this.f16799w = (b7 >> 3) & 1;
                                }
                                if (this.f16799w != this.f16789k) {
                                    if (i10 == 0) {
                                        i11 = b7 & 247;
                                        if (i11 == 17) {
                                            i12 = b7 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b7 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b10 == 32) {
                                                                    l(2);
                                                                } else if (b10 != 41) {
                                                                    switch (b10) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.f16794r = 2;
                                                                            this.f16790n.f16784h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.f16794r = 3;
                                                                            this.f16790n.f16784h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.f16794r = 4;
                                                                            this.f16790n.f16784h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f16793q;
                                                                            if (i13 != 0) {
                                                                                if (b10 != 33) {
                                                                                    switch (b10) {
                                                                                        case 44:
                                                                                            this.f16791o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar7 = this.f16790n;
                                                                                                arrayList = bVar7.f16778b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f16779c.setLength(0);
                                                                                                bVar7.f16777a.clear();
                                                                                                iMin = Math.min(bVar7.f16784h, bVar7.f16780d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f16791o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f16790n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar8 = this.f16790n;
                                                                                            arrayList = bVar8.f16778b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f16779c.setLength(0);
                                                                                            bVar8.f16777a.clear();
                                                                                            iMin = Math.min(bVar8.f16784h, bVar8.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar9 = this.f16790n;
                                                                                            arrayList = bVar9.f16778b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f16779c.setLength(0);
                                                                                            bVar9.f16777a.clear();
                                                                                            iMin = Math.min(bVar9.f16784h, bVar9.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar10 = this.f16790n;
                                                                                        arrayList = bVar10.f16778b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f16779c.setLength(0);
                                                                                        bVar10.f16777a.clear();
                                                                                        iMin = Math.min(bVar10.f16784h, bVar10.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b7 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar11 = this.f16790n;
                                                                                            arrayList = bVar11.f16778b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f16779c.setLength(0);
                                                                                            bVar11.f16777a.clear();
                                                                                            iMin = Math.min(bVar11.f16784h, bVar11.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar12 = this.f16790n;
                                                                                        arrayList = bVar12.f16778b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f16779c.setLength(0);
                                                                                        bVar12.f16777a.clear();
                                                                                        iMin = Math.min(bVar12.f16784h, bVar12.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar13 = this.f16790n;
                                                                                        arrayList = bVar13.f16778b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f16779c.setLength(0);
                                                                                        bVar13.f16777a.clear();
                                                                                        iMin = Math.min(bVar13.f16784h, bVar13.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar14 = this.f16790n;
                                                                                    arrayList = bVar14.f16778b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f16779c.setLength(0);
                                                                                    bVar14.f16777a.clear();
                                                                                    iMin = Math.min(bVar14.f16784h, bVar14.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b7 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar15 = this.f16790n;
                                                                                            arrayList = bVar15.f16778b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f16779c.setLength(0);
                                                                                            bVar15.f16777a.clear();
                                                                                            iMin = Math.min(bVar15.f16784h, bVar15.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar16 = this.f16790n;
                                                                                        arrayList = bVar16.f16778b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f16779c.setLength(0);
                                                                                        bVar16.f16777a.clear();
                                                                                        iMin = Math.min(bVar16.f16784h, bVar16.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar17 = this.f16790n;
                                                                                        arrayList = bVar17.f16778b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f16779c.setLength(0);
                                                                                        bVar17.f16777a.clear();
                                                                                        iMin = Math.min(bVar17.f16784h, bVar17.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar18 = this.f16790n;
                                                                                    arrayList = bVar18.f16778b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f16779c.setLength(0);
                                                                                    bVar18.f16777a.clear();
                                                                                    iMin = Math.min(bVar18.f16784h, bVar18.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b7 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar19 = this.f16790n;
                                                                                        arrayList = bVar19.f16778b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f16779c.setLength(0);
                                                                                        bVar19.f16777a.clear();
                                                                                        iMin = Math.min(bVar19.f16784h, bVar19.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar110 = this.f16790n;
                                                                                    arrayList = bVar110.f16778b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f16779c.setLength(0);
                                                                                    bVar110.f16777a.clear();
                                                                                    iMin = Math.min(bVar110.f16784h, bVar110.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar111 = this.f16790n;
                                                                                    arrayList = bVar111.f16778b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f16779c.setLength(0);
                                                                                    bVar111.f16777a.clear();
                                                                                    iMin = Math.min(bVar111.f16784h, bVar111.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b10 == 32) {
                                                    l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            l(1);
                                                            this.f16794r = 2;
                                                            this.f16790n.f16784h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f16794r = 3;
                                                            this.f16790n.f16784h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.f16794r = 4;
                                                            this.f16790n.f16784h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f16793q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f16791o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar112 = this.f16790n;
                                                                                arrayList = bVar112.f16778b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f16779c.setLength(0);
                                                                                bVar112.f16777a.clear();
                                                                                iMin = Math.min(bVar112.f16784h, bVar112.f16780d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f16791o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f16790n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i12 = b7 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b7 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b10 == 32) {
                                                                    l(2);
                                                                } else if (b10 != 41) {
                                                                    switch (b10) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.f16794r = 2;
                                                                            this.f16790n.f16784h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.f16794r = 3;
                                                                            this.f16790n.f16784h = 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.f16794r = 4;
                                                                            this.f16790n.f16784h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f16793q;
                                                                            if (i13 != 0) {
                                                                                if (b10 != 33) {
                                                                                    switch (b10) {
                                                                                        case 44:
                                                                                            this.f16791o = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                b bVar113 = this.f16790n;
                                                                                                arrayList = bVar113.f16778b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f16779c.setLength(0);
                                                                                                bVar113.f16777a.clear();
                                                                                                iMin = Math.min(bVar113.f16784h, bVar113.f16780d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f16791o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f16790n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar114 = this.f16790n;
                                                                                            arrayList = bVar114.f16778b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f16779c.setLength(0);
                                                                                            bVar114.f16777a.clear();
                                                                                            iMin = Math.min(bVar114.f16784h, bVar114.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar115 = this.f16790n;
                                                                                            arrayList = bVar115.f16778b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f16779c.setLength(0);
                                                                                            bVar115.f16777a.clear();
                                                                                            iMin = Math.min(bVar115.f16784h, bVar115.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar116 = this.f16790n;
                                                                                        arrayList = bVar116.f16778b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f16779c.setLength(0);
                                                                                        bVar116.f16777a.clear();
                                                                                        iMin = Math.min(bVar116.f16784h, bVar116.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b7 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar117 = this.f16790n;
                                                                                            arrayList = bVar117.f16778b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f16779c.setLength(0);
                                                                                            bVar117.f16777a.clear();
                                                                                            iMin = Math.min(bVar117.f16784h, bVar117.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar118 = this.f16790n;
                                                                                        arrayList = bVar118.f16778b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f16779c.setLength(0);
                                                                                        bVar118.f16777a.clear();
                                                                                        iMin = Math.min(bVar118.f16784h, bVar118.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar119 = this.f16790n;
                                                                                        arrayList = bVar119.f16778b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f16779c.setLength(0);
                                                                                        bVar119.f16777a.clear();
                                                                                        iMin = Math.min(bVar119.f16784h, bVar119.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1110 = this.f16790n;
                                                                                    arrayList = bVar1110.f16778b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f16779c.setLength(0);
                                                                                    bVar1110.f16777a.clear();
                                                                                    iMin = Math.min(bVar1110.f16784h, bVar1110.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b7 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b10 == 32) {
                                                                l(2);
                                                            } else if (b10 != 41) {
                                                                switch (b10) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f16794r = 2;
                                                                        this.f16790n.f16784h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f16794r = 3;
                                                                        this.f16790n.f16784h = 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.f16794r = 4;
                                                                        this.f16790n.f16784h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f16793q;
                                                                        if (i13 != 0) {
                                                                            if (b10 != 33) {
                                                                                switch (b10) {
                                                                                    case 44:
                                                                                        this.f16791o = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            b bVar1111 = this.f16790n;
                                                                                            arrayList = bVar1111.f16778b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f16779c.setLength(0);
                                                                                            bVar1111.f16777a.clear();
                                                                                            iMin = Math.min(bVar1111.f16784h, bVar1111.f16780d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f16791o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f16790n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1112 = this.f16790n;
                                                                                        arrayList = bVar1112.f16778b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f16779c.setLength(0);
                                                                                        bVar1112.f16777a.clear();
                                                                                        iMin = Math.min(bVar1112.f16784h, bVar1112.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1113 = this.f16790n;
                                                                                        arrayList = bVar1113.f16778b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f16779c.setLength(0);
                                                                                        bVar1113.f16777a.clear();
                                                                                        iMin = Math.min(bVar1113.f16784h, bVar1113.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1114 = this.f16790n;
                                                                                    arrayList = bVar1114.f16778b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f16779c.setLength(0);
                                                                                    bVar1114.f16777a.clear();
                                                                                    iMin = Math.min(bVar1114.f16784h, bVar1114.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b7 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b10 == 32) {
                                                            l(2);
                                                        } else if (b10 != 41) {
                                                            switch (b10) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f16794r = 2;
                                                                    this.f16790n.f16784h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f16794r = 3;
                                                                    this.f16790n.f16784h = 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.f16794r = 4;
                                                                    this.f16790n.f16784h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f16793q;
                                                                    if (i13 != 0) {
                                                                        if (b10 != 33) {
                                                                            switch (b10) {
                                                                                case 44:
                                                                                    this.f16791o = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        b bVar1115 = this.f16790n;
                                                                                        arrayList = bVar1115.f16778b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f16779c.setLength(0);
                                                                                        bVar1115.f16777a.clear();
                                                                                        iMin = Math.min(bVar1115.f16784h, bVar1115.f16780d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f16791o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f16790n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1116 = this.f16790n;
                                                                                    arrayList = bVar1116.f16778b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f16779c.setLength(0);
                                                                                    bVar1116.f16777a.clear();
                                                                                    iMin = Math.min(bVar1116.f16784h, bVar1116.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b10 == 32) {
                                                        l(2);
                                                    } else if (b10 != 41) {
                                                        switch (b10) {
                                                            case 37:
                                                                l(1);
                                                                this.f16794r = 2;
                                                                this.f16790n.f16784h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f16794r = 3;
                                                                this.f16790n.f16784h = 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.f16794r = 4;
                                                                this.f16790n.f16784h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f16793q;
                                                                if (i13 != 0) {
                                                                    if (b10 != 33) {
                                                                        switch (b10) {
                                                                            case 44:
                                                                                this.f16791o = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    b bVar1117 = this.f16790n;
                                                                                    arrayList = bVar1117.f16778b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f16779c.setLength(0);
                                                                                    bVar1117.f16777a.clear();
                                                                                    iMin = Math.min(bVar1117.f16784h, bVar1117.f16780d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f16791o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f16790n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b10 == 32) {
                                                    l(2);
                                                } else if (b10 != 41) {
                                                    switch (b10) {
                                                        case 37:
                                                            l(1);
                                                            this.f16794r = 2;
                                                            this.f16790n.f16784h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f16794r = 3;
                                                            this.f16790n.f16784h = 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.f16794r = 4;
                                                            this.f16790n.f16784h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f16793q;
                                                            if (i13 != 0) {
                                                                if (b10 != 33) {
                                                                    switch (b10) {
                                                                        case 44:
                                                                            this.f16791o = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                b bVar1118 = this.f16790n;
                                                                                arrayList = bVar1118.f16778b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f16779c.setLength(0);
                                                                                bVar1118.f16777a.clear();
                                                                                iMin = Math.min(bVar1118.f16784h, bVar1118.f16780d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f16791o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f16790n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f16790n;
                                        iArr = C;
                                        bVar20.a((char) iArr[(b7 & 127) - 32]);
                                        if ((b10 & 224) != 0) {
                                            this.f16790n.a((char) iArr[(b10 & 127) - 32]);
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            k();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final x8.c d() {
        x8.c cVar;
        x8.c cVarD = super.d();
        if (cVarD != null) {
            return cVarD;
        }
        long j9 = this.l;
        if (j9 == -9223372036854775807L) {
            return null;
        }
        long j10 = this.f16801y;
        if (j10 == -9223372036854775807L || this.f16843e - j10 < j9 || (cVar = (x8.c) this.f16840b.pollFirst()) == null) {
            return null;
        }
        this.f16791o = Collections.EMPTY_LIST;
        this.f16801y = -9223372036854775807L;
        z zVarF = f();
        long j11 = this.f16843e;
        cVar.C = j11;
        cVar.E = zVarF;
        cVar.F = j11;
        return cVar;
    }

    @Override
    public final boolean i() {
        return this.f16791o != this.f16792p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            d7.b bVarC = ((b) arrayList.get(i10)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f4755i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            d7.b bVarC2 = (d7.b) arrayList2.get(i11);
            if (bVarC2 != null) {
                if (bVarC2.f4755i != iMin) {
                    bVarC2 = ((b) arrayList.get(i11)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f16790n;
        bVar.f16783g = this.f16793q;
        bVar.f16777a.clear();
        bVar.f16778b.clear();
        bVar.f16779c.setLength(0);
        bVar.f16780d = 15;
        bVar.f16781e = 0;
        bVar.f16782f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.f16790n);
    }

    public final void l(int i10) {
        int i11 = this.f16793q;
        if (i11 == i10) {
            return;
        }
        this.f16793q = i10;
        if (i10 != 3) {
            k();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f16791o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i12)).f16783g = i10;
            i12++;
        }
    }

    @Override
    public final void release() {
    }
}
