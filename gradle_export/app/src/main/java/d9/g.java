package d9;

import android.text.Layout;

public final class g {

    public String f4821a;

    public int f4822b;

    public boolean f4823c;

    public int f4824d;

    public boolean f4825e;

    public float f4831k;
    public String l;

    public Layout.Alignment f4833o;

    public Layout.Alignment f4834p;

    public b f4836r;

    public String f4838t;

    public String f4839u;

    public int f4826f = -1;

    public int f4827g = -1;

    public int f4828h = -1;

    public int f4829i = -1;

    public int f4830j = -1;
    public int m = -1;

    public int f4832n = -1;

    public int f4835q = -1;

    public float f4837s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f4823c && gVar.f4823c) {
                this.f4822b = gVar.f4822b;
                this.f4823c = true;
            }
            if (this.f4828h == -1) {
                this.f4828h = gVar.f4828h;
            }
            if (this.f4829i == -1) {
                this.f4829i = gVar.f4829i;
            }
            if (this.f4821a == null && (str = gVar.f4821a) != null) {
                this.f4821a = str;
            }
            if (this.f4826f == -1) {
                this.f4826f = gVar.f4826f;
            }
            if (this.f4827g == -1) {
                this.f4827g = gVar.f4827g;
            }
            if (this.f4832n == -1) {
                this.f4832n = gVar.f4832n;
            }
            if (this.f4833o == null && (alignment2 = gVar.f4833o) != null) {
                this.f4833o = alignment2;
            }
            if (this.f4834p == null && (alignment = gVar.f4834p) != null) {
                this.f4834p = alignment;
            }
            if (this.f4835q == -1) {
                this.f4835q = gVar.f4835q;
            }
            if (this.f4830j == -1) {
                this.f4830j = gVar.f4830j;
                this.f4831k = gVar.f4831k;
            }
            if (this.f4836r == null) {
                this.f4836r = gVar.f4836r;
            }
            if (this.f4837s == Float.MAX_VALUE) {
                this.f4837s = gVar.f4837s;
            }
            if (this.f4838t == null) {
                this.f4838t = gVar.f4838t;
            }
            if (this.f4839u == null) {
                this.f4839u = gVar.f4839u;
            }
            if (!this.f4825e && gVar.f4825e) {
                this.f4824d = gVar.f4824d;
                this.f4825e = true;
            }
            if (this.m != -1 || (i10 = gVar.m) == -1) {
                return;
            }
            this.m = i10;
        }
    }
}
