package zh;

import java.lang.reflect.Array;
import java.math.BigInteger;
import q3.e0;

public abstract class j {

    public static final long[] f17483a;

    public static final long[] f17484b;

    public static final long[] f17485c;

    public static final g[][] f17486d;

    public static final g[] f17487e;

    public static final BigInteger f17488f;

    public static final BigInteger f17489g;

    public static final BigInteger f17490h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f17488f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f17489g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f17490h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        e0 e0Var = new e0(27, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        e0Var.C = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        e0Var.B = bigIntegerModPow2;
        f17483a = i.g(c(bigIntegerMod));
        f17484b = i.g(c(bigIntegerMod2));
        f17485c = i.g(c(bigIntegerModPow));
        f17486d = (g[][]) Array.newInstance((Class<?>) g.class, 32, 8);
        e0 e0VarA = e0Var;
        for (int i10 = 0; i10 < 32; i10++) {
            e0 e0VarA2 = e0VarA;
            for (int i11 = 0; i11 < 8; i11++) {
                f17486d[i10][i11] = b(e0VarA2);
                e0VarA2 = a(e0VarA2, e0VarA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                e0VarA = a(e0VarA, e0VarA);
            }
        }
        e0 e0VarA3 = a(e0Var, e0Var);
        f17487e = new g[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f17487e[i13] = b(e0Var);
            e0Var = a(e0Var, e0VarA3);
        }
    }

    public static e0 a(e0 e0Var, e0 e0Var2) {
        e0 e0Var3 = new e0(27, false);
        BigInteger bigIntegerMultiply = f17489g.multiply(((BigInteger) e0Var.B).multiply((BigInteger) e0Var2.B).multiply((BigInteger) e0Var.C).multiply((BigInteger) e0Var2.C));
        BigInteger bigInteger = f17488f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) e0Var.B).multiply((BigInteger) e0Var2.C).add(((BigInteger) e0Var2.B).multiply((BigInteger) e0Var.C));
        BigInteger bigInteger2 = BigInteger.ONE;
        e0Var3.B = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        e0Var3.C = ((BigInteger) e0Var.C).multiply((BigInteger) e0Var2.C).add(((BigInteger) e0Var.B).multiply((BigInteger) e0Var2.B)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return e0Var3;
    }

    public static g b(e0 e0Var) {
        BigInteger bigIntegerAdd = ((BigInteger) e0Var.C).add((BigInteger) e0Var.B);
        BigInteger bigInteger = f17488f;
        return new g(i.g(c(bigIntegerAdd.mod(bigInteger))), i.g(c(((BigInteger) e0Var.C).subtract((BigInteger) e0Var.B).mod(bigInteger))), i.g(c(f17490h.multiply((BigInteger) e0Var.B).multiply((BigInteger) e0Var.C).mod(bigInteger))));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b7 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b7;
        }
        return bArr;
    }
}
