import javax.swing.JOptionPane;

public class Primera {
	public static void main (String args[]){

		int opc = Integer.parseInt(JOptionPane.showInputDialog(null,   "*******************************\n"
				+ "* Para sumar presione 1       *\n"
				+ "* Para multiplicar presione 2 *\n"
				+ "* Para raiz presione 3        *\n"));

		while(opc != 0){
			
			if(opc != 1 && opc != 2 && opc != 3 && opc != 4){
				JOptionPane.showMessageDialog(null, "la opción solicitada no la puedo procesar");
				JOptionPane.showMessageDialog(null, "Gracias por usar el programa de cálculo");
				break;
			}


				int a = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer número"));
				int b = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo número"));
				switch (opc){
				case 1:
					JOptionPane.showMessageDialog(null, "el resultado de la suma es:  "+suma(a,b));
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "el resultado de la multiplicación es:  "+mul(a,b));
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "la raíz cuadrada de : "+a+" es "+raiz(a));
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "el resultado de la suma es:  "+resta(a,b));
					break;

				default: JOptionPane.showMessageDialog(null, "el resultado no puede calcularse:");
				}
				opc = Integer.parseInt(JOptionPane.showInputDialog(null,   "*******************************\n"
						+ "* Para sumar presione 1       *\n"
						+ "* Para multiplicar presione 2 *\n"
						+ "* Para raiz presione 3        *\n"));
				if(opc ==0){
					JOptionPane.showMessageDialog(null, "Gracias por usar el programa de cálculo");
				}	
		}


	}
	public static int suma (int a, int b){		
		int suma = 0;

		suma = a + b;

		return suma;
	}

	public static int mul (int a, int b){		
		int suma = 0;

		suma = a * b;

		return suma;
	}

	public static double raiz (int numero){
		return Math.sqrt(numero);
	}

	public static int resta (int a, int b){		
		int resta = 0;

		resta = a - b;

		return resta;
	}



	public static String manuelPerra (int a, char b){
		String bitch = "";

		if (a == 4 || b == 'a'){
			bitch = "manuel es marica";
		}else if (a == 3 && b =='b'){
			bitch = "manuel es medio marica";
		}else{
			bitch ="manueles maricon completamente";
		}

		return bitch;
	}
}
