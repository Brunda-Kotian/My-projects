public class MethodEx1 {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // return value
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        MethodEx1 obj = new MethodEx1();
        int result = obj.addNumbers(num1, num2);// calling method
        System.out.println("sum is:" + result);
    }

}
