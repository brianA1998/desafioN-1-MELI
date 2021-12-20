data class Parking(val vehicles : MutableSet<Vehicle>){

    //Verified capabilities the Parking
    fun addVehicle(vehicle : Vehicle) {
        if(vehicles.size <= 20){
            checkIn(true)
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
