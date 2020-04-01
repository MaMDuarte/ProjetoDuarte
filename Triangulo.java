import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		String crescente = "";
		int valor= Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		for (int i = 1; i <= valor; i++) {
			crescente += "# ";
			System.out.println(crescente);
		}
		
	}

}
