class Box {
double weight; 
double height; 
double depth;

Box(double w , double h , double d )
{ 

weight = w; 
height = h; 
depth = d; 

}
double volume(){

    return height*weight*depth;  
}

}

class boxdemo7 { 

public static void main(String[] args){

    Box mybox1 = new Box(10 , 20 , 15); 
    
    Box mybox2 = new Box(3,6,9); 

    double vol;

    vol = mybox1.volume();
      
System.out.println("The volume of the first one is "+ vol); 

vol = mybox2.volume(); 
System.out.println("The volume of the second one is "+ vol); 
}

}
