public class Main {

    public static void main(String[] args) {



    shouldWakeUp(true , -1);

    boolean isTeen = hasTeen(22,23,34);
        System.out.println(isTeen);

    isCatPlaying(false , 35);

    double rectangleArea = area(-1.0 , 4.0);
        System.out.println(rectangleArea);

        double circleArea = area(5);
        System.out.println(circleArea);
    }






    // 1. parametre boolean , kopegin havlayip havlamadigini tutmali
    // 2. parametre int degeri almali , 0 ile 23 arasinda deger alacak . aksam 8 ile sabah 8 arasinda havliyorsa metod true olacak
    public static void shouldWakeUp(boolean bark , int time ) {
            if (time >= 0 && time < 8)
            {
                if (bark){
                    System.out.println(true);
                }
                else {
                    System.out.println(false
                    );
                }
            }
            else if(time>20 && time <= 23){
                if (bark) {
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }
            else {
                System.out.println(false);
            }
    }

    // 3 parametre alacak . 3 int
    public static boolean hasTeen (int number1 , int number2 , int number3){
        if ((number1 >+ 13 && number1 <=19) || (number2 >=13 && number2 <=19) || (number3 >=13 && number3 <=19)){
            return true;
        }
        else return false;
    }

    public static void isCatPlaying (boolean summer , int temp) {
        if (summer && (temp >25 && temp < 45)){
            System.out.println(true);
        }
        else if (!summer && (temp>25 && temp <35)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static double area(double edge1 , double edge2) {
        if (edge1 <0 || edge2<0){
            return -1;
        }
        else {
            return edge1 * edge2 ;
        }
    }

    public static double area(double radius){
        if (radius<0){
            return -1;
        }
        else {
            return Math.pow(radius , 2) * Math.PI;
        }
    }




}