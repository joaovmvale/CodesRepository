import java.util.Scanner;

public class Solution2 {

    public void ConcatERemove(String s, String t, int k){
        int x = 0;
        int counter = 0;
        int counter2 = 0;
        while (x < s.length() && x < t.length() && s.charAt(x) == t.charAt(x)){
            x+=1;
        }

        counter = s.length() - x;
        counter2 = t.length() - x;

        int auxiliar = counter + counter2;

        if (auxiliar <= k && ((k - auxiliar) > 2 * x || (k - auxiliar) % 2 == 0)){
            System.out.println("sim");
        }else{
            System.out.println("não");
        }
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        Scanner sc = new Scanner(System.in);
        String s;
        String t;
        int k;
        System.out.println("Digite a string 'S' inicial: ");
        s = sc.next();
        if (s.length() == 0 || s.length() > 100 || !s.equals(s.toLowerCase())){
            System.out.println("A string deve conter entre 0 a 100 caracteres minusculos.");
            System.out.println("Digite a string 'S' inicial: ");
            s = sc.next();
        }
        System.out.println("Digite a string 'T' desejada: ");
        t = sc.next();
        if (t.length() == 0 || t.length() > 100 || !t.equals(t.toLowerCase())){
            System.out.println("A string deve conter entre 0 a 100 caracteres minusculos.");
            System.out.println("Digite a string 'T' desejada: ");
            t = sc.next();
        }
        System.out.println("Digite um numero inteiro 'K': ");
        k = sc.nextInt();
        if(k == 0 || k > 100){
            System.out.println("O numero deve ser entre 0 e 100.");
            System.out.println("Digite um numero inteiro 'K': ");
            k = sc.nextInt();
        }
        sc.close();
        sol.ConcatERemove(s,t,k);
    }
}
