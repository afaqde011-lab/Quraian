package com.mchutov.p000quranify.auth.presentation.analytics;

import com.google.protobuf.RuntimeVersion;
import ep.d;
import ep.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lep/e;", RuntimeVersion.SUFFIX, "analyticsProvider", "(Lep/e;)Ljava/lang/String;", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class AuthAnalyticsProviderKt {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                d dVar = e.Companion;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d dVar2 = e.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d dVar3 = e.Companion;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String analyticsProvider(e eVar) {
        m.e(eVar, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i11 == 1) {
            return "email";
        }
        if (i11 == 2) {
            return AuthAnalyticsProvider.GOOGLE;
        }
        if (i11 == 3) {
            return AuthAnalyticsProvider.APPLE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
