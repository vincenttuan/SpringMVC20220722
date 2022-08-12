package spring.mvc.session13.repository;

import java.util.List;

import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import spring.mvc.session13.entity.Job;

@Repository
public class JobDaoImpl implements JobDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int add(Job job) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Job job) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer jid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Job get(Integer jid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> query() {
		String sql = "select j.jid, j.jname, j.eid, "
				   + "e.eid as employee_eid, e.ename as employee_ename, "
				   + "e.salary as employee_salary, e.createtime as employee_createtime "
				   + "from job j left join employee e on j.eid = e.eid  ";
		ResultSetExtractor<List<Job>> resultSetExtractor = JdbcTemplateMapperFactory.newInstance()
				.addKeys("jid")
				.newResultSetExtractor(Job.class);
		
		return jdbcTemplate.query(sql, resultSetExtractor);
	}

	@Override
	public List<Job> query(Object httpSessionValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> queryPage(int offset) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
