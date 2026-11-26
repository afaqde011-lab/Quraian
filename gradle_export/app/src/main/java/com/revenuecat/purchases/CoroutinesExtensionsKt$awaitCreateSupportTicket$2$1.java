package com.revenuecat.purchases;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "wasSent", "Lg00/b0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1 extends n implements k {
    final k00.c<CreateSupportTicketResult> $continuation;

    public CoroutinesExtensionsKt$awaitCreateSupportTicket$2$1(k00.c<? super CreateSupportTicketResult> cVar) {
        super(1);
        this.$continuation = cVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return b0.a;
    }

    public final void invoke(boolean z) {
        this.$continuation.resumeWith(new CreateSupportTicketResult(z));
    }
}
