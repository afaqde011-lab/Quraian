package p40;

public final class p1 implements l40.a {
    public static final p1 a = new p1();
    public static final u0 b = new u0("kotlin.uuid.Uuid", n40.c.k);

    @Override
    public final Object deserialize(o40.c decoder) {
        String strConcat;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        String uuidString = decoder.p();
        kotlin.jvm.internal.m.e(uuidString, "uuidString");
        int length = uuidString.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = uuidString.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = r30.d.b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                qd.s0.t0(uuidString, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = uuidString.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = r30.d.b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                qd.s0.t0(uuidString, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new t30.b(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (uuidString.length() <= 64) {
                    strConcat = uuidString;
                } else {
                    String strSubstring = uuidString.substring(0, 64);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(uuidString.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = uuidString.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = r30.d.b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                qd.s0.t0(uuidString, i, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(8) != '-') {
                qd.s0.t0(uuidString, 8, "'-' (hyphen)");
                throw null;
            }
            long j11 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j12 = j11 << 4;
                char cCharAt4 = uuidString.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j13 = r30.d.b[cCharAt4];
                    if (j13 >= 0) {
                        j11 = j12 | j13;
                    }
                }
                qd.s0.t0(uuidString, i3, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(13) != '-') {
                qd.s0.t0(uuidString, 13, "'-' (hyphen)");
                throw null;
            }
            long j14 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j15 = j14 << 4;
                char cCharAt5 = uuidString.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j16 = r30.d.b[cCharAt5];
                    if (j16 >= 0) {
                        j14 = j15 | j16;
                    }
                }
                qd.s0.t0(uuidString, i4, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(18) != '-') {
                qd.s0.t0(uuidString, 18, "'-' (hyphen)");
                throw null;
            }
            long j17 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j18 = j17 << 4;
                char cCharAt6 = uuidString.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j19 = r30.d.b[cCharAt6];
                    if (j19 >= 0) {
                        j17 = j18 | j19;
                    }
                }
                qd.s0.t0(uuidString, i5, "a hexadecimal digit");
                throw null;
            }
            if (uuidString.charAt(23) != '-') {
                qd.s0.t0(uuidString, 23, "'-' (hyphen)");
                throw null;
            }
            long j21 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j22 = j21 << 4;
                char cCharAt7 = uuidString.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j23 = r30.d.b[cCharAt7];
                    if (j23 >= 0) {
                        j21 = j22 | j23;
                    }
                }
                qd.s0.t0(uuidString, i6, "a hexadecimal digit");
                throw null;
            }
            long j24 = (j7 << 32) | (j11 << 16) | j14;
            long j25 = (j17 << 48) | j21;
            if (j24 != 0 || j25 != 0) {
                return new t30.b(j24, j25);
            }
        }
        return t30.b.C;
    }

    @Override
    public final n40.e getDescriptor() {
        return b;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        t30.b value = (t30.b) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.D(value.toString());
    }
}
