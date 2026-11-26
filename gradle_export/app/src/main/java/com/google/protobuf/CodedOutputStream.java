package com.google.protobuf;

import a1.b;
import com.google.android.gms.cast.Cast;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public AbstractBufferedEncoder(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b7) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr[i10] = b7;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i10) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = i11 + 1;
            this.position = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.position = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.position = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.position = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j9) {
            byte[] bArr = this.buffer;
            int i10 = this.position;
            int i11 = i10 + 1;
            this.position = i11;
            bArr[i10] = (byte) (j9 & 255);
            int i12 = i10 + 2;
            this.position = i12;
            bArr[i11] = (byte) ((j9 >> 8) & 255);
            int i13 = i10 + 3;
            this.position = i13;
            bArr[i12] = (byte) ((j9 >> 16) & 255);
            int i14 = i10 + 4;
            this.position = i14;
            bArr[i13] = (byte) (255 & (j9 >> 24));
            int i15 = i10 + 5;
            this.position = i15;
            bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
            int i16 = i10 + 6;
            this.position = i16;
            bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
            int i17 = i10 + 7;
            this.position = i17;
            bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
            this.position = i10 + 8;
            bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i10) {
            if (i10 >= 0) {
                bufferUInt32NoTag(i10);
            } else {
                bufferUInt64NoTag(i10);
            }
        }

        public final void bufferTag(int i10, int i11) {
            bufferUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        public final void bufferUInt32NoTag(int i10) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255);
                    this.totalBytesWritten++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.totalBytesWritten++;
                return;
            }
            long j9 = this.position;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.putByte(bArr3, i13, (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            UnsafeUtil.putByte(bArr4, i14, (byte) i10);
            this.totalBytesWritten += (int) (((long) this.position) - j9);
        }

        public final void bufferUInt64NoTag(long j9) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr[i10] = (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255);
                    this.totalBytesWritten++;
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                bArr2[i11] = (byte) j9;
                this.totalBytesWritten++;
                return;
            }
            long j10 = this.position;
            while ((j9 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                UnsafeUtil.putByte(bArr3, i12, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                j9 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            UnsafeUtil.putByte(bArr4, i13, (byte) j9);
            this.totalBytesWritten += (int) (((long) this.position) - j10);
        }

        @Override
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.buffer = bArr;
            this.offset = i10;
            this.position = i10;
            this.limit = i12;
        }

        @Override
        public void flush() {
        }

        @Override
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override
        public final void write(byte b7) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                this.position = i10 + 1;
                bArr[i10] = b7;
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e3);
            }
        }

        @Override
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e3);
            }
        }

        @Override
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.buffer, this.position, i11);
                this.position += i11;
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i11)), e3);
            }
        }

        @Override
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override
        public final void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override
        public final void writeFixed32NoTag(int i10) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.position = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.position = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.position = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e3);
            }
        }

        @Override
        public final void writeFixed64(int i10, long j9) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j9);
        }

        @Override
        public final void writeFixed64NoTag(long j9) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i10 = this.position;
                int i11 = i10 + 1;
                this.position = i11;
                bArr[i10] = (byte) (((int) j9) & 255);
                int i12 = i10 + 2;
                this.position = i12;
                bArr[i11] = (byte) (((int) (j9 >> 8)) & 255);
                int i13 = i10 + 3;
                this.position = i13;
                bArr[i12] = (byte) (((int) (j9 >> 16)) & 255);
                int i14 = i10 + 4;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j9 >> 24)) & 255);
                int i15 = i10 + 5;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j9 >> 32)) & 255);
                int i16 = i10 + 6;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j9 >> 40)) & 255);
                int i17 = i10 + 7;
                this.position = i17;
                bArr[i16] = (byte) (((int) (j9 >> 48)) & 255);
                this.position = i10 + 8;
                bArr[i17] = (byte) (((int) (j9 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e3);
            }
        }

        @Override
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override
        public final void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override
        public final void writeStringNoTag(String str) throws IOException {
            int i10 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    return;
                }
                int i11 = i10 + iComputeUInt32SizeNoTag2;
                this.position = i11;
                int iEncode = Utf8.encode(str, this.buffer, i11, spaceLeft());
                this.position = i10;
                writeUInt32NoTag((iEncode - i10) - iComputeUInt32SizeNoTag2);
                this.position = iEncode;
            } catch (Utf8.UnpairedSurrogateException e3) {
                this.position = i10;
                inefficientWriteStringNoTag(str, e3);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override
        public final void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i11 = this.position;
                    this.position = i11 + 1;
                    bArr[i11] = (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e3);
                }
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override
        public final void writeUInt64(int i10, long j9) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j9);
        }

        @Override
        public final void writeUInt64NoTag(long j9) throws IOException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j9 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    UnsafeUtil.putByte(bArr, i10, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    j9 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                UnsafeUtil.putByte(bArr2, i11, (byte) j9);
                return;
            }
            while ((j9 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255);
                    j9 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e3);
                }
            }
            byte[] bArr4 = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            bArr4[i13] = (byte) j9;
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i10) {
            super(i10);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i10) throws IOException {
            if (this.limit - this.position < i10) {
                doFlush();
            }
        }

        @Override
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override
        public void write(byte b7) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b7);
        }

        @Override
        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.out.write(bArr, i10, i11);
            this.totalBytesWritten += i11;
        }

        @Override
        public void writeBool(int i10, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i10, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override
        public void writeFixed32(int i10, int i11) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i10, 5);
            bufferFixed32NoTag(i11);
        }

        @Override
        public void writeFixed32NoTag(int i10) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i10);
        }

        @Override
        public void writeFixed64(int i10, long j9) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i10, 1);
            bufferFixed64NoTag(j9);
        }

        @Override
        public void writeFixed64NoTag(long j9) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j9);
        }

        @Override
        public void writeInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferInt32NoTag(i11);
        }

        @Override
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            flush();
            this.out.writeLazy(bArr, i10, i11);
            this.totalBytesWritten += i11;
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override
        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i10 = iComputeUInt32SizeNoTag + length;
            int i11 = this.limit;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i10 > i11 - this.position) {
                doFlush();
            }
            int i12 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                    return;
                }
                int i13 = i12 + iComputeUInt32SizeNoTag2;
                this.position = i13;
                int iEncode2 = Utf8.encode(str, this.buffer, i13, this.limit - i13);
                this.position = i12;
                int i14 = (iEncode2 - i12) - iComputeUInt32SizeNoTag2;
                bufferUInt32NoTag(i14);
                this.position = iEncode2;
                this.totalBytesWritten += i14;
            } catch (Utf8.UnpairedSurrogateException e3) {
                this.totalBytesWritten -= this.position - i12;
                this.position = i12;
                inefficientWriteStringNoTag(str, e3);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override
        public void writeUInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt32NoTag(i11);
        }

        @Override
        public void writeUInt32NoTag(int i10) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i10);
        }

        @Override
        public void writeUInt64(int i10, long j9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt64NoTag(j9);
        }

        @Override
        public void writeUInt64NoTag(long j9) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j9);
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override
        public void flush() {
            Java8Compatibility.position(this.byteBuffer, this.initialPosition + getTotalBytesWritten());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super(b.o("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(String str, Throwable th2) {
            super(b.o("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }

        public OutOfSpaceException(Throwable th2) {
            super(MESSAGE, th2);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i10) throws IOException {
            if (this.limit - this.position < i10) {
                doFlush();
            }
        }

        @Override
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override
        public void write(byte b7) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b7);
        }

        @Override
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.limit;
            int i11 = this.position;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.buffer, i11, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.buffer, i11, i12);
            int i13 = iRemaining - i12;
            this.position = this.limit;
            this.totalBytesWritten += i12;
            doFlush();
            while (true) {
                int i14 = this.limit;
                if (i13 <= i14) {
                    byteBuffer.get(this.buffer, 0, i13);
                    this.position = i13;
                    this.totalBytesWritten += i13;
                    return;
                } else {
                    byteBuffer.get(this.buffer, 0, i14);
                    this.out.write(this.buffer, 0, this.limit);
                    int i15 = this.limit;
                    i13 -= i15;
                    this.totalBytesWritten += i15;
                }
            }
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.limit;
            int i13 = this.position;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.buffer, i13, i11);
                this.position += i11;
                this.totalBytesWritten += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.buffer, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.position = this.limit;
            this.totalBytesWritten += i14;
            doFlush();
            if (i16 <= this.limit) {
                System.arraycopy(bArr, i15, this.buffer, 0, i16);
                this.position = i16;
            } else {
                this.out.write(bArr, i15, i16);
            }
            this.totalBytesWritten += i16;
        }

        @Override
        public void writeBool(int i10, boolean z10) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i10, 0);
            buffer(z10 ? (byte) 1 : (byte) 0);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override
        public void writeFixed32(int i10, int i11) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i10, 5);
            bufferFixed32NoTag(i11);
        }

        @Override
        public void writeFixed32NoTag(int i10) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i10);
        }

        @Override
        public void writeFixed64(int i10, long j9) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i10, 1);
            bufferFixed64NoTag(j9);
        }

        @Override
        public void writeFixed64NoTag(long j9) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j9);
        }

        @Override
        public void writeInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferInt32NoTag(i11);
        }

        @Override
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i10 = iComputeUInt32SizeNoTag + length;
                int i11 = this.limit;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i10 > i11 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i12 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i13 = i12 + iComputeUInt32SizeNoTag2;
                        this.position = i13;
                        int iEncode2 = Utf8.encode(str, this.buffer, i13, this.limit - i13);
                        this.position = i12;
                        iEncodedLength = (iEncode2 - i12) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e3) {
                    this.totalBytesWritten -= this.position - i12;
                    this.position = i12;
                    throw e3;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new OutOfSpaceException(e10);
                }
            } catch (Utf8.UnpairedSurrogateException e11) {
                inefficientWriteStringNoTag(str, e11);
            }
        }

        @Override
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override
        public void writeUInt32(int i10, int i11) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt32NoTag(i11);
        }

        @Override
        public void writeUInt32NoTag(int i10) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i10);
        }

        @Override
        public void writeUInt64(int i10, long j9) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i10, 0);
            bufferUInt64NoTag(j9);
        }

        @Override
        public void writeUInt64NoTag(long j9) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j9);
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws IOException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, this.buffer.position());
        }

        @Override
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override
        public void write(byte b7) throws IOException {
            try {
                this.buffer.put(b7);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.buffer.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            } catch (BufferOverflowException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override
        public void writeFixed32NoTag(int i10) throws IOException {
            try {
                this.buffer.putInt(i10);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void writeFixed64(int i10, long j9) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j9);
        }

        @Override
        public void writeFixed64NoTag(long j9) throws IOException {
            try {
                this.buffer.putLong(j9);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override
        public void writeStringNoTag(String str) throws IOException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                    return;
                }
                int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iPosition2);
                encode(str);
                int iPosition3 = this.buffer.position();
                Java8Compatibility.position(this.buffer, iPosition);
                writeUInt32NoTag(iPosition3 - iPosition2);
                Java8Compatibility.position(this.buffer, iPosition3);
            } catch (Utf8.UnpairedSurrogateException e3) {
                Java8Compatibility.position(this.buffer, iPosition);
                inefficientWriteStringNoTag(str, e3);
            } catch (IllegalArgumentException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override
        public void writeUInt32NoTag(int i10) throws IOException {
            while ((i10 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    i10 >>>= 7;
                } catch (BufferOverflowException e3) {
                    throw new OutOfSpaceException(e3);
                }
            }
            this.buffer.put((byte) i10);
        }

        @Override
        public void writeUInt64(int i10, long j9) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j9);
        }

        @Override
        public void writeUInt64NoTag(long j9) throws IOException {
            while (((-128) & j9) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    j9 >>>= 7;
                } catch (BufferOverflowException e3) {
                    throw new OutOfSpaceException(e3);
                }
            }
            this.buffer.put((byte) j9);
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + ((long) byteBuffer.limit());
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j9) {
            return (int) (j9 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j9) {
            Java8Compatibility.position(this.buffer, bufferPos(j9));
        }

        @Override
        public void flush() {
            Java8Compatibility.position(this.originalBuffer, bufferPos(this.position));
        }

        @Override
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override
        public void write(byte b7) throws IOException {
            long j9 = this.position;
            if (j9 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j9;
            UnsafeUtil.putByte(j9, b7);
        }

        @Override
        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) iRemaining;
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j9 = i11;
                long j10 = this.limit - j9;
                long j11 = this.position;
                if (j10 >= j11) {
                    UnsafeUtil.copyMemory(bArr, i10, j11, j9);
                    this.position += j9;
                    return;
                }
            }
            if (bArr != null) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i11)));
            }
            throw new NullPointerException("value");
        }

        @Override
        public void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override
        public void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            writeByteArrayNoTag(bArr, i11, i12);
        }

        @Override
        public void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override
        public void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override
        public void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override
        public void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override
        public void writeFixed32NoTag(int i10) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i10);
            this.position += 4;
        }

        @Override
        public void writeFixed64(int i10, long j9) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j9);
        }

        @Override
        public void writeFixed64NoTag(long j9) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j9);
            this.position += 8;
        }

        @Override
        public void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override
        public void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override
        public void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override
        public void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            Java8Compatibility.clear(byteBufferDuplicate);
            write(byteBufferDuplicate);
        }

        @Override
        public void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override
        public void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override
        public void writeStringNoTag(String str) throws IOException {
            long j9 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += (long) iEncodedLength;
                    return;
                }
                int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                Java8Compatibility.position(this.buffer, iBufferPos);
                Utf8.encodeUtf8(str, this.buffer);
                int iPosition = this.buffer.position() - iBufferPos;
                writeUInt32NoTag(iPosition);
                this.position += (long) iPosition;
            } catch (Utf8.UnpairedSurrogateException e3) {
                this.position = j9;
                repositionBuffer(j9);
                inefficientWriteStringNoTag(str, e3);
            } catch (IllegalArgumentException e10) {
                throw new OutOfSpaceException(e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override
        public void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i10, i11));
        }

        @Override
        public void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override
        public void writeUInt32NoTag(int i10) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((i10 & (-128)) != 0) {
                    long j9 = this.position;
                    this.position = j9 + 1;
                    UnsafeUtil.putByte(j9, (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    i10 >>>= 7;
                }
                long j10 = this.position;
                this.position = 1 + j10;
                UnsafeUtil.putByte(j10, (byte) i10);
                return;
            }
            while (true) {
                long j11 = this.position;
                if (j11 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.position = 1 + j11;
                    UnsafeUtil.putByte(j11, (byte) i10);
                    return;
                } else {
                    this.position = j11 + 1;
                    UnsafeUtil.putByte(j11, (byte) ((i10 | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    i10 >>>= 7;
                }
            }
        }

        @Override
        public void writeUInt64(int i10, long j9) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j9);
        }

        @Override
        public void writeUInt64NoTag(long j9) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j9 & (-128)) != 0) {
                    long j10 = this.position;
                    this.position = j10 + 1;
                    UnsafeUtil.putByte(j10, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    j9 >>>= 7;
                }
                long j11 = this.position;
                this.position = 1 + j11;
                UnsafeUtil.putByte(j11, (byte) j9);
                return;
            }
            while (true) {
                long j12 = this.position;
                if (j12 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j9 & (-128)) == 0) {
                    this.position = 1 + j12;
                    UnsafeUtil.putByte(j12, (byte) j9);
                    return;
                } else {
                    this.position = j12 + 1;
                    UnsafeUtil.putByte(j12, (byte) ((((int) j9) | Cast.MAX_NAMESPACE_LENGTH) & 255));
                    j9 >>>= 7;
                }
            }
        }
    }

    private CodedOutputStream() {
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i10);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i10, double d3) {
        return computeDoubleSizeNoTag(d3) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d3) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j9) {
        return computeFixed64SizeNoTag(j9) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f3) {
        return computeFloatSizeNoTag(f3) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f3) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite, Schema schema) {
        return computeGroupSizeNoTag(messageLite, schema) + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        return computeUInt64SizeNoTag(i10);
    }

    public static int computeInt64Size(int i10, long j9) {
        return computeInt64SizeNoTag(j9) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j9) {
        return computeUInt64SizeNoTag(j9);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i10);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i10) {
        return computeUInt32SizeNoTag(i10) + i10;
    }

    public static int computeMessageSetExtensionSize(int i10, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i10);
    }

    public static int computeMessageSize(int i10, MessageLite messageLite, Schema schema) {
        return computeMessageSizeNoTag(messageLite, schema) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static int computePreferredBufferSize(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int computeRawMessageSetExtensionSize(int i10, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j9) {
        return computeUInt64SizeNoTag(j9);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j9) {
        return computeSFixed64SizeNoTag(j9) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j9) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j9) {
        return computeSInt64SizeNoTag(j9) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j9) {
        return computeUInt64SizeNoTag(encodeZigZag64(j9));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i10, 0));
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int computeUInt64Size(int i10, long j9) {
        return computeUInt64SizeNoTag(j9) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j9) {
        return (640 - (Long.numberOfLeadingZeros(j9) * 9)) >>> 6;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j9) {
        return (j9 >> 63) ^ (j9 << 1);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i10) {
        if (i10 >= 0) {
            return new ByteOutputEncoder(byteOutput, i10);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new OutputStreamEncoder(outputStream, i10);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return UnsafeDirectNioEncoder.isSupported() ? newUnsafeInstance(byteBuffer) : newSafeInstance(byteBuffer);
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i10, int i11) {
        return new ArrayEncoder(bArr, i10, i11);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new OutOfSpaceException(e3);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override
    public abstract void write(byte b7) throws IOException;

    @Override
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i10, double d3) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d3));
    }

    public final void writeDoubleNoTag(double d3) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d3));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j9) throws IOException;

    public abstract void writeFixed64NoTag(long j9) throws IOException;

    public final void writeFloat(int i10, float f3) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f3));
    }

    public final void writeFloatNoTag(float f3) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f3));
    }

    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite, Schema schema) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) throws IOException {
        schema.writeTo(messageLite, this.wrapper);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j9) throws IOException {
        writeUInt64(i10, j9);
    }

    public final void writeInt64NoTag(long j9) throws IOException {
        writeUInt64NoTag(j9);
    }

    @Override
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i10, MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException;

    public abstract void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b7) throws IOException {
        write(b7);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j9) throws IOException {
        writeFixed64NoTag(j9);
    }

    public abstract void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j9) throws IOException {
        writeUInt64NoTag(j9);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j9) throws IOException {
        writeFixed64(i10, j9);
    }

    public final void writeSFixed64NoTag(long j9) throws IOException {
        writeFixed64NoTag(j9);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j9) throws IOException {
        writeUInt64(i10, encodeZigZag64(j9));
    }

    public final void writeSInt64NoTag(long j9) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j9));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j9) throws IOException;

    public abstract void writeUInt64NoTag(long j9) throws IOException;
}
