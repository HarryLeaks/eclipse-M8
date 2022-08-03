package projecto1;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class data {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("Data de hoje: " + hoje);
		
		LocalTime hora = LocalTime.now();
		System.out.println("Hora de hoje: " + hora);
		
		Date data1 = new Date();
		System.out.println("A data atual é: " + data1.toString());
		
		System.out.printf("Date: %s/%s/%s", hoje.getDayOfMonth(), hoje.getMonth().toString().toLowerCase(), hoje.getYear());
	}
}
