class Stack { 
    int stck[] = new int[10];
int tos; 

//initializing the top of the stack 

Stack(){ 
tos = -1;

}
//pushing the item to the stack 

void push (int item){ 
    if(tos==9)
    System.out.println("Stack is full"); 
    else 
    stck[++tos] = item; 

}


//poping a item from the stack 

int pop() { 

    if(tos < 0){ 
        System.out.println("Stack Underflow "); 
        return 0;
    }
else 
return stck[tos--];
}


}