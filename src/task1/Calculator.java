package task1;

public class Calculator {
    private float result=0.0f;

    public Calculator() {
    }

    public Calculator(float result) {
        this.result = result;
    }
    public void add(float value){
        result+=value;
    }
    public void sub(float value){
        result-=value;
    }
    public void mult(float value){
        result*=value;
    }
    public void div(float value){
        result/=value;
    }
    public void pow(int value){
        //since power is a complicated that changes what it does based on the exponent we need severa conditions
        if (value == 0){
            result = 1;
            return;
        }
        float num = result;
        for (int i = 1; i < Math.abs(value); i++) {
           result *=num;
        }
        //instead of making a seperate loop where we divide the number instead of multiply it its faster to just flip it
        if(value<0){
            result = 1/result;
        }
    }
    public float getResult(){
        return result;
    }
    public float abs(){
        //could've just used the Math.abs function but it would've ruined the point I guess
        float num = result;
        if(num<0){
            num = 0-num;
        }
        return num;
    }

}
