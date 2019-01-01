package com.muaaz.timetable

data class Hobby(var title: String)
data class Hobby01(var title: String)
data class Hobby02(var title: String)
data class Hobby03(var title: String)
data class Hobby04(var title: String)
data class Hobby05(var title: String)

object Supplier {

    val hobbies = listOf<Hobby>(
            Hobby("9.00  - 9.55     ITC/VLSI"),
            Hobby("9.55  - 10.50    TLW"),
            Hobby("11.10 - 12.05    DC"),
            Hobby("12.05 - 1.00     C++/FO/ASP"),
            Hobby("1.00  - 1.55     LUNCH BREAK"),
            Hobby("1.55  - 2.50     LIC"),
            Hobby("2.50  - 3.40     ESD")
    )

    val hobbies01 = listOf<Hobby01>(
            Hobby01("9.00  - 9.55     LIC"),
            Hobby01("9.55  - 10.50    ITC/VLSI"),
            Hobby01("11.10 - 12.05    LIC"),
            Hobby01("12.05 - 1.00     DC"),
            Hobby01("1.00  - 1.55     LUNCH BREAK"),
            Hobby01("1.55  - 2.50     TLW"),
            Hobby01("2.50  - 3.40     DC")
    )

    val hobbies02 = listOf<Hobby02>(
            Hobby02("9.00  - 9.55     BC LAB(B1)/LIC LAB(B2)"),
            Hobby02("9.55  - 10.50    BC LAB(B1)/LIC LAB(B2)"),
            Hobby02("11.10 - 12.05    BC LAB(B1)/LIC LAB(B2)"),
            Hobby02("12.05 - 1.00     C++/FO/ASP")
    )

    val hobbies03 = listOf<Hobby03>(
            Hobby03("9.00  - 9.55     LIC"),
            Hobby03("9.55  - 10.50    DC"),
            Hobby03("11.10 - 12.05    ITC/VLSI"),
            Hobby03("12.05 - 1.00     TLW")
    )

    val hobbies04 = listOf<Hobby04>(
            Hobby04("9.00  - 9.55     ITC/VLSI"),
            Hobby04("9.55  - 10.50    LIC"),
            Hobby04("11.10 - 12.05    DC"),
            Hobby04("12.05 - 1.00     C++/FO/ASP")
    )

    val hobbies05 = listOf<Hobby05>(
            Hobby05("9.00  - 9.55     BC LAB(B1)/LIC LAB(B2)"),
            Hobby05("9.55  - 10.50    BC LAB(B1)/LIC LAB(B2)"),
            Hobby05("11.10 - 12.05    BC LAB(B1)/LIC LAB(B2)"),
            Hobby05("12.05 - 1.00     TLW")
    )
}