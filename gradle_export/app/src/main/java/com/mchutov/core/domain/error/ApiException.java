package com.mchutov.core.domain.error;

import kotlin.Metadata;
import retrofit2.HttpException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/mchutov/core/domain/error/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class ApiException extends Exception {
    public final String A;

    public ApiException() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public ApiException(String str, Throwable th) {
        super(str, th);
        this.A = str;
    }

    public ApiException(String str, HttpException httpException, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : httpException);
    }

    @Override
    public final String getMessage() {
        return this.A;
    }
}
