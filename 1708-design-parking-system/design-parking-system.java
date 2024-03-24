class ParkingSystem {

    int n[] = new int[4];

    public ParkingSystem(int big, int medium, int small) {
        n[0]=0;
        n[1]=big;
        n[2]=medium;
        n[3]=small;
    }
    
    public boolean addCar(int carType) {
        if(n[carType]>0)
        {
            n[carType]--;
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