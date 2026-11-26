package y5;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c {

    public final int f16606a;

    public final int f16607b;

    public final long f16608c;

    public final byte[] f16609d;

    public c(int i10, int i11, byte[] bArr) {
        this(-1L, bArr, i10, i11);
    }

    public c(long j9, byte[] bArr, int i10, int i11) {
        this.f16606a = i10;
        this.f16607b = i11;
        this.f16608c = j9;
        this.f16609d = bArr;
    }

    public static c a(long j9, ByteOrder byteOrder) {
        long[] jArr = {j9};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(4, 1, byteBufferWrap.array());
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f16614a);
        byteBufferWrap.putInt((int) eVar2.f16615b);
        return new c(5, 1, byteBufferWrap.array());
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.E[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i10}[0]);
        return new c(3, 1, byteBufferWrap.array());
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f16614a / eVar.f16615b;
    }

    public final int e(ByteOrder byteOrder) {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i10 < jArr.length) {
                sb2.append(jArr[i10]);
                i10++;
                if (i10 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i10 < iArr.length) {
                sb2.append(iArr[i10]);
                i10++;
                if (i10 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i10 < dArr.length) {
                sb2.append(dArr[i10]);
                i10++;
                if (i10 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i10 < eVarArr.length) {
            sb2.append(eVarArr[i10].f16614a);
            sb2.append('/');
            sb2.append(eVarArr[i10].f16615b);
            i10++;
            if (i10 != eVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        String str;
        byte b7;
        ?? r13;
        byte[] bArr = this.f16609d;
        InputStream inputStream2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    bVar.C = byteOrder;
                    int i10 = this.f16606a;
                    int length = 0;
                    int i11 = this.f16607b;
                    switch (i10) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b7 = bArr[0]) < 0 || b7 > 1) {
                                str = new String(bArr, g.N);
                                try {
                                    bVar.close();
                                    return str;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b7 + 48)});
                            try {
                                bVar.close();
                                return str2;
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i11 >= g.F.length) {
                                int i12 = 0;
                                while (true) {
                                    byte[] bArr2 = g.F;
                                    if (i12 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i12] == bArr2[i12]) {
                                        i12++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (length < i11) {
                                byte b10 = bArr[length];
                                if (b10 == 0) {
                                    str = sb2.toString();
                                    bVar.close();
                                    return str;
                                }
                                if (b10 >= 32) {
                                    sb2.append((char) b10);
                                } else {
                                    sb2.append('?');
                                }
                                length++;
                            }
                            str = sb2.toString();
                            bVar.close();
                            return str;
                        case 3:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                bVar.close();
                                return r13;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                return r13;
                            }
                        case 4:
                            r13 = new long[i11];
                            while (length < i11) {
                                r13[length] = ((long) bVar.readInt()) & 4294967295L;
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 5:
                            r13 = new e[i11];
                            while (length < i11) {
                                r13[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 8:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readShort();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 9:
                            r13 = new int[i11];
                            while (length < i11) {
                                r13[length] = bVar.readInt();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 10:
                            r13 = new e[i11];
                            while (length < i11) {
                                r13[length] = new e(bVar.readInt(), bVar.readInt());
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 11:
                            r13 = new double[i11];
                            while (length < i11) {
                                r13[length] = bVar.readFloat();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        case 12:
                            r13 = new double[i11];
                            while (length < i11) {
                                r13[length] = bVar.readDouble();
                                length++;
                            }
                            bVar.close();
                            return r13;
                        default:
                            try {
                                bVar.close();
                                return null;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                return null;
                            }
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (bVar != null) {
                        try {
                            bVar.close();
                        } catch (IOException e14) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                    }
                }
                throw th;
            }
        } catch (IOException e16) {
            e = e16;
            bVar = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.D[this.f16606a]);
        sb2.append(", data length:");
        return g4.c.g(this.f16609d.length, ")", sb2);
    }
}
