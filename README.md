#Andmete sisestamiseks erinevad andmetyybid

**Täisarvud:**

* `Byte` - 1 bait'i pisike täisarv. **Vahemik: -128 ~ 127**
* `Short` - 2 bait'i lühike täisarv. **Vahemik:-32768 ~ 32767**
* `Int`	- 4 bait'i täisarv. **Vahemik: -2147483648 ~ 2147483647**
* `Long` - 8 bait'i pikk täisarv. **Vahemik: -9223372036854775808 ~ 9223372036854775807**
    * math.BigInteger - x bait'i konstrueeritav. **Vahemik: x ~ y**

**Murdarvud/komakohaarvud:**

* `Float` - 4 bait'i väike murdarv. **Vahemik: 2^-126 ~ (2-2^-23)2^127**
* `Double` - 8 bait'i murdarv. **Vahemik: 2^-1022 ~ (2-2^-52)2^1023**
    * math.BigDecimal - x bait'i konstrueeritav. **Vahemik: x ~ y**

**Muu:**

* `Void` - 0 bait'i null operaator. **Pole parameetreid(väärtuseid).**
* `Boolean` - 1/8 bait'i kahendväärtus. **Vahemik: false ~ true**
* `Char` - 2 bait'i tähtmärk. **Vahemik: Unicode 0 ~ 65535**
* `String` - 4 bait-4GB sõne iga element. **Vahemik: Unicode 0 ~ 65535**
