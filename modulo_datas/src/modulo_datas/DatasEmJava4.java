package modulo_datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatasEmJava4 {
	public static void main(String[] args) throws ParseException, InterruptedException{
		/*
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Dia da Semana: "+dataAtual.getDayOfWeek().name());
		System.out.println("Dia do m�s: "+dataAtual.getDayOfMonth());
		System.out.println("Dia do ano: "+dataAtual.getDayOfYear());
		System.out.println("M�s: "+dataAtual.getMonth());
		System.out.println("Ano: "+dataAtual.getYear());
		*/
		
		//classe instant -  quanto tempo um processo demora a ser executado
		/*
		Instant inicio = Instant.now();
		Thread.sleep(2000);//pode ser um processo com tempo qualquer desconhecido
		Instant ifinal = Instant.now();
		Duration duracao = Duration.between(inicio, ifinal);
		System.out.println("Dura�ao em nanossegundos: "+duracao.toNanos());
		System.out.println("Dura�ao em minutos: "+duracao.toMinutes());
		System.out.println("Dura�ao em milisegundos: "+duracao.toMillis());
		System.out.println("Dura�ao em segundos: "+duracao);
		*/
		
		//Objeto Period
		LocalDate dataAntiga = LocalDate.parse("2019-02-07"); //jeito mais comum
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		LocalDate dataIgual = LocalDate.of(2019, 2, 7);
		System.out.println("Data antiga � anterior a nova? "+dataAntiga.isBefore(dataNova));
		//para comparar datas:
		System.out.println("Data antiga � igual a Igual? "+dataAntiga.isEqual(dataIgual));
		//agora sim, objeto periodo (tambem est�tico)
		Period periodo;
		if(dataAntiga.isBefore(dataNova)) {
			periodo = Period.between(dataAntiga, dataNova);
		}else {
			periodo = Period.between(dataNova, dataAntiga);
		}
		System.out.println("Per�odo �: "+periodo.getYears()+" anos, "+periodo.getMonths()+" meses e "+periodo.getDays()+" dias.");
	
	}
}
