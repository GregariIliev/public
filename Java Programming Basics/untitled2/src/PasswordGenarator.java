import java.util.Scanner;

public class PasswordGenarator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());
        String abc = "abcdefghijklmnopqrstuvwxyz";
        boolean sdfsdf = false;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < abc.length(); k++) {
                    String Latter1 = "";
                    if (k < l) {
                        char currentLetter1 = abc.charAt(k);
                        Latter1 = String.valueOf(currentLetter1);
                    }else {
                        break;
                    }
                    for (int m = 0; m < abc.length() ; m++) {
                        String Latter2 = "";
                        if (m < l){
                            char currentLatter2 = abc.charAt(m);
                            Latter2 = String.valueOf(currentLatter2);
                        }else {
                            break;
                        }
                        for (int o = 1; o <= n ; o++) {
                            if (i < o && j < o){
                                System.out.printf("%d%d%s%s%d ",i ,j ,Latter1 ,Latter2 ,o);
                            }
                        }
                    }

                }
            }
        }
    }
}
