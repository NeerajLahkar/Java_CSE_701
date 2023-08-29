class sub_Array{
    public static void main (String args[]){
        int num[]={80,50,60,90};
        double result=0;
        int i;
        for(i=0;i<4;i++){
            result=result+num[i];
        }
        System.out.println(result/4);
    }
}