package com.integra.onlinegaming.daoImpl;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.integra.onlinegaming.dao.TournamentDao;
import com.integra.onlinegaming.model.Tournament;

@Repository
public class TournametDaoImpl implements TournamentDao {

	 @Autowired
		private SessionFactory sessionFactory;

		public Integer save(Tournament tournamentDetails) {

			Session session = this.sessionFactory.getCurrentSession();
			Serializable serializable = session.save(tournamentDetails);
			return serializable.hashCode();
		}
		
}

