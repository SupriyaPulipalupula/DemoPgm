package com.mphasis.training.daos;

import java.time.LocalDate;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mphasis.training.entities.Player;


public class PlayerDao {

	SessionFactory sessionFactory=null;
	public PlayerDao() {
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Player.class);
		StandardServiceRegistryBuilder builder=
				new StandardServiceRegistryBuilder().applySettings(con.getProperties());
		sessionFactory=con.buildSessionFactory(builder.build());
	}
	public List<Player> retriveAllPlayers(){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).list();
		return players;	
	}
	public Player retrivePlayerById(int id) {
		Session session=sessionFactory.openSession();
		Player p=(Player)session.get(Player.class, id);
		return p;	
	}
	public List<Player> retrivePlayerByName(String name){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("name",name)).list();
		return players;	
	}
	public List<Player> retrivePlayerByGender(String g) {
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("gender",g)).list();
		return players;	
	}
	public Player retrivePlayerByContact(long ph) {
		Session session=sessionFactory.openSession();
		Player p=(Player)session.createCriteria(Player.class).add(Restrictions.eq("contact",ph));
		return p;	
	}
	public Player retrivePlayerByEmail(String email)
	{
	Session session=sessionFactory.openSession();
	Player p=(Player)session.createCriteria(Player.class).add(Restrictions.eq("email",email));
	return p;	
	}
	public List<Player> retrivePlayerByTeamName(String tname){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("teamname",tname)).list();
		return players;
	}
	public List<Player> retrivePlayerByScore(int score){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("score",score)).list();
		return players;
	}
	public List<Player> retrivePlayerByAge(int age){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("age",age)).list();
		return players;
	}
	public List<Player> retrivePlayerByDob(LocalDate dob){
		List<Player> players=new ArrayList<Player>();
		Session session=sessionFactory.openSession();
		players=session.createCriteria(Player.class).add(Restrictions.eq("dob",dob)).list();
		return players;
	}


}
