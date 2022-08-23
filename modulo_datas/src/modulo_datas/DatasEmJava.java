package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	public static void main(String[] args) throws ParseException {
		//objeto Calendar
		Calendar calendar = Calendar.getInstance(); //pega a data atual
		//System.out.println("Calendar dia do mes: "+calendar.get(Calendar.DAY_OF_MONTH));
		
		//simular que a data vem do banco de dados
		/*
		calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-10")); //definindo uma data qualquer
		calendar.add(calendar.DAY_OF_MONTH, -5); //pode reduzir os dias
		calendar.add(calendar.DAY_OF_MONTH, 40); //data de hoje + 40 dias
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		calendar.add(calendar.MONTH, 1);
		System.out.println("Somando 1 mês: "+ new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		*/
		
		//simular quantos dias existem entre uma data e outra
		//Date dataPassada = new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-01");
		long diasEntre = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now());
		System.out.println("Numero de dias entre as datas: "+diasEntre);
		
		
		
		//é possivel ver os gets pela documentação
		//Date date = new Date();
		//System.out.println(date);
		//System.out.println("Dia do mes: "+date.getDate());
		
		//SimpleDateFormat
		//formato banco de dados:
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		//formato mostrar em tela
		//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("Data em formato para banco de dados: "+simpleDateFormat.format(date));
		//System.out.println("Data atual em formato padrão e String: "+ dateFormat.format(date));
		//retornando um objeto date
		//System.out.println(dateFormat.parseObject("18/10/1987"));
		
		//imprimindo com calendar
		//System.out.println("Calendar Data em formato para banco de dados: "+simpleDateFormat.format(calendar.getTime()));
		//System.out.println("Calendar Data atual em formato padrão e String: "+ dateFormat.format(calendar.getTime()));
		
		//comparando datas - utilizarei o objeto dateFormat
		/*
		Date dataVencimentoBoleto = dateFormat.parse("10/04/2021");
		Date dataAtualHoje = dateFormat.parse("07/04/2021");
		if(dataVencimentoBoleto.after(dataAtualHoje)) { //se a data 1 é posterior, maior que a data 2
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}
		if(dataVencimentoBoleto.before(dataAtualHoje)) { //se a data 1 é anterior, menor que a data 2
			System.out.println("Boleto vencido - URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
		*/
		
	}
}
