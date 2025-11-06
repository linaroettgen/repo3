package h1;

public class h1main {
	public static void main(String[] args) {
 double guthaben = 5000.0;
 double einkommen = 3000.0;
 int rating = 0;
 boolean warnhinweis = false;
 boolean negativ;
		 if (guthaben < 0) {
			 negativ = true;}
		  
		 else { negativ = false;} 
		 
	
   // rating berechnen
  if (guthaben > 0) {
	rating += 3;
}
  if ( guthaben == 0) {
	  rating += 2;
  }
	if (guthaben < 0 && einkommen >= -guthaben) {
		rating += 1;
	}
	if (guthaben < 0 && einkommen < -guthaben) {
		rating -= 1;
	}
	
	// warnhinweis
	if (einkommen < -guthaben && rating < 0) {
		warnhinweis = true;
	} else {
		warnhinweis = false;
	}
		System.out.print("rating" +rating);
		System.out.print(warnhinweis);
		
	}
}

