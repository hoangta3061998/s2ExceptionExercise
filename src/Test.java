public class Test {
    public static void main(String[] args) {
try {
    Triangle t = new Triangle(1,2,3);
}catch (IllegalTriangleException e){
    System.err.println("Invalid input");
}
    }
}
