//# java
//task 1
package calculator;

public class percentage{

    public static void main (String[] args){
    int java=100;
    int dsa=90;
    int c=95;
    int sum=java+dsa+c;
    float avgper=(sum/3);
    String grade;
    if(avgper>=90) {
        grade = "A";
    }else if (avgper>=80){
        grade = "B";
    }else if (avgper>=70){
        grade = "C";
    }else if (avgper>=60){
        grade = "D";
    }else if (avgper>=50){
        grade = "E";
    }else{
        grade = "Fail";
    }
    System.out.println("average percentage is :" + avgper);
    System.out.println("Grade : "+grade);
}
}
