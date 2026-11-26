package com.revenuecat.purchases.models;

import com.revenuecat.purchases.common.verification.SigningManager;
import g00.c;
import g00.h;
import g00.i;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l40.a;
import n40.e;
import o40.b;
import p40.o0;
import p40.x0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0004+,-*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001d¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/models/Checksum;", "", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "algorithm", "", "value", "<init>", "(Lcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;)V", "", "seen1", "Lp40/x0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;Lp40/x0;)V", "self", "Lo40/b;", "output", "Ln40/e;", "serialDesc", "Lg00/b0;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/models/Checksum;Lo40/b;Ln40/e;)V", "write$Self", "other", "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/revenuecat/purchases/models/Checksum$Algorithm;Ljava/lang/String;)Lcom/revenuecat/purchases/models/Checksum;", "toString", "hashCode", "()I", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "getAlgorithm", "getAlgorithm$annotations", "()V", "Ljava/lang/String;", "getValue", "getValue$annotations", "Companion", "$serializer", "Algorithm", "ChecksumValidationException", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Checksum {
    private final Algorithm algorithm;
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {Algorithm.INSTANCE.serializer(), null};

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "", "algorithmName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAlgorithmName", "()Ljava/lang/String;", "SHA256", "SHA384", "SHA512", "MD5", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Algorithm {
        SHA256("SHA-256"),
        SHA384("SHA-384"),
        SHA512("SHA-512"),
        MD5("MD5");

        private final String algorithmName;

        public static final Companion INSTANCE = new Companion(null);
        private static final h $cachedSerializer$delegate = rd.a.I(i.B, Companion.AnonymousClass1.INSTANCE);

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Algorithm$Companion;", "", "<init>", "()V", "", "value", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "fromString", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class AnonymousClass1 extends n implements u00.a {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override
                public final a invoke() {
                    return o0.d("com.revenuecat.purchases.models.Checksum.Algorithm", Algorithm.values(), new String[]{SigningManager.POST_PARAMS_ALGORITHM, "sha384", "sha512", "md5"}, new Annotation[][]{null, null, null, null});
                }
            }

            private Companion() {
            }

            public Companion(f fVar) {
                this();
            }

            private final a get$cachedSerializer() {
                return (a) Algorithm.$cachedSerializer$delegate.getValue();
            }

            public final Algorithm fromString(String value) {
                m.e(value, "value");
                String lowerCase = value.toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals(SigningManager.POST_PARAMS_ALGORITHM)) {
                            return Algorithm.SHA256;
                        }
                        return null;
                    case -903628221:
                        if (lowerCase.equals("sha384")) {
                            return Algorithm.SHA384;
                        }
                        return null;
                    case -903626518:
                        if (lowerCase.equals("sha512")) {
                            return Algorithm.SHA512;
                        }
                        return null;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            return Algorithm.MD5;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            public final a serializer() {
                return get$cachedSerializer();
            }
        }

        Algorithm(String str) {
            this.algorithmName = str;
        }

        public final String getAlgorithmName() {
            return this.algorithmName;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$ChecksumValidationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ChecksumValidationException extends Exception {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/models/Checksum$Companion;", "", "<init>", "()V", "", "data", "Lcom/revenuecat/purchases/models/Checksum$Algorithm;", "algorithm", "Lcom/revenuecat/purchases/models/Checksum;", "generate", "([BLcom/revenuecat/purchases/models/Checksum$Algorithm;)Lcom/revenuecat/purchases/models/Checksum;", "Ll40/a;", "serializer", "()Ll40/a;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final Checksum generate(byte[] data, Algorithm algorithm) {
            m.e(data, "data");
            m.e(algorithm, "algorithm");
            byte[] hash = MessageDigest.getInstance(algorithm.getAlgorithmName()).digest(data);
            m.d(hash, "hash");
            return new Checksum(algorithm, ChecksumKt.toHexString(hash));
        }

        public final a serializer() {
            return Checksum$$serializer.INSTANCE;
        }
    }

    @c
    public Checksum(int i, Algorithm algorithm, String str, x0 x0Var) {
        if (3 != (i & 3)) {
            o0.g(i, 3, Checksum$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.algorithm = algorithm;
        this.value = str;
    }

    public Checksum(Algorithm algorithm, String value) {
        m.e(algorithm, "algorithm");
        m.e(value, "value");
        this.algorithm = algorithm;
        this.value = value;
    }

    public static Checksum copy$default(Checksum checksum, Algorithm algorithm, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            algorithm = checksum.algorithm;
        }
        if ((i & 2) != 0) {
            str = checksum.value;
        }
        return checksum.copy(algorithm, str);
    }

    public static void getAlgorithm$annotations() {
    }

    public static void getValue$annotations() {
    }

    public static final void write$Self$purchases_defaultsBc8Release(Checksum self, b output, e serialDesc) {
        output.C(serialDesc, 0, $childSerializers[0], self.algorithm);
        output.i(serialDesc, 1, self.value);
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getValue() {
        return this.value;
    }

    public final Checksum copy(Algorithm algorithm, String value) {
        m.e(algorithm, "algorithm");
        m.e(value, "value");
        return new Checksum(algorithm, value);
    }

    public boolean equals(Object other) {
        if (!(other instanceof Checksum)) {
            return false;
        }
        String str = this.value;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        m.d(lowerCase, "toLowerCase(...)");
        Checksum checksum = (Checksum) other;
        String lowerCase2 = checksum.value.toLowerCase(locale);
        m.d(lowerCase2, "toLowerCase(...)");
        return lowerCase.equals(lowerCase2) && this.algorithm == checksum.algorithm;
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.algorithm.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Checksum(algorithm=");
        sb.append(this.algorithm);
        sb.append(", value=");
        return g4.c.k(sb, this.value, ')');
    }
}
