package in.sunnyit.dao;

import org.springframework.jdbc.core.JdbcTemplate;


public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}


	public boolean save() { 
		
		String sql = "insert into book values(1,'Java',1456)";
		
		jdbcTemplate.execute(sql);
		
		return true;
	}

}
