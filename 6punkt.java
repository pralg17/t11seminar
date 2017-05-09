Klassi kasutamine staatiliste funktsioonide kogumikuna (moodulina)

Näide sellisest klassist.

public class Massiiv2{
	public static int summa(int[] m){
		int abi=0;
		for(int i=0; i<m.length; i++){
			abi+=m[i];
		}
		return abi;

	}
	//Looge alamprogramm massiivi v2hima elemendi leidmiseks
	public static int miinimum(int[] m){
		int abi=m[0];
		for(int i=1; i<m.length; i++){
			if(m[i]<abi){abi=m[i];}

		}
		return abi;
	}
	public static void main(String[] args){
		int[] massid={65, 58, 103, 87};
		int kokku=summa(massid);
		System.out.println(kokku);
		System.out.println(miinimum(massid));
	}
}
