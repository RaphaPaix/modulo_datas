package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatasEmJava3 {
	public static void main(String[] args) throws ParseException{
		//Nova API de datas a partir do JAVA 8
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: "+dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual: "+horaAtual.format(DateTimeFormatter.ofPattern("HH:mm.ss")));
		
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atual: "+dataEHoraAtual);
		
		//formatando a data
		System.out.println("Data formatada: "
		+dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
}
