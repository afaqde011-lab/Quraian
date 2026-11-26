package com.revenuecat.purchases.customercenter;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/Resumable;", "", "", "shouldResume", "Lg00/b0;", "resume", "(Z)V", "invoke", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Resumable {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void invoke(Resumable resumable, boolean z) {
            Resumable.super.invoke(z);
        }
    }

    static void invoke$default(Resumable resumable, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        resumable.invoke(z);
    }

    default void invoke(boolean shouldResume) {
        resume(shouldResume);
    }

    void resume(boolean shouldResume);
}
