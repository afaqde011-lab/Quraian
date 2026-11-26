package vo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lvo/f;", "", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getReason", "reason", "c", "getReasonSpecification", "reasonSpecification", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    @ck.b("code")
    private final String code;

    @ck.b("reason")
    private final String reason;

    @ck.b("reason_specification")
    private final String reasonSpecification;

    public f(String code, String reason, String reasonSpecification) {
        kotlin.jvm.internal.m.e(code, "code");
        kotlin.jvm.internal.m.e(reason, "reason");
        kotlin.jvm.internal.m.e(reasonSpecification, "reasonSpecification");
        this.code = code;
        this.reason = reason;
        this.reasonSpecification = reasonSpecification;
    }
}
