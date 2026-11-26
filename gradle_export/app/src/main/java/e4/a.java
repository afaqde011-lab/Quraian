package e4;

import a1.i;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;

public final class a {

    public final b f5052b;

    public final i f5053c;

    public int f5051a = 0;

    public int f5054d = 8;

    public int[] f5055e = new int[8];

    public int[] f5056f = new int[8];

    public float[] f5057g = new float[8];

    public int f5058h = -1;

    public int f5059i = -1;

    public boolean f5060j = false;

    public a(b bVar, i iVar) {
        this.f5052b = bVar;
        this.f5053c = iVar;
    }

    public final void a(g gVar, float f3, boolean z10) {
        if (f3 <= -0.001f || f3 >= 0.001f) {
            int i10 = this.f5058h;
            b bVar = this.f5052b;
            if (i10 == -1) {
                this.f5058h = 0;
                this.f5057g[0] = f3;
                this.f5055e[0] = gVar.B;
                this.f5056f[0] = -1;
                gVar.K++;
                gVar.a(bVar);
                this.f5051a++;
                if (this.f5060j) {
                    return;
                }
                int i11 = this.f5059i + 1;
                this.f5059i = i11;
                int[] iArr = this.f5055e;
                if (i11 >= iArr.length) {
                    this.f5060j = true;
                    this.f5059i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f5051a; i13++) {
                int i14 = this.f5055e[i10];
                int i15 = gVar.B;
                if (i14 == i15) {
                    float[] fArr = this.f5057g;
                    float f10 = fArr[i10] + f3;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == 0.0f) {
                        if (i10 == this.f5058h) {
                            this.f5058h = this.f5056f[i10];
                        } else {
                            int[] iArr2 = this.f5056f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            gVar.b(bVar);
                        }
                        if (this.f5060j) {
                            this.f5059i = i10;
                        }
                        gVar.K--;
                        this.f5051a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f5056f[i10];
            }
            int length = this.f5059i;
            int i16 = length + 1;
            if (this.f5060j) {
                int[] iArr3 = this.f5055e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f5055e;
            if (length >= iArr4.length && this.f5051a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f5055e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f5055e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f5054d * 2;
                this.f5054d = i18;
                this.f5060j = false;
                this.f5059i = length - 1;
                this.f5057g = Arrays.copyOf(this.f5057g, i18);
                this.f5055e = Arrays.copyOf(this.f5055e, this.f5054d);
                this.f5056f = Arrays.copyOf(this.f5056f, this.f5054d);
            }
            this.f5055e[length] = gVar.B;
            this.f5057g[length] = f3;
            if (i12 != -1) {
                int[] iArr7 = this.f5056f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f5056f[length] = this.f5058h;
                this.f5058h = length;
            }
            gVar.K++;
            gVar.a(bVar);
            this.f5051a++;
            if (!this.f5060j) {
                this.f5059i++;
            }
            int i19 = this.f5059i;
            int[] iArr8 = this.f5055e;
            if (i19 >= iArr8.length) {
                this.f5060j = true;
                this.f5059i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i10 = this.f5058h;
        for (int i11 = 0; i10 != -1 && i11 < this.f5051a; i11++) {
            g gVar = ((g[]) this.f5053c.D)[this.f5055e[i10]];
            if (gVar != null) {
                gVar.b(this.f5052b);
            }
            i10 = this.f5056f[i10];
        }
        this.f5058h = -1;
        this.f5059i = -1;
        this.f5060j = false;
        this.f5051a = 0;
    }

    public final float c(g gVar) {
        int i10 = this.f5058h;
        for (int i11 = 0; i10 != -1 && i11 < this.f5051a; i11++) {
            if (this.f5055e[i10] == gVar.B) {
                return this.f5057g[i10];
            }
            i10 = this.f5056f[i10];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f5051a;
    }

    public final g e(int i10) {
        int i11 = this.f5058h;
        for (int i12 = 0; i11 != -1 && i12 < this.f5051a; i12++) {
            if (i12 == i10) {
                return ((g[]) this.f5053c.D)[this.f5055e[i11]];
            }
            i11 = this.f5056f[i11];
        }
        return null;
    }

    public final float f(int i10) {
        int i11 = this.f5058h;
        for (int i12 = 0; i11 != -1 && i12 < this.f5051a; i12++) {
            if (i12 == i10) {
                return this.f5057g[i11];
            }
            i11 = this.f5056f[i11];
        }
        return 0.0f;
    }

    public final void g(g gVar, float f3) {
        if (f3 == 0.0f) {
            h(gVar, true);
            return;
        }
        int i10 = this.f5058h;
        b bVar = this.f5052b;
        if (i10 == -1) {
            this.f5058h = 0;
            this.f5057g[0] = f3;
            this.f5055e[0] = gVar.B;
            this.f5056f[0] = -1;
            gVar.K++;
            gVar.a(bVar);
            this.f5051a++;
            if (this.f5060j) {
                return;
            }
            int i11 = this.f5059i + 1;
            this.f5059i = i11;
            int[] iArr = this.f5055e;
            if (i11 >= iArr.length) {
                this.f5060j = true;
                this.f5059i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f5051a; i13++) {
            int i14 = this.f5055e[i10];
            int i15 = gVar.B;
            if (i14 == i15) {
                this.f5057g[i10] = f3;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f5056f[i10];
        }
        int length = this.f5059i;
        int i16 = length + 1;
        if (this.f5060j) {
            int[] iArr2 = this.f5055e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f5055e;
        if (length >= iArr3.length && this.f5051a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f5055e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f5055e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f5054d * 2;
            this.f5054d = i18;
            this.f5060j = false;
            this.f5059i = length - 1;
            this.f5057g = Arrays.copyOf(this.f5057g, i18);
            this.f5055e = Arrays.copyOf(this.f5055e, this.f5054d);
            this.f5056f = Arrays.copyOf(this.f5056f, this.f5054d);
        }
        this.f5055e[length] = gVar.B;
        this.f5057g[length] = f3;
        if (i12 != -1) {
            int[] iArr6 = this.f5056f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f5056f[length] = this.f5058h;
            this.f5058h = length;
        }
        gVar.K++;
        gVar.a(bVar);
        int i19 = this.f5051a + 1;
        this.f5051a = i19;
        if (!this.f5060j) {
            this.f5059i++;
        }
        int[] iArr7 = this.f5055e;
        if (i19 >= iArr7.length) {
            this.f5060j = true;
        }
        if (this.f5059i >= iArr7.length) {
            this.f5060j = true;
            this.f5059i = iArr7.length - 1;
        }
    }

    public final float h(g gVar, boolean z10) {
        int i10 = this.f5058h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f5051a) {
            if (this.f5055e[i10] == gVar.B) {
                if (i10 == this.f5058h) {
                    this.f5058h = this.f5056f[i10];
                } else {
                    int[] iArr = this.f5056f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    gVar.b(this.f5052b);
                }
                gVar.K--;
                this.f5051a--;
                this.f5055e[i10] = -1;
                if (this.f5060j) {
                    this.f5059i = i10;
                }
                return this.f5057g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f5056f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f5058h;
        String string = RuntimeVersion.SUFFIX;
        for (int i11 = 0; i10 != -1 && i11 < this.f5051a; i11++) {
            StringBuilder sbQ = x5.q(w.c.j(string, " -> "));
            sbQ.append(this.f5057g[i10]);
            sbQ.append(" : ");
            StringBuilder sbQ2 = x5.q(sbQ.toString());
            sbQ2.append(((g[]) this.f5053c.D)[this.f5055e[i10]]);
            string = sbQ2.toString();
            i10 = this.f5056f[i10];
        }
        return string;
    }
}
