public class Main {
    // Phạm vi global: Khai báo bên ngoài method
    public static String globalVar = "Global varluable";

    // Phạm vi method; Khai báo bên trong method
    // Phạm vi block: Khai báo bên trong dáu ngoặc nhọn
    public static void main(String[] args) {

        System.out.println("Hello Toan");

//        Khai báo
        String firstName;
        String lastName;
        String email ="techmaster.vn";

//        Gán giá trị cho biến
        firstName = "Vu";
        lastName ="Toan";
        String fullName = firstName + " " + lastName;
        int age = 25;
        String address = "Nam Định";

        System.out.println("firstName=" + lastName);
        System.out.println("lastName =" + lastName);
        System.out.println("fullName =" + fullName);
        System.out.println("Xin chào, tôi tên là " + fullName + ". Năm nay tôi " + age + " tuổi. Quê tôi ở " + address);

    // Khai báo các kiểu dữ liệu
        long salary = 1000_000_000L;
        double height = 1.7;
        float weight = 60.5f;

        boolean isExist= true;
        boolean isMarried = false;

        char characterA = 'A';
        char characterB = 66; //Tra bảng mã ASCII

        System.out.println(characterA);
        System.out.println(characterB);

        System.out.println(salary);

        //Ép kiểu
        //Ép kiểu ngầm định (nhỏ -> Lớn)
        int number = 10;
        long numberOne = number;

        //Ép kiểu tường minh
        short numberTwo = (short) number;

        //Gọi biến Global
        System.out.println(globalVar);

        //Phạm vi block
        {
            String blockVar = "Block varluable";
            System.out.println(blockVar);
        }
//        System.out.println(blockVar);
// Ngoài phạm vi sử dụng -> Error
    }
}

