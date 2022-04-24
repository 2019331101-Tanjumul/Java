class box { 

    double width;
    double height; 
    double depth;

    double volume(){
        return width*height*depth; 
    }



void setdim(double w, double h,double d){
    width = w; 
    height = h; 
    depth = d;

}

} 


class boxdemo5 {
    public static void main (String[] args){

 Box mybox1 = new Box(); 
 Box mybox2 = new Box(); 

 double vol; 

mybox1.setdim(10,20,15); 
mybox2.setdim(3,6,9); 

vol = mybox1.volume(); 
System.out.println("Volume is " +vol); 

vol = mybox2.volume();
System.out.println("Volume is" + vol); 


    }
}