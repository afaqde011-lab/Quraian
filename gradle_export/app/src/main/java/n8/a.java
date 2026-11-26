package n8;

import a10.h0;
import androidx.media3.common.v0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends h0 {

    public static final Pattern f11185h = Pattern.compile("(.+?)='(.*?)';", 32);

    public final CharsetDecoder f11186f = StandardCharsets.UTF_8.newDecoder();

    public final CharsetDecoder f11187g = StandardCharsets.ISO_8859_1.newDecoder();

    public final v0 t(j8.a aVar, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f11187g;
        CharsetDecoder charsetDecoder2 = this.f11186f;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th3;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new v0(new c(null, null, bArr));
        }
        Matcher matcher = f11185h.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strI = w00.a.I(strGroup);
                strI.getClass();
                if (strI.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strI.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new v0(new c(str, str2, bArr));
    }
}
