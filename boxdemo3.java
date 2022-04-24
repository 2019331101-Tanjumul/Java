class Box{

    double width;
    double height; 
    double depth;

    //it display the volume of a box 

    void volume() {
        System.out.println("Volume is "); 
        System.out.println(width*height*depth); 

    }

    public void setdim(int i, int j, int k) {
    }

}  

public class boxdemo3{

public static void main(String[] args){

Box mybox1 = new Box(); 
Box mybox2 = new Box(); 

//Assigning values to mybox1;s instance variables
mybox1.width =10; 
mybox1.height = 20; 
mybox1.depth = 15; 

//let's assign different values to mybox2's instance variables 

mybox2.width = 3; 
mybox2.height = 6; 
mybox2.depth = 9; 

// let's call here the first volume of box 
mybox1.volume();

// calling the second volume of the box 
mybox2.volume(); 

   }

 }


