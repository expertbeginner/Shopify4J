/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.apache.commons.codec.language;

import com.apache.commons.codec.EncoderException;
import com.apache.commons.codec.StringEncoder;

/**
 * Utility methods for {@link Soundex} and {@link RefinedSoundex} classes.
 * 
 * @author Apache Software Foundation
 * @version $Id: SoundexUtils.java 658834 2008-05-21 19:57:51Z niallp $
 * @since 1.3
 */
final class SoundexUtils {

    /**
     * Cleans up the input string before Soundex processing by only returning
     * upper case letters.
     * 
     * @param str
     *                  The String to clean.
     * @return A clean String.
     */
    static String clean(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int len = str.length();
        char[] chars = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (Character.isLetter(str.charAt(i))) {
                chars[count++] = str.charAt(i);
            }
        }
        if (count == len) {
            return str.toUpperCase(java.util.Locale.ENGLISH);
        }
        return new String(chars, 0, count).toUpperCase(java.util.Locale.ENGLISH);
    }

    /**
     * Encodes the Strings and returns the number of characters in the two
     * encoded Strings that are the same.
     * <ul>
     * <li>For Soundex, this return value ranges from 0 through 4: 0 indicates
     * little or no similarity, and 4 indicates strong similarity or identical
     * values.</li>
     * <li>For refined Soundex, the return value can be greater than 4.</li>
     * </ul>
     * 
     * @param encoder
     *                  The encoder to use to encode the Strings.
     * @param s1
     *                  A String that will be encoded and compared.
     * @param s2
     *                  A String that will be encoded and compared.
     * @return The number of characters in the two Soundex encoded Strings that
     *             are the same.
     * 
     * @see #differenceEncoded(String,String)
     * @see <a href="http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_de-dz_8co5.asp">
     *          MS T-SQL DIFFERENCE</a>
     * 
     * @throws EncoderException
     *                  if an error occurs encoding one of the strings
     */
    static int difference(StringEncoder encoder, String s1, String s2) throws EncoderException {
        return differenceEncoded(encoder.encode(s1), encoder.encode(s2));
    }

    /**
     * Returns the number of characters in the two Soundex encoded Strings that
     * are the same.
     * <ul>
     * <li>For Soundex, this return value ranges from 0 through 4: 0 indicates
     * little or no similarity, and 4 indicates strong similarity or identical
     * values.</li>
     * <li>For refined Soundex, the return value can be greater than 4.</li>
     * </ul>
     * 
     * @param es1
     *                  An encoded String.
     * @param es2
     *                  An encoded String.
     * @return The number of characters in the two Soundex encoded Strings that
     *             are the same.
     * 
     * @see <a href="http://msdn.microsoft.com/library/default.asp?url=/library/en-us/tsqlref/ts_de-dz_8co5.asp">
     *          MS T-SQL DIFFERENCE</a>
     */
    static int differenceEncoded(String es1, String es2) {

        if (es1 == null || es2 == null) {
            return 0;
        }
        int lengthToMatch = Math.min(es1.length(), es2.length());
        int diff = 0;
        for (int i = 0; i < lengthToMatch; i++) {
            if (es1.charAt(i) == es2.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }

}
