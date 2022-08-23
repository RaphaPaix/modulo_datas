package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava5 {
	public static void main(String[] args) throws ParseException{
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		System.out.println("Data Base: "+dataBase);
		System.out.println("Mais 5 dias: "+(dataBase=dataBase.plusDays(5)));
		System.out.println("Mais 5 semanas: "+(dataBase=dataBase.plusWeeks(5)));
		System.out.println("Mais 5 anos: "+(dataBase=dataBase.plusYears(5)));
		System.out.println("Menos 2 meses: "+(dataBase=dataBase.plusMonths(-2)));
		System.out.println("Menos 1 ano: "+(dataBase.minusYears(1)));
		System.out.println("-----------------------");
		//imprimindo parcelas com vencimento de boleto, usando a data base
		for(int parcela=1;parcela<=12;parcela++) {
			dataBase=dataBase.plusMonths(1);
			System.out.println("Parcela "+parcela+" com vencimento na data: "+dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		
	}
}
