//18253069 Günseli ÇOLAK

import java.util.Stack;

public class Odev2 {
    
    public static String result;
    
    /**
    * Postfix biçiminde verilen metni ExpressionTree sınıfına dönüştürür
    * @param girdi postfix girdi metni
    * @return Oluşturulan ifade ağacı
    */
	public static ExpressionTree postfixToExpressionTree(String girdi) throws Exception {
		
        Stack<BTNode> stack = new Stack<>();

        String[] stringArray = girdi.split(" ");

        for (String string : stringArray) {
            if (Character.isDigit(string.charAt(0))){
                stack.push(new BTNode(string, null, null));
            }
            else if (isOperator(string)){

                BTNode temp1 = stack.pop(); // right
                BTNode temp2 = stack.pop(); //left

                stack.push(new BTNode(string, temp2, temp1));
            }
            else{
                throw new Exception("The string is not a number or an operator.");
            }
        }
        return new ExpressionTree(stack.pop());
	}
	
	public static boolean isOperator(String string) {

		switch (string) {	
		    case "^":
			case "*":
			case "/":
			case "+":
			case "-":	
				return true;
			default:
				return false;
		}
	}
	
    /**
    * Parametre olarak verilen ifade ağacını değerlendirir(sonucunu hesaplar).
    * @param agac İfade ağacı
    * @return İfade ağacının sonucu
    */
	public static int evaluateExpressionTree(ExpressionTree agac) {
		
		BTNode root = agac.getRoot();
		
		result = "";
		
		postOrderRoot(root);

		return postfixDegerlendir(result);
	}
	
	public static void postOrderRoot(BTNode root) {
		
		if (root.left != null)
			postOrderRoot(root.left);
		
		if (root.right != null)
			postOrderRoot(root.right);
		
		result += root.value + " ";	
	}
	
	public static int postfixDegerlendir(String girdi) {
		
		Stack<Integer> pstack =new Stack<>();

        String[] stringArray = girdi.split(" ");
        
        int result =0;
        
        for (String string : stringArray) {

            if (Character.isDigit(string.charAt(0))){
                pstack.push(Integer.parseInt(string));
            }
            else{

                int d1=pstack.pop();
                int d2=pstack.pop();

                switch (string) {

                    case "^":
                        result = d2 ^ d1;
                        break;
                    case "*":
                        result = d2 * d1;
                        break;
                    case "/":
                        result = d2 / d1;
                        break;
                    case "+":
                        result = d2 + d1;
                        break;
                    case "-":
                        result = d2 - d1;
                        break;
                    default:
                        break;
                }
                pstack.push(result);
            }

        }
        return pstack.pop();
	}
}
