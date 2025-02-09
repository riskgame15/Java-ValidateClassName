
public class ClassNameValidate {
    private final String CLASSNAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public ClassNameValidate() {
    }

    public boolean valid(String className) {
        return className.matches(CLASSNAME_REGEX);
    }
}
