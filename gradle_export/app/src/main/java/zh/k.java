package zh;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import q3.e0;
import s10.w0;
import sd.p1;

public final class k {

    public final ai.a f17491a;

    public k(byte[] bArr) {
        if (!oi.k.a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f17491a = ai.a.a(bArr);
    }

    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        byte[] bArr4 = this.f17491a.f486a;
        byte[] bArr5 = new byte[bArr4.length];
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i10 = 31;
            while (i10 >= 0) {
                int i11 = bArrCopyOfRange[i10] & 255;
                int i12 = i.f17478b[i10] & 255;
                if (i11 != i12) {
                    if (i11 >= i12) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) o.f17497d.f17498a.d("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    messageDigest.update(bArr5);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jH = i.h(0, bArrDigest) & 2097151;
                    long jI = (i.i(2, bArrDigest) >> 5) & 2097151;
                    long jH2 = (i.h(5, bArrDigest) >> 2) & 2097151;
                    long jI2 = (i.i(7, bArrDigest) >> 7) & 2097151;
                    long jI3 = (i.i(10, bArrDigest) >> 4) & 2097151;
                    long jH3 = (i.h(13, bArrDigest) >> 1) & 2097151;
                    long jI4 = (i.i(15, bArrDigest) >> 6) & 2097151;
                    long jH4 = (i.h(18, bArrDigest) >> 3) & 2097151;
                    long jH5 = i.h(21, bArrDigest) & 2097151;
                    long jI5 = (i.i(23, bArrDigest) >> 5) & 2097151;
                    long jH6 = (i.h(26, bArrDigest) >> 2) & 2097151;
                    long jI6 = (i.i(28, bArrDigest) >> 7) & 2097151;
                    long jI7 = (i.i(31, bArrDigest) >> 4) & 2097151;
                    long jH7 = (i.h(34, bArrDigest) >> 1) & 2097151;
                    long jI8 = (i.i(36, bArrDigest) >> 6) & 2097151;
                    long jH8 = (i.h(39, bArrDigest) >> 3) & 2097151;
                    long jH9 = i.h(42, bArrDigest) & 2097151;
                    long jI9 = (i.i(44, bArrDigest) >> 5) & 2097151;
                    long jH10 = (i.h(47, bArrDigest) >> 2) & 2097151;
                    long jI10 = (i.i(49, bArrDigest) >> 7) & 2097151;
                    long jI11 = (i.i(52, bArrDigest) >> 4) & 2097151;
                    long jH11 = (i.h(55, bArrDigest) >> 1) & 2097151;
                    long jI12 = (i.i(57, bArrDigest) >> 6) & 2097151;
                    long jI13 = i.i(60, bArrDigest) >> 3;
                    long j9 = (jI13 * 666643) + jI6;
                    long j10 = (jI13 * 470296) + jI7;
                    long j11 = (jI13 * 654183) + jH7;
                    long j12 = jI8 - (jI13 * 997805);
                    long j13 = (jI13 * 136657) + jH8;
                    long j14 = jH9 - (jI13 * 683901);
                    long j15 = (jI12 * 666643) + jH6;
                    long j16 = (jI12 * 470296) + j9;
                    long j17 = (jI12 * 654183) + j10;
                    long j18 = j11 - (jI12 * 997805);
                    long j19 = (jI12 * 136657) + j12;
                    long j20 = j13 - (jI12 * 683901);
                    long j21 = (jH11 * 666643) + jI5;
                    long j22 = (jH11 * 470296) + j15;
                    long j23 = (jH11 * 654183) + j16;
                    long j24 = j17 - (jH11 * 997805);
                    long j25 = (jH11 * 136657) + j18;
                    long j26 = j19 - (jH11 * 683901);
                    long j27 = (jI11 * 666643) + jH5;
                    long j28 = (jI11 * 470296) + j21;
                    long j29 = (jI11 * 654183) + j22;
                    long j30 = j23 - (jI11 * 997805);
                    long j31 = (jI11 * 136657) + j24;
                    long j32 = j25 - (jI11 * 683901);
                    long j33 = (jI10 * 666643) + jH4;
                    long j34 = (jI10 * 470296) + j27;
                    long j35 = (jI10 * 654183) + j28;
                    long j36 = j29 - (jI10 * 997805);
                    long j37 = (jI10 * 136657) + j30;
                    long j38 = j31 - (jI10 * 683901);
                    long j39 = (jH10 * 666643) + jI4;
                    long j40 = (jH10 * 470296) + j33;
                    long j41 = (jH10 * 654183) + j34;
                    long j42 = j35 - (jH10 * 997805);
                    long j43 = (jH10 * 136657) + j36;
                    long j44 = j37 - (jH10 * 683901);
                    long j45 = (j39 + 1048576) >> 21;
                    long j46 = j40 + j45;
                    long j47 = j39 - (j45 << 21);
                    long j48 = (j41 + 1048576) >> 21;
                    long j49 = j42 + j48;
                    long j50 = j41 - (j48 << 21);
                    long j51 = (j43 + 1048576) >> 21;
                    long j52 = j44 + j51;
                    long j53 = j43 - (j51 << 21);
                    long j54 = (j38 + 1048576) >> 21;
                    long j55 = j32 + j54;
                    long j56 = j38 - (j54 << 21);
                    long j57 = (j26 + 1048576) >> 21;
                    long j58 = j20 + j57;
                    long j59 = j26 - (j57 << 21);
                    long j60 = (j14 + 1048576) >> 21;
                    long j61 = jI9 + j60;
                    long j62 = j14 - (j60 << 21);
                    long j63 = (j46 + 1048576) >> 21;
                    long j64 = j50 + j63;
                    long j65 = j46 - (j63 << 21);
                    long j66 = (j49 + 1048576) >> 21;
                    long j67 = j53 + j66;
                    long j68 = j49 - (j66 << 21);
                    long j69 = (j52 + 1048576) >> 21;
                    long j70 = j56 + j69;
                    long j71 = j52 - (j69 << 21);
                    long j72 = (j55 + 1048576) >> 21;
                    long j73 = j59 + j72;
                    long j74 = j55 - (j72 << 21);
                    long j75 = (j58 + 1048576) >> 21;
                    long j76 = j62 + j75;
                    long j77 = j58 - (j75 << 21);
                    long j78 = (j61 * 666643) + jH3;
                    long j79 = (j61 * 470296) + j47;
                    long j80 = (j61 * 654183) + j65;
                    long j81 = j64 - (j61 * 997805);
                    long j82 = (j61 * 136657) + j68;
                    long j83 = j67 - (j61 * 683901);
                    long j84 = (j76 * 666643) + jI3;
                    long j85 = (j76 * 470296) + j78;
                    long j86 = (j76 * 654183) + j79;
                    long j87 = j80 - (j76 * 997805);
                    long j88 = (j76 * 136657) + j81;
                    long j89 = j82 - (j76 * 683901);
                    long j90 = (j77 * 666643) + jI2;
                    long j91 = (j77 * 470296) + j84;
                    long j92 = (j77 * 654183) + j85;
                    long j93 = (j77 * 136657) + j87;
                    long j94 = j88 - (j77 * 683901);
                    long j95 = (j73 * 666643) + jH2;
                    long j96 = (j73 * 470296) + j90;
                    long j97 = (j73 * 654183) + j91;
                    long j98 = (j73 * 136657) + (j86 - (j77 * 997805));
                    long j99 = (j74 * 666643) + jI;
                    long j100 = (j74 * 470296) + j95;
                    long j101 = (j74 * 654183) + j96;
                    long j102 = j97 - (j74 * 997805);
                    long j103 = (j74 * 136657) + (j92 - (j73 * 997805));
                    long j104 = j98 - (j74 * 683901);
                    long j105 = (j70 * 666643) + jH;
                    long j106 = (j70 * 470296) + j99;
                    long j107 = (j70 * 654183) + j100;
                    long j108 = j101 - (j70 * 997805);
                    long j109 = (j70 * 136657) + j102;
                    long j110 = j103 - (j70 * 683901);
                    long j111 = (j105 + 1048576) >> 21;
                    long j112 = j106 + j111;
                    long j113 = j105 - (j111 << 21);
                    long j114 = (j107 + 1048576) >> 21;
                    long j115 = j108 + j114;
                    long j116 = j107 - (j114 << 21);
                    long j117 = (j109 + 1048576) >> 21;
                    long j118 = j110 + j117;
                    long j119 = j109 - (j117 << 21);
                    long j120 = (j104 + 1048576) >> 21;
                    long j121 = (j93 - (j73 * 683901)) + j120;
                    long j122 = j104 - (j120 << 21);
                    long j123 = (j94 + 1048576) >> 21;
                    long j124 = j89 + j123;
                    long j125 = j94 - (j123 << 21);
                    long j126 = (j83 + 1048576) >> 21;
                    long j127 = j71 + j126;
                    long j128 = j83 - (j126 << 21);
                    long j129 = (j112 + 1048576) >> 21;
                    long j130 = j116 + j129;
                    long j131 = j112 - (j129 << 21);
                    long j132 = (j115 + 1048576) >> 21;
                    long j133 = j119 + j132;
                    long j134 = j115 - (j132 << 21);
                    long j135 = (j118 + 1048576) >> 21;
                    long j136 = j122 + j135;
                    long j137 = j118 - (j135 << 21);
                    long j138 = (j121 + 1048576) >> 21;
                    long j139 = j125 + j138;
                    long j140 = j121 - (j138 << 21);
                    long j141 = (j124 + 1048576) >> 21;
                    long j142 = j128 + j141;
                    long j143 = j124 - (j141 << 21);
                    long j144 = (j127 + 1048576) >> 21;
                    long j145 = j127 - (j144 << 21);
                    long j146 = (j144 * 666643) + j113;
                    long j147 = (j144 * 470296) + j131;
                    long j148 = (j144 * 654183) + j130;
                    long j149 = j134 - (j144 * 997805);
                    long j150 = (j144 * 136657) + j133;
                    long j151 = j137 - (j144 * 683901);
                    long j152 = j146 >> 21;
                    long j153 = j147 + j152;
                    long j154 = j146 - (j152 << 21);
                    long j155 = j153 >> 21;
                    long j156 = j148 + j155;
                    long j157 = j153 - (j155 << 21);
                    long j158 = j156 >> 21;
                    long j159 = j149 + j158;
                    long j160 = j156 - (j158 << 21);
                    long j161 = j159 >> 21;
                    long j162 = j150 + j161;
                    long j163 = j159 - (j161 << 21);
                    long j164 = j162 >> 21;
                    long j165 = j151 + j164;
                    long j166 = j162 - (j164 << 21);
                    long j167 = j165 >> 21;
                    long j168 = j136 + j167;
                    long j169 = j165 - (j167 << 21);
                    long j170 = j168 >> 21;
                    long j171 = j140 + j170;
                    long j172 = j168 - (j170 << 21);
                    long j173 = j171 >> 21;
                    long j174 = j139 + j173;
                    long j175 = j171 - (j173 << 21);
                    long j176 = j174 >> 21;
                    long j177 = j143 + j176;
                    long j178 = j174 - (j176 << 21);
                    long j179 = j177 >> 21;
                    long j180 = j142 + j179;
                    long j181 = j177 - (j179 << 21);
                    long j182 = j180 >> 21;
                    long j183 = j145 + j182;
                    long j184 = j180 - (j182 << 21);
                    long j185 = j183 >> 21;
                    long j186 = j183 - (j185 << 21);
                    long j187 = (666643 * j185) + j154;
                    long j188 = (654183 * j185) + j160;
                    long j189 = j163 - (997805 * j185);
                    long j190 = (136657 * j185) + j166;
                    long j191 = j169 - (j185 * 683901);
                    long j192 = j187 >> 21;
                    long j193 = (470296 * j185) + j157 + j192;
                    long j194 = j187 - (j192 << 21);
                    long j195 = j193 >> 21;
                    long j196 = j188 + j195;
                    long j197 = j193 - (j195 << 21);
                    long j198 = j196 >> 21;
                    long j199 = j189 + j198;
                    long j200 = j196 - (j198 << 21);
                    long j201 = j199 >> 21;
                    long j202 = j190 + j201;
                    long j203 = j199 - (j201 << 21);
                    long j204 = j202 >> 21;
                    long j205 = j191 + j204;
                    long j206 = j202 - (j204 << 21);
                    long j207 = j205 >> 21;
                    long j208 = j172 + j207;
                    long j209 = j205 - (j207 << 21);
                    long j210 = j208 >> 21;
                    long j211 = j175 + j210;
                    long j212 = j208 - (j210 << 21);
                    long j213 = j211 >> 21;
                    long j214 = j178 + j213;
                    long j215 = j211 - (j213 << 21);
                    long j216 = j214 >> 21;
                    long j217 = j181 + j216;
                    long j218 = j214 - (j216 << 21);
                    long j219 = j217 >> 21;
                    long j220 = j184 + j219;
                    long j221 = j217 - (j219 << 21);
                    long j222 = j220 >> 21;
                    long j223 = j186 + j222;
                    long j224 = j220 - (j222 << 21);
                    bArrDigest[0] = (byte) j194;
                    bArrDigest[1] = (byte) (j194 >> 8);
                    bArrDigest[2] = (byte) ((j194 >> 16) | (j197 << 5));
                    bArrDigest[3] = (byte) (j197 >> 3);
                    bArrDigest[4] = (byte) (j197 >> 11);
                    bArrDigest[5] = (byte) ((j197 >> 19) | (j200 << 2));
                    bArrDigest[6] = (byte) (j200 >> 6);
                    bArrDigest[7] = (byte) ((j200 >> 14) | (j203 << 7));
                    bArrDigest[8] = (byte) (j203 >> 1);
                    bArrDigest[9] = (byte) (j203 >> 9);
                    bArrDigest[10] = (byte) ((j203 >> 17) | (j206 << 4));
                    bArrDigest[11] = (byte) (j206 >> 4);
                    bArrDigest[12] = (byte) (j206 >> 12);
                    bArrDigest[13] = (byte) ((j206 >> 20) | (j209 << 1));
                    bArrDigest[14] = (byte) (j209 >> 7);
                    bArrDigest[15] = (byte) ((j209 >> 15) | (j212 << 6));
                    bArrDigest[16] = (byte) (j212 >> 2);
                    bArrDigest[17] = (byte) (j212 >> 10);
                    bArrDigest[18] = (byte) ((j212 >> 18) | (j215 << 3));
                    bArrDigest[19] = (byte) (j215 >> 5);
                    bArrDigest[20] = (byte) (j215 >> 13);
                    bArrDigest[21] = (byte) j218;
                    bArrDigest[22] = (byte) (j218 >> 8);
                    bArrDigest[23] = (byte) ((j218 >> 16) | (j221 << 5));
                    bArrDigest[24] = (byte) (j221 >> 3);
                    bArrDigest[25] = (byte) (j221 >> 11);
                    bArrDigest[26] = (byte) ((j221 >> 19) | (j224 << 2));
                    bArrDigest[27] = (byte) (j224 >> 6);
                    bArrDigest[28] = (byte) ((j224 >> 14) | (j223 << 7));
                    bArrDigest[29] = (byte) (j223 >> 1);
                    bArrDigest[30] = (byte) (j223 >> 9);
                    bArrDigest[31] = (byte) (j223 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrG = i.g(bArr5);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    i.n(jArr4, jArrG);
                    i.j(jArr5, jArr4, j.f17483a);
                    i.p(jArr4, jArr4, jArr2);
                    i.q(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    i.n(jArr8, jArr5);
                    i.j(jArr8, jArr8, jArr5);
                    i.n(jArr, jArr8);
                    i.j(jArr, jArr, jArr5);
                    i.j(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    i.n(jArr9, jArr);
                    i.n(jArr10, jArr9);
                    i.n(jArr10, jArr10);
                    i.j(jArr10, jArr, jArr10);
                    i.j(jArr9, jArr9, jArr10);
                    i.n(jArr9, jArr9);
                    i.j(jArr9, jArr10, jArr9);
                    i.n(jArr10, jArr9);
                    for (int i13 = 1; i13 < 5; i13++) {
                        i.n(jArr10, jArr10);
                    }
                    i.j(jArr9, jArr10, jArr9);
                    i.n(jArr10, jArr9);
                    for (int i14 = 1; i14 < 10; i14++) {
                        i.n(jArr10, jArr10);
                    }
                    i.j(jArr10, jArr10, jArr9);
                    i.n(jArr11, jArr10);
                    for (int i15 = 1; i15 < 20; i15++) {
                        i.n(jArr11, jArr11);
                    }
                    i.j(jArr10, jArr11, jArr10);
                    i.n(jArr10, jArr10);
                    for (int i16 = 1; i16 < 10; i16++) {
                        i.n(jArr10, jArr10);
                    }
                    i.j(jArr9, jArr10, jArr9);
                    i.n(jArr10, jArr9);
                    for (int i17 = 1; i17 < 50; i17++) {
                        i.n(jArr10, jArr10);
                    }
                    i.j(jArr10, jArr10, jArr9);
                    i.n(jArr11, jArr10);
                    for (int i18 = 1; i18 < 100; i18++) {
                        i.n(jArr11, jArr11);
                    }
                    i.j(jArr10, jArr11, jArr10);
                    i.n(jArr10, jArr10);
                    for (int i19 = 1; i19 < 50; i19++) {
                        i.n(jArr10, jArr10);
                    }
                    i.j(jArr9, jArr10, jArr9);
                    i.n(jArr9, jArr9);
                    i.n(jArr9, jArr9);
                    i.j(jArr, jArr9, jArr);
                    i.j(jArr, jArr, jArr8);
                    i.j(jArr, jArr, jArr4);
                    i.n(jArr6, jArr);
                    i.j(jArr6, jArr6, jArr5);
                    i.p(jArr7, jArr6, jArr4);
                    if (i.a(jArr7)) {
                        i.q(jArr7, jArr6, jArr4);
                        if (i.a(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        i.j(jArr, jArr, j.f17485c);
                    }
                    if (!i.a(jArr) && ((bArr5[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    int i20 = 255;
                    if ((i.d(jArr)[0] & 1) == ((bArr5[31] & 255) >> 7)) {
                        for (int i21 = 0; i21 < 10; i21++) {
                            jArr[i21] = -jArr[i21];
                        }
                    }
                    i.j(jArr3, jArr, jArrG);
                    h[] hVarArr = new h[8];
                    hVarArr[0] = new h(new w0(new p1(jArr, jArrG, jArr2, 27), jArr3, 23));
                    p1 p1Var = new p1(27);
                    long[] jArr12 = (long[]) p1Var.D;
                    long[] jArr13 = (long[]) p1Var.B;
                    long[] jArr14 = new long[10];
                    e0 e0Var = new e0(p1Var, jArr14, 26);
                    long[] jArr15 = new long[10];
                    i.n(jArr13, jArr);
                    i.n(jArr12, jArrG);
                    i.n(jArr14, jArr2);
                    i.q(jArr14, jArr14, jArr14);
                    long[] jArr16 = (long[]) p1Var.C;
                    i.q(jArr16, jArr, jArrG);
                    i.n(jArr15, jArr16);
                    i.q(jArr16, jArr12, jArr13);
                    i.p(jArr12, jArr12, jArr13);
                    i.p(jArr13, jArr15, jArr16);
                    i.p(jArr14, jArr14, jArr12);
                    w0 w0Var = new w0(e0Var);
                    for (int i22 = 1; i22 < 8; i22++) {
                        i.b(e0Var, w0Var, hVarArr[i22 - 1]);
                        hVarArr[i22] = new h(new w0(e0Var));
                    }
                    byte[] bArrM = i.m(bArrDigest);
                    byte[] bArrM2 = i.m(bArrCopyOfRange);
                    e0 e0Var2 = new e0(26);
                    long[] jArr17 = (long[]) e0Var2.C;
                    p1 p1Var2 = (p1) e0Var2.B;
                    w0 w0Var2 = new w0(23);
                    while (i20 >= 0 && bArrM[i20] == 0 && bArrM2[i20] == 0) {
                        i20--;
                    }
                    while (i20 >= 0) {
                        long[] jArr18 = new long[10];
                        long[] jArr19 = new long[10];
                        long[] jArr20 = new long[10];
                        long[] jArr21 = (long[]) p1Var2.B;
                        long[] jArr22 = (long[]) p1Var2.D;
                        long[] jArr23 = (long[]) p1Var2.C;
                        i.j(jArr18, jArr21, jArr17);
                        i.j(jArr19, jArr23, jArr22);
                        i.j(jArr20, jArr22, jArr17);
                        long[] jArr24 = new long[10];
                        i.n(jArr21, jArr18);
                        i.n(jArr22, jArr19);
                        i.n(jArr17, jArr20);
                        i.q(jArr17, jArr17, jArr17);
                        i.q(jArr23, jArr18, jArr19);
                        i.n(jArr24, jArr23);
                        i.q(jArr23, jArr22, jArr21);
                        i.p(jArr22, jArr22, jArr21);
                        i.p(jArr21, jArr24, jArr23);
                        i.p(jArr17, jArr17, jArr22);
                        byte b7 = bArrM[i20];
                        if (b7 > 0) {
                            w0.h(w0Var2, e0Var2);
                            i.b(e0Var2, w0Var2, hVarArr[bArrM[i20] / 2]);
                        } else if (b7 < 0) {
                            w0.h(w0Var2, e0Var2);
                            i.o(e0Var2, w0Var2, hVarArr[(-bArrM[i20]) / 2]);
                        }
                        byte b10 = bArrM2[i20];
                        if (b10 > 0) {
                            w0.h(w0Var2, e0Var2);
                            i.b(e0Var2, w0Var2, j.f17487e[bArrM2[i20] / 2]);
                        } else if (b10 < 0) {
                            w0.h(w0Var2, e0Var2);
                            i.o(e0Var2, w0Var2, j.f17487e[(-bArrM2[i20]) / 2]);
                        }
                        i20--;
                    }
                    long[] jArr25 = new long[10];
                    long[] jArr26 = new long[10];
                    long[] jArr27 = new long[10];
                    long[] jArr28 = (long[]) p1Var2.B;
                    long[] jArr29 = (long[]) p1Var2.D;
                    i.j(jArr25, jArr28, jArr17);
                    i.j(jArr26, (long[]) p1Var2.C, jArr29);
                    i.j(jArr27, jArr29, jArr17);
                    long[] jArr30 = new long[10];
                    long[] jArr31 = new long[10];
                    long[] jArr32 = new long[10];
                    long[] jArr33 = new long[10];
                    long[] jArr34 = new long[10];
                    long[] jArr35 = new long[10];
                    long[] jArr36 = new long[10];
                    long[] jArr37 = new long[10];
                    long[] jArr38 = new long[10];
                    long[] jArr39 = new long[10];
                    long[] jArr40 = new long[10];
                    long[] jArr41 = new long[10];
                    long[] jArr42 = new long[10];
                    i.n(jArr33, jArr27);
                    i.n(jArr42, jArr33);
                    i.n(jArr41, jArr42);
                    i.j(jArr34, jArr41, jArr27);
                    i.j(jArr35, jArr34, jArr33);
                    i.n(jArr41, jArr35);
                    i.j(jArr36, jArr41, jArr34);
                    i.n(jArr41, jArr36);
                    i.n(jArr42, jArr41);
                    i.n(jArr41, jArr42);
                    i.n(jArr42, jArr41);
                    i.n(jArr41, jArr42);
                    i.j(jArr37, jArr41, jArr36);
                    i.n(jArr41, jArr37);
                    i.n(jArr42, jArr41);
                    for (int i23 = 2; i23 < 10; i23 += 2) {
                        i.n(jArr41, jArr42);
                        i.n(jArr42, jArr41);
                    }
                    i.j(jArr38, jArr42, jArr37);
                    i.n(jArr41, jArr38);
                    i.n(jArr42, jArr41);
                    for (int i24 = 2; i24 < 20; i24 += 2) {
                        i.n(jArr41, jArr42);
                        i.n(jArr42, jArr41);
                    }
                    i.j(jArr41, jArr42, jArr38);
                    i.n(jArr42, jArr41);
                    i.n(jArr41, jArr42);
                    for (int i25 = 2; i25 < 10; i25 += 2) {
                        i.n(jArr42, jArr41);
                        i.n(jArr41, jArr42);
                    }
                    i.j(jArr39, jArr41, jArr37);
                    i.n(jArr41, jArr39);
                    i.n(jArr42, jArr41);
                    for (int i26 = 2; i26 < 50; i26 += 2) {
                        i.n(jArr41, jArr42);
                        i.n(jArr42, jArr41);
                    }
                    i.j(jArr40, jArr42, jArr39);
                    i.n(jArr42, jArr40);
                    i.n(jArr41, jArr42);
                    for (int i27 = 2; i27 < 100; i27 += 2) {
                        i.n(jArr42, jArr41);
                        i.n(jArr41, jArr42);
                    }
                    i.j(jArr42, jArr41, jArr40);
                    i.n(jArr41, jArr42);
                    i.n(jArr42, jArr41);
                    for (int i28 = 2; i28 < 50; i28 += 2) {
                        i.n(jArr41, jArr42);
                        i.n(jArr42, jArr41);
                    }
                    i.j(jArr41, jArr42, jArr39);
                    i.n(jArr42, jArr41);
                    i.n(jArr41, jArr42);
                    i.n(jArr42, jArr41);
                    i.n(jArr41, jArr42);
                    i.n(jArr42, jArr41);
                    i.j(jArr30, jArr42, jArr35);
                    i.j(jArr31, jArr25, jArr30);
                    i.j(jArr32, jArr26, jArr30);
                    byte[] bArrD = i.d(jArr32);
                    bArrD[31] = (byte) (bArrD[31] ^ ((i.d(jArr31)[0] & 1) << 7));
                    for (int i29 = 0; i29 < 32; i29++) {
                        if (bArrD[i29] != bArr[i29]) {
                            break;
                        }
                    }
                    return;
                }
                i10--;
                bArr3 = bArr;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
