class box { 

    double width;
    double height; 
    double depth;


    // here , this is a constructor 
    void Box() {

System.out.println("Constructing Box");

width = 10; 
height = 10; 
depth = 10; 
    }
//here the return volume 

     double volume(){ 
    return width * height * depth; 

}

}

class boxdemo6{ 

public static void main (String[] args){
    // declare allocat and initializing the box object \

    Box mybox1 = box();
    Box mybox2 = box();

    double vol; 

    //get volumes from the first box 

    vol = mybox1.volume(); 
    System.out.println("The volume of the box1 is "+ vol);

    vol = mybox2.volume(); 
    System.out.println("The volume of the box2 is "+ vol);
}




}