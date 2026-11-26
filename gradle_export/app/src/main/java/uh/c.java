package uh;

public final class c {

    public static final c f15258c;

    public static final c f15259d;

    public static final c f15260e;

    public static final c f15261f;

    public static final c f15262g;

    public static final c f15263h;

    public static final c f15264i;

    public static final c f15265j;

    public static final c f15266k;
    public static final c l;
    public static final c m;

    public static final c f15267n;

    public static final c f15268o;

    public final int f15269a;

    public final String f15270b;

    static {
        int i10 = 0;
        f15258c = new c("TINK", i10);
        f15259d = new c("CRUNCHY", i10);
        f15260e = new c("LEGACY", i10);
        f15261f = new c("NO_PREFIX", i10);
        int i11 = 1;
        f15262g = new c("SHA1", i11);
        f15263h = new c("SHA224", i11);
        f15264i = new c("SHA256", i11);
        f15265j = new c("SHA384", i11);
        f15266k = new c("SHA512", i11);
        int i12 = 2;
        l = new c("TINK", i12);
        m = new c("CRUNCHY", i12);
        f15267n = new c("LEGACY", i12);
        f15268o = new c("NO_PREFIX", i12);
    }

    public c(String str, int i10) {
        this.f15269a = i10;
        this.f15270b = str;
    }

    public final String toString() {
        switch (this.f15269a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f15270b;
    }
}
