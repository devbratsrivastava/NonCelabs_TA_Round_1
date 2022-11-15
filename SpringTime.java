import java.util.*;
public class SpringTime
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double velocity = scan.nextInt();
		System.out.println("The velocity of the leaf falling down is: " + velocity + " cm/s");
		double time_taken= reach_ground(velocity);
		System.out.print("Time taken to reach the ground is: "+ time_taken + " s");
	}
	public static double reach_ground(double velocity){
	    //initially the velocity is given as 5cm/s and the time is given as 80s 
		//so from the formula of speed = distance/time we get d= 400 5cm
		double velocity_example = 5;
		double time_example = 80;
		double distance= velocity_example * time_example;
		System.out.println("The distance of the branch from the ground is: " +distance +" cm");
		if (velocity<=0 ) return 0;
		double ans= distance/velocity;
		return ans;
	}
}
