package mariam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Kasutus{

	
	
	public static void main (String[] args){
		 // TEEN MUUTUJAD, MIS ON SEOTUD KLASSIDEGA
		Euroks yks = new Euroks();
		Dollariks kaks = new Dollariks();
		Rublaks kolm = new Rublaks();
		
		//NENDE ABIL KASUTAN KLASSIDE FUNKTSIOONE
		System.out.println(yks.dollarEuroks(4.0));
		System.out.println(kaks.eurodDollariks(4.0));
		System.out.println(kolm.eurodRublaks(4.0));
		System.out.println(yks.rublaEuroks(400.0));
		System.out.println(kolm.dollaridRublaks(5.0));
		System.out.println(kaks.rublaDollariks(500.0));
		
		
		
		
	}
}
//scl enable rh-maven33 bash
//mvn package
//java -jar target/testimine-1.jar