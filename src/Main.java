import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz:");
        heat = input.nextInt();

        if (heat<5){
            System.out.print("Kayak yapmaya gidebilirsiniz.");
        }else if(heat<=10){
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if(heat<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.print("Piknik yapmaya gidebilirsiniz.");
        }else if(heat<=25){
            System.out.print("Piknik yapmaya gidebilirsiniz.");
        }else{
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}
