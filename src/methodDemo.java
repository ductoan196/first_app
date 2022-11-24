public class methodDemo {
    public static void main(String[] args) {
        //Công việc A; Tốn mất 20 dòng code
        // Thực hiện công việc A 10 lần: Tốn 200 dòng
        // Có method: Tốn thêm 10 dòng để gọi

        int data = sumTwoNumber(3, 4);
        System.out.println(data);
        System.out.println(sumTwoNumber(3, 7));

        sayHello();

        //Cách 2: Định nghĩa đối tượng -> Goi method của đối tượng (thể hiện, instance) đấy
        //Class: Khuôn bánh (chỉ có 1)
        //Object: Bánh sinh ra từ khuôn
        methodDemo methodtoan = new methodDemo();
        methodDemo.sayHellowwithName("Đức Toàn");

    }

    // Tính tổng 2 số: Trả về kết quả là tổng của 2 số a, b
    // Tham số: Parameter (giá trị ảo, chưa biết trước khi định nghĩa method)
    // Đối số: argument (giá trị thật khi thực thi method)
    public static int sumTwoNumber(int a, int b) {
        int result = a + b;
        return result;
        // hoặc return a + b;

        //Những câu lệnh đằng sau từ khóa return sẽ không được thực thi
    }

    public static void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    //Ví dụ method có 1 tham số
    public void sayHellowwithName(String name) {
        System.out.println("Xin chào " + name);
    }
}
