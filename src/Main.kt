


import java.util.*

fun main(){
    val car = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("CC333CC",VehicleType.MINIBUS,Calendar.getInstance())
    val bus = Vehicle("DD444DD",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val carRed = Vehicle("FF22DD",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_003")
    val motoBlue = Vehicle("AD000EE",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibusYellow = Vehicle("ED111AA",VehicleType.MINIBUS,Calendar.getInstance(),"DISCOUNT_CARD_004")
    val busGreen = Vehicle("AF012MM",VehicleType.BUS, Calendar.getInstance())
    val carBlack = Vehicle("BA345BB",VehicleType.CAR, Calendar.getInstance())
    val motoGreen = Vehicle("CC898AA",VehicleType.MOTORCYCLE, Calendar.getInstance(),"DISCOUNT_CARD_005")
    val minibusRed = Vehicle("AE444AA",VehicleType.MINIBUS,Calendar.getInstance())
    val busBlue = Vehicle("FF000FF",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_006")
    val carGrey = Vehicle("FJ000AA",VehicleType.CAR, Calendar.getInstance())
    val motoRed = Vehicle("PP000PP",VehicleType.MOTORCYCLE, Calendar.getInstance(),"DISCOUNT_CARD_007")
    val minibusGreen = Vehicle("CC567AA",VehicleType.MINIBUS,Calendar.getInstance())
    val busBlack = Vehicle("BB999BB",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_008")
    val carViolet = Vehicle("CC000CC",VehicleType.CAR, Calendar.getInstance())
    val motoYellow = Vehicle("AD000AD",VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibusBlue = Vehicle("EE444EE",VehicleType.MINIBUS,Calendar.getInstance())
    val busRed = Vehicle("DD111DD",VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_009")
    //val busPurple = Vehicle("EE999EE",VehicleType.BUS, Calendar.getInstance())

    val mutableSetA = mutableSetOf<Vehicle>( car, moto , minibus , bus);
    val parking = Parking(mutableSetOf(car,moto,minibus,bus,carRed,motoBlue,minibusYellow,busGreen,carBlack,motoGreen,
        minibusRed,busBlue,carGrey,motoRed,minibusGreen,busBlack,carViolet,motoYellow,minibusBlue,busRed))
    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))
    parking.addVehicle(parking.vehicles)
    /*parking.addVehicle(bus)
    parking.addVehicle(car)
    parking.addVehicle(moto)
    parking.addVehicle(minibus)
    parking.addVehicle(carRed)
    parking.addVehicle(motoBlue)
    parking.addVehicle(minibusYellow)
    parking.addVehicle(busGreen)
    parking.addVehicle(carBlack)
    parking.addVehicle(motoGreen)
    parking.addVehicle(minibusRed)
    parking.addVehicle(busBlue)
    parking.addVehicle(carGrey)
    parking.addVehicle(motoRed)
    parking.addVehicle(minibusGreen)
    parking.addVehicle(busBlack)
    parking.addVehicle(carViolet)
    parking.addVehicle(motoYellow)
    parking.addVehicle(minibusBlue)
    parking.addVehicle(busRed)*/


    // Checking that a duplicated car can't be added
    val car2 = Vehicle("AA111AA",VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val isCar2Inserted = parking.vehicles.add(car2)
    println(isCar2Inserted)


}