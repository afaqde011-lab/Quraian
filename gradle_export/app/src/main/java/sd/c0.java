package sd;

public final class c0 implements Cloneable {
    public final float A;
    public final int B;

    public c0(float f3) {
        this.A = f3;
        this.B = 1;
    }

    public c0(float f3, int i10) {
        this.A = f3;
        this.B = i10;
    }

    public final float a(y1 y1Var) {
        if (this.B != 9) {
            return d(y1Var);
        }
        w1 w1Var = (w1) y1Var.f14134c;
        h2.a aVar = w1Var.f14114g;
        if (aVar == null) {
            aVar = w1Var.f14113f;
        }
        float f3 = this.A;
        if (aVar == null) {
            return f3;
        }
        float fSqrt = aVar.f6542d;
        float f10 = aVar.f6543e;
        if (fSqrt != f10) {
            fSqrt = (float) (Math.sqrt((f10 * f10) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f3 * fSqrt) / 100.0f;
    }

    public final float b(y1 y1Var, float f3) {
        return this.B == 9 ? (this.A * f3) / 100.0f : d(y1Var);
    }

    public final float c() {
        float f3;
        float f10;
        int iB = e4.f.b(this.B);
        float f11 = this.A;
        if (iB == 0) {
            return f11;
        }
        if (iB == 3) {
            return f11 * 96.0f;
        }
        if (iB == 4) {
            f3 = f11 * 96.0f;
            f10 = 2.54f;
        } else if (iB == 5) {
            f3 = f11 * 96.0f;
            f10 = 25.4f;
        } else if (iB == 6) {
            f3 = f11 * 96.0f;
            f10 = 72.0f;
        } else {
            if (iB != 7) {
                return f11;
            }
            f3 = f11 * 96.0f;
            f10 = 6.0f;
        }
        return f3 / f10;
    }

    public final float d(y1 y1Var) {
        float textSize;
        int iB = e4.f.b(this.B);
        float f3 = this.A;
        switch (iB) {
            case 1:
                textSize = ((w1) y1Var.f14134c).f14111d.getTextSize();
                break;
            case 2:
                textSize = ((w1) y1Var.f14134c).f14111d.getTextSize() / 2.0f;
                break;
            case 3:
                y1Var.getClass();
                return f3 * 96.0f;
            case 4:
                y1Var.getClass();
                return (f3 * 96.0f) / 2.54f;
            case 5:
                y1Var.getClass();
                return (f3 * 96.0f) / 25.4f;
            case 6:
                y1Var.getClass();
                return (f3 * 96.0f) / 72.0f;
            case 7:
                y1Var.getClass();
                return (f3 * 96.0f) / 6.0f;
            case 8:
                w1 w1Var = (w1) y1Var.f14134c;
                h2.a aVar = w1Var.f14114g;
                if (aVar == null) {
                    aVar = w1Var.f14113f;
                }
                if (aVar != null) {
                    return (f3 * aVar.f6542d) / 100.0f;
                }
            default:
                return f3;
        }
        return textSize * f3;
    }

    public final float e(y1 y1Var) {
        if (this.B != 9) {
            return d(y1Var);
        }
        w1 w1Var = (w1) y1Var.f14134c;
        h2.a aVar = w1Var.f14114g;
        if (aVar == null) {
            aVar = w1Var.f14113f;
        }
        float f3 = this.A;
        return aVar == null ? f3 : (f3 * aVar.f6543e) / 100.0f;
    }

    public final boolean f() {
        return this.A < 0.0f;
    }

    public final boolean g() {
        return this.A == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.A));
        switch (this.B) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
