package com.mphasis.training;

import java.time.LocalDate;
import java.util.Scanner;

import com.mphasis.training.bos.PlayerBo;
import com.mphasis.training.entities.Player;
import com.mphasis.training.exceptions.BusinessException;

public class PlayerApp {
	
	public static void main(String[] args) throws BusinessException {
		
		PlayerBo pbo=new PlayerBo();
		do {
			System.out.println("1.get all players \n2.get player by id"
					+ " 3.get player by name \n 4.get player by gender"
					+ " 5.get all contact \n6.get player by email"
					+"7.get all teamname \n8.get player by age"
					+"9.get all score \n10.get player by dob \n11.exit");
			Scanner sc=new Scanner(System.in);
			switch(sc.nextInt()) {
			case 1:System.out.println("get all players");
				   pbo.getAllPlayers().forEach(p->System.out.println(p));
				   break;
			case 2:System.out.println("Player by id");
				   Player p=pbo.getPlayerById(sc.nextInt());
				   System.out.println(p);
				   break;
			case 3:System.out.println("Player by name");
				   pbo.getPlayerByName(sc.next()).forEach(k->System.out.println(k));
				   break;
			case 4:System.out.println("Player by gender");
			       pbo.getPlayerByGender(sc.next()).forEach(k->System.out.println(k));
			       break;
			case 5:System.out.println("Player by contact");
				   Player s= pbo.getPlayerByContact(sc.nextLong());
				   System.out.println(s);
				   break;
			case 6:System.out.println("Player by Email");
				   Player t=pbo.getPlayerByEmail(sc.next());
				   System.out.println(t);
				   break;
			case 7:System.out.println("players by teamname");
				   pbo.getPlayerByTeamName(sc.next()).forEach(k->System.out.println(k));
				   break;
			case 8:System.out.println("players by age");
				   pbo.getPlayerByAge(sc.nextInt()).forEach(k->System.out.println(k));
				   break;
			case 9:System.out.println("players by score");
			       pbo.getPlayerByScore(sc.nextInt()).forEach(k->System.out.println(k));
			       break;
			case 10:System.out.println("players by dob");
				    Player u=pbo.getPlayerByDob(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
				    System.out.println(u);
			 	    break;
			case 11:System.out.println("exit");
					System.exit(0);
      
			}
			
		}while(true);
	}

}
