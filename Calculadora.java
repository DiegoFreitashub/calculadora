import java.util.Scanner;
  	class Calculadora {

  		
  		
  		public static double soma(double N1,double N2) {
  			return N1+N2;
  		}
  		public static double subtracao(double N1, double N2) {
  			return N1-N2;	
  		}
  		public static double multiplicacao(double N1, double N2) {
  			return N1*N2;
  		}
  		public static double divisao(double N1, double N2) {
  			return N1/N2;
  		}
  	
  		public static void main(String[]args) { 
  			Scanner sc = new Scanner(System.in);
  			
			System.out.println("Informe o primeiro numero: ");		
			double N1 = sc.nextDouble();
			System.out.println("Informe o segundo numero: ");
			double N2 = sc.nextDouble();
			sc.close();
  		
			double som = soma(N1,N2);
			double sub = subtracao(N1,N2);
			double multi = multiplicacao(N1,N2);
			double div = divisao(N1,N2);
			
  			
			System.out.println(som);
			System.out.println(sub);
			System.out.println(multi);
			System.out.println(div);

  		}		
  	
  	}
