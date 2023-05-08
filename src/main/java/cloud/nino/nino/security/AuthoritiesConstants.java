package cloud.nino.nino.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String LOCATIONADMIN = "ROLE_LOCATION_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String AUTOGENERATED = "ROLE_AUTOGENERATED";

    public static final String ICPADMIN = "ROLE_ICP_ADMIN";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";

    private AuthoritiesConstants() {
    }
}