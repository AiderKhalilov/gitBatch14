
class AnotherClass {
    private static String testPrivate(String priv) {
        System.out.println(priv);
        return priv;
    }

    static String testDefault(String def) {
        return def;
    }

    protected static String testProtected() {
        String output = "protected";
        return output;
    }

    public static String testPublic() {
        String output = "public";
        return output;
    }



    public static void main(String args[]) {
        System.out.println(testPrivate("private"));
        System.out.println(AnotherClass.testDefault("default"));
        testProtected();
        testPublic();

        //hi aider


    }

}