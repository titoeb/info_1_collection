public class Dec2bin {
    public static void main(String args[]) {
        int input = Integer.parseInt(args[0]);
        String output = "";
        for(int i = 0; input > 0; i++){
            if(i > 0 && i % 4 == 0){
                output =  input % 2 + "'" + output;
            } else {
                output = input % 2 + output;
            }
            input /=  2;
        }
       if(output.length() > 4){
            while(output.length() % 5 != 4) output = "0" + output;
        }
        System.out.println(output);
    }
}

