package Exercise_1_Package;

public class Refined_Triangle_Area_Class {
    public static void main(String[] args) {

        double triangleSideOne = 4902.5984123;
        double triangleHeightOne = 2332.1251212;

        double triangleArea = (triangleSideOne * triangleHeightOne) / 2;

        System.out.println("The area of the triangle is " + triangleArea);

        int intSide = (int) triangleSideOne;
        int intHeight = (int) triangleHeightOne;

        int intArea = (intSide * intHeight) / 2;

        System.out.println("The rounded area of the triangle is " + intArea);
    }
}
