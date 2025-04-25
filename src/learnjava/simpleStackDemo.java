package learnjava;

public class simpleStackDemo {
    char[] data;
    int tos;

    simpleStackDemo(int size){
        data = new char[size];
        tos = 0;
    }
    void push(char ch){
        if(isFull()){
            System.out.println("------- The stack is full ----------");
            return;
        }
        else{
            data[tos] = ch;
            tos++;
        }
    }
    char pop(){
        if(isEmpty()){
            System.out.println("-------- The stack is empty ------------");
            return (char) 0;
        }
        else{
            tos--;
            return data[tos];
        }
    }
    boolean isFull(){
        return tos == data.length;
    }
    boolean isEmpty(){
        return tos == 0;
    }
    public static  void main(String[] args){
    int i;
    char ch;

    simpleStackDemo ssd = new simpleStackDemo(10);
        System.out.println("Pushing 10 items into the stack");
            for(ch = 'A'; ch < 'K'; ch++){
                System.out.print(ch);
                ssd.push(ch);
            }
            System.out.println();
        System.out.println("Popping out 10 items from the stack");
        for(i=0; i<10; i++){
            ch = ssd.pop();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println();

        System.out.println("Using isEmpty and isFull to fill and empty the stack");

        System.out.print("Pushing: ");
        for(ch = 'A'; !ssd.isFull(); ch++){
            System.out.print(ch);
            ssd.push(ch);
        }
        System.out.println();
        System.out.println();

        System.out.print("Popping: ");
        while(!ssd.isEmpty()){
            ch = ssd.pop();
            System.out.print(ch);
        }
        System.out.println();
        System.out.println();

        System.out.println("Generate errors, use a 4-element stack");

        simpleStackDemo ssd1 = new simpleStackDemo(4);

        System.out.print("Pushing: ");
        for(ch = '1'; ch<'6'; ch++){
            System.out.print(ch);
            ssd1.push(ch);
        }
        System.out.println();
        System.out.println();
        System.out.print("Popping: ");
        for(i=0; i<5; i++){
            ch = ssd1.pop();
            System.out.print(ch);
        }

    }
}
