package br.ufc.persistencia.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public static Date formatData(String data) {
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date dataAniver;
			dataAniver = df.parse(data);
			return dataAniver;
		} catch (ParseException e) {
			System.out.println("\nErro data.\n");
			e.printStackTrace();
		}

		return null;
	}
}