
    int top=-1;
    int[]arr;
    public stack(int size) {
        arr = new int[size];
    }
    int push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is full");
            return -1;
        }else{
            top++;
            arr[top]=data;
            return 1;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            top--;
            return arr[top+1];
        }
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    } 
    
}
