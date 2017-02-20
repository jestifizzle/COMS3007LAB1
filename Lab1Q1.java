import java.util.Scanner;

/**
 * Created by jesse on 2017/02/16.
 */
public class Lab1Q1 {

    public static int percept(double[] W, double[] X){
        int out;
        double[] r = new double[W.length];
        double result = 0;
        for (int i = 0; i < W.length; i++){
            r[i] = W[i]*X[i];
            result = result + r[i];
        }
        if (result <= 0){
            out = 0;
        } else {
            out = 1;
        }
        return out;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] inputS = s.split(" ");
        double[] inputW = new double[inputS.length];
        for (int i = 0; i < inputS.length; i++){
            inputW[i] = Double.parseDouble(inputS[i]);
        }
        s = in.nextLine();
        inputS = s.split(" ");
        double[] inputX = new double[inputS.length];
        for (int i = 0; i < inputS.length; i++){
            inputX[i] = Double.parseDouble(inputS[i]);
        }

        int Y = percept(inputW,inputX);

        System.out.println(Y);
        in.close();
    }
}
