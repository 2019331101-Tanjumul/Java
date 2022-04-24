class box { 

    double width;
    double height; 
    double depth;

    //computing and returning the volume 

    double volume(){
        return width*height*depth; 
    }

}

class demobox4 {
    public static void main(String[] args ){ 

Box mybox1 = new Box(); 
Box mybox2 = new Box(); 

double vol; 

//Assinging the values of mybox1 instance variables

mybox1.width =10; 
mybox1.height = 20; 
mybox1.depth = 15; 

//Assigning the values of the mybox2 instance variables 

mybox2.width =10; 
mybox2.height = 20; 
mybox2.depth = 15; 


//lets get the volume of the first box 

vol = mybox1.volume(); 
System.out.println("Volume is "+ vol); 

//for the second box 
vol = mybox2.volume();
System.out.println("Volume of the second box is "+ vol); 
    }
}