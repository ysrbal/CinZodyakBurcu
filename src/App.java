import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int date, kalan;
        String burc = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Dogum Tarihinizi Giriniz : ");
        date = input.nextInt();

        kalan = date%12;

        if(kalan == 0) {
            burc = "Maymun";
        }else if(kalan == 1 ){
            burc = "Horoz";
        }else if (kalan == 2){
            burc = "Köpek";
        }else if (kalan == 3){
            burc = "Domuz";
        }else if (kalan == 4){
            burc = "Fare";
        }else if (kalan == 5){
            burc = "Öküz";
        }else if (kalan == 6){
            burc = "Kaplan";
        }else if (kalan == 7){
            burc = "Tavşan";
        }else if (kalan == 8){
            burc = "Ejderha";
        }else if (kalan == 9){
            burc = "Yılan";
        }else if (kalan == 10){
            burc = "At";
        }else{
            burc = "Koyun";
        }
            System.out.println("Burcunuz : "+ burc);
        }



    }

