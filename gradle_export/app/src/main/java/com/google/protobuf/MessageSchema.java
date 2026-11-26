package com.google.protobuf;

import a1.b;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.k;
import g4.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t4, T t10, int i10) {
        return isFieldPresent(t4, i10) == isFieldPresent(t10, i10);
    }

    private static <T> boolean booleanAt(T t4, long j9) {
        return UnsafeUtil.getBoolean(t4, j9);
    }

    private static void checkMutable(Object obj) {
        if (!isMutable(obj)) {
            throw new IllegalArgumentException(c.h(obj, "Mutating immutable message: "));
        }
    }

    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
        int i12 = registers.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint32 + i12;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i13) {
            int iDecodeVarint33 = iDecodeVarint32 + 1;
            int i14 = bArr[iDecodeVarint32];
            if (i14 < 0) {
                iDecodeVarint33 = ArrayDecoders.decodeVarint32(i14, bArr, iDecodeVarint33, registers);
                i14 = registers.int1;
            }
            int i15 = iDecodeVarint33;
            int i16 = i14 >>> 3;
            int i17 = i14 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i14, bArr, i15, i11, registers);
                }
            } else if (i17 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i15, i11, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i14, bArr, i15, i11, registers);
            }
        }
        if (iDecodeVarint32 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i10, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i10, i11, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i10, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t4, long j9) {
        return UnsafeUtil.getDouble(t4, j9);
    }

    private boolean equals(T t4, T t10, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t4, t10, i10) && Double.doubleToLongBits(UnsafeUtil.getDouble(t4, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t10, jOffset));
            case 1:
                return arePresentForEquals(t4, t10, i10) && Float.floatToIntBits(UnsafeUtil.getFloat(t4, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t10, jOffset));
            case 2:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getLong(t4, jOffset) == UnsafeUtil.getLong(t10, jOffset);
            case 3:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getLong(t4, jOffset) == UnsafeUtil.getLong(t10, jOffset);
            case 4:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 5:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getLong(t4, jOffset) == UnsafeUtil.getLong(t10, jOffset);
            case 6:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 7:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getBoolean(t4, jOffset) == UnsafeUtil.getBoolean(t10, jOffset);
            case 8:
                return arePresentForEquals(t4, t10, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case 9:
                return arePresentForEquals(t4, t10, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case 10:
                return arePresentForEquals(t4, t10, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case 11:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 12:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 13:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 14:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getLong(t4, jOffset) == UnsafeUtil.getLong(t10, jOffset);
            case 15:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getInt(t4, jOffset) == UnsafeUtil.getInt(t10, jOffset);
            case 16:
                return arePresentForEquals(t4, t10, i10) && UnsafeUtil.getLong(t4, jOffset) == UnsafeUtil.getLong(t10, jOffset);
            case 17:
                return arePresentForEquals(t4, t10, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case TYPE_SINT64_VALUE:
            case k.REMOTE_EXCEPTION:
            case 20:
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case k.RECONNECTION_TIMED_OUT:
            case 23:
            case 24:
            case 25:
            case RuntimeVersion.MINOR:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            case ONEOF_TYPE_OFFSET:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t4, t10, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t4, jOffset), UnsafeUtil.getObject(t10, jOffset));
            default:
                return true;
        }
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i10)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) ? ub2 : (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i11, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        return ub2;
    }

    private static <T> float floatAt(T t4, long j9) {
        return UnsafeUtil.getFloat(t4, j9);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[b.e(i10, 3, 2, 1)];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t4) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t4));
    }

    private static <T> int intAt(T t4, long j9) {
        return UnsafeUtil.getInt(t4, j9);
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t4, int i10) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j9 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j9 != 1048575) {
            return ((1 << (iPresenceMaskAndOffsetAt >>> 20)) & UnsafeUtil.getInt(t4, j9)) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t4, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t4, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t4, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t4, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t4, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t4, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t4, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                }
                break;
            case 9:
                return UnsafeUtil.getObject(t4, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t4, jOffset));
                break;
            case 11:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t4, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t4, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t4, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t4, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private boolean isFieldPresent(T t4, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(t4, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean isInitialized(Object obj, int i10, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i10)));
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & LEGACY_ENUM_IS_CLOSED_MASK) != 0;
    }

    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isMapInitialized(T t4, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t4, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t4, T t10, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        return UnsafeUtil.getInt(t4, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t10, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t4, int i10, int i11) {
        return UnsafeUtil.getInt(t4, (long) (presenceMaskAndOffsetAt(i11) & 1048575)) == i10;
    }

    private static boolean isRequired(int i10) {
        return (i10 & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t4, long j9) {
        return UnsafeUtil.getLong(t4, j9);
    }

    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r17, com.google.protobuf.ExtensionSchema<ET> r18, T r19, com.google.protobuf.Reader r20, com.google.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(T t4, T t10, int i10) {
        if (isFieldPresent(t10, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t4, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t4, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t4, jOffset, object);
                }
                setFieldPresent(t4, i10);
                return;
            }
            Object object2 = unsafe.getObject(t4, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t4, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeOneofMessage(T t4, T t10, int i10) {
        int iNumberAt = numberAt(i10);
        if (isOneofPresent(t10, iNumberAt, i10)) {
            long jOffset = offset(typeAndOffsetAt(i10));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t10, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t10);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t4, iNumberAt, i10)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t4, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t4, jOffset, object);
                }
                setOneofPresent(t4, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t4, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t4, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t4, T t10, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putDouble(t4, jOffset, UnsafeUtil.getDouble(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 1:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putFloat(t4, jOffset, UnsafeUtil.getFloat(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 2:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t4, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 3:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t4, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 4:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 5:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t4, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 6:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 7:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putBoolean(t4, jOffset, UnsafeUtil.getBoolean(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 8:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putObject(t4, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 9:
                mergeMessage(t4, t10, i10);
                break;
            case 10:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putObject(t4, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 11:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 12:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 13:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 14:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t4, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 15:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putInt(t4, jOffset, UnsafeUtil.getInt(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 16:
                if (isFieldPresent(t10, i10)) {
                    UnsafeUtil.putLong(t4, jOffset, UnsafeUtil.getLong(t10, jOffset));
                    setFieldPresent(t4, i10);
                }
                break;
            case 17:
                mergeMessage(t4, t10, i10);
                break;
            case TYPE_SINT64_VALUE:
            case k.REMOTE_EXCEPTION:
            case 20:
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case k.RECONNECTION_TIMED_OUT:
            case 23:
            case 24:
            case 25:
            case RuntimeVersion.MINOR:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t4, t10, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t4, t10, jOffset);
                break;
            case ONEOF_TYPE_OFFSET:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t10, iNumberAt, i10)) {
                    UnsafeUtil.putObject(t4, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t4, iNumberAt, i10);
                }
                break;
            case 60:
                mergeOneofMessage(t4, t10, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t10, iNumberAt, i10)) {
                    UnsafeUtil.putObject(t4, jOffset, UnsafeUtil.getObject(t10, jOffset));
                    setOneofPresent(t4, iNumberAt, i10);
                }
                break;
            case 68:
                mergeOneofMessage(t4, t10, i10);
                break;
        }
    }

    private Object mutableMessageFieldForMerge(T t4, int i10) {
        Schema messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t4, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t4, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    private Object mutableOneofMessageFieldForMerge(T t4, int i10, int i11) {
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t4, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t4, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i10++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr2 = i10 > 0 ? new int[i10] : null;
        int[] iArr3 = i11 > 0 ? new int[i11] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            FieldInfo fieldInfo2 = fields[i12];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i15] = i13;
                i15++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i16] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        char c10;
        int iObjectFieldOffset2;
        int i30;
        int i31;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i32;
        java.lang.reflect.Field fieldReflectField2;
        java.lang.reflect.Field fieldReflectField3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c11 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (stringInfo.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt2 = stringInfo.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i39 = iCharAt2 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = stringInfo.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt2 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = EMPTY_INT_ARRAY;
            i14 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt3 = stringInfo.charAt(i38);
            if (iCharAt3 >= 55296) {
                int i42 = iCharAt3 & 8191;
                int i43 = 13;
                while (true) {
                    i24 = i41 + 1;
                    cCharAt8 = stringInfo.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i24;
                }
                iCharAt3 = i42 | (cCharAt8 << i43);
                i41 = i24;
            }
            int i44 = i41 + 1;
            int iCharAt4 = stringInfo.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    cCharAt7 = stringInfo.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                iCharAt4 = i45 | (cCharAt7 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int iCharAt5 = stringInfo.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt6 = stringInfo.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt6 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = stringInfo.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt5 = stringInfo.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt5 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            iCharAt = stringInfo.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt4 = stringInfo.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            int iCharAt7 = stringInfo.charAt(i53);
            if (iCharAt7 >= 55296) {
                int i57 = iCharAt7 & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt3 = stringInfo.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt7 = i57 | (cCharAt3 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            int iCharAt8 = stringInfo.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt2 = stringInfo.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int iCharAt9 = stringInfo.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt = stringInfo.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i65 = iCharAt7;
            i12 = iCharAt5;
            i13 = i65;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i38 = i62;
            i16 = iCharAt6;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i66 = i15 + i13;
        int i67 = i66;
        int i68 = i15;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = stringInfo.charAt(i38);
            if (iCharAt10 >= c11) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = stringInfo.charAt(i73);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i25 = i35;
            } else {
                i25 = i71;
            }
            int i75 = i25 + 1;
            int iCharAt11 = stringInfo.charAt(i25);
            if (iCharAt11 >= c11) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = stringInfo.charAt(i77);
                    i26 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i26;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i27 = i34;
            } else {
                i26 = length;
                i27 = i75;
            }
            int i79 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & CHECK_INITIALIZED_BIT) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            int i80 = iCharAt10;
            if (i79 >= ONEOF_TYPE_OFFSET) {
                int i81 = i27 + 1;
                int iCharAt12 = stringInfo.charAt(i27);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = stringInfo.charAt(i81);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c12 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i79 - 51;
                int i85 = iCharAt12;
                if (i84 == 9 || i84 == 17) {
                    objArr[b.e(i69, 3, 2, 1)] = objects[i11];
                    i11++;
                } else if (i84 == 12 && (rawMessageInfo.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0)) {
                    objArr[b.e(i69, 3, 2, 1)] = objects[i11];
                    i11++;
                }
                int i86 = i85 * 2;
                Object obj = objects[i86];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i86] = fieldReflectField2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                int i87 = i86 + 1;
                Object obj2 = objects[i87];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i87] = fieldReflectField3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i66 = i66;
                i38 = i81;
                iObjectFieldOffset = iObjectFieldOffset3;
                c10 = 2;
                stringInfo = stringInfo;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i28 = i14;
                i29 = i11;
                i31 = 0;
            } else {
                int i88 = i11 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i79 == 9 || i79 == 17) {
                    i28 = i14;
                    objArr[b.e(i69, 3, 2, 1)] = fieldReflectField4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i28 = i14;
                        i32 = i11 + 2;
                        objArr[b.e(i69, 3, 2, 1)] = objects[i88];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i28 = i14;
                        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                            i32 = i11 + 2;
                            objArr[b.e(i69, 3, 2, 1)] = objects[i88];
                        }
                    } else {
                        if (i79 == 50) {
                            int i89 = i68 + 1;
                            iArr[i68] = i69;
                            int i90 = (i69 / 3) * 2;
                            int i91 = i11 + 2;
                            objArr[i90] = objects[i88];
                            if ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0) {
                                objArr[i90 + 1] = objects[i91];
                                i28 = i14;
                                i66 = i66;
                                i68 = i89;
                                i29 = i11 + 3;
                            } else {
                                i28 = i14;
                                i29 = i91;
                                i66 = i66;
                                i68 = i89;
                            }
                        } else {
                            i28 = i14;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                        if ((iCharAt11 & 4096) != 0 || i79 > 17) {
                            c10 = 2;
                            iObjectFieldOffset2 = 1048575;
                            i30 = i27;
                            i31 = 0;
                        } else {
                            int i92 = i27 + 1;
                            int iCharAt13 = stringInfo.charAt(i27);
                            if (iCharAt13 >= 55296) {
                                int i93 = iCharAt13 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i30 = i92 + 1;
                                    cCharAt9 = stringInfo.charAt(i92);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i93 |= (cCharAt9 & 8191) << i94;
                                    i94 += 13;
                                    i92 = i30;
                                }
                                iCharAt13 = i93 | (cCharAt9 << i94);
                            } else {
                                i30 = i92;
                            }
                            c10 = 2;
                            int i95 = (iCharAt13 / 32) + (i28 * 2);
                            Object obj3 = objects[i95];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldReflectField = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldReflectField = reflectField(cls, (String) obj3);
                                objects[i95] = fieldReflectField;
                            }
                            int i96 = iCharAt13;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                            i31 = i96 % 32;
                        }
                        if (i79 >= 18 && i79 <= 49) {
                            iArr[i67] = iObjectFieldOffset;
                            i67++;
                        }
                        i38 = i30;
                    }
                    i29 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    if ((iCharAt11 & 4096) != 0) {
                        c10 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i30 = i27;
                        i31 = 0;
                    } else {
                        c10 = 2;
                        iObjectFieldOffset2 = 1048575;
                        i30 = i27;
                        i31 = 0;
                    }
                    if (i79 >= 18) {
                        iArr[i67] = iObjectFieldOffset;
                        i67++;
                    }
                    i38 = i30;
                }
                i29 = i88;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    c10 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i30 = i27;
                    i31 = 0;
                } else {
                    c10 = 2;
                    iObjectFieldOffset2 = 1048575;
                    i30 = i27;
                    i31 = 0;
                }
                if (i79 >= 18) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
                i38 = i30;
            }
            int i97 = i69 + 1;
            iArr4[i69] = i80;
            int i98 = i69 + 2;
            int i99 = iObjectFieldOffset2;
            iArr4[i97] = ((iCharAt11 & REQUIRED_BIT) != 0 ? REQUIRED_MASK : 0) | ((iCharAt11 & UTF8_CHECK_BIT) != 0 ? ENFORCE_UTF8_MASK : 0) | ((iCharAt11 & LEGACY_ENUM_IS_CLOSED_BIT) != 0 ? LEGACY_ENUM_IS_CLOSED_MASK : 0) | (i79 << 20) | iObjectFieldOffset;
            i69 += 3;
            iArr4[i98] = (i31 << 20) | i99;
            i11 = i29;
            stringInfo = stringInfo;
            i66 = i66;
            iArr3 = iArr4;
            i14 = i28;
            length = i26;
            c11 = 55296;
        }
        return new MessageSchema<>(iArr3, objArr, i12, i16, rawMessageInfo.getDefaultInstance(), rawMessageInfo.getSyntax(), false, iArr, i15, i66, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t4, long j9) {
        return ((Boolean) UnsafeUtil.getObject(t4, j9)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t4, long j9) {
        return ((Double) UnsafeUtil.getObject(t4, j9)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t4, long j9) {
        return ((Float) UnsafeUtil.getObject(t4, j9)).floatValue();
    }

    private static <T> int oneofIntAt(T t4, long j9) {
        return ((Integer) UnsafeUtil.getObject(t4, j9)).intValue();
    }

    private static <T> long oneofLongAt(T t4, long j9) {
        return ((Long) UnsafeUtil.getObject(t4, j9)).longValue();
    }

    private <K, V> int parseMapField(T t4, byte[] bArr, int i10, int i11, int i12, long j9, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t4, j9);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t4, j9, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t4, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j9, int i17, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j10 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case ONEOF_TYPE_OFFSET:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t4, j9, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t4, j10, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t4, j9, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t4, j10, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t4, j9, Long.valueOf(registers.long1));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t4, j9, Integer.valueOf(registers.int1));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t4, j9, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t4, j10, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t4, j9, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t4, j10, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t4, j9, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint65;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i22 = registers.int1;
                if (i22 == 0) {
                    unsafe.putObject(t4, j9, RuntimeVersion.SUFFIX);
                } else {
                    if ((i15 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t4, j9, new String(bArr, iDecodeVarint33, i22, Internal.UTF_8));
                    iDecodeVarint33 += i22;
                }
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint33;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t4, i13, i17);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, registers);
                storeOneofMessageField(t4, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i10, registers);
                unsafe.putObject(t4, j9, registers.object1);
                unsafe.putInt(t4, j10, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i23 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i23)) {
                    getMutableUnknownFields(t4).storeField(i12, Long.valueOf(i23));
                    return iDecodeVarint34;
                }
                unsafe.putObject(t4, j9, Integer.valueOf(i23));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint34;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t4, j9, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint35;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t4, j9, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t4, j10, i13);
                return iDecodeVarint66;
            case 68:
                if (i14 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t4, i13, i17);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, registers);
                    storeOneofMessageField(t4, i13, i17, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i10;
    }

    private int parseRepeatedField(T t4, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j9, int i16, long j10, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t4, j10);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t4, j10, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i16) {
            case TYPE_SINT64_VALUE:
            case 35:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeDoubleList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case k.REMOTE_EXCEPTION:
            case 36:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFloatList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 20:
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
            case 37:
            case 38:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case k.RECONNECTION_TIMED_OUT:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 23:
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
            case 40:
            case 46:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 1) {
                    return ArrayDecoders.decodeFixed64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 5) {
                    return ArrayDecoders.decodeFixed32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeBoolList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case RuntimeVersion.MINOR:
                if (i14 == 2) {
                    return (j9 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i12, bArr, i10, i11, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return ArrayDecoders.decodeBytesList(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufList, registers);
                    }
                    return i10;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t4, i13, (List<Integer>) protobufList, getEnumFieldVerifier(i15), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt32List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i10, protobufList, registers);
                }
                if (i14 == 0) {
                    return ArrayDecoders.decodeSInt64List(i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufList, registers);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j9, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j9), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i10), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = c.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    private void setFieldPresent(T t4, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j9 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j9 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t4, j9, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t4, j9));
    }

    private void setOneofPresent(T t4, int i10, int i11) {
        UnsafeUtil.putInt(t4, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i10, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i11;
        Class<?> messageFieldClass;
        int i12;
        OneofInfo oneof = fieldInfo.getOneof();
        if (oneof == null) {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                iObjectFieldOffset2 = presenceField == null ? 1048575 : (int) UnsafeUtil.objectFieldOffset(presenceField);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i10] = fieldInfo.getFieldNumber();
            int i13 = i10 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i11 = ENFORCE_UTF8_MASK;
            } else {
                i11 = 0;
            }
            iArr[i13] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
            iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                if (messageFieldClass != null) {
                    objArr[b.e(i10, 3, 2, 1)] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[b.e(i10, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            i12 = (i10 / 3) * 2;
            objArr[i12] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i12 + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[i12 + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iId = fieldInfo.getType().id() + ONEOF_TYPE_OFFSET;
        iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
        jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = fieldInfo.getFieldNumber();
        int i14 = i10 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i11 = ENFORCE_UTF8_MASK;
        } else {
            i11 = 0;
        }
        iArr[i14] = (fieldInfo.isRequired() ? REQUIRED_MASK : 0) | i11 | (iId << 20) | iObjectFieldOffset;
        iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            if (messageFieldClass != null) {
                objArr[b.e(i10, 3, 2, 1)] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[b.e(i10, 3, 2, 1)] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        i12 = (i10 / 3) * 2;
        objArr[i12] = fieldInfo.getMapDefaultEntry();
        if (messageFieldClass != null) {
            objArr[i12 + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[i12 + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private void storeMessageField(T t4, int i10, Object obj) {
        UNSAFE.putObject(t4, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t4, i10);
    }

    private void storeOneofMessageField(T t4, int i10, int i11, Object obj) {
        UNSAFE.putObject(t4, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t4, i10, i11);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    private void writeFieldsInAscendingOrder(T t4, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        boolean z11;
        MessageSchema<T> messageSchema = this;
        if (messageSchema.hasExtensions) {
            FieldSet<T> extensions = messageSchema.extensionSchema.getExtensions(t4);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = messageSchema.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i14);
            int iNumberAt = messageSchema.numberAt(i14);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i16 = messageSchema.buffer[i14 + 2];
                z10 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(t4, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z10 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && messageSchema.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                messageSchema.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeDouble(iNumberAt, doubleAt(t4, jOffset));
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeFloat(iNumberAt, floatAt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeBool(iNumberAt, booleanAt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t4, jOffset), writer);
                    }
                    break;
                case 9:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t4, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t4, jOffset));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    if (messageSchema.isFieldPresent(t4, i14, i10, i11, i12)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t4, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case k.REMOTE_EXCEPTION:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case k.RECONNECTION_TIMED_OUT:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case RuntimeVersion.MINOR:
                    SchemaUtil.writeStringList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, messageSchema.getMessageFieldSchema(i14));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer);
                    break;
                case 29:
                    z11 = false;
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 30:
                    z11 = false;
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 31:
                    z11 = false;
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    z11 = false;
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 33:
                    z11 = false;
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 34:
                    z11 = false;
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, z10);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(messageSchema.numberAt(i14), (List) unsafe.getObject(t4, jOffset), writer, messageSchema.getMessageFieldSchema(i14));
                    break;
                case 50:
                    messageSchema.writeMapHelper(writer, iNumberAt, unsafe.getObject(t4, jOffset), i14);
                    break;
                case ONEOF_TYPE_OFFSET:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t4, jOffset));
                    }
                    break;
                case 52:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t4, jOffset));
                    }
                    break;
                case 53:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t4, jOffset));
                    }
                    break;
                case 54:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t4, jOffset));
                    }
                    break;
                case 55:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 56:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t4, jOffset));
                    }
                    break;
                case 57:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 58:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t4, jOffset));
                    }
                    break;
                case 59:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        messageSchema.writeString(iNumberAt, unsafe.getObject(t4, jOffset), writer);
                    }
                    break;
                case 60:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t4, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
                case 61:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t4, jOffset));
                    }
                    break;
                case 62:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 63:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 64:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 65:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t4, jOffset));
                    }
                    break;
                case 66:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t4, jOffset));
                    }
                    break;
                case 67:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t4, jOffset));
                    }
                    break;
                case 68:
                    if (messageSchema.isOneofPresent(t4, iNumberAt, i14)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t4, jOffset), messageSchema.getMessageFieldSchema(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry;
        }
        while (entry != null) {
            messageSchema.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        messageSchema.writeUnknownInMessageTo(messageSchema.unknownFieldSchema, t4, writer);
    }

    private void writeFieldsInDescendingOrder(T t4, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t4, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t4);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t4, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t4, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t4, length)) {
                        writer.writeInt64(iNumberAt, longAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t4, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t4, length)) {
                        writer.writeInt32(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t4, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t4, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t4, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t4, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t4, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t4, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t4, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t4, length)) {
                        writer.writeEnum(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t4, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t4, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t4, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t4, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t4, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case k.REMOTE_EXCEPTION:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case k.RECONNECTION_TIMED_OUT:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case RuntimeVersion.MINOR:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), length);
                    break;
                case ONEOF_TYPE_OFFSET:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t4, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t4, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t4, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t4, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t4), writer);
    }

    @Override
    public boolean equals(T t4, T t10) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t4, t10, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t4).equals(this.unknownFieldSchema.getFromMessage(t10))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t4).equals(this.extensionSchema.getExtensions(t10));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    @Override
    public int getSerializedSize(T t4) {
        int i10;
        int iComputeDoubleSize;
        int iComputeFloatSize;
        int iComputeInt64Size;
        int iComputeSizeMessage;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        MessageSchema<T> messageSchema = this;
        T t10 = t4;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int iComputeBytesSize = 0;
        int i14 = 1048575;
        while (i12 < messageSchema.buffer.length) {
            int iTypeAndOffsetAt = messageSchema.typeAndOffsetAt(i12);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = messageSchema.numberAt(i12);
            int i15 = messageSchema.buffer[i12 + 2];
            int i16 = i15 & i11;
            if (iType <= 17) {
                if (i16 != i14) {
                    i13 = i16 == i11 ? 0 : unsafe.getInt(t10, i16);
                    i14 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            int i17 = iComputeBytesSize;
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                i16 = 0;
            }
            switch (iType) {
                case 0:
                    if (!messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 1:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 2:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 3:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 4:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 5:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 6:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 7:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 8:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object)) + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 9:
                    if (!messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = i17 + iComputeSizeMessage;
                    }
                    break;
                case 10:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 11:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 12:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 13:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 14:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeFloatSize + i17;
                        messageSchema = this;
                        t10 = t4;
                    }
                    messageSchema = this;
                    t10 = t4;
                    iComputeBytesSize = i17;
                    break;
                case 15:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 16:
                    if (messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeInt64Size = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeBytesSize = iComputeInt64Size + i17;
                        messageSchema = this;
                    }
                    messageSchema = this;
                    iComputeBytesSize = i17;
                    break;
                case 17:
                    if (!messageSchema.isFieldPresent(t10, i12, i14, i13, i10)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case TYPE_SINT64_VALUE:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case k.REMOTE_EXCEPTION:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 20:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case k.RECONNECTION_TIMED_OUT:
                    iComputeSizeMessage = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 23:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 24:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 25:
                    iComputeSizeMessage = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case RuntimeVersion.MINOR:
                    iComputeSizeMessage = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 27:
                    iComputeSizeMessage = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 28:
                    iComputeSizeMessage = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 29:
                    iComputeSizeMessage = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 30:
                    iComputeSizeMessage = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 31:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    iComputeSizeMessage = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 33:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 34:
                    iComputeSizeMessage = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag <= 0) {
                        iComputeBytesSize = i17;
                    } else {
                        if (messageSchema.useCachedSizeField) {
                            unsafe.putInt(t10, i16, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeBytesSize = iComputeUInt32SizeNoTag + iComputeTagSize + iComputeSizeFixed64ListNoTag + i17;
                    }
                    break;
                case 49:
                    iComputeSizeMessage = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case 50:
                    iComputeSizeMessage = messageSchema.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMapFieldDefaultEntry(i12));
                    iComputeBytesSize = i17 + iComputeSizeMessage;
                    break;
                case ONEOF_TYPE_OFFSET:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 52:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 53:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 54:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 55:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 56:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 57:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 58:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 59:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeBytesSize = (object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2)) + i17;
                    }
                    break;
                case 60:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeSizeMessage = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = i17 + iComputeSizeMessage;
                    }
                    break;
                case 61:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 62:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 63:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 64:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 65:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 66:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 67:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                case 68:
                    if (!messageSchema.isOneofPresent(t10, iNumberAt, i12)) {
                        iComputeBytesSize = i17;
                    } else {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), messageSchema.getMessageFieldSchema(i12));
                        iComputeBytesSize = iComputeDoubleSize + i17;
                    }
                    break;
                default:
                    iComputeBytesSize = i17;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeBytesSize + messageSchema.getUnknownFieldsSerializedSize(messageSchema.unknownFieldSchema, t10);
        return messageSchema.hasExtensions ? unknownFieldsSerializedSize + messageSchema.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override
    public int hashCode(T t4) {
        int i10;
        int iHashLong;
        int i11;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iNumberAt = numberAt(i13);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t4, jOffset)));
                    i12 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t4, jOffset)).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t4, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 12:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 13:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t4, jOffset);
                    i12 = i11 + iOneofIntAt;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t4, jOffset));
                    i12 = iHashLong + i10;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t4, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case TYPE_SINT64_VALUE:
                case k.REMOTE_EXCEPTION:
                case 20:
                case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                case k.RECONNECTION_TIMED_OUT:
                case 23:
                case 24:
                case 25:
                case RuntimeVersion.MINOR:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                    i12 = iHashLong + i10;
                    break;
                case ONEOF_TYPE_OFFSET:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t4, jOffset)));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t4, jOffset)).hashCode();
                        i12 = iHashLong + i10;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                        i12 = iHashLong + i10;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                        i12 = iHashLong + i10;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i11 = i12 * 53;
                        iOneofIntAt = oneofIntAt(t4, jOffset);
                        i12 = i11 + iOneofIntAt;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t4, jOffset));
                        i12 = iHashLong + i10;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t4, iNumberAt, i13)) {
                        i10 = i12 * 53;
                        iHashLong = UnsafeUtil.getObject(t4, jOffset).hashCode();
                        i12 = iHashLong + i10;
                    }
                    break;
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t4).hashCode() + (i12 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t4).hashCode() : iHashCode2;
    }

    @Override
    public final boolean isInitialized(T t4) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.checkInitializedCount) {
            int i15 = this.intArray[i13];
            int iNumberAt = this.numberAt(i15);
            int iTypeAndOffsetAt = this.typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = UNSAFE.getInt(t4, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            MessageSchema<T> messageSchema = this;
            T t10 = t4;
            if (isRequired(iTypeAndOffsetAt) && !messageSchema.isFieldPresent(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (messageSchema.isFieldPresent(t10, i15, i10, i11, i18) && !isInitialized(t10, iTypeAndOffsetAt, messageSchema.getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!messageSchema.isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (messageSchema.isOneofPresent(t10, iNumberAt, i15) && !isInitialized(t10, iTypeAndOffsetAt, messageSchema.getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !messageSchema.isMapInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (!messageSchema.isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                return false;
            }
            i13++;
            this = messageSchema;
            t4 = t10;
            i12 = i10;
            i14 = i11;
        }
        MessageSchema<T> messageSchema2 = this;
        return !messageSchema2.hasExtensions || messageSchema2.extensionSchema.getExtensions(t4).isInitialized();
    }

    @Override
    public void makeImmutable(T t4) {
        if (isMutable(t4)) {
            if (t4 instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t4;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int length = this.buffer.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iTypeAndOffsetAt = typeAndOffsetAt(i10);
                long jOffset = offset(iTypeAndOffsetAt);
                int iType = type(iTypeAndOffsetAt);
                if (iType != 9) {
                    if (iType != 60 && iType != 68) {
                        switch (iType) {
                            case 17:
                                if (isFieldPresent(t4, i10)) {
                                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t4, jOffset));
                                }
                                break;
                            case TYPE_SINT64_VALUE:
                            case k.REMOTE_EXCEPTION:
                            case 20:
                            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            case k.RECONNECTION_TIMED_OUT:
                            case 23:
                            case 24:
                            case 25:
                            case RuntimeVersion.MINOR:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.listFieldSchema.makeImmutableListAt(t4, jOffset);
                                break;
                            case 50:
                                Unsafe unsafe = UNSAFE;
                                Object object = unsafe.getObject(t4, jOffset);
                                if (object != null) {
                                    unsafe.putObject(t4, jOffset, this.mapFieldSchema.toImmutable(object));
                                }
                                break;
                        }
                    } else if (isOneofPresent(t4, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t4, jOffset));
                    }
                } else if (isFieldPresent(t4, i10)) {
                    getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t4, jOffset));
                }
            }
            this.unknownFieldSchema.makeImmutable(t4);
            if (this.hasExtensions) {
                this.extensionSchema.makeImmutable(t4);
            }
        }
    }

    @Override
    public void mergeFrom(T t4, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t4);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t4, reader, extensionRegistryLite);
    }

    @Override
    public void mergeFrom(T t4, T t10) {
        checkMutable(t4);
        t10.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t4, t10, i10);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t4, t10);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t4, t10);
        }
    }

    @Override
    public void mergeFrom(T t4, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t4, bArr, i10, i11, 0, registers);
    }

    @Override
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override
    public void writeTo(T t4, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t4, writer);
        } else {
            writeFieldsInAscendingOrder(t4, writer);
        }
    }
}
