import java.util.Scanner;


class CodeApp {

    public static void main(String[] args) {

        // propojeni
        CodeBean codeBean = new CodeBean();

        // input request
        System.out.println("Zadejte dvoumístný kód země: ");
        Scanner sc = new Scanner(System.in);

        // stuff
        String ISO2Code = sc.nextLine();
        String ISO3Code = codeBean.getISO3Code(ISO2Code);

        // input test
        System.out.println(ISO2Code);

        // output
        System.out.println(ISO3Code);
    }
}


