package com.mchutov.core.domain.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/mchutov/core/domain/exception/AuthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthException extends Exception {
    public final String A;
    public final String B;
    public final Integer C;

    public AuthException(Integer num, String str, String str2) {
        super(str2);
        this.A = str;
        this.B = str2;
        this.C = num;
    }

    @Override
    public final String getMessage() {
        return this.B;
    }
}
