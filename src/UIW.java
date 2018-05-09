import javax.swing.JOptionPane;

public class UIW {
public static void main(String[] args) {
	System.out.print("1 1");
	int num1= 1;
	int num2= 1;
	String fibba=JOptionPane.showInputDialog("How many fibonacci sequences.");
	int fib=Integer.parseInt(fibba);
	for (int i=0;i<fib;i++){
		int sum= num1+num2;
		System.out.print(" "+sum+" ");
		num1=num2;
		num2=sum;
	}
}
	
} 

