package u5;

public final class f {

    public double f14976a;

    public double f14977b;

    public boolean f14978c;

    public double f14979d;

    public double f14980e;

    public double f14981f;

    public double f14982g;

    public double f14983h;

    public double f14984i;

    public final gg.e f14985j;

    public f() {
        this.f14976a = Math.sqrt(1500.0d);
        this.f14977b = 0.5d;
        this.f14978c = false;
        this.f14984i = Double.MAX_VALUE;
        this.f14985j = new gg.e();
    }

    public f(float f3) {
        this.f14976a = Math.sqrt(1500.0d);
        this.f14977b = 0.5d;
        this.f14978c = false;
        this.f14985j = new gg.e();
        this.f14984i = f3;
    }

    public final void a(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f14977b = f3;
        this.f14978c = false;
    }

    public final void b(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f14976a = Math.sqrt(f3);
        this.f14978c = false;
    }

    public final gg.e c(double d3, double d5, long j9) {
        double dSin;
        double dCos;
        if (!this.f14978c) {
            if (this.f14984i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d10 = this.f14977b;
            if (d10 > 1.0d) {
                double d11 = this.f14976a;
                this.f14981f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                double d12 = this.f14977b;
                double d13 = this.f14976a;
                this.f14982g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
            } else if (d10 >= 0.0d && d10 < 1.0d) {
                this.f14983h = Math.sqrt(1.0d - (d10 * d10)) * this.f14976a;
            }
            this.f14978c = true;
        }
        double d14 = j9 / 1000.0d;
        double d15 = d3 - this.f14984i;
        double d16 = this.f14977b;
        if (d16 > 1.0d) {
            double d17 = this.f14982g;
            double d18 = ((d17 * d15) - d5) / (d17 - this.f14981f);
            double d19 = d15 - d18;
            dSin = (Math.pow(2.718281828459045d, this.f14981f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f14982g;
            double dPow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f14981f;
            dCos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + dPow;
        } else if (d16 == 1.0d) {
            double d22 = this.f14976a;
            double d23 = (d22 * d15) + d5;
            double d24 = (d23 * d14) + d15;
            double dPow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f14976a) * d14) * d24;
            double d25 = -this.f14976a;
            dCos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (dPow3 * d25);
            dSin = dPow2;
        } else {
            double d26 = 1.0d / this.f14983h;
            double d27 = this.f14976a;
            double d28 = ((d16 * d27 * d15) + d5) * d26;
            dSin = ((Math.sin(this.f14983h * d14) * d28) + (Math.cos(this.f14983h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f14976a;
            double d30 = this.f14977b;
            double d31 = (-d29) * dSin * d30;
            double dPow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.f14983h;
            double dSin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.f14983h;
            dCos = (((Math.cos(d33 * d14) * d28 * d33) + dSin2) * dPow4) + d31;
        }
        float f3 = (float) (dSin + this.f14984i);
        gg.e eVar = this.f14985j;
        eVar.A = f3;
        eVar.B = (float) dCos;
        return eVar;
    }
}
