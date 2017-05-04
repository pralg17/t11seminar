# t11seminar

Seminari küsimused

http://minitorn.tlu.ee/~jaagup/kool/java/kursused/17/prpohi/kys.txt

Igaüks lisab tunnis määratud teemal tutvustuse omapoolsesse faili + muud kommentaarid, mis üldisest vestlusest võiksid vajalikuna meelde jääda.
___

Joone arvutamise valem võiks välja näha umbes järgmiselt:

Lisaklass JavaScripti näitel:

class joonevõrrand extends lineaarvõrrand (a,b) {
    super(a,b);
    leiaX(double: x) {
        return ((this.a*x)+b)
    }
}

Päringu vastu võtmine ning arvutus toimuks Node Express najal järgmiselt:

app.get("/LV/joonepunkt/:x", (req,res)) {
    res.send(`Joon lõikub Y-teljega punktis ${joonevõrrand.leiaX(req.params.x)}.`)
}
