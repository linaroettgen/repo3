package h3;

public class h3main {
	public static void main(String[] args) {
		int max = 50;
		int fix = 40;
		int wartend = 20;
		boolean istVoll = true;
		
		int freieplätze = max - fix;
		
		if (freieplätze > 0 && wartend > 0) {
			if (freieplätze >= wartend) {
				fix = fix + wartend;
				wartend = 0;
			} else {
				if (freieplätze > 0 && wartend > freieplätze) {
					fix = fix + freieplätze;
					wartend = wartend - freieplätze;
				} 
				if (fix == max) {
					istVoll = true;
				} else {
					if (max > fix) {
						istVoll= false;
					}
				}
				System.out.print("fixplätze" + fix);
				System.out.print("wartend" + wartend);
				System.out.print(istVoll);
			}
		}}}