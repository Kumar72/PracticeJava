package pro.chandan.practicejava.exercism;

public class TwoFer {
    public String twofer(String name) {
        return name == null ? "One for you, one for me."
                : "One for "+name+", one for me.";
    }

    public String clean (String identifier) {
        return identifier.replace(" ","_")
                .replaceAll("^\\x00-\\x7F","CTRL");
    }

}

class TwoFerTest {
    public static void main(String[] args) {
        TwoFer twoFer = new TwoFer();
        String name = "Chandan";
        String name2 = "";

        System.out.println(twoFer.twofer(name));
        System.out.println(twoFer.twofer(name2));
        System.out.println(twoFer.twofer(null));

        System.out.println(twoFer.clean(""));
    }
}
