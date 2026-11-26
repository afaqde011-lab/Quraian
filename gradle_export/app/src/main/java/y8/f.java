package y8;

import a8.n0;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e7.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m10.z;
import ta.c0;

public final class f extends i {

    public final u f16829h = new u();

    public final n0 f16830i = new n0();

    public int f16831j = -1;

    public final int f16832k;
    public final e[] l;
    public e m;

    public List f16833n;

    public List f16834o;

    public n0 f16835p;

    public int f16836q;

    public f(int i10, List list) {
        this.f16832k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e7.e.f5121a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b7 = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.l[i11] = new e();
        }
        this.m = this.l[0];
    }

    @Override
    public final z f() {
        List list = this.f16833n;
        this.f16834o = list;
        list.getClass();
        return new z(list);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f16833n = null;
        this.f16834o = null;
        this.f16836q = 0;
        this.m = this.l[0];
        l();
        this.f16835p = null;
    }

    @Override
    public final void g(h hVar) {
        ByteBuffer byteBuffer = hVar.E;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        u uVar = this.f16829h;
        uVar.L(iLimit, bArrArray);
        while (uVar.a() >= 3) {
            int iA = uVar.A();
            int i10 = iA & 3;
            boolean z10 = (iA & 4) == 4;
            byte bA = (byte) uVar.A();
            byte bA2 = (byte) uVar.A();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (bA & 192) >> 6;
                        int i12 = this.f16831j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e7.a.m("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f16831j + " current=" + i11);
                        }
                        this.f16831j = i11;
                        int i13 = bA & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        n0 n0Var = new n0(i11, i13);
                        this.f16835p = n0Var;
                        byte[] bArr = n0Var.f300b;
                        n0Var.f303e = 1;
                        bArr[0] = bA2;
                    } else {
                        c0.s(i10 == 2);
                        n0 n0Var2 = this.f16835p;
                        if (n0Var2 == null) {
                            e7.a.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = n0Var2.f300b;
                            int i14 = n0Var2.f303e;
                            int i15 = i14 + 1;
                            n0Var2.f303e = i15;
                            bArr2[i14] = bA;
                            n0Var2.f303e = i14 + 2;
                            bArr2[i15] = bA2;
                        }
                    }
                    n0 n0Var3 = this.f16835p;
                    if (n0Var3.f303e == (n0Var3.f302d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override
    public final boolean i() {
        return this.f16833n != this.f16834o;
    }

    public final void j() {
        char c10;
        boolean z10;
        n0 n0Var = this.f16835p;
        if (n0Var == null) {
            return;
        }
        int i10 = 2;
        if (n0Var.f303e != (n0Var.f302d * 2) - 1) {
            e7.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f16835p.f302d * 2) - 1) + ", but current index is " + this.f16835p.f303e + " (sequence number " + this.f16835p.f301c + ");");
        }
        n0 n0Var2 = this.f16835p;
        byte[] bArr = n0Var2.f300b;
        int i11 = n0Var2.f303e;
        n0 n0Var3 = this.f16830i;
        n0Var3.o(i11, bArr);
        boolean z11 = false;
        while (n0Var3.b() > 0) {
            int i12 = 3;
            int i13 = n0Var3.i(3);
            int i14 = n0Var3.i(5);
            if (i13 == 7) {
                n0Var3.t(i10);
                i13 = n0Var3.i(6);
                if (i13 < 7) {
                    a1.b.y("Invalid extended service number: ", i13, "Cea708Decoder");
                }
            }
            if (i14 == 0) {
                if (i13 != 0) {
                    e7.a.m("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                }
                if (z11) {
                    this.f16833n = k();
                }
                this.f16835p = null;
            }
            if (i13 != this.f16832k) {
                n0Var3.u(i14);
            } else {
                int iG = (i14 * 8) + n0Var3.g();
                while (n0Var3.g() < iG) {
                    int i15 = n0Var3.i(8);
                    if (i15 != 16) {
                        if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i12) {
                                    this.f16833n = k();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 >= 17 && i15 <= 23) {
                                                e7.a.m("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                n0Var3.t(8);
                                            } else if (i15 < 24 || i15 > 31) {
                                                a1.b.y("Invalid C0 command: ", i15, "Cea708Decoder");
                                            } else {
                                                e7.a.m("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                n0Var3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.f16811b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.m.a((char) 9835);
                            } else {
                                this.m.a((char) (i15 & 255));
                            }
                            z11 = true;
                        } else {
                            if (i15 <= 159) {
                                e[] eVarArr = this.l;
                                switch (i15) {
                                    case Cast.MAX_NAMESPACE_LENGTH:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z10 = true;
                                        int i16 = i15 - 128;
                                        if (this.f16836q != i16) {
                                            this.f16836q = i16;
                                            this.m = eVarArr[i16];
                                        }
                                        break;
                                    case 136:
                                        z10 = true;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (n0Var3.h()) {
                                                e eVar = eVarArr[8 - i17];
                                                eVar.f16810a.clear();
                                                eVar.f16811b.clear();
                                                eVar.f16822o = -1;
                                                eVar.f16823p = -1;
                                                eVar.f16824q = -1;
                                                eVar.f16826s = -1;
                                                eVar.f16828u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (n0Var3.h()) {
                                                eVarArr[8 - i18].f16813d = true;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 138:
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (n0Var3.h()) {
                                                eVarArr[8 - i19].f16813d = false;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 139:
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (n0Var3.h()) {
                                                e eVar2 = eVarArr[8 - i20];
                                                eVar2.f16813d = !eVar2.f16813d;
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 140:
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (n0Var3.h()) {
                                                eVarArr[8 - i21].d();
                                            }
                                        }
                                        z10 = true;
                                        break;
                                    case 141:
                                        n0Var3.t(8);
                                        z10 = true;
                                        break;
                                    case 142:
                                        z10 = true;
                                        break;
                                    case 143:
                                        l();
                                        z10 = true;
                                        break;
                                    case 144:
                                        int i22 = i10;
                                        if (this.m.f16812c) {
                                            n0Var3.i(4);
                                            n0Var3.i(i22);
                                            n0Var3.i(i22);
                                            boolean zH = n0Var3.h();
                                            boolean zH2 = n0Var3.h();
                                            i12 = 3;
                                            n0Var3.i(3);
                                            n0Var3.i(3);
                                            this.m.e(zH, zH2);
                                            z10 = true;
                                        } else {
                                            n0Var3.t(16);
                                            z10 = true;
                                            i12 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.f16812c) {
                                            int iC = e.c(n0Var3.i(2), n0Var3.i(2), n0Var3.i(2), n0Var3.i(2));
                                            int iC2 = e.c(n0Var3.i(2), n0Var3.i(2), n0Var3.i(2), n0Var3.i(2));
                                            n0Var3.t(2);
                                            e.c(n0Var3.i(2), n0Var3.i(2), n0Var3.i(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            n0Var3.t(24);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 146:
                                        if (this.m.f16812c) {
                                            n0Var3.t(4);
                                            int i23 = n0Var3.i(4);
                                            n0Var3.t(2);
                                            n0Var3.i(6);
                                            e eVar3 = this.m;
                                            if (eVar3.f16828u != i23) {
                                                eVar3.a('\n');
                                            }
                                            eVar3.f16828u = i23;
                                        } else {
                                            n0Var3.t(16);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        a1.b.y("Invalid C1 command: ", i15, "Cea708Decoder");
                                        z10 = true;
                                        break;
                                    case 151:
                                        if (this.m.f16812c) {
                                            int iC3 = e.c(n0Var3.i(2), n0Var3.i(2), n0Var3.i(2), n0Var3.i(2));
                                            n0Var3.i(2);
                                            e.c(n0Var3.i(2), n0Var3.i(2), n0Var3.i(2), 0);
                                            n0Var3.h();
                                            n0Var3.h();
                                            n0Var3.i(2);
                                            n0Var3.i(2);
                                            int i24 = n0Var3.i(2);
                                            n0Var3.t(8);
                                            e eVar4 = this.m;
                                            eVar4.f16821n = iC3;
                                            eVar4.f16820k = i24;
                                        } else {
                                            n0Var3.t(32);
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case ModuleDescriptor.MODULE_VERSION:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i25 = i15 - 152;
                                        e eVar5 = eVarArr[i25];
                                        n0Var3.t(i10);
                                        boolean zH3 = n0Var3.h();
                                        n0Var3.t(i10);
                                        int i26 = n0Var3.i(i12);
                                        boolean zH4 = n0Var3.h();
                                        int i27 = n0Var3.i(7);
                                        int i28 = n0Var3.i(8);
                                        int i29 = n0Var3.i(4);
                                        int i30 = n0Var3.i(4);
                                        n0Var3.t(i10);
                                        n0Var3.t(6);
                                        n0Var3.t(i10);
                                        int i31 = n0Var3.i(3);
                                        int i32 = n0Var3.i(3);
                                        ArrayList arrayList = eVar5.f16810a;
                                        eVar5.f16812c = true;
                                        eVar5.f16813d = zH3;
                                        eVar5.f16814e = i26;
                                        eVar5.f16815f = zH4;
                                        eVar5.f16816g = i27;
                                        eVar5.f16817h = i28;
                                        eVar5.f16818i = i29;
                                        int i33 = i30 + 1;
                                        if (eVar5.f16819j != i33) {
                                            eVar5.f16819j = i33;
                                            while (true) {
                                                if (arrayList.size() >= eVar5.f16819j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i31 != 0 && eVar5.l != i31) {
                                            eVar5.l = i31;
                                            int i34 = i31 - 1;
                                            int i35 = e.B[i34];
                                            boolean z12 = e.A[i34];
                                            int i36 = e.f16808y[i34];
                                            int i37 = e.f16809z[i34];
                                            int i38 = e.f16807x[i34];
                                            eVar5.f16821n = i35;
                                            eVar5.f16820k = i38;
                                        }
                                        if (i32 != 0 && eVar5.m != i32) {
                                            eVar5.m = i32;
                                            int i39 = i32 - 1;
                                            int i40 = e.D[i39];
                                            int i41 = e.C[i39];
                                            eVar5.e(false, false);
                                            eVar5.f(e.f16805v, e.E[i39]);
                                        }
                                        if (this.f16836q != i25) {
                                            this.f16836q = i25;
                                            this.m = eVarArr[i25];
                                        }
                                        z10 = true;
                                        i12 = 3;
                                        break;
                                }
                            } else {
                                z10 = true;
                                if (i15 <= 255) {
                                    this.m.a((char) (i15 & 255));
                                } else {
                                    a1.b.y("Invalid base command: ", i15, "Cea708Decoder");
                                }
                                i10 = 2;
                                c10 = 7;
                            }
                            z11 = z10;
                            i10 = 2;
                            c10 = 7;
                        }
                        c10 = 7;
                    } else {
                        int i42 = n0Var3.i(8);
                        if (i42 <= 31) {
                            c10 = 7;
                            if (i42 > 7) {
                                if (i42 <= 15) {
                                    n0Var3.t(8);
                                } else if (i42 <= 23) {
                                    n0Var3.t(16);
                                } else if (i42 <= 31) {
                                    n0Var3.t(24);
                                }
                            }
                        } else {
                            c10 = 7;
                            if (i42 <= 127) {
                                if (i42 == 32) {
                                    this.m.a(' ');
                                } else if (i42 == 33) {
                                    this.m.a((char) 160);
                                } else if (i42 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i42 == 42) {
                                    this.m.a((char) 352);
                                } else if (i42 == 44) {
                                    this.m.a((char) 338);
                                } else if (i42 == 63) {
                                    this.m.a((char) 376);
                                } else if (i42 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i42 == 58) {
                                    this.m.a((char) 353);
                                } else if (i42 == 60) {
                                    this.m.a((char) 339);
                                } else if (i42 != 61) {
                                    switch (i42) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i42) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    a1.b.y("Invalid G2 character: ", i42, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i10 = 2;
                                z11 = true;
                            } else if (i42 > 159) {
                                i10 = 2;
                                if (i42 <= 255) {
                                    if (i42 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        a1.b.y("Invalid G3 character: ", i42, "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z11 = true;
                                } else {
                                    a1.b.y("Invalid extended command: ", i42, "Cea708Decoder");
                                }
                            } else if (i42 <= 135) {
                                n0Var3.t(32);
                            } else if (i42 <= 143) {
                                n0Var3.t(40);
                            } else if (i42 <= 159) {
                                i10 = 2;
                                n0Var3.t(2);
                                n0Var3.t(n0Var3.i(6) * 8);
                            }
                        }
                        i10 = 2;
                    }
                    i10 = i10;
                }
            }
        }
        if (z11) {
            this.f16833n = k();
        }
        this.f16835p = null;
    }

    public final List k() {
        d dVar;
        Layout.Alignment alignment;
        float f3;
        float f10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            e[] eVarArr = this.l;
            e eVar = eVarArr[i10];
            if (eVar.f16812c && (!eVar.f16810a.isEmpty() || eVar.f16811b.length() != 0)) {
                e eVar2 = eVarArr[i10];
                if (eVar2.f16813d) {
                    ArrayList arrayList2 = eVar2.f16810a;
                    if (!eVar2.f16812c || (arrayList2.isEmpty() && eVar2.f16811b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i11));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i12 = eVar2.f16820k;
                        if (i12 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i12 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f16820k);
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (eVar2.f16815f) {
                            f3 = eVar2.f16817h / 99.0f;
                            f10 = eVar2.f16816g / 99.0f;
                        } else {
                            f3 = eVar2.f16817h / 209.0f;
                            f10 = eVar2.f16816g / 74.0f;
                        }
                        float f11 = (f3 * 0.9f) + 0.05f;
                        float f12 = (f10 * 0.9f) + 0.05f;
                        int i13 = eVar2.f16818i;
                        int i14 = i13 / 3;
                        int i15 = i14 == 0 ? 0 : i14 == 1 ? 1 : 2;
                        int i16 = i13 % 3;
                        int i17 = i16 == 0 ? 0 : i16 == 1 ? 1 : 2;
                        int i18 = eVar2.f16821n;
                        dVar = new d(spannableStringBuilder, alignment2, f12, i15, f11, i17, i18 != e.f16806w, i18, eVar2.f16814e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f16802c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((d) arrayList.get(i19)).f16803a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10].d();
        }
    }
}
