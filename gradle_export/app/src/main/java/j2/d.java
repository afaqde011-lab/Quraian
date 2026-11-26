package j2;

import du.w;

public final class d {

    public static final float[] f7863a;

    public static final float[] f7864b;

    public static final s f7865c;

    public static final s f7866d;

    public static final r f7867e;

    public static final r f7868f;

    public static final r f7869g;

    public static final r f7870h;

    public static final r f7871i;

    public static final r f7872j;

    public static final r f7873k;
    public static final r l;
    public static final r m;

    public static final r f7874n;

    public static final r f7875o;

    public static final r f7876p;

    public static final r f7877q;

    public static final r f7878r;

    public static final k f7879s;

    public static final k f7880t;

    public static final r f7881u;

    public static final r f7882v;

    public static final r f7883w;

    public static final l f7884x;

    public static final c[] f7885y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f7863a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f7864b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        s sVar = new s(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar2 = new s(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        s sVar3 = new s(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f7865c = sVar3;
        s sVar4 = new s(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f7866d = sVar4;
        t tVar = j.f7897d;
        r rVar = new r("sRGB IEC61966-2.1", fArr, tVar, sVar, 0);
        f7867e = rVar;
        r rVar2 = new r("sRGB IEC61966-2.1 (Linear)", fArr, tVar, 1.0d, 0.0f, 1.0f, 1);
        f7868f = rVar2;
        r rVar3 = new r("scRGB-nl IEC 61966-2-2:2003", fArr, tVar, null, new w(24), new w(25), -0.799f, 2.399f, sVar, 2);
        f7869g = rVar3;
        r rVar4 = new r("scRGB IEC 61966-2-2:2003", fArr, tVar, 1.0d, -0.5f, 7.499f, 3);
        f7870h = rVar4;
        r rVar5 = new r("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f7871i = rVar5;
        r rVar6 = new r("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, tVar, new s(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f7872j = rVar6;
        r rVar7 = new r("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new t(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f7873k = rVar7;
        r rVar8 = new r("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, tVar, sVar, 7);
        l = rVar8;
        r rVar9 = new r("NTSC (1953)", fArr2, j.f7894a, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = rVar9;
        r rVar10 = new r("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, tVar, new s(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f7874n = rVar10;
        r rVar11 = new r("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, tVar, 2.2d, 0.0f, 1.0f, 10);
        f7875o = rVar11;
        r rVar12 = new r("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f7895b, new s(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f7876p = rVar12;
        t tVar2 = j.f7896c;
        r rVar13 = new r("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, tVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f7877q = rVar13;
        r rVar14 = new r("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, tVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f7878r = rVar14;
        k kVar = new k(b.f7856b, 14, 1, "Generic XYZ");
        f7879s = kVar;
        long j9 = b.f7857c;
        k kVar2 = new k(j9, 15, 0, "Generic L*a*b*");
        f7880t = kVar2;
        r rVar15 = new r("None", fArr, tVar, sVar2, 16);
        f7881u = rVar15;
        r rVar16 = new r("Hybrid Log Gamma encoding", fArr3, tVar, null, new w(26), new w(27), 0.0f, 1.0f, sVar3, 17);
        f7882v = rVar16;
        r rVar17 = new r("Perceptual Quantizer encoding", fArr3, tVar, null, new w(28), new w(29), 0.0f, 1.0f, sVar4, 18);
        f7883w = rVar17;
        l lVar = new l("Oklab", j9, 19);
        f7884x = lVar;
        f7885y = new c[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, kVar, kVar2, rVar15, rVar16, rVar17, lVar};
    }

    public static double a(s sVar, double d3) {
        double d5 = d3 < 0.0d ? -1.0d : 1.0d;
        double d10 = d3 * d5;
        double d11 = sVar.f7918b;
        double d12 = sVar.f7919c;
        double d13 = sVar.f7920d;
        double d14 = sVar.f7921e;
        double d15 = sVar.f7922f;
        double d16 = d11 * d10;
        return (sVar.f7923g + 1.0d) * d5 * (d16 <= 1.0d ? Math.pow(d16, d12) : Math.exp((d10 - d15) * d13) + d14);
    }

    public static double b(s sVar, double d3) {
        double d5 = d3 < 0.0d ? -1.0d : 1.0d;
        double d10 = 1.0d / sVar.f7918b;
        double d11 = 1.0d / sVar.f7919c;
        double d12 = 1.0d / sVar.f7920d;
        double d13 = sVar.f7921e;
        double d14 = sVar.f7922f;
        double d15 = (d3 * d5) / (sVar.f7923g + 1.0d);
        return d5 * (d15 <= 1.0d ? Math.pow(d15, d11) * d10 : (Math.log(d15 - d13) * d12) + d14);
    }

    public static double c(s sVar, double d3) {
        double d5 = d3 < 0.0d ? -1.0d : 1.0d;
        double d10 = d3 * d5;
        double d11 = sVar.f7918b;
        double d12 = sVar.f7920d;
        double dPow = (Math.pow(d10, d12) * sVar.f7919c) + d11;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d10, d12) * sVar.f7922f) + sVar.f7921e), sVar.f7923g) * d5;
    }

    public static double d(s sVar, double d3) {
        double d5 = d3 < 0.0d ? -1.0d : 1.0d;
        double d10 = d3 * d5;
        double d11 = -sVar.f7918b;
        double d12 = sVar.f7921e;
        double d13 = 1.0d / sVar.f7923g;
        return Math.pow(Math.max((Math.pow(d10, d13) * d12) + d11, 0.0d) / ((Math.pow(d10, d13) * (-sVar.f7922f)) + sVar.f7919c), 1.0d / sVar.f7920d) * d5;
    }
}
