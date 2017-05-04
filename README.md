# t11seminar

Seminari küsimused

http://minitorn.tlu.ee/~jaagup/kool/java/kursused/17/prpohi/kys.txt

Igaüks lisab tunnis määratud teemal tutvustuse omapoolsesse faili + muud kommentaarid, mis üldisest vestlusest võiksid vajalikuna meelde jääda.

* HttpSessioni abil objekti(de) meeles pidamine brauserisessiooni vältel

HttpSession session = request.getSession();
Object obj = new Object();
session.setAttribute("object", obj);

Hiljem objekti kättesaamiseks:
<%= request.getAttribute("object")%>
