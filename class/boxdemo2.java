


    
class Box{
    double width;
    double height; 
    double depth;
    public void setdim(int i, int j, int k) {
    }
    public double volume() {
        return 0;
    }

}
 class boxdemo2 {
     public static void main (String[] args ){
Box mybox1 = new Box(); 
Box mybox2 = new Box(); 
double vol; 


mybox1.width = 10;
mybox1.height = 20; 
mybox1.depth = 15; 


//again assinging the values for the mybox2 


mybox2.width = 3;
mybox2.height = 6; 
mybox2.depth = 9; 



vol = mybox1.width * mybox1.height * mybox1.depth;

System.out.println("Volume for mybox1 is "+ vol); 


// computing volume for the second box mybox2

vol = mybox2.width * mybox2.height * mybox2.depth;

System.out.println("Volume for the mybox2 is "+vol);
     }
 }   

