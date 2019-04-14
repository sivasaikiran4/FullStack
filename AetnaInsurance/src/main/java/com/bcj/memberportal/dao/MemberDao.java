package com.bcj.memberportal.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bcj.memberportal.model.Member;



public class MemberDao {

	@Autowired
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public int createMember(Member mmbr) {
		Session session = sessionFactory.getCurrentSession();
		session.save(mmbr);
		return mmbr.getId();
	}

	public List<Member> getMemberById(int id) {
   Session session = sessionFactory.getCurrentSession();
   ProjectionList projections = Projections.projectionList()
			.add(Projections.property("firstName").as("firstName"))
			.add(Projections.property("lastName").as("lastName"))
			.add(Projections.property("plan").as("plan"))
			.add(Projections.property("address").as("address"));
			
		Criteria membercriteria = session.createCriteria(Member.class,"member");
		membercriteria.setProjection(projections)
		.add(Restrictions.eq("member.id", id))
	    .setResultTransformer(new AliasToBeanResultTransformer(Member.class));
		
		return  (List<Member>) membercriteria.list();
	}

}
