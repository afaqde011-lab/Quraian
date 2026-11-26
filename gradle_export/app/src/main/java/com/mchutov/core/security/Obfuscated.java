package com.mchutov.core.security;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0082 J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/mchutov/core/security/Obfuscated;", "", "<init>", "()V", "decodeNative", "", "encodedHex", "keyHex", "decode", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Obfuscated {
    public static final int $stable = 0;
    public static final Obfuscated INSTANCE = new Obfuscated();

    static {
        System.loadLibrary("qsec");
    }

    private Obfuscated() {
    }

    private final native String decodeNative(String encodedHex, String keyHex);

    public final String decode(String encodedHex) {
        m.e(encodedHex, "encodedHex");
        return encodedHex.length() == 0 ? "" : decodeNative(encodedHex, "4fa27118e3059c6b2df74482b13960ce075aab21d4963f8812ef576dc04ba973");
    }
}
