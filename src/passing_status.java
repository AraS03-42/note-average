import java.util.Scanner;

public class passing_status {
    public static void main(String[] args) {
        double turkish,math,physics,chemistry,history,music,average = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Math grade : ");
        math =input.nextDouble();
        if( math >= 0 && math <=100){
            average += math;
            i++;
        }
        System.out.print("Please enter your Physics grade : ");
        physics =input.nextDouble();
        if( physics >= 0 && physics <= 100){
            average += physics;
            i++;
        }
        System.out.print("Please enter your Chemistry grade : ");
        chemistry =input.nextDouble();
        if( chemistry >= 0 && chemistry <= 100){
            average += chemistry;
            i++;
        }
        System.out.print("Please enter your Turkish grade : ");
        turkish =input.nextDouble();
        if( turkish >= 0 && turkish <= 100){
            average += turkish;
            i++;
        }
        System.out.print("Please enter your Music grade : ");
        music =input.nextDouble();
        if( music >= 0 && music <= 100){
            average += music;
            i++;
        }
        average /= i;
        String str = (average >= 55) ? "Passed the Class" : "Failed the Class";
        System.out.println(str);
    }
}
