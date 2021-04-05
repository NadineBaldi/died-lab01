package died.lab01.problema02;

public class App {

		public static void main(String[] args) {
			Temperatura dia1 = new Temperatura(30.0,Escala.CELCIUS);
			Temperatura dia2 = new Temperatura(55.0,Escala.FAHRENHEIT);
			System.out.println("T1 en C°: "+dia1.asCelcius());
			System.out.println("T1 en F°: "+dia1.asFahrenheit());
			System.out.println("T2 en C°: "+dia2.asCelcius());
			System.out.println("T2 en F°: "+dia2.asFahrenheit());
			dia2.aumentar(dia1);
			System.out.println("T1+T2 en C°: "+dia2.asCelcius());
			System.out.println("T1+T2 en F°: "+dia2.asFahrenheit());
			dia1.disminuir(new Temperatura(10.0, Escala.CELCIUS));
			System.out.println("T1 en C°: "+dia1.asCelcius());
			System.out.println("T1 en F°: "+dia1.asFahrenheit());

		}

	}

