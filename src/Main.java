
public class ClassNameTest {
    public static String[] validNames = {"C0223G", "A0323K", "P3456I"};
    public static String[] invalidNames = {"M0318G", "P0323A", "P345I"};

    public static void main(String[] args) {
        ClassNameValidate validate = new ClassNameValidate();
        for (String name : validNames) {
            boolean isValid = validate.valid(name);
            System.out.println("Class name "+ name + " is valid? " + isValid);
        }
        System.out.println();
        for (String name : invalidNames) {
            boolean isValid = validate.valid(name);
            System.out.println("Class name "+ name + " is valid? " + isValid);
        }
    }
}
