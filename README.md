# t11seminar

Seminari küsimused

http://minitorn.tlu.ee/~jaagup/kool/java/kursused/17/prpohi/kys.txt

Igaüks lisab tunnis määratud teemal tutvustuse omapoolsesse faili + muud kommentaarid, mis üldisest vestlusest võiksid vajalikuna meelde jääda.
***************************
Andmepäringute koostamine liidesekäskude abil - järjestamine, filtreerimine

* liides halduri jaoks (data access object e DAO), mis laiendab tüüpi CrudRepository
* Vajalik lisada @Transactional annotatsioon
Siin saab defineerida omaloodud päringutüüpe määratud objekti kohta (nt otsimine perekonnanime järgi või välja filteerida etteantud kogusest suurema/väiksemad väärtused).

* Näide DAO liidese imporditavatest teekidest ja annotatsioonist:
* Haldur.java
```
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface Haldur extends CrudRepository<MinuObjekt, String>{
	List<Obejkt> findByperekonnanimi(String perekonnanimi);
	List<Objekt> findAllByOrderBy();
	List<Objekt> findByEmailEpostAndNimi(String epost, String nimi);
	List<Objekt> findByalgusLike(String algus);
	List<Objekt> findBykogusLessThan(float kogus);
	List<Objekt> findBykogusGreaterThan(float kogus);
}
```
*(http://docs.spring.io/spring-data/jpa/docs/1.3.4.RELEASE/reference/html/jpa.repositories.html)

* klassis, kus eksemplarid luuakse

```
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   //et tabel luua antud klassi põhjal
@Table(name="tabelinimi")
public class Isik{
	@Id      //annotatsioon primaarvõtme järgi(nimi) küsimiseks
        public String nimi;
 	public float hind;
	public float kogus;
}
```

* rakenduse fail
```
public class Rakendus {

import org.springframework.beans.factory.annotation.Autowired;  

@Autowired
private Haldur haldur;

public void p2ringud() {
     Isik p = new Isik();
     Isik p = haldur.findBynimi("Kask");
     Isik p = findBysaldoLessThan(float kogus);

   }
```
 
