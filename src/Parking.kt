data class Parking(val vehicles : MutableSet<Vehicle>){

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


}
