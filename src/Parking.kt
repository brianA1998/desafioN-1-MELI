class Parking(val vehicles : MutableSet<Vehicle>){

    lateinit var vehiclesQuantity : Pair<Int,Int>

    //Verified capabilities the Parking
    fun addVehicle(vehicles: MutableSet<Vehicle>) {
        if(vehicles.size <= 20){
            vehicles.forEach {
                checkIn(true)
            }
        }else{
            checkIn(false)
        }
    }

        //Verified the check-in
        private fun checkIn(result : Boolean){
            if(result){
                println("Welcome to AlkeParking!")
            }else{
                println("Sorry, the check-in failed")
            }
        }

    //Get gain and quantity of vehicles
    fun gainInfo(){
        println("${vehiclesQuantity.first} vehicles have checked out and have earnings of ${vehiclesQuantity.second}")
    }

    //list of plates of vehicles
    fun listVehicles() {
        vehicles.forEach {
            println("${it.plate}")
        }
    }


}
