public class Main {
    public static void main(String[] args) {
        FractionUse f1 = new FractionUse(20, 30);
        f1.Print();
        f1.setNum(12);
        int d = f1.getDen();
        System.out.println(d);
        f1.Print();

        f1.setNum(10);
        f1.setDen(30);
        f1.Print();

        FractionUse f2 = new FractionUse(3, 4);
        f1.add(f2);
        f1.Print();
        f2.Print();

        FractionUse f3 = new FractionUse(4, 5);
        f3.multiply(f2);
        f3.Print();
        f2.Print();

        FractionUse f4 = FractionUse.add(f1, f3);
        f1.Print();
        f3.Print();
        f4.Print();

    }
}


class FractionUse{
    private int num,den;


    public FractionUse(){
        num=0;
        den=0;
    }
    public FractionUse(int num,int den){
        this.num=num;
        if(den == 0){
            //TODO error out
        }
        this.den=den;
        simplify(); //To change 10/20 to 1/2
    }
    public int getDen(){
        return den;
    }
    public int getNum(){
        return num;
    }
    public void setDen(int n){
        if(den == 0){
            return ;
        }
        this.den=n;
        simplify();
    }
    public void setNum(int n){
        this.num=n;
        simplify();
    }

public void Print(){
        if(den == 1){
            System.out.println(num);
        }
        else{
            System.out.println(num+"/" +den);
        }
}

    private void simplify(){
        int gcd=1;
        int smaller=Math.min(num,den);
        for(int i=2;i<=smaller;i++){
            if(num % i == 0 && den %i == 0){
                gcd=i;
            }
        }
        num=num/gcd;
        den=den/gcd;

    }

    //f1 fraction should not change
    public static FractionUse add(FractionUse f1,FractionUse f2){
        int newnum=f1.num *f2.den + f1.den*f2.num;
        int newden=f1.den * f2.den;
        FractionUse f5=new FractionUse(newnum,newden);
        return f5;
    }
    public void add(FractionUse f2){
        this.num=this.num *f2.den+this.den*f2.num;
        this.den=this.den * f2.den;
        simplify();
    }
    public void multiply(FractionUse f2){
        this.num=this.num * f2.num;
        this.den=this.den * f2.den;
        simplify();
    }

}
