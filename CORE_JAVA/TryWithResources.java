import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TryWithResources{
    public static void main(String args[]) throws NumberFormatException, IOException{
        
        int i=1;
        int j=0;
        int num =0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            j = 18/i;

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }
    }
}