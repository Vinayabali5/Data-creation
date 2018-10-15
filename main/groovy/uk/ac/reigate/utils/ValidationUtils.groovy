package uk.ac.reigate.utils;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 *
 * Validation utility methods
 *
 */
public final class ValidationUtils {
    
    private static final Pattern EMAIL_REGEX = Pattern.compile('^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$');
    
    
    private ValidationUtils() {
        throw new NotImplementedException("Utility classes cannot be instantiated");
    }
    
    public static void assertNotBlank(String username, String message) {
        if (StringUtils.isBlank(username)) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void assertNotNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void assertMinimumLength(String username, int length, String message) {
        if (username.length() < length) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void assertMatches(String string, Pattern regex, String message) {
        if (!regex.matcher(string).matches()) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void assertEmail(String email, String message) {
        assertMatches(email, EMAIL_REGEX, message);
    }
}
