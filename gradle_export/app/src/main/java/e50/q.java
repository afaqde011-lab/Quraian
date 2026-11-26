package e50;

import ab.a0;
import com.google.android.gms.internal.measurement.x5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k50.c0;

public final class q implements Closeable {
    public static final Logger D;
    public final k50.k A;
    public final p B;
    public final b C;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        kotlin.jvm.internal.m.d(logger, "getLogger(Http2::class.java.name)");
        D = logger;
    }

    public q(c0 source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.A = source;
        p pVar = new p(source);
        this.B = pVar;
        this.C = new b(pVar);
    }

    public final boolean a(boolean z, a20.a aVar) throws IOException {
        int i;
        int i2;
        int i3;
        Object[] array;
        int i4 = 0;
        try {
            this.A.e0(9L);
            int iS = y40.b.s(this.A);
            if (iS > 16384) {
                throw new IOException(g4.c.f(iS, "FRAME_SIZE_ERROR: "));
            }
            int i5 = this.A.readByte() & 255;
            byte b = this.A.readByte();
            int i6 = b & 255;
            int i7 = this.A.readInt();
            int i8 = i7 & Integer.MAX_VALUE;
            Logger logger = D;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.a(true, i8, iS, i5, i6));
            }
            if (z && i5 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = e.b;
                sb.append(i5 < strArr.length ? strArr[i5] : y40.b.h("0x%02x", Integer.valueOf(i5)));
                throw new IOException(sb.toString());
            }
            int i9 = 2;
            switch (i5) {
                case 0:
                    i(aVar, iS, i6, i8);
                    return true;
                case 1:
                    r(aVar, iS, i6, i8);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(g4.c.i("TYPE_PRIORITY length: ", iS, " != 5"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    k50.k kVar = this.A;
                    kVar.readInt();
                    kVar.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException(g4.c.i("TYPE_RST_STREAM length: ", iS, " != 4"));
                    }
                    if (i8 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i11 = this.A.readInt();
                    int[] iArrC = e4.f.c(14);
                    int length = iArrC.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            int i13 = iArrC[i12];
                            if (e4.f.b(i13) == i11) {
                                i = i13;
                            } else {
                                i12++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(g4.c.f(i11, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    m mVar = (m) aVar.C;
                    if (i8 != 0 && (i7 & 1) == 0) {
                        i4 = 1;
                    }
                    if (i4 == 0) {
                        u uVarL = mVar.l(i8);
                        if (uVarL == null) {
                            return true;
                        }
                        uVarL.j(i);
                        return true;
                    }
                    mVar.I.c(new i(mVar.C + '[' + i8 + "] onReset", mVar, i8, i, 1), 0L);
                    return true;
                case 4:
                    k50.k kVar2 = this.A;
                    if (i8 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) == 0) {
                        if (iS % 6 != 0) {
                            throw new IOException(g4.c.f(iS, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        y yVar = new y();
                        z00.c cVarE0 = a0.E0(6, a0.I0(0, iS));
                        int i14 = cVarE0.A;
                        int i15 = cVarE0.B;
                        int i16 = cVarE0.C;
                        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                            while (true) {
                                short s = kVar2.readShort();
                                byte[] bArr = y40.b.a;
                                int i17 = s & 65535;
                                i2 = kVar2.readInt();
                                if (i17 != 2) {
                                    if (i17 == 3) {
                                        i17 = 4;
                                    } else if (i17 == 4) {
                                        if (i2 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i17 = 7;
                                    } else if (i17 == 5 && (i2 < 16384 || i2 > 16777215)) {
                                    }
                                } else if (i2 != 0 && i2 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                yVar.c(i17, i2);
                                if (i14 != i15) {
                                    i14 += i16;
                                }
                            }
                            throw new IOException(g4.c.f(i2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        m mVar2 = (m) aVar.C;
                        mVar2.H.c(new h(x5.n(new StringBuilder(), mVar2.C, " applyAndAckSettings"), aVar, yVar, i9), 0L);
                        return true;
                    }
                    if (iS != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    v(aVar, iS, i6, i8);
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(g4.c.f(iS, "TYPE_PING length != 8: "));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i18 = this.A.readInt();
                    int i19 = this.A.readInt();
                    if (((b & 1) != 0 ? 1 : 0) == 0) {
                        ((m) aVar.C).H.c(new i(x5.n(new StringBuilder(), ((m) aVar.C).C, " ping"), (m) aVar.C, i18, i19, 0), 0L);
                        return true;
                    }
                    m mVar3 = (m) aVar.C;
                    synchronized (mVar3) {
                        try {
                            if (i18 == 1) {
                                mVar3.L++;
                            } else if (i18 == 2) {
                                mVar3.N++;
                            } else if (i18 == 3) {
                                mVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(g4.c.f(iS, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i8 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i21 = this.A.readInt();
                    int i22 = this.A.readInt();
                    int i23 = iS - 8;
                    int[] iArrC2 = e4.f.c(14);
                    int length2 = iArrC2.length;
                    int i24 = 0;
                    while (true) {
                        if (i24 < length2) {
                            i3 = iArrC2[i24];
                            if (e4.f.b(i3) != i22) {
                                i24++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                    if (i3 == 0) {
                        throw new IOException(g4.c.f(i22, "TYPE_GOAWAY unexpected error code: "));
                    }
                    k50.l debugData = k50.l.D;
                    if (i23 > 0) {
                        debugData = this.A.m(i23);
                    }
                    kotlin.jvm.internal.m.e(debugData, "debugData");
                    debugData.d();
                    m mVar4 = (m) aVar.C;
                    synchronized (mVar4) {
                        array = mVar4.B.values().toArray(new u[0]);
                        mVar4.F = true;
                    }
                    u[] uVarArr = (u[]) array;
                    int length3 = uVarArr.length;
                    while (i4 < length3) {
                        u uVar = uVarArr[i4];
                        if (uVar.a > i21 && uVar.g()) {
                            uVar.j(8);
                            ((m) aVar.C).l(uVar.a);
                        }
                        i4++;
                    }
                    break;
                    break;
                case 8:
                    if (iS != 4) {
                        throw new IOException(g4.c.f(iS, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j = 2147483647L & ((long) this.A.readInt());
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i8 == 0) {
                        m mVar5 = (m) aVar.C;
                        synchronized (mVar5) {
                            mVar5.U += j;
                            mVar5.notifyAll();
                        }
                        return true;
                    }
                    u uVarI = ((m) aVar.C).i(i8);
                    if (uVarI != null) {
                        synchronized (uVarI) {
                            uVarI.f += j;
                            if (j > 0) {
                                uVarI.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.A.skip(iS);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override
    public final void close() throws IOException {
        this.A.close();
    }

    public final void i(a20.a aVar, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z4 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i2 & 8) != 0) {
            byte b = this.A.readByte();
            byte[] bArr = y40.b.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iA = o.a(i, i2, i4);
        k50.k source = this.A;
        kotlin.jvm.internal.m.e(source, "source");
        m mVar = (m) aVar.C;
        long j2 = 0;
        if (i3 == 0 || (i3 & 1) != 0) {
            u uVarI = mVar.i(i3);
            if (uVarI == null) {
                ((m) aVar.C).A(i3, 2);
                long j3 = iA;
                ((m) aVar.C).v(j3);
                source.skip(j3);
            } else {
                byte[] bArr2 = y40.b.a;
                s sVar = uVarI.i;
                long j4 = iA;
                sVar.getClass();
                long j5 = j4;
                while (true) {
                    if (j5 <= j2) {
                        z = z4;
                        u uVar = sVar.F;
                        byte[] bArr3 = y40.b.a;
                        uVar.b.v(j4);
                        break;
                    }
                    synchronized (sVar.F) {
                        z2 = sVar.B;
                        j = j2;
                        z = z4;
                        z3 = sVar.D.B + j5 > sVar.A;
                    }
                    if (z3) {
                        source.skip(j5);
                        sVar.F.e(4);
                        break;
                    }
                    if (z2) {
                        source.skip(j5);
                        break;
                    }
                    long jS = source.s(sVar.C, j5);
                    if (jS == -1) {
                        throw new EOFException();
                    }
                    j5 -= jS;
                    u uVar2 = sVar.F;
                    synchronized (uVar2) {
                        try {
                            if (sVar.E) {
                                sVar.C.a();
                            } else {
                                k50.i iVar = sVar.D;
                                boolean z5 = iVar.B == j;
                                iVar.p0(sVar.C);
                                if (z5) {
                                    uVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j;
                    z4 = z;
                }
                if (z) {
                    uVarI.i(y40.b.b, true);
                }
            }
        } else {
            k50.i iVar2 = new k50.i();
            long j6 = iA;
            source.e0(j6);
            source.s(iVar2, j6);
            mVar.I.c(new j(mVar.C + '[' + i3 + "] onData", mVar, i3, iVar2, iA, z4), 0L);
        }
        this.A.skip(i4);
    }

    public final List l(int i, int i2, int i3, int i4) throws IOException {
        p pVar = this.B;
        pVar.E = i;
        pVar.B = i;
        pVar.F = i2;
        pVar.C = i3;
        pVar.D = i4;
        b bVar = this.C;
        c0 c0Var = bVar.c;
        ArrayList arrayList = bVar.b;
        while (!c0Var.a()) {
            byte b = c0Var.readByte();
            byte[] bArr = y40.b.a;
            int i5 = b & 255;
            if (i5 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iE = bVar.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    a[] aVarArr = d.a;
                    if (i6 <= aVarArr.length - 1) {
                        arrayList.add(aVarArr[i6]);
                    }
                }
                int length = bVar.e + 1 + (i6 - d.a.length);
                if (length >= 0) {
                    a[] aVarArr2 = bVar.d;
                    if (length < aVarArr2.length) {
                        a aVar = aVarArr2[length];
                        kotlin.jvm.internal.m.b(aVar);
                        arrayList.add(aVar);
                    }
                }
                throw new IOException(g4.c.f(iE, "Header index too large "));
            }
            if (i5 == 64) {
                a[] aVarArr3 = d.a;
                k50.l lVarD = bVar.d();
                d.a(lVarD);
                bVar.c(new a(lVarD, bVar.d()));
            } else if ((b & 64) == 64) {
                bVar.c(new a(bVar.b(bVar.e(i5, 63) - 1), bVar.d()));
            } else if ((b & 32) == 32) {
                int iE2 = bVar.e(i5, 31);
                bVar.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + bVar.a);
                }
                int i7 = bVar.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        a[] aVarArr4 = bVar.d;
                        h00.n.y0(0, aVarArr4.length, null, aVarArr4);
                        bVar.e = bVar.d.length - 1;
                        bVar.f = 0;
                        bVar.g = 0;
                    } else {
                        bVar.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                a[] aVarArr5 = d.a;
                k50.l lVarD2 = bVar.d();
                d.a(lVarD2);
                arrayList.add(new a(lVarD2, bVar.d()));
            } else {
                arrayList.add(new a(bVar.b(bVar.e(i5, 15) - 1), bVar.d()));
            }
        }
        List listN1 = h00.q.n1(arrayList);
        arrayList.clear();
        return listN1;
    }

    public final void r(a20.a aVar, int i, int i2, int i3) throws IOException {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i4 = 0;
        int i5 = 1;
        boolean z = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.A.readByte();
            byte[] bArr = y40.b.a;
            i4 = b & 255;
        }
        if ((i2 & 32) != 0) {
            k50.k kVar = this.A;
            kVar.readInt();
            kVar.readByte();
            byte[] bArr2 = y40.b.a;
            i -= 5;
        }
        List listL = l(o.a(i, i2, i4), i4, i2, i3);
        m mVar = (m) aVar.C;
        if (i3 != 0 && (i3 & 1) == 0) {
            mVar.I.c(new k(mVar.C + '[' + i3 + "] onHeaders", mVar, i3, listL, z), 0L);
            return;
        }
        synchronized (mVar) {
            u uVarI = mVar.i(i3);
            if (uVarI != null) {
                uVarI.i(y40.b.u(listL), z);
                return;
            }
            if (mVar.F) {
                return;
            }
            if (i3 <= mVar.D) {
                return;
            }
            if (i3 % 2 == mVar.E % 2) {
                return;
            }
            u uVar = new u(i3, mVar, false, z, y40.b.u(listL));
            mVar.D = i3;
            mVar.B.put(Integer.valueOf(i3), uVar);
            mVar.G.e().c(new h(mVar.C + '[' + i3 + "] onStream", mVar, uVar, i5), 0L);
        }
    }

    public final void v(a20.a aVar, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i2 & 8) != 0) {
            byte b = this.A.readByte();
            byte[] bArr = y40.b.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.A.readInt() & Integer.MAX_VALUE;
        List listL = l(o.a(i - 4, i2, i4), i4, i2, i3);
        m mVar = (m) aVar.C;
        synchronized (mVar) {
            if (mVar.Y.contains(Integer.valueOf(i5))) {
                mVar.A(i5, 2);
                return;
            }
            mVar.Y.add(Integer.valueOf(i5));
            mVar.I.c(new k(mVar.C + '[' + i5 + "] onRequest", mVar, i5, listL), 0L);
        }
    }
}
