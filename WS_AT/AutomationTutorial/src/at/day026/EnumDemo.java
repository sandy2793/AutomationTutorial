package at.day026;

import java.util.concurrent.TimeUnit;

enum Month {
	JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), 
	JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);
	int monthNo;
	Month(int monthNo) {
		this.monthNo = monthNo;
	}
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class EnumDemo {
	

	public static void main(String[] args) {
//		Month m = null;
//		switch (m){
//		case JAN:
//			System.out.println("JAN");
//			break;
//		case FEB:
//			System.out.println("FEB");
//			break;
//
//		default: 
//			break;
//		}
//		String str = Month.APR.toString();
//		System.out.println(str);
//		System.out.println(Month.APR);
		
		Day d = Day.SATURDAY;
		System.out.println(d.isWeekend());
		
		for (Month mm : Month.values()) {
			System.out.println(mm.monthNo+" "+mm);
		}
		
	}

}
