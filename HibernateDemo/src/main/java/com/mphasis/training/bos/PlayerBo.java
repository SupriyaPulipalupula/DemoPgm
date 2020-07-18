package com.mphasis.training.bos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mphasis.training.daos.PlayerDao;
import com.mphasis.training.entities.Player;
import com.mphasis.training.exceptions.BusinessException;

public class PlayerBo {
	
	PlayerDao pdao=new PlayerDao();

	public List<Player> getAllPlayers() throws BusinessException {
		
		List<Player> players=pdao.retriveAllPlayers();
		if(players.isEmpty()) {
	           throw new BusinessException("No Players Found");
	       }
		return players;
	}

	
	public Player getPlayerById(int id) throws BusinessException {
		Player player= null;
		if((id>=1)&&(id<=16)) {
			 player=pdao.retrivePlayerById(id);
		}else {
			throw new BusinessException("id should be between 1 and 16");
		}
		return player;
		
	}

	
	public List<Player> getPlayerByName(String name) throws BusinessException {
		List<Player> player=new ArrayList<Player>();
		if(name.matches("[A-Z][a-z]{4,14}")){
			player=pdao.retrivePlayerByName(name);
		}else {
			throw new BusinessException("invalid name format");
		}
		
		return player;
	}


	public List<Player> getPlayerByGender(String g) throws BusinessException {
		List<Player> player=new ArrayList<Player>();
		if(g.matches("[m|M|f|F]")) {
			player=pdao.retrivePlayerByGender(g);
		}else {
			throw new BusinessException("gender should be m or f");
		}
		// TODO Auto-generated method stub
		return player;
	}

	
	public Player getPlayerByContact(long contact) {
		Player player=null;
		player=pdao.retrivePlayerByContact(contact);
		return null;
	}

	
	public Player getPlayerByEmail(String Email) throws BusinessException {
		Player player=null;
		
			player=pdao.retrivePlayerByEmail(Email);
		
		
		return player;
	}

	
	public List<Player> getPlayerByTeamName(String tname) throws BusinessException {
		List<Player> player=new ArrayList<Player>();
	 if(tname.matches("[a-z]{5,10}")) {
		 player=pdao.retrivePlayerByTeamName(tname);
	 }else {
		 throw new BusinessException("teamname should have 5-10 characters");
	 }
		// TODO Auto-generated method stub
		return player;
	}

	
	public List<Player> getPlayerByAge(int age) throws BusinessException {
		List<Player> player=new ArrayList<Player>();
		if(age>18 && age<20) {
			player=pdao.retrivePlayerByAge(age);
		}else {
			 throw new BusinessException("age should be 18 to 20");
		}
		// TODO Auto-generated method stub
		return player;
	}

	
	public Player getPlayerByDob(LocalDate dob) {
		
		Player player=(Player) pdao.retrivePlayerByDob(dob);
		
		// TODO Auto-generated method stub
		return player;
	}

	
	public List<Player> getPlayerByScore(int score) throws BusinessException {
		List<Player> player=new ArrayList<Player>();
		if(score>=80) {
			player=pdao.retrivePlayerByScore(score);
		}else {
			 throw new BusinessException("score should be greater than 80");
		}
		// TODO Auto-generated method stub
		return player;
	}


}
