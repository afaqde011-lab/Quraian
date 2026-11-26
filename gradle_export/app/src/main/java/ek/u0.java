package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.BitSet;

public class u0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        boolean zS;
        BitSet bitSet = new BitSet();
        aVar.a();
        int iT0 = aVar.t0();
        int i10 = 0;
        while (iT0 != 2) {
            int iB = e4.f.b(iT0);
            if (iB == 5 || iB == 6) {
                int iB0 = aVar.b0();
                if (iB0 == 0) {
                    zS = false;
                } else {
                    if (iB0 != 1) {
                        StringBuilder sbQ = oi.k.q("Invalid bitset value ", iB0, ", expected 0 or 1; at path ");
                        sbQ.append(aVar.F(true));
                        throw new JsonSyntaxException(sbQ.toString());
                    }
                    zS = true;
                }
            } else {
                if (iB != 7) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + g4.c.t(iT0) + "; at path " + aVar.F(false));
                }
                zS = aVar.S();
            }
            if (zS) {
                bitSet.set(i10);
            }
            i10++;
            iT0 = aVar.t0();
        }
        aVar.v();
        return bitSet;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.i();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.f0(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.v();
    }
}
