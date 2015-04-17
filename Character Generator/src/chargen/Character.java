package chargen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Character {
	
	private String firstName, lastName;
	private int HP, STR, DEX, INT, IDEA, CON, APP, POW, LUCK, SIZ, SAN, EDU, KNOW, MYTHOS, AGE;
	private String dmgBonus, gender;
	
	
	Random rand;
	
	public Character(String gender, int mythosKnowledge, int minAge, int maxAge){
		
		
		firstName = genName(gender, false);
		lastName = genName(gender, true);
		this.gender = gender;
		rand = new Random();
		
		STR = getD6(3, 0);
		CON = getD6(3, 0);
		POW = getD6(3, 0);
		DEX = getD6(3, 0);
		APP = getD6(3, 0);
		
		SIZ = getD6(2, 6);
		INT = getD6(2, 6);
		
		EDU = getD6(3, 6);
		
		SAN = POW*5;
		LUCK = POW*5;
		IDEA = INT*5;
		KNOW = EDU*5;
		
		dmgBonus = whatDmgBonus();
		HP = (int) Math.ceil((CON + SIZ)/2);
		
		MYTHOS = 99-mythosKnowledge;
		
		
		
		rand.setSeed(System.nanoTime());
		AGE = rand.nextInt(maxAge - minAge + 1) + minAge;
		if(AGE < (EDU + 6)){
			EDU = AGE - 6;
			if(EDU < 1){
				EDU = 1;
			}
			
		}
	}
	
	public int getD6(int numRolls, int afterAdd){
		int result = 0;
		
		for(int i = 0; i < numRolls; i++){
			rand.setSeed(System.nanoTime());
			result += rand.nextInt(6) + 1;
		}
		
		result += afterAdd;
		if(result < 6){
			return getD6(numRolls, afterAdd);
		}
		return result;
	}
	
	public String whatDmgBonus(){
		int combined = getSTR() + getSIZ();
		
		if(combined > 2 && combined <=12){
			return "-1D6";
		} else if(combined >= 13 && combined <=16){
			return "-1D4";
		} else if(combined >= 17 && combined <=24){
			return "0";
		} else if(combined >= 25 && combined <=32){
			return "+1D4";
		} else if(combined >= 33 && combined <=36){
			return "+1D6";
		}
		
		return "ERROR, WTF WRONG VALUE";
	}
	
	/**
	 * 
	 * @param gender Gender of the name, only applies to given names
	 * @param surname True if surname, False if given name
	 * @return Either a given name or a surname
	 */
	private String genName(String gender, boolean surname){
		
		Scanner s = null;
		ArrayList<String> list = null;
		if (surname) {
			try {
				s = new Scanner(new File("src/namelists/surnames.txt"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			list = new ArrayList<String>();
			while (s.hasNextLine()) {
				list.add(s.nextLine());
			}
		} else if(gender.equalsIgnoreCase("male")){
			try {
				s = new Scanner(new File("src/namelists/malefirst.txt"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			list = new ArrayList<String>();
			while (s.hasNextLine()) {
				list.add(s.nextLine());
			}
		} else{
			try {
				s = new Scanner(new File("src/namelists/femalefirst.txt"));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			list = new ArrayList<String>();
			while (s.hasNextLine()) {
				list.add(s.nextLine());
			}
		}
		
		Random rand = new Random();
		
		rand.setSeed(System.nanoTime());
	    // nextInt excludes the top value so we have to add 1 to include the top value
	    int randomNum = rand.nextInt(list.size() + 1);
		
		
	    
		s.close();
		
		String name = list.get(randomNum).replaceAll("\\s+","");
		
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
	
	public String getGender(){
		return gender;
	}
	
	public int getAge(){
		return AGE;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getMythos(){
		return MYTHOS;
	}
	
	public int getSTR() {
		return STR;
	}

	public int getDEX() {
		return DEX;
	}

	public int getINT() {
		return INT;
	}

	public int getIDEA() {
		return IDEA;
	}

	public int getCON() {
		return CON;
	}

	public int getAPP() {
		return APP;
	}

	public int getPOW() {
		return POW;
	}

	public int getLUCK() {
		return LUCK;
	}

	public int getSIZ() {
		return SIZ;
	}

	public int getSAN() {
		return SAN;
	}

	public int getEDU() {
		return EDU;
	}

	public int getKNOW() {
		return KNOW;
	}

	public String getDmgBonus() {
		return dmgBonus;
	}

	public int getHP() {
		return HP;
	}
	
}
