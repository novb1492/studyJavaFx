package ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class registerDao {
	
	private Connection connection;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="kim";
	String pwd="1111";
	
	public registerDao() {
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection=DriverManager.getConnection(url,user,pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public registerDto selectId(String id) {
		String sql="select * from users where id=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				registerDto registerDto=new registerDto();
				registerDto.setId(resultSet.getString("id"));
				registerDto.setPwd(resultSet.getString("pwd"));
				registerDto.setName(resultSet.getString("name"));
				registerDto.setGender(resultSet.getString("gender"));
				registerDto.setHobby(resultSet.getString("hobby"));
				registerDto.setAge(resultSet.getInt("age"));
				return  registerDto;
			}
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		}
		return null;
	}
	public void insert(registerDto registerDto) {
		System.out.println("idText : " + registerDto.getId());
		System.out.println("pwText : " + registerDto.getPwd());
		System.out.println("nameText : " + registerDto.getName());
		System.out.println("age : " + registerDto.getAge());
		System.out.println("gender : " + registerDto.getGender());
		

		
		String sql="insert into users values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, registerDto.getId());
			preparedStatement.setString(2, registerDto.getPwd());
			preparedStatement.setString(3, registerDto.getName());
			preparedStatement.setInt(4, registerDto.getAge());
			preparedStatement.setString(5, registerDto.getGender());
			preparedStatement.setString(6, registerDto.getHobby());
			 preparedStatement.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
	}
}
