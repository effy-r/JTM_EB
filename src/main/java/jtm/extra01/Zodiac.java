package jtm.extra01;

public class Zodiac {

	/**
	 * Determine the sign of the zodiac, use day and month.
	 * 
	 * @param day
	 * @param month
	 * @return zodiac
	 */
	public static String getZodiac(int day, int month) {
		String zodiac = null;
		int zodiac1 = 0;

		if (day > 21 & month == 3 || day <= 20 & month == 4) {
			zodiac1 = 1;
		}

		else if (day > 20 & month == 4 || day <= 21 & month == 5) {
			zodiac1 = 2;
		}
		else if (day > 21 & month == 5 || day <= 20 & month == 6) {
			zodiac1 = 3;
		}
		else if (day > 21 & month == 6 || day <= 23 & month == 7) {
			zodiac1 = 4;
		}
		if (day > 23 & month == 7 || day <= 23 & month == 8) {
			zodiac1 = 5;
		}
		else if (day > 23 & month == 8 || day <= 23 & month == 9) {
			zodiac1 = 6;
		}
		else if (day > 24 & month == 9 || day <= 23 & month == 10) {
			zodiac1 = 7;
		}
		else if (day > 24 & month == 10 || day <= 22 & month == 11) {
			zodiac1 = 8;
		}
		else if (day > 23 & month == 11 || day <= 21 & month == 12) {
			zodiac1 = 9;
		}
		else if (day > 22 & month == 12 || day <= 20 & month == 1) {
			zodiac1 = 10;
		}
		else if (day > 21 & month == 1 || day <= 19 & month == 2) {
			zodiac1 = 11;
		}
		else if (day > 20 & month == 2 || day <= 20 & month == 3) {
			zodiac1 = 12;
		}

		switch (zodiac1) {
		case 1:
			zodiac = "Aries";
			break;
		case 2:
			zodiac = "Taurus";
			break;
		case 3:
			zodiac = "Gemini";
			break;
		case 4:
			zodiac = "Cancer";
			break;
		case 5:
			zodiac = "Leo";

			break;
		case 6:
			zodiac = "Virgo";
			break;
		case 7:
			zodiac = "Libra";
			break;
		case 8:
			zodiac = "Scorpio";
			break;
		case 9:
			zodiac = "Sagittarius";
			break;
		case 10:
			zodiac = "Capricorn";
			break;
		case 11:
			zodiac = "Aquarius";
			break;
		case 12:
			zodiac = "Pisces";
			break;

		}
		// TODO #1: Implement method which return zodiac sign names
		// As method parameter - day and month;
		// Look at wikipedia:
		// https://en.wikipedia.org/wiki/Zodiac#Table_of_dates
		// Tropical zodiac, to get appropriate date ranges for signs
		return zodiac;
	}

	public static void main(String[] args) {
		// HINT: you can use main method to test your getZodiac method with
		// different parameters
		System.out.println(getZodiac(5, 5));
	}

}
