public class Evaluate2 {
    public static void main(String[] args) { 
        Stack<String> ops  = new EVLStack<String>();
        Stack<Double> vals = new EVLStack<Double>();

        while (!StdIn.isEmpty()){// Strings anstatt Einzelzeichen! => Bestandteile ..
            String s = StdIn.readString(); // .. muessen whitespace-getrennt sein!
            if      (s.equals("("))               ;
            else if (s.equals("+")) {
                String op = s;
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
		else if (op.equals("*"))    v = vals.pop() * v;
		// usw.: alle Operatoren
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("/"))    v = vals.pop() / v;
		else if (op.equals("sqrt")) v = Math.sqrt(v); 
                vals.push(v);
            }
            else if (s.equals("*")) {
                String op =s;
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
		else if (op.equals("*"))    v = vals.pop() * v;
		// usw.: alle Operatoren
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("/"))    v = vals.pop() / v;
		else if (op.equals("sqrt")) v = Math.sqrt(v); 
                vals.push(v);
            }
            // usw.: alle Operatoren
            else if (s.equals("-")) {
                String op = s;
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
		else if (op.equals("*"))    v = vals.pop() * v;
		// usw.: alle Operatoren
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("/"))    v = vals.pop() / v;
		else if (op.equals("sqrt")) v = Math.sqrt(v); 
                vals.push(v);
            }
            else if (s.equals("/")) {
                String op = s;
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
		else if (op.equals("*"))    v = vals.pop() * v;
		// usw.: alle Operatoren
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("/"))    v = vals.pop() / v;
		else if (op.equals("sqrt")) v = Math.sqrt(v); 
                vals.push(v);
            }
            else if (s.equals("sqrt")) {
                String op = s;
                double v = vals.pop();
                if      (op.equals("+"))    v = vals.pop() + v;
		else if (op.equals("*"))    v = vals.pop() * v;
		// usw.: alle Operatoren
                else if (op.equals("-"))    v = vals.pop() - v;
                else if (op.equals("/"))    v = vals.pop() / v;
		else if (op.equals("sqrt")) v = Math.sqrt(v); 
                vals.push(v);
            }
            else if (s.equals(")"))			;
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
