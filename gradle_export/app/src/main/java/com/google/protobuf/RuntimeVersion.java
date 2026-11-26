package com.google.protobuf;

import a1.b;
import com.google.android.gms.internal.measurement.x5;
import java.util.logging.Logger;

public final class RuntimeVersion {
    public static final int MAJOR = 4;
    public static final int MINOR = 26;
    public static final int PATCH = 1;
    public static final RuntimeDomain DOMAIN = RuntimeDomain.PUBLIC;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING = versionString(4, 26, 1, SUFFIX);
    private static final Logger logger = Logger.getLogger(RuntimeVersion.class.getName());

    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i10, int i11, int i12, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        validateProtobufGencodeVersionImpl(runtimeDomain, i10, i11, i12, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i10, int i11, int i12, String str, String str2) {
        if (checkDisabled()) {
            return;
        }
        String strVersionString = versionString(i10, i11, i12, str);
        if (i10 < 0 || i11 < 0 || i12 < 0) {
            throw new ProtobufRuntimeVersionException(b.o("Invalid gencode version: ", strVersionString));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
        }
        if (i10 != 4) {
            throw new ProtobufRuntimeVersionException(x5.n(b.s("Detected mismatched Protobuf Gencode/Runtime major versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Same major version is required."));
        }
        if (26 < i11 || (26 == i11 && 1 < i12)) {
            throw new ProtobufRuntimeVersionException(x5.n(b.s("Detected incompatible Protobuf Gencode/Runtime versions when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Runtime version cannot be older than the linked gencode version."));
        }
        if (str.equals(SUFFIX)) {
            return;
        }
        throw new ProtobufRuntimeVersionException(x5.n(b.s("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ", str2, ": gencode ", strVersionString, ", runtime "), VERSION_STRING, ". Version suffixes must be the same."));
    }

    private static String versionString(int i10, int i11, int i12, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), str);
    }
}
