package s8;

import a8.c0;
import a8.d0;
import a8.e0;
import a8.k;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

public final class d implements d0 {

    public final k f13830a;

    public final SparseArray f13831b;

    public final long f13832c;

    public final int f13833d;

    public d(SparseArray sparseArray, long j9, int i10, long j10, long j11) {
        k kVar;
        int i11;
        this.f13831b = sparseArray;
        this.f13832c = j9;
        this.f13833d = i10;
        List list = (List) sparseArray.get(i10);
        if (list == null || list.isEmpty()) {
            kVar = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) list.get(i13);
                jArrCopyOf3[i13] = cVar.A;
                jArrCopyOf[i13] = cVar.B;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j9) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j10 + j11) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j9 - jArrCopyOf3[i15];
            if (i15 < i11) {
                e7.a.m("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            kVar = new k(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f13830a = kVar;
    }

    @Override
    public final boolean b() {
        List list = (List) this.f13831b.get(this.f13833d);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override
    public final c0 d(long j9) {
        k kVar = this.f13830a;
        if (kVar != null) {
            return kVar.d(j9);
        }
        e0 e0Var = e0.f252c;
        return new c0(e0Var, e0Var);
    }

    @Override
    public final long f() {
        return this.f13832c;
    }
}
