import java.util.Scanner; 
class RideBillCalculator{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter your Height in cm : "); 
        int height=sc.nextInt(); 
        int photoPrice = 3; 
        if(height<120){ 
            System.out.println("Sorry you are not eligible ride"); 
        } 
        else{ 
            System.out.println("You can ride !!"); 
            System.out.println("Enter your age : "); 
            int age=sc.nextInt(); 
            if(age<12){ 
                System.out.println("For photos you will have to pay 3$ extra!!"); 
                System.out.println("Do you want to take photos : "); 
                String wantPhotos=sc.next(); 
                if(wantPhotos.equalsIgnoreCase("no")){ 
                    System.out.println("your ride bill is 5$"); 
                } 
                else if(wantPhotos.equalsIgnoreCase("yes")){ 
                    System.out.println("your ride bill is "+(5+photoPrice)+"$"); 
                } 
                else{ 
                    System.out.println("Invalid entry !!"); 
                } 
            } 
            else if(age>=12 && age <18){ 
                System.out.println("For photos you will have to pay 3$ extra!!"); 
                System.out.println("Do you want to take photos : "); 
                String wantPhotos=sc.next(); 
                if(wantPhotos.equalsIgnoreCase("no")){ 
                    System.out.println("your ride bill is 7$"); 
                } 
                else if(wantPhotos.equalsIgnoreCase("yes")){ 
                    System.out.println("your ride bill is "+(7+photoPrice)+"$"); 
                } 
                else{ 
                    System.out.println("Invalid entry !!"); 
                } 
            } 
            else if(age>=18 && age <45){ 
                System.out.println("For photos you will have to pay 3$ extra!!"); 
                System.out.println("Do you want to take photos : "); 
                String wantPhotos=sc.next(); 
                if(wantPhotos.equalsIgnoreCase("no")){ 
                    System.out.println("your ride bill is 12$"); 
                } 
                else if(wantPhotos.equalsIgnoreCase("yes")){ 
                    System.out.println("your ride bill is "+(12+photoPrice)+"$"); 
                } 
                else{ 
                    System.out.println("Invalid entry !!"); 
                } 
            } 
            else if(age>=45 && age <=55){ 
                System.out.println("For photos you will have to pay 3$ extra!!"); 
                System.out.println("Do you want to take photos : "); 
                String wantPhotos=sc.next(); 
                if(wantPhotos.equalsIgnoreCase("no")){ 
                    System.out.println("your ride bill is 0$"); 
                } 
                else if(wantPhotos.equalsIgnoreCase("yes")){ 
                    System.out.println("your ride bill is "+(0+photoPrice)+"$"); 
                } 
                else{ 
                    System.out.println("Invalid entry !!"); 
                } 
            } 
            else{ 
                System.out.println("considering your age you are not eligible for ride"); 
            } 
        } 
    } 
}
