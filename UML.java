import java.sql.Connection;

public class UML {
	public class MainClass{
		public void main(String args[]){
		 }
		}
		public class LoginForm{
		 private UserDAO dao;
		 void init(){
		 }
		 void display(){
		 }
		 void validate(){
		 }
		}
		public class UserDAO{
		 private DBUtil db;
		 public boolean findUser(String userName,String userPassword){
			return false;
		}
		}
		public class DBUtil{
		  Connection getConnection() {
			return null;
		}
		}
}
