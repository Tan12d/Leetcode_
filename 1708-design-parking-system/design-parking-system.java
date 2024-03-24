class ParkingSystem {

    int n[] = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        n[0]=big;
        n[1]=medium;
        n[2]=small;
    }
    
    public boolean addCar(int carType) {
        if(n[carType-1]>0)
        {
            n[carType-1]--;
            return true;
        }

        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */