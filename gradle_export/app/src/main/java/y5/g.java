package y5;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import oi.k;

public final class g {
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final d G;
    public static final d[][] H;
    public static final d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;

    public final FileDescriptor f16629a;

    public final AssetManager.AssetInputStream f16630b;

    public int f16631c;

    public final HashMap[] f16632d;

    public final HashSet f16633e;

    public ByteOrder f16634f;

    public boolean f16635g;

    public int f16636h;

    public int f16637i;

    public int f16638j;

    public int f16639k;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final List m = Arrays.asList(1, 6, 3, 8);

    public static final List f16616n = Arrays.asList(2, 7, 4, 5);

    public static final int[] f16617o = {8, 8, 8};

    public static final int[] f16618p = {8};

    public static final byte[] f16619q = {-1, -40, -1};

    public static final byte[] f16620r = {102, 116, 121, 112};

    public static final byte[] f16621s = {109, 105, 102, 49};

    public static final byte[] f16622t = {104, 101, 105, 99};

    public static final byte[] f16623u = {79, 76, 89, 77, 80, 0};

    public static final byte[] f16624v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    public static final byte[] f16625w = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static final byte[] f16626x = {101, 88, 73, 102};

    public static final byte[] f16627y = {73, 72, 68, 82};

    public static final byte[] f16628z = {73, 69, 78, 68};
    public static final byte[] A = {82, 73, 70, 70};
    public static final byte[] B = {87, 69, 66, 80};
    public static final byte[] C = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        D = new String[]{RuntimeVersion.SUFFIX, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        E = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        F = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", MediaError.DetailedErrorCode.SEGMENT_NETWORK, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", MediaError.DetailedErrorCode.HLS_NETWORK_INVALID_SEGMENT, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", MediaError.DetailedErrorCode.SEGMENT_NETWORK, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", MediaError.DetailedErrorCode.HLS_NETWORK_INVALID_SEGMENT, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        G = new d("StripOffsets", 273, 3);
        H = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        J = new HashMap[10];
        K = new HashMap[10];
        L = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        M = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        N = charsetForName;
        O = "Exif\u0000\u0000".getBytes(charsetForName);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = H;
            if (i10 >= dVarArr6.length) {
                HashMap map = M;
                d[] dVarArr7 = I;
                map.put(Integer.valueOf(dVarArr7[0].f16610a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f16610a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f16610a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f16610a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f16610a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f16610a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            J[i10] = new HashMap();
            K[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                J[i10].put(Integer.valueOf(dVar.f16610a), dVar);
                K[i10].put(dVar.f16611b, dVar);
            }
            i10++;
        }
    }

    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = H;
        this.f16632d = new HashMap[dVarArr.length];
        this.f16633e = new HashSet(dVarArr.length);
        this.f16634f = ByteOrder.BIG_ENDIAN;
        boolean z10 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z11 = l;
        if (z10) {
            this.f16630b = (AssetManager.AssetInputStream) inputStream;
            this.f16629a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f16630b = null;
                this.f16629a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z11) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.f16630b = null;
                this.f16629a = null;
            }
        } else {
            this.f16630b = null;
            this.f16629a = null;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            try {
                try {
                    this.f16632d[i10] = new HashMap();
                } catch (IOException | UnsupportedOperationException e3) {
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e3);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                a();
                if (z11) {
                    p();
                }
                throw th2;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.f16631c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.f16631c;
            if (i11 == 4) {
                e(bVar, 0, 0);
            } else if (i11 == 13) {
                h(bVar);
            } else if (i11 == 9) {
                i(bVar);
            } else if (i11 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.f16631c;
            if (i12 == 12) {
                d(fVar);
            } else if (i12 == 7) {
                g(fVar);
            } else if (i12 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.i(this.f16636h);
            u(fVar);
        }
        a();
        if (!z11) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s6 = bVar.readShort();
        boolean z10 = l;
        if (s6 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s6 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s6));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f16632d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(N);
            map.put("DateTime", new c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f16634f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f16634f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f16634f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f16634f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i10 = cVarC.f16606a;
            if (!L.contains(str)) {
                return cVarC.f(this.f16634f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f16634f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f16614a / eVar.f16615b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f16614a / eVar2.f16615b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f16614a / eVar3.f16615b)));
            }
            try {
                return Double.toString(cVarC.d(this.f16634f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < H.length; i10++) {
            c cVar = (c) this.f16632d[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f16632d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f16634f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f16634f));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i10, this.f16634f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.i(i12);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, O)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    fVar.readFully(bArr2);
                    this.f16636h = i14;
                    r(0, bArr2);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    public final void e(y5.b r23, int r24, int r25) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: y5.g.e(y5.b, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i10;
        b bVar2;
        b bVar3;
        b bVar4;
        int i11;
        b bVar5;
        b bVar6;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        byte[] bArr3;
        b bVar7;
        short s6;
        long j9;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i17 = 0;
        while (true) {
            byte[] bArr5 = f16619q;
            if (i17 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i17] != bArr5[i17]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i18 = 0; i18 < bytes.length; i18++) {
                    if (bArr4[i18] != bytes[i18]) {
                        int i19 = 1;
                        try {
                            try {
                                try {
                                    bVar2 = new b(bArr4);
                                    try {
                                        try {
                                            long j10 = bVar2.readInt();
                                            byte[] bArr6 = new byte[4];
                                            bVar2.readFully(bArr6);
                                            if (Arrays.equals(bArr6, f16620r)) {
                                                if (j10 == 1) {
                                                    j10 = bVar2.readLong();
                                                    j9 = 16;
                                                    if (j10 < 16) {
                                                    }
                                                    bVar4 = new b(bArr4);
                                                    ByteOrder byteOrderQ = q(bVar4);
                                                    this.f16634f = byteOrderQ;
                                                    bVar4.C = byteOrderQ;
                                                    s6 = bVar4.readShort();
                                                    if (s6 != 20306 || s6 == 21330) {
                                                        i11 = 1;
                                                    } else {
                                                        i11 = i10;
                                                    }
                                                    bVar4.close();
                                                    if (i11 != 0) {
                                                        return 7;
                                                    }
                                                    try {
                                                        bVar7 = new b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderQ2 = q(bVar7);
                                                            this.f16634f = byteOrderQ2;
                                                            bVar7.C = byteOrderQ2;
                                                            if (bVar7.readShort() == 85) {
                                                                i12 = 1;
                                                            } else {
                                                                i12 = i10;
                                                            }
                                                            bVar7.close();
                                                        } catch (Exception unused) {
                                                            bVar6 = bVar7;
                                                            if (bVar6 != null) {
                                                                bVar6.close();
                                                            }
                                                            i12 = i10;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            bVar5 = bVar7;
                                                            if (bVar5 != null) {
                                                                bVar5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        bVar6 = null;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        bVar5 = null;
                                                    }
                                                    if (i12 != 0) {
                                                        return 10;
                                                    }
                                                    i13 = i10;
                                                    while (true) {
                                                        bArr = f16625w;
                                                        if (i13 < bArr.length) {
                                                            i14 = 1;
                                                            break;
                                                        }
                                                        if (bArr4[i13] != bArr[i13]) {
                                                            i14 = i10;
                                                            break;
                                                        }
                                                        i13++;
                                                    }
                                                    if (i14 != 0) {
                                                        return 13;
                                                    }
                                                    i15 = i10;
                                                    while (true) {
                                                        bArr2 = A;
                                                        if (i15 < bArr2.length) {
                                                            i16 = i10;
                                                            while (true) {
                                                                bArr3 = B;
                                                                if (i16 >= bArr3.length) {
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                                                    break;
                                                                }
                                                                i16++;
                                                            }
                                                            if (i19 != 0) {
                                                                return 14;
                                                            }
                                                            return i10;
                                                        }
                                                        if (bArr4[i15] != bArr2[i15]) {
                                                            break;
                                                        }
                                                        i15++;
                                                    }
                                                    i19 = i10;
                                                    if (i19 != 0) {
                                                        return 14;
                                                    }
                                                    return i10;
                                                }
                                                j9 = 8;
                                                i10 = 0;
                                                long j11 = 5000;
                                                if (j10 > j11) {
                                                    j10 = j11;
                                                }
                                                long j12 = j10 - j9;
                                                if (j12 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z10 = false;
                                                        boolean z11 = false;
                                                        for (long j13 = 0; j13 < j12 / 4; j13++) {
                                                            try {
                                                                bVar2.readFully(bArr7);
                                                                if (j13 != 1) {
                                                                    if (Arrays.equals(bArr7, f16621s)) {
                                                                        z10 = true;
                                                                    } else if (Arrays.equals(bArr7, f16622t)) {
                                                                        z11 = true;
                                                                    }
                                                                    if (z10 && z11) {
                                                                        bVar2.close();
                                                                        return 12;
                                                                    }
                                                                }
                                                            } catch (EOFException unused3) {
                                                            }
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        if (l) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (bVar2 != null) {
                                                        }
                                                        bVar4 = new b(bArr4);
                                                        ByteOrder byteOrderQ3 = q(bVar4);
                                                        this.f16634f = byteOrderQ3;
                                                        bVar4.C = byteOrderQ3;
                                                        s6 = bVar4.readShort();
                                                        if (s6 != 20306) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                        bVar4.close();
                                                        if (i11 != 0) {
                                                            return 7;
                                                        }
                                                        bVar7 = new b(bArr4);
                                                        ByteOrder byteOrderQ4 = q(bVar7);
                                                        this.f16634f = byteOrderQ4;
                                                        bVar7.C = byteOrderQ4;
                                                        if (bVar7.readShort() == 85) {
                                                            i12 = 1;
                                                        } else {
                                                            i12 = i10;
                                                        }
                                                        bVar7.close();
                                                        if (i12 != 0) {
                                                            return 10;
                                                        }
                                                        i13 = i10;
                                                        while (true) {
                                                            bArr = f16625w;
                                                            if (i13 < bArr.length) {
                                                                i14 = 1;
                                                                break;
                                                            }
                                                            if (bArr4[i13] != bArr[i13]) {
                                                                i14 = i10;
                                                                break;
                                                            }
                                                            i13++;
                                                        }
                                                        if (i14 != 0) {
                                                            return 13;
                                                        }
                                                        i15 = i10;
                                                        while (true) {
                                                            bArr2 = A;
                                                            if (i15 < bArr2.length) {
                                                                i16 = i10;
                                                                while (true) {
                                                                    bArr3 = B;
                                                                    if (i16 >= bArr3.length) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i16++;
                                                                }
                                                                if (i19 != 0) {
                                                                    return 14;
                                                                }
                                                                return i10;
                                                            }
                                                            if (bArr4[i15] != bArr2[i15]) {
                                                                break;
                                                                break;
                                                            }
                                                            i15++;
                                                        }
                                                        i19 = i10;
                                                        if (i19 != 0) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                }
                                                bVar2.close();
                                                bVar4 = new b(bArr4);
                                                ByteOrder byteOrderQ5 = q(bVar4);
                                                this.f16634f = byteOrderQ5;
                                                bVar4.C = byteOrderQ5;
                                                s6 = bVar4.readShort();
                                                if (s6 != 20306) {
                                                    i11 = 1;
                                                } else {
                                                    i11 = 1;
                                                }
                                                bVar4.close();
                                                if (i11 != 0) {
                                                    return 7;
                                                }
                                                bVar7 = new b(bArr4);
                                                ByteOrder byteOrderQ6 = q(bVar7);
                                                this.f16634f = byteOrderQ6;
                                                bVar7.C = byteOrderQ6;
                                                if (bVar7.readShort() == 85) {
                                                    i12 = 1;
                                                } else {
                                                    i12 = i10;
                                                }
                                                bVar7.close();
                                                if (i12 != 0) {
                                                    return 10;
                                                }
                                                i13 = i10;
                                                while (true) {
                                                    bArr = f16625w;
                                                    if (i13 < bArr.length) {
                                                        i14 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i13] != bArr[i13]) {
                                                        i14 = i10;
                                                        break;
                                                    }
                                                    i13++;
                                                }
                                                if (i14 != 0) {
                                                    return 13;
                                                }
                                                i15 = i10;
                                                while (true) {
                                                    bArr2 = A;
                                                    if (i15 < bArr2.length) {
                                                        i16 = i10;
                                                        while (true) {
                                                            bArr3 = B;
                                                            if (i16 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                                                break;
                                                                break;
                                                            }
                                                            i16++;
                                                        }
                                                        if (i19 != 0) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                    if (bArr4[i15] != bArr2[i15]) {
                                                        break;
                                                        break;
                                                    }
                                                    i15++;
                                                }
                                                i19 = i10;
                                                if (i19 != 0) {
                                                    return 14;
                                                }
                                                return i10;
                                            }
                                            bVar2.close();
                                            i10 = 0;
                                        } catch (Exception e10) {
                                            e = e10;
                                            i10 = 0;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bVar = bVar2;
                                        if (bVar != null) {
                                            bVar.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    i10 = 0;
                                    bVar2 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar = null;
                                }
                                ByteOrder byteOrderQ7 = q(bVar4);
                                this.f16634f = byteOrderQ7;
                                bVar4.C = byteOrderQ7;
                                s6 = bVar4.readShort();
                                if (s6 != 20306) {
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                }
                                bVar4.close();
                            } catch (Exception unused4) {
                                if (bVar4 != null) {
                                    bVar4.close();
                                }
                                i11 = i10;
                            } catch (Throwable th6) {
                                th = th6;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                            bVar4 = new b(bArr4);
                        } catch (Exception unused5) {
                            bVar4 = null;
                        } catch (Throwable th7) {
                            th = th7;
                            bVar3 = null;
                        }
                        if (i11 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderQ8 = q(bVar7);
                        this.f16634f = byteOrderQ8;
                        bVar7.C = byteOrderQ8;
                        if (bVar7.readShort() == 85) {
                            i12 = 1;
                        } else {
                            i12 = i10;
                        }
                        bVar7.close();
                        if (i12 != 0) {
                            return 10;
                        }
                        i13 = i10;
                        while (true) {
                            bArr = f16625w;
                            if (i13 < bArr.length) {
                                i14 = 1;
                                break;
                            }
                            if (bArr4[i13] != bArr[i13]) {
                                i14 = i10;
                                break;
                            }
                            i13++;
                        }
                        if (i14 != 0) {
                            return 13;
                        }
                        i15 = i10;
                        while (true) {
                            bArr2 = A;
                            if (i15 < bArr2.length) {
                                i16 = i10;
                                while (true) {
                                    bArr3 = B;
                                    if (i16 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i16 + 4] != bArr3[i16]) {
                                        break;
                                        break;
                                    }
                                    i16++;
                                }
                                if (i19 != 0) {
                                    return 14;
                                }
                                return i10;
                            }
                            if (bArr4[i15] != bArr2[i15]) {
                                break;
                                break;
                            }
                            i15++;
                        }
                        i19 = i10;
                        if (i19 != 0) {
                            return 14;
                        }
                        return i10;
                    }
                }
                return 9;
            }
            i17++;
        }
    }

    public final void g(f fVar) throws IOException {
        int i10;
        int i11;
        j(fVar);
        HashMap[] mapArr = this.f16632d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f16609d);
            fVar2.C = this.f16634f;
            byte[] bArr = f16623u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.i(0L);
            byte[] bArr3 = f16624v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.i(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.i(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f16634f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f16634f);
                c cVarC2 = c.c(i15, this.f16634f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.C = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f16625w;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f16627y)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f16628z)) {
                    return;
                }
                if (Arrays.equals(bArr2, f16626x)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f16636h = i11;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z10 = l;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.B);
        bVar.readFully(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.B);
        bVar.C = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == G.f16610a) {
                short s6 = bVar.readShort();
                short s10 = bVar.readShort();
                c cVarC = c.c(s6, this.f16634f);
                c cVarC2 = c.c(s10, this.f16634f);
                HashMap[] mapArr = this.f16632d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s6) + ", width: " + ((int) s10));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f16631c == 8) {
            HashMap[] mapArr = this.f16632d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f16609d);
                fVar2.C = this.f16634f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f16632d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f16609d), (int) cVar.f16608c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.C = ByteOrder.LITTLE_ENDIAN;
        bVar.a(A.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = B;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(C, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    this.f16636h = i12;
                    r(0, bArr3);
                    u(new b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f16634f);
        int iE2 = cVar2.e(this.f16634f);
        if (this.f16631c == 7) {
            iE += this.f16637i;
        }
        if (iE > 0 && iE2 > 0 && this.f16630b == null && this.f16629a == null) {
            bVar.a(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f16634f) <= 512 && cVar2.e(this.f16634f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f16634f = byteOrderQ;
        fVar.C = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.f16631c;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(g4.c.f(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.a(i12);
        }
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f16632d;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbQ = k.q("The size of tag group[", i10, "]: ");
            sbQ.append(mapArr[i10].size());
            Log.d("ExifInterface", sbQ.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f16634f) + "'");
            }
            i10++;
        }
    }

    public final void r(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i10);
    }

    public final void s(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        long j9;
        long j10;
        boolean z10;
        int i11;
        long j11;
        Integer num;
        HashSet hashSet;
        long j12;
        String str;
        int unsignedShort;
        long j13;
        String strI;
        int i12;
        int i13 = fVar.B;
        int i14 = fVar.E;
        Integer numValueOf = Integer.valueOf(i13);
        HashSet hashSet2 = this.f16633e;
        hashSet2.add(numValueOf);
        short s6 = fVar.readShort();
        boolean z11 = l;
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s6));
        }
        if (s6 <= 0) {
            return;
        }
        short s10 = 0;
        while (true) {
            mapArr = this.f16632d;
            if (s10 >= s6) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i15 = fVar.readInt();
            long j14 = ((long) fVar.B) + 4;
            short s11 = s6;
            d dVar = (d) J[i10].get(Integer.valueOf(unsignedShort2));
            if (z11) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f16611b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i15)));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = E;
                    if (unsignedShort3 < iArr.length) {
                        int i16 = dVar.f16612c;
                        if (i16 == 7 || unsignedShort3 == 7 || i16 == unsignedShort3 || (i11 = dVar.f16613d) == unsignedShort3 || (((i16 == 4 || i11 == 4) && unsignedShort3 == 3) || (((i16 == 9 || i11 == 9) && unsignedShort3 == 8) || ((i16 == 12 || i11 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i16;
                            }
                            j9 = j14;
                            j10 = ((long) i15) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i15);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z11 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + D[unsignedShort3] + ") is unexpected for tag: " + dVar.f16611b);
                        }
                    }
                    if (z10) {
                        j11 = j9;
                        if (j10 > 4) {
                            i12 = fVar.readInt();
                            if (z11 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f16631c == 7) {
                                if ("MakerNote".equals(dVar.f16611b)) {
                                    this.f16637i = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f16611b)) {
                                    this.f16638j = i12;
                                    this.f16639k = i15;
                                    c cVarC = c.c(6, this.f16634f);
                                    c cVarA = c.a(this.f16638j, this.f16634f);
                                    c cVarA2 = c.a(this.f16639k, this.f16634f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.i(i12);
                        } else {
                            j11 = j11;
                            unsignedShort2 = unsignedShort2;
                            dVar = dVar;
                        }
                        num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                        if (z11 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j13 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j13 = -1;
                                }
                                if (z11 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                                }
                                if (j13 > 0 || (i14 != -1 && j13 >= i14)) {
                                    hashSet = hashSet2;
                                    if (z11 != 0) {
                                        strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i14 != -1) {
                                            strI = strI + " (total length: " + i14 + ")";
                                        }
                                        Log.d("ExifInterface", strI);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j13))) {
                                        fVar.i(j13);
                                        s(fVar, num.intValue());
                                    } else if (z11 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                    }
                                }
                                fVar.i(j11);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j13 = unsignedShort;
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                            }
                            if (j13 > 0) {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            fVar.i(j11);
                        } else {
                            hashSet = hashSet2;
                            j12 = j11;
                            int i17 = fVar.B + this.f16636h;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            c cVar = new c(i17, bArr, unsignedShort3, i15);
                            HashMap map = mapArr[i10];
                            str = dVar.f16611b;
                            map.put(str, cVar);
                            if ("DNGVersion".equals(str)) {
                                this.f16631c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f16634f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f16634f) == 65535)) {
                                this.f16631c = 8;
                            }
                            if (fVar.B != j12) {
                                fVar.i(j12);
                            }
                        }
                    } else {
                        fVar.i(j9);
                        hashSet = hashSet2;
                    }
                    s10 = (short) (s10 + 1);
                    hashSet2 = hashSet;
                    s6 = s11;
                    z11 = z11;
                }
                j9 = j14;
                if (z11 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    fVar.i(j9);
                    hashSet = hashSet2;
                } else {
                    j11 = j9;
                    if (j10 > 4) {
                        i12 = fVar.readInt();
                        if (z11 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f16631c == 7) {
                            if ("MakerNote".equals(dVar.f16611b)) {
                                this.f16637i = i12;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.i(i12);
                    } else {
                        j11 = j11;
                        unsignedShort2 = unsignedShort2;
                        dVar = dVar;
                    }
                    num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                    if (z11 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j13 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z11 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                            }
                            if (j13 > 0) {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z11 != 0) {
                                    strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i14 != -1) {
                                        strI = strI + " (total length: " + i14 + ")";
                                    }
                                    Log.d("ExifInterface", strI);
                                }
                            }
                            fVar.i(j11);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j13 = unsignedShort;
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                        }
                        if (j13 > 0) {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        fVar.i(j11);
                    } else {
                        hashSet = hashSet2;
                        j12 = j11;
                        int i18 = fVar.B + this.f16636h;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i18, bArr2, unsignedShort3, i15);
                        HashMap map2 = mapArr[i10];
                        str = dVar.f16611b;
                        map2.put(str, cVar2);
                        if ("DNGVersion".equals(str)) {
                            this.f16631c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.f16631c = 8;
                        if (fVar.B != j12) {
                            fVar.i(j12);
                        }
                    }
                }
                s10 = (short) (s10 + 1);
                hashSet2 = hashSet;
                s6 = s11;
                z11 = z11;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j9 = j14;
            j10 = 0;
            z10 = false;
            if (z10) {
                fVar.i(j9);
                hashSet = hashSet2;
            } else {
                j11 = j9;
                if (j10 > 4) {
                    i12 = fVar.readInt();
                    if (z11 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f16631c == 7) {
                        if ("MakerNote".equals(dVar.f16611b)) {
                            this.f16637i = i12;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.i(i12);
                } else {
                    j11 = j11;
                    unsignedShort2 = unsignedShort2;
                    dVar = dVar;
                }
                num = (Integer) M.get(Integer.valueOf(unsignedShort2));
                if (z11 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j13 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z11 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                        }
                        if (j13 > 0) {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z11 != 0) {
                                strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                                if (i14 != -1) {
                                    strI = strI + " (total length: " + i14 + ")";
                                }
                                Log.d("ExifInterface", strI);
                            }
                        }
                        fVar.i(j11);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j13 = unsignedShort;
                    if (z11 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j13), dVar.f16611b));
                    }
                    if (j13 > 0) {
                        hashSet = hashSet2;
                        if (z11 != 0) {
                            strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                            if (i14 != -1) {
                                strI = strI + " (total length: " + i14 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z11 != 0) {
                            strI = w.c.i(j13, "Skip jump into the IFD since its offset is invalid: ");
                            if (i14 != -1) {
                                strI = strI + " (total length: " + i14 + ")";
                            }
                            Log.d("ExifInterface", strI);
                        }
                    }
                    fVar.i(j11);
                } else {
                    hashSet = hashSet2;
                    j12 = j11;
                    int i19 = fVar.B + this.f16636h;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i19, bArr3, unsignedShort3, i15);
                    HashMap map3 = mapArr[i10];
                    str = dVar.f16611b;
                    map3.put(str, cVar3);
                    if ("DNGVersion".equals(str)) {
                        this.f16631c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f16631c = 8;
                    if (fVar.B != j12) {
                        fVar.i(j12);
                    }
                }
            }
            s10 = (short) (s10 + 1);
            hashSet2 = hashSet;
            s6 = s11;
            z11 = z11;
        }
        HashSet hashSet3 = hashSet2;
        boolean z12 = z11;
        int i20 = fVar.readInt();
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i20)));
        }
        long j15 = i20;
        if (j15 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i20))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i20);
                return;
            }
            return;
        }
        fVar.i(j15);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(String str, int i10, String str2) {
        HashMap[] mapArr = this.f16632d;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void u(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.f16632d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f16634f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f16634f);
            int[] iArr2 = f16617o;
            if (Arrays.equals(iArr2, iArr) || (this.f16631c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f16634f)) == 1 && Arrays.equals(iArr, f16618p)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrO = va.a.o(cVar4.g(this.f16634f));
                long[] jArrO2 = va.a.o(cVar5.g(this.f16634f));
                if (jArrO == null || jArrO.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrO2 == null || jArrO2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrO.length != jArrO2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j9 = 0;
                for (long j10 : jArrO2) {
                    j9 += j10;
                }
                byte[] bArr = new byte[(int) j9];
                this.f16635g = true;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < jArrO.length; i12++) {
                    int i13 = (int) jArrO[i12];
                    int i14 = (int) jArrO2[i12];
                    if (i12 < jArrO.length - 1 && i13 + i14 != jArrO[i12 + 1]) {
                        this.f16635g = false;
                    }
                    int i15 = i13 - i10;
                    if (i15 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i15);
                        int i16 = i10 + i15;
                        byte[] bArr2 = new byte[i14];
                        try {
                            bVar.readFully(bArr2);
                            i10 = i16 + i14;
                            System.arraycopy(bArr2, 0, bArr, i11, i14);
                            i11 += i14;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                        return;
                    }
                }
                if (this.f16635g) {
                    long j11 = jArrO[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i10, int i11) {
        HashMap[] mapArr = this.f16632d;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = l;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f16634f);
        int iE2 = cVar2.e(this.f16634f);
        int iE3 = cVar3.e(this.f16634f);
        int iE4 = cVar4.e(this.f16634f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void w(f fVar, int i10) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f16632d;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f16606a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f16634f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f16634f);
                cVarC2 = c.b(eVarArr[1], this.f16634f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f16634f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f16634f);
                cVarC2 = c.c(iArr[1], this.f16634f);
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f16634f);
            int iE2 = cVar4.e(this.f16634f);
            int iE3 = cVar5.e(this.f16634f);
            int iE4 = cVar3.e(this.f16634f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f16634f);
            c cVarC4 = c.c(iE3 - iE4, this.f16634f);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f16634f);
            int iE6 = cVar8.e(this.f16634f);
            fVar.i(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f16632d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
