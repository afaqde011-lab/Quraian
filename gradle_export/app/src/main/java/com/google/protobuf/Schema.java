package com.google.protobuf;

import java.io.IOException;

@CheckReturnValue
interface Schema<T> {
    boolean equals(T t4, T t10);

    int getSerializedSize(T t4);

    int hashCode(T t4);

    boolean isInitialized(T t4);

    void makeImmutable(T t4);

    void mergeFrom(T t4, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t4, T t10);

    void mergeFrom(T t4, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException;

    T newInstance();

    void writeTo(T t4, Writer writer) throws IOException;
}
