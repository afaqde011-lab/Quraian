package dq;

import a40.z;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import g00.b0;

public final class s extends m00.i implements u00.n {
    public int A;
    public int B;
    public final u C;
    public final String D;
    public final ReciterCollectionEvent E;
    public final long F;

    public s(u uVar, String str, ReciterCollectionEvent reciterCollectionEvent, long j, k00.c cVar) {
        super(2, cVar);
        this.C = uVar;
        this.D = str;
        this.E = reciterCollectionEvent;
        this.F = j;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new s(this.C, this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: dq.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
