package pkgbreak;

public class Break {
    public static void main(String[] args) {
        boolean t=true;
        first:{
            second:{
                third:{
                    System.out.println("Before the Break.");
                    if(t)
                        break second;
                    System.out.println("this wont excuse");
                }
                 System.out.println("this wont excuse");               
            }
            System.out.println("this is after second block");
        }
    }    
}
