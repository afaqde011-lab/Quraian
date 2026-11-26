package i9;

import a8.r;
import androidx.media3.common.ParserException;
import e7.u;

public abstract class e {

    public static final byte[] f7554a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    public static final byte[] f7555b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(r rVar) {
        u uVar = new u(8);
        int i10 = d.b(rVar, uVar).f7552a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        rVar.a(0, 4, uVar.f5182a);
        uVar.N(0);
        int iM = uVar.m();
        if (iM == 1463899717) {
            return true;
        }
        e7.a.d("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static d b(int i10, r rVar, u uVar) throws ParserException {
        d dVarB = d.b(rVar, uVar);
        while (true) {
            int i11 = dVarB.f7552a;
            if (i11 == i10) {
                return dVarB;
            }
            a1.b.y("Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j9 = dVarB.f7553b;
            long j10 = 8 + j9;
            if (j9 % 2 != 0) {
                j10 = 9 + j9;
            }
            if (j10 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            rVar.u((int) j10);
            dVarB = d.b(rVar, uVar);
        }
    }
}
