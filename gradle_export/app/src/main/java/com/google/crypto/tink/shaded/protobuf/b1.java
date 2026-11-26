package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class b1 {

    public static final Class f4246a;

    public static final c1 f4247b;

    public static final c1 f4248c;

    public static final e1 f4249d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f4246a = cls;
        f4247b = v(false);
        f4248c = v(true);
        f4249d = new e1();
    }

    public static void A(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                mVar.getClass();
                mVar.c0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 8;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.d0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void B(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mVar.f0(i10, 0);
                mVar.e0(iIntValue);
            }
            return;
        }
        mVar.f0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += m.T(((Integer) list.get(i12)).intValue());
        }
        mVar.g0(iT);
        for (int i13 = 0; i13 < list.size(); i13++) {
            mVar.e0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void C(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 4;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.b0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void D(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.c0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 8;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.d0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void E(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                mVar.getClass();
                mVar.a0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 4;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.b0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void F(int i10, List list, k0 k0Var, a1 a1Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            k0Var.b(i10, list.get(i11), a1Var);
        }
    }

    public static void G(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mVar.f0(i10, 0);
                mVar.e0(iIntValue);
            }
            return;
        }
        mVar.f0(i10, 2);
        int iT = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iT += m.T(((Integer) list.get(i12)).intValue());
        }
        mVar.g0(iT);
        for (int i13 = 0; i13 < list.size(); i13++) {
            mVar.e0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void H(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += m.X(((Long) list.get(i12)).longValue());
        }
        mVar.g0(iX);
        while (i11 < list.size()) {
            mVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void I(int i10, List list, k0 k0Var, a1 a1Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            k0Var.c(i10, list.get(i11), a1Var);
        }
    }

    public static void J(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.a0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 4;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.b0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void K(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.c0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12 += 8;
        }
        mVar.g0(i12);
        while (i11 < list.size()) {
            mVar.d0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void L(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mVar.f0(i10, 0);
                mVar.g0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        mVar.f0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iW += m.W((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        mVar.g0(iW);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int iIntValue3 = ((Integer) list.get(i13)).intValue();
            mVar.g0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                mVar.h0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iX += m.X((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        mVar.g0(iX);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            mVar.i0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void N(int i10, List list, k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!(list instanceof e0)) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                String str = (String) list.get(i11);
                mVar.f0(i10, 2);
                int i12 = mVar.f4293d;
                byte[] bArr = mVar.f4292c;
                int i13 = mVar.f4294e;
                try {
                    int iW = m.W(str.length() * 3);
                    int iW2 = m.W(str.length());
                    if (iW2 == iW) {
                        int i14 = i13 + iW2;
                        mVar.f4294e = i14;
                        int iT = p1.f4308a.t(str, bArr, i14, i12 - i14);
                        mVar.f4294e = i13;
                        mVar.g0((iT - i13) - iW2);
                        mVar.f4294e = iT;
                    } else {
                        mVar.g0(p1.b(str));
                        int i15 = mVar.f4294e;
                        mVar.f4294e = p1.f4308a.t(str, bArr, i15, i12 - i15);
                    }
                } catch (o1 e3) {
                    mVar.f4294e = i13;
                    m.f4289f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
                    byte[] bytes = str.getBytes(b0.f4244a);
                    try {
                        mVar.g0(bytes.length);
                        mVar.Z(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e10) {
                        throw new CodedOutputStream$OutOfSpaceException(e10);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    throw new CodedOutputStream$OutOfSpaceException(e11);
                }
            }
            return;
        }
        e0 e0Var = (e0) list;
        for (int i16 = 0; i16 < list.size(); i16++) {
            Object raw = e0Var.getRaw(i16);
            if (raw instanceof String) {
                String str2 = (String) raw;
                mVar.f0(i10, 2);
                int i17 = mVar.f4293d;
                byte[] bArr2 = mVar.f4292c;
                int i18 = mVar.f4294e;
                try {
                    int iW3 = m.W(str2.length() * 3);
                    int iW4 = m.W(str2.length());
                    if (iW4 == iW3) {
                        int i19 = i18 + iW4;
                        mVar.f4294e = i19;
                        int iT2 = p1.f4308a.t(str2, bArr2, i19, i17 - i19);
                        mVar.f4294e = i18;
                        mVar.g0((iT2 - i18) - iW4);
                        mVar.f4294e = iT2;
                    } else {
                        mVar.g0(p1.b(str2));
                        int i20 = mVar.f4294e;
                        mVar.f4294e = p1.f4308a.t(str2, bArr2, i20, i17 - i20);
                    }
                } catch (o1 e12) {
                    mVar.f4294e = i18;
                    m.f4289f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
                    byte[] bytes2 = str2.getBytes(b0.f4244a);
                    try {
                        mVar.g0(bytes2.length);
                        mVar.Z(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e13) {
                        throw new CodedOutputStream$OutOfSpaceException(e13);
                    }
                } catch (IndexOutOfBoundsException e14) {
                    throw new CodedOutputStream$OutOfSpaceException(e14);
                }
            } else {
                i iVar = (i) raw;
                mVar.f0(i10, 2);
                mVar.g0(iVar.size());
                h hVar = (h) iVar;
                mVar.Z(hVar.D, hVar.i(), hVar.size());
            }
        }
    }

    public static void O(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                mVar.f0(i10, 0);
                mVar.g0(iIntValue);
            }
            return;
        }
        mVar.f0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += m.W(((Integer) list.get(i12)).intValue());
        }
        mVar.g0(iW);
        for (int i13 = 0; i13 < list.size(); i13++) {
            mVar.g0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void P(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                mVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        mVar.f0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += m.X(((Long) list.get(i12)).longValue());
        }
        mVar.g0(iX);
        while (i11 < list.size()) {
            mVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = m.V(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iV += m.P((i) list.get(i11));
        }
        return iV;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.b(0);
            throw null;
        }
        int iT = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iT += m.T(((Integer) list.get(i10)).intValue());
        }
        return iT;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m.Q(i10) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m.R(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.b(0);
            throw null;
        }
        int iT = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iT += m.T(((Integer) list.get(i10)).intValue());
        }
        return iT;
    }

    public static int j(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (m.V(i10) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            if (size <= 0) {
                return 0;
            }
            i0Var.b(0);
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += m.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static int l(int i10, List list, a1 a1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = m.V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int iA = ((a) list.get(i11)).a(a1Var);
            iV += m.W(iA) + iA;
        }
        return iV;
    }

    public static int m(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.b(0);
            throw null;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iW += m.W((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iW;
    }

    public static int o(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            if (size <= 0) {
                return 0;
            }
            i0Var.b(0);
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iX += m.X((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iX;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = m.V(i10) * size;
        if (!(list instanceof e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof i) {
                    int size2 = ((i) obj).size();
                    iV = m.W(size2) + size2 + iV;
                } else {
                    iV = m.U((String) obj) + iV;
                }
                i11++;
            }
            return iV;
        }
        e0 e0Var = (e0) list;
        while (i11 < size) {
            Object raw = e0Var.getRaw(i11);
            if (raw instanceof i) {
                int size3 = ((i) raw).size();
                iV = m.W(size3) + size3 + iV;
            } else {
                iV = m.U((String) raw) + iV;
            }
            i11++;
        }
        return iV;
    }

    public static int r(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.b(0);
            throw null;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += m.W(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int t(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (m.V(i10) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            if (size <= 0) {
                return 0;
            }
            i0Var.b(0);
            throw null;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += m.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static c1 v(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (c1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(c1 c1Var, Object obj, Object obj2) {
        ((e1) c1Var).getClass();
        x xVar = (x) obj;
        d1 d1Var = xVar.unknownFields;
        d1 d1Var2 = ((x) obj2).unknownFields;
        d1 d1Var3 = d1.f4255f;
        if (!d1Var3.equals(d1Var2)) {
            if (d1Var3.equals(d1Var)) {
                int i10 = d1Var.f4256a + d1Var2.f4256a;
                int[] iArrCopyOf = Arrays.copyOf(d1Var.f4257b, i10);
                System.arraycopy(d1Var2.f4257b, 0, iArrCopyOf, d1Var.f4256a, d1Var2.f4256a);
                Object[] objArrCopyOf = Arrays.copyOf(d1Var.f4258c, i10);
                System.arraycopy(d1Var2.f4258c, 0, objArrCopyOf, d1Var.f4256a, d1Var2.f4256a);
                d1Var = new d1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                d1Var.getClass();
                if (!d1Var2.equals(d1Var3)) {
                    if (!d1Var.f4260e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = d1Var.f4256a + d1Var2.f4256a;
                    d1Var.a(i11);
                    System.arraycopy(d1Var2.f4257b, 0, d1Var.f4257b, d1Var.f4256a, d1Var2.f4256a);
                    System.arraycopy(d1Var2.f4258c, 0, d1Var.f4258c, d1Var.f4256a, d1Var2.f4256a);
                    d1Var.f4256a = i11;
                }
            }
        }
        xVar.unknownFields = d1Var;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i10, List list, k0 k0Var, boolean z10) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m mVar = (m) k0Var.f4283a;
        if (!z10) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean zBooleanValue = ((Boolean) list.get(i11)).booleanValue();
                mVar.f0(i10, 0);
                mVar.Y(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        mVar.f0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = m.f4289f;
            i12++;
        }
        mVar.g0(i12);
        for (int i14 = 0; i14 < list.size(); i14++) {
            mVar.Y(((Boolean) list.get(i14)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i10, List list, k0 k0Var) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        k0Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            m mVar = (m) k0Var.f4283a;
            i iVar = (i) list.get(i11);
            mVar.f0(i10, 2);
            mVar.g0(iVar.size());
            h hVar = (h) iVar;
            mVar.Z(hVar.D, hVar.i(), hVar.size());
        }
    }
}
