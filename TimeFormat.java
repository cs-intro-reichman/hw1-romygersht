// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        // all the "if" actions in this code has the same content; i wrote notes only in the first one
		
		if (hours>0 && hours<12 || hours ==00) 
		// "am" cases 
		{
			if (minutes<10 || minutes==00) {
				// printing 0 before the minutes that less them 10 (single digit)
				System.out.print(hours+":"); 
				System.out.print("0"+minutes);
				System.out.println(" AM");
			}
			if (minutes>=10) {
				// printing without adding 0
            System.out.print(hours+":"); 
			System.out.print(minutes);
			System.out.println(" AM");
			}
		}

		if (hours==12)
		// this hour is a private case; at all the other "pm" cases, i need to subtract in 12 exept here
		{
			if (minutes<10 || minutes==00) {
				System.out.print(hours+":"); 
				System.out.print("0"+minutes);
				System.out.println(" PM");
			}
			if (minutes>=10) {
		    System.out.print(hours+":");
		    System.out.print(minutes);
		    System.out.println(" PM");
			}
		}
        
		if (hours>12 && hours<=23)
		// "pm" cases
		 {
			hours = hours - 12; // changing the hours to much the format (between 0-12)
			if (minutes<10 || minutes==00) {
				System.out.print(hours+":"); 
				System.out.print("0"+minutes);
				System.out.println(" PM");
			}
			if (minutes>=10) {
			System.out.print(hours+":");
		    System.out.print(minutes);
		    System.out.println(" PM");
			}
		}
	}
}