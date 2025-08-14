public class LabelForLoop {
   public static void main(String[] args){
    OuterLoop:
        for(int i=0;i<5;i++){
            System.out.println(i);
            InnerLoop:
                for(int j=2;j<10;j++){
                    if(j==5)
                     break OuterLoop;
                     System.out.println(j);
                     if(j==9)
                     break InnerLoop;
                }
        }
   } 
}
