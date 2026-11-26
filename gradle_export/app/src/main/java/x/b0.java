package x;

public final class b0 implements z {

    public final float f16243a;

    public final a1 f16244b;

    public b0(float f3, float f10, float f11) {
        this.f16243a = f11;
        a1 a1Var = new a1();
        a1Var.f16229a = 1.0f;
        a1Var.f16230b = Math.sqrt(50.0d);
        a1Var.f16231c = 1.0f;
        if (f3 < 0.0f) {
            o0.a("Damping ratio must be non-negative");
        }
        a1Var.f16231c = f3;
        double d3 = a1Var.f16230b;
        if (((float) (d3 * d3)) <= 0.0f) {
            o0.a("Spring stiffness constant must be positive.");
        }
        a1Var.f16230b = Math.sqrt(f10);
        this.f16244b = a1Var;
    }

    @Override
    public final long b(float f3, float f10, float f11) {
        double dLog;
        long j9;
        a1 a1Var = this.f16244b;
        double d3 = a1Var.f16230b;
        float f12 = (float) (d3 * d3);
        float f13 = a1Var.f16231c;
        float f14 = this.f16243a;
        float f15 = (f3 - f10) / f14;
        float f16 = f11 / f14;
        if (f13 == 0.0f) {
            j9 = 9223372036854L;
        } else {
            double d5 = f12;
            double d10 = f13;
            double d11 = f16;
            double d12 = f15;
            double d13 = 1.0f;
            double dSqrt = d10 * 2.0d * Math.sqrt(d5);
            double d14 = (dSqrt * dSqrt) - (d5 * 4.0d);
            double dSqrt2 = d14 < 0.0d ? 0.0d : Math.sqrt(d14);
            double d15 = -dSqrt;
            double d16 = (d15 + dSqrt2) * 0.5d;
            double dSqrt3 = (d14 < 0.0d ? Math.sqrt(Math.abs(d14)) : 0.0d) * 0.5d;
            double d17 = (d15 - dSqrt2) * 0.5d;
            if (d12 == 0.0d && d11 == 0.0d) {
                j9 = 0;
            } else {
                if (d12 < 0.0d) {
                    d11 = -d11;
                }
                double dAbs = Math.abs(d12);
                double dAbs2 = Double.MAX_VALUE;
                if (d10 > 1.0d) {
                    double d18 = (d16 * dAbs) - d11;
                    double d19 = d16 - d17;
                    double d20 = d18 / d19;
                    double d21 = dAbs - d20;
                    dLog = Math.log(Math.abs(d13 / d21)) / d16;
                    double dLog2 = Math.log(Math.abs(d13 / d20)) / d17;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d22 = d21 * d16;
                    double dLog3 = Math.log(d22 / ((-d20) * d17)) / (d17 - d16);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d13 = -d13;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d17) * d20) + (Math.exp(d16 * dLog3) * d21))) < d13) {
                                if (d20 > 0.0d && d21 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d13 = -d13;
                            }
                        }
                        dLog = Math.log((-((d20 * d17) * d17)) / (d22 * d16)) / d19;
                    }
                    double d23 = d20 * d17;
                    if (Math.abs((Math.exp(d17 * dLog) * d23) + (Math.exp(d16 * dLog) * d22)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (dAbs2 > 0.001d && i10 < 100) {
                            i10++;
                            double d24 = d16 * dLog;
                            double d25 = d17 * dLog;
                            double dExp = dLog - ((((Math.exp(d25) * d20) + (Math.exp(d24) * d21)) + d13) / ((Math.exp(d25) * d23) + (Math.exp(d24) * d22)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d10 < 1.0d) {
                    double d26 = (d11 - (d16 * dAbs)) / dSqrt3;
                    dLog = Math.log(d13 / Math.sqrt((d26 * d26) + (dAbs * dAbs))) / d16;
                } else {
                    double d27 = d16 * dAbs;
                    double d28 = d11 - d27;
                    double dLog4 = Math.log(Math.abs(d13 / dAbs)) / d16;
                    double dLog5 = Math.log(Math.abs(d13 / d28));
                    double dLog6 = dLog5;
                    for (int i11 = 0; i11 < 6; i11++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d16));
                    }
                    double d29 = dLog6 / d16;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d29;
                    } else if ((Double.doubleToRawLongBits(d29) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d29);
                    }
                    double d30 = (-(d27 + d28)) / (d16 * d28);
                    double d31 = d16 * d30;
                    double dExp2 = (Math.exp(d31) * d28 * d30) + (Math.exp(d31) * dAbs);
                    if (Double.isNaN(d30) || d30 <= 0.0d) {
                        d13 = -d13;
                    } else if (d30 <= 0.0d || (-dExp2) >= d13) {
                        dLog4 = (-(2.0d / d16)) - (dAbs / d28);
                    } else {
                        d13 = -d13;
                        dLog4 = (d28 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                    }
                    dLog = dLog4;
                    int i12 = 0;
                    while (dAbs2 > 0.001d && i12 < 100) {
                        i12++;
                        double d32 = d16 * dLog;
                        double dExp3 = dLog - (((Math.exp(d32) * ((d28 * dLog) + dAbs)) + d13) / (Math.exp(d32) * (((((double) 1) + d32) * d28) + d27)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j9 = (long) (dLog * 1000.0d);
            }
        }
        return j9 * 1000000;
    }

    @Override
    public final float c(float f3, float f10, float f11, long j9) {
        a1 a1Var = this.f16244b;
        a1Var.f16229a = f10;
        return Float.intBitsToFloat((int) (a1Var.a(f3, f11, j9 / 1000000) & 4294967295L));
    }

    @Override
    public final float d(float f3, float f10, float f11) {
        return 0.0f;
    }

    @Override
    public final float e(float f3, float f10, float f11, long j9) {
        a1 a1Var = this.f16244b;
        a1Var.f16229a = f10;
        return Float.intBitsToFloat((int) (a1Var.a(f3, f11, j9 / 1000000) >> 32));
    }
}
