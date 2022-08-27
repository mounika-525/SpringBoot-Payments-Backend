package com.dbs.repository;

	import java.util.List;

	import javax.persistence.EntityManager;

	import org.hibernate.Session;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.dbs.model.Banks;

	@Repository
	public class BanksRespositoryImplementation implements BanksRepository {
		
		@Autowired
		private EntityManager entityMgnr;

		@Override
		public List<Banks> get() {
			Session currentSession = entityMgnr.unwrap(Session.class);
			Query<Banks> query = currentSession.createQuery("from Banks", Banks.class);
			List<Banks> list = query.getResultList();
			return list;
		}

		@Override
		public Banks get(String bic) {
			Session currentSession = entityMgnr.unwrap(Session.class);
			Banks bank = currentSession.get(Banks.class, bic);
			return bank;
		}

	}

