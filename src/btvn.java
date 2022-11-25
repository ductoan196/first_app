public class btvn {
    public static void main(String[] args) {
        System.out.println("Xin chào các bạn");

        String name = "Đức Toàn";

        char character2 = '"';

        int data = sumTwoNumber(2,3);

        int century_result = century(1999);

        int square_result = square(6);

        double bmi_result = bmi_index(70, 1.7);

        System.out.println("Xin chào " + name);
        System.out.println("Xin chào " + character2 +name +character2 );
        System.out.println("Tổng hai số là " + data);
        System.out.println("Bình phương một số: "+ square_result);
        System.out.println("Century:" + century_result);
        System.out.println("Chỉ số BMI: " + (double)Math.round(bmi_result * 100)/100);
    }

    //Tính tổng 2 số bất kỳ
    public static int sumTwoNumber(int c, int d){
        return (int) (c + d);
    }
    //Tính bình phương 1 số bất kỳ
    public static int square(int number){
        return (int) Math.pow(number,2);
    }

    //Tính thể kỷ của một năm bất kỳ
    public static int century(int year){
        return (int) Math.floor(year/100 +1);
    }

    //Tính chỉ số BMI
    public static double bmi_index(double weight, double height){
        return (double) weight/Math.pow(height,2);
    }
}
