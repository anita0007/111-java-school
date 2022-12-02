public class User{
	public static void main(String[] args){
        Car[] myCar = new Car[4];
        
        for (int x = 0;x<4;x++) {
            myCar[x] = new Car();
            myCar[x].wheel1 = x;
            myCar[x].wheel2 = x+1;
            myCar[x].wheel3 = x+2;
            myCar[x].wheel4 = x+3;
            int z = myCar[x].lanuch(7);
            System.out.println(z);
        }
        
	}
}
        