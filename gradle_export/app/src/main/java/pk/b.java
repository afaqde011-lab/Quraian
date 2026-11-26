package pk;

public final class b {

    public static final b f12546f = new b(0.5286651d, 0.5555555555555556d, 1.0732051d, 1.0732051d);

    public static final b f12547g = new b(0.396498825d, 0.0d, 1.0d, 1.0d);

    public final double f12548a;

    public final double f12549b;

    public final double f12550c;

    public final double f12551d;

    public qk.a f12552e;

    public b(double d3, double d5, double d10, double d11) {
        this.f12548a = d3;
        this.f12549b = d5;
        this.f12550c = d10;
        this.f12551d = d11;
    }

    public final qk.a a() {
        qk.a aVar;
        qk.a aVar2 = this.f12552e;
        if (aVar2 != null) {
            return aVar2;
        }
        double d3 = (1.5707963267948966d - (this.f12549b * 1.5707963267948966d)) * 0.5d;
        double dSin = Math.sin(d3);
        double dCos = Math.cos(d3);
        double d5 = this.f12550c;
        double d10 = this.f12548a;
        double d11 = this.f12551d;
        if (d5 == 1.0d && d11 == 1.0d) {
            double d12 = dCos + 1.0d;
            double d13 = dSin / d12;
            aVar = new qk.a(new qk.b(-d10, 0.0d), new qk.b((1.0d - (1.5d / d12)) * d13, 0.0d), new qk.b(d13, 0.0d), new qk.b(dSin, 1.0d - dCos));
        } else {
            double d14 = 1.0d / d11;
            double d15 = 1.0d - d14;
            double dSqrt = 0.0d + ((1.0d / Math.sqrt(2.0d)) * d15) + (dSin * d14);
            double dSqrt2 = 1.0d + (((-1.0d) / Math.sqrt(2.0d)) * d15) + ((-dCos) * d14);
            qk.b bVar = new qk.b(dSqrt, dSqrt2);
            double d16 = -d10;
            qk.b bVar2 = new qk.b(d16, 0.0d);
            double d17 = (1.0d * dSin) - (0.0d * dCos);
            double d18 = dSqrt - d16;
            double d19 = dSqrt2 - 0.0d;
            double d20 = (d18 * 0.0d) + ((-d19) * 1.0d);
            double d21 = ((-((d19 * dCos) - (d18 * dSin))) / d17) - ((((((d5 * 1.5d) * d20) * d20) / d17) / d17) / d17);
            double d22 = (-d20) / d17;
            double d23 = d21 * 1.0d;
            if (d23 < 0.0d) {
                d23 = 0.0d;
            }
            double d24 = d21 * 0.0d;
            if (d24 < 0.0d) {
                d24 = 0.0d;
            }
            qk.b bVar3 = new qk.b(d16 + d23, 0.0d + d24);
            double d25 = d22 * dCos;
            if (d25 < 0.0d) {
                d25 = 0.0d;
            }
            double d26 = d22 * dSin;
            if (d26 < 0.0d) {
                d26 = 0.0d;
            }
            aVar = new qk.a(bVar2, bVar3, new qk.b(dSqrt - d25, dSqrt2 - d26), bVar);
        }
        this.f12552e = aVar;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f12548a, bVar.f12548a) == 0 && Double.compare(this.f12549b, bVar.f12549b) == 0 && Double.compare(this.f12550c, bVar.f12550c) == 0 && Double.compare(this.f12551d, bVar.f12551d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f12551d) + ((Double.hashCode(this.f12550c) + ((Double.hashCode(this.f12549b) + (Double.hashCode(this.f12548a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "G2ContinuityProfile(extendedFraction=" + this.f12548a + ", arcFraction=" + this.f12549b + ", bezierCurvatureScale=" + this.f12550c + ", arcCurvatureScale=" + this.f12551d + ")";
    }
}
