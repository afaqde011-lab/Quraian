package com.google.common.util.concurrent;

import fh.e1;
import java.util.Objects;
import kh.n;
import kh.o;

public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        e1.m(3, o.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", n.class.getName());
    }

    @Override
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb2.append(", ");
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
