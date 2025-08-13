public class SecondLargetsAndMinimum {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int firstMax=-1,secondMax=-1;
        int firstMin=Integer.MAX_VALUE,secondMin=Integer.MAX_VALUE;
        for(int num:a){
            if(num>firstMax){
                secondMax=firstMax;
                firstMax=num;
            }else if(num>secondMax){
                secondMax=num;
            }

            if(num<firstMin){
                secondMin=firstMin;
                firstMin=num;
            }else if(num<secondMin){
                secondMin =num;
            }
        }
        System.out.println(firstMax+" --> "+secondMax);
        System.out.println(firstMin+" --> "+secondMin);
    }
}
