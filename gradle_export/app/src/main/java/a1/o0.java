package a1;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class o0 implements u00.k {
    public final int A;
    public final int B;
    public final int C;

    public o0(int i10, int i11, int i12) {
        this.A = i12;
        this.B = i10;
        this.C = i11;
    }

    public final Object invoke(Object obj) {
        int length;
        int i10;
        long j9;
        d1 d1Var;
        char cCharAt;
        switch (this.A) {
            case 0:
                z0.a aVar = (z0.a) obj;
                int i11 = this.B;
                int i12 = this.C;
                if (i11 < 0 || i12 < 0) {
                    g0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
                }
                int iG = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    int i14 = iG + 1;
                    long j10 = aVar.D;
                    d1 d1Var2 = aVar.B;
                    if (m3.q0.g(j10) <= i14) {
                        iG = m3.q0.g(aVar.D);
                        length = 0;
                        for (int i15 = 0; i15 < i12; i15++) {
                            i10 = length + 1;
                            j9 = aVar.D;
                            d1Var = aVar.B;
                            if (m3.q0.f(j9) + i10 < d1Var.length()) {
                                length = d1Var.length() - m3.q0.f(aVar.D);
                                x0.u(aVar, m3.q0.f(aVar.D), m3.q0.f(aVar.D) + length);
                                x0.u(aVar, m3.q0.g(aVar.D) - iG, m3.q0.g(aVar.D));
                                return g00.b0.a;
                            }
                            cCharAt = d1Var.charAt((m3.q0.f(aVar.D) + i10) - 1);
                            char cCharAt2 = d1Var.charAt(m3.q0.f(aVar.D) + i10);
                            if (Character.isHighSurrogate(cCharAt) || !Character.isLowSurrogate(cCharAt2)) {
                                length = i10;
                            } else {
                                length += 2;
                            }
                        }
                        x0.u(aVar, m3.q0.f(aVar.D), m3.q0.f(aVar.D) + length);
                        x0.u(aVar, m3.q0.g(aVar.D) - iG, m3.q0.g(aVar.D));
                        return g00.b0.a;
                    }
                    iG = (Character.isHighSurrogate(d1Var2.charAt((m3.q0.g(aVar.D) - i14) + (-1))) && Character.isLowSurrogate(d1Var2.charAt(m3.q0.g(aVar.D) - i14))) ? iG + 2 : i14;
                }
                length = 0;
                while (i15 < i12) {
                    i10 = length + 1;
                    j9 = aVar.D;
                    d1Var = aVar.B;
                    if (m3.q0.f(j9) + i10 < d1Var.length()) {
                        length = d1Var.length() - m3.q0.f(aVar.D);
                        x0.u(aVar, m3.q0.f(aVar.D), m3.q0.f(aVar.D) + length);
                        x0.u(aVar, m3.q0.g(aVar.D) - iG, m3.q0.g(aVar.D));
                        return g00.b0.a;
                    }
                    cCharAt = d1Var.charAt((m3.q0.f(aVar.D) + i10) - 1);
                    char cCharAt3 = d1Var.charAt(m3.q0.f(aVar.D) + i10);
                    if (Character.isHighSurrogate(cCharAt)) {
                        length = i10;
                    } else {
                        length = i10;
                    }
                }
                x0.u(aVar, m3.q0.f(aVar.D), m3.q0.f(aVar.D) + length);
                x0.u(aVar, m3.q0.g(aVar.D) - iG, m3.q0.g(aVar.D));
                return g00.b0.a;
            case 1:
                PlayerItem playerItem = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem, "it");
                return Boolean.valueOf(playerItem.getReciterId() == this.B && playerItem.getSurahNumber() == this.C);
            default:
                PlayerItem playerItem2 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem2, "it");
                return Boolean.valueOf(playerItem2.getReciterId() == this.B && playerItem2.getSurahNumber() == this.C);
        }
    }
}
