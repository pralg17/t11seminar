# t11seminar

Seminari küsimused

http://minitorn.tlu.ee/~jaagup/kool/java/kursused/17/prpohi/kys.txt

Igaüks lisab tunnis määratud teemal tutvustuse omapoolsesse faili + muud kommentaarid, mis üldisest vestlusest võiksid vajalikuna meelde jääda.

13)* JPA andmebaasi ühendumine Spring Boot veebirakenduse juures

Dependency injection - Spring
- Spring on raamistik, mida kasutatakse Javas DI (dependency injection) jaoks.

Spring Boot
- Spring Boot on Spring-i lisa veebirakenduste kirjutamiseks.
  
Controller
-üks klass, mille annoteerid @SpringBootApplication annotatsiooniga ning main-meetodis kutsud SpringApplication.run() meetodit.
-kontroller-klass, mille annoteerid @RestController annotatsiooniga. Kontrolleri sisse üks meetod, mis vastab päringutele. See meetod on vaja annoteerida @RequestMapping.

JPA-Java Persistence API- klasside ja meetodite kollektsioon andmete püsivaks talletamiseks andmebaasidesse.
-Andmebaasi objekti talletamine ajutisse mällu
-Lisatakse projektile Spring Boot sõltuvus ning üks annoteeritud entity klass.

data access object (DAO). 
-Loo entity klassi jaoks repositoorium (interface), mis laiendab tüüpi CrudRepository.
-Käivita rakendus ning mine brauseriga lehele

crud controller
-Lisa kontrollerisse juurde kaks meetodit:
-Üks, mis sisestab andmebaasi uue entity objekti.
-Teine, mis loeb andmebaasist kõik entity'd.