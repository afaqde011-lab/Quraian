package x;

public final class a1 {

    public float f16229a;

    public double f16230b;

    public float f16231c;

    public final long a(float f3, float f10, long j9) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f11 = f3 - this.f16229a;
        double d3 = j9 / 1000.0d;
        float f12 = this.f16231c;
        double d5 = ((double) f12) * ((double) f12);
        double d10 = this.f16230b;
        double d11 = ((double) (-f12)) * d10;
        if (f12 <= 1.0f) {
            if (f12 == 1.0f) {
                double d12 = f11;
                double d13 = (d10 * d12) + ((double) f10);
                double d14 = (-d10) * d3;
                double d15 = (d3 * d13) + d12;
                dSin = Math.exp(d14) * d15;
                dExp = Math.exp(d14) * d15 * (-this.f16230b);
                dExp2 = Math.exp(d14) * d13;
            } else {
                double d16 = 1;
                double dSqrt = Math.sqrt(d16 - d5) * d10;
                double d17 = f11;
                double d18 = (((-d11) * d17) + ((double) f10)) * (d16 / dSqrt);
                double d19 = dSqrt * d3;
                double d20 = d3 * d11;
                dSin = ((Math.sin(d19) * d18) + (Math.cos(d19) * d17)) * Math.exp(d20);
                dCos = (((Math.cos(d19) * dSqrt * d18) + (Math.sin(d19) * (-dSqrt) * d17)) * Math.exp(d20)) + (d11 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f16229a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d5 - ((double) 1)) * d10;
        double d21 = d11 + dSqrt2;
        double d22 = d11 - dSqrt2;
        double d23 = f11;
        double d24 = ((d22 * d23) - ((double) f10)) / (d22 - d21);
        double d25 = d23 - d24;
        double d26 = d22 * d3;
        double d27 = d3 * d21;
        dSin = (Math.exp(d27) * d24) + (Math.exp(d26) * d25);
        dExp = Math.exp(d26) * d25 * d22;
        dExp2 = Math.exp(d27) * d24 * d21;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f16229a))) << 32);
    }
}
