package androidx.datastore.core;

import a1.d;
import a40.c0;
import c40.o;
import c40.s;
import c40.t;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import java.io.File;
import k00.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RuntimeVersion.SUFFIX, "fileName", "Lg00/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends n implements k {
    final t $$this$channelFlow;
    final File $file;

    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, t tVar) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = tVar;
    }

    public Object invoke(Object obj) {
        invoke((String) obj);
        return b0.a;
    }

    public final void invoke(String str) {
        if (m.a(str, this.$file.getName())) {
            s sVar = this.$$this$channelFlow;
            Object objJ = sVar.j(b0.a);
            if (!(objJ instanceof c40.n)) {
            } else {
                Object obj = ((o) c0.C(j.A, new d(sVar, null, 22))).a;
            }
        }
    }
}
